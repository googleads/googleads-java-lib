// Copyright 2017 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package adwords.axis.v201710.accountmanagement;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201710.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201710.cm.ApiError;
import com.google.api.ads.adwords.axis.v201710.cm.ApiException;
import com.google.api.ads.adwords.axis.v201710.mcm.ManagedCustomer;
import com.google.api.ads.adwords.axis.v201710.mcm.ManagedCustomerLink;
import com.google.api.ads.adwords.axis.v201710.mcm.ManagedCustomerPage;
import com.google.api.ads.adwords.axis.v201710.mcm.ManagedCustomerServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.selectorfields.v201710.cm.ManagedCustomerField;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Maps;
import com.google.common.collect.SortedSetMultimap;
import com.google.common.collect.TreeMultimap;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.SystemUtils;

/**
 * This example gets the account hierarchy under the current account.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetAccountHierarchy {
  private static final int PAGE_SIZE = 500;

  public static void main(String[] args) {
    AdWordsSession session;
    try {
      // Generate a refreshable OAuth2 credential.
      Credential oAuth2Credential =
          new OfflineCredentials.Builder()
              .forApi(Api.ADWORDS)
              .fromFile()
              .build()
              .generateCredential();

      // Construct an AdWordsSession.
      session =
          new AdWordsSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();
    } catch (ConfigurationLoadException cle) {
      System.err.printf(
          "Failed to load configuration from the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, cle);
      return;
    } catch (ValidationException ve) {
      System.err.printf(
          "Invalid configuration in the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, ve);
      return;
    } catch (OAuthException oe) {
      System.err.printf(
          "Failed to create OAuth credentials. Check OAuth settings in the %s file. "
              + "Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, oe);
      return;
    }

    AdWordsServicesInterface adWordsServices = AdWordsServices.getInstance();

    try {
      runExample(adWordsServices, session);
    } catch (ApiException apiException) {
      // ApiException is the base class for most exceptions thrown by an API request. Instances
      // of this exception have a message and a collection of ApiErrors that indicate the
      // type and underlying cause of the exception. Every exception object in the adwords.axis
      // packages will return a meaningful value from toString
      //
      // ApiException extends RemoteException, so this catch block must appear before the
      // catch block for RemoteException.
      System.err.println("Request failed due to ApiException. Underlying ApiErrors:");
      if (apiException.getErrors() != null) {
        int i = 0;
        for (ApiError apiError : apiException.getErrors()) {
          System.err.printf("  Error %d: %s%n", i++, apiError);
        }
      }
    } catch (RemoteException re) {
      System.err.printf(
          "Request failed unexpectedly due to RemoteException: %s%n", re);
    }
  }

  /**
   * Runs the example.
   *
   * @param adWordsServices the services factory.
   * @param session the session.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(AdWordsServicesInterface adWordsServices, AdWordsSession session)
      throws RemoteException {
    // Get the ServicedAccountService.
    ManagedCustomerServiceInterface managedCustomerService =
        adWordsServices.get(session, ManagedCustomerServiceInterface.class);

    // Create selector builder.
    int offset = 0;
    SelectorBuilder selectorBuilder =
        new SelectorBuilder()
            .fields(ManagedCustomerField.CustomerId, ManagedCustomerField.Name)
            .offset(offset)
            .limit(PAGE_SIZE);

    // Get results.
    ManagedCustomerPage page;

    // Map from customerId to customer node.
    Map<Long, ManagedCustomerTreeNode> customerIdToCustomerNode = Maps.newHashMap();

    // Map from each parent customer ID to its set of linked child customer IDs.
    SortedSetMultimap<Long, Long> parentIdToChildIds = TreeMultimap.create();
    do {
      page = managedCustomerService.get(selectorBuilder.build());

      if (page.getEntries() != null) {
        // Create account tree nodes for each customer.
        for (ManagedCustomer customer : page.getEntries()) {
          ManagedCustomerTreeNode node = new ManagedCustomerTreeNode();
          node.account = customer;
          customerIdToCustomerNode.put(customer.getCustomerId(), node);
        }
        
        // Update the map of parent customer ID to child customer IDs.
        if (page.getLinks() != null) {
          for (ManagedCustomerLink link : page.getLinks()) {
            parentIdToChildIds.put(link.getManagerCustomerId(), link.getClientCustomerId());
          }
        }
      }
      offset += PAGE_SIZE;
      selectorBuilder.increaseOffsetBy(PAGE_SIZE);
    } while (offset < page.getTotalNumEntries());

    // Update the parentNode of each child node, and add each child to the childAccounts
    // of its parentNode.
    for (Entry<Long, Long> parentIdEntry : parentIdToChildIds.entries()) {
      ManagedCustomerTreeNode parentNode = customerIdToCustomerNode.get(parentIdEntry.getKey());
      ManagedCustomerTreeNode childNode = customerIdToCustomerNode.get(parentIdEntry.getValue());
      childNode.parentNode = parentNode;
      parentNode.childAccounts.add(childNode);
    }

    // Find the root account node in the tree.
    ManagedCustomerTreeNode rootNode = null;
    for (ManagedCustomerTreeNode node : customerIdToCustomerNode.values()) {
      if (node.parentNode == null) {
        rootNode = node;
        break;
      }
    }

    // Display serviced account graph.
    if (rootNode != null) {
      // Display account tree.
      System.out.println("CustomerId, Name");
      System.out.println(rootNode.toTreeString(0, new StringBuffer()));
    } else {
      System.out.println("No serviced accounts were found.");
    }
  }

  /**
   * Example implementation of a node that would exist in an account tree.
   */
  private static class ManagedCustomerTreeNode {
    protected ManagedCustomerTreeNode parentNode;
    protected ManagedCustomer account;
    protected List<ManagedCustomerTreeNode> childAccounts =
        new ArrayList<ManagedCustomerTreeNode>();

    /**
     * Default constructor.
     */
    public ManagedCustomerTreeNode() {}

    @Override
    public String toString() {
      return String.format("%s, %s", account.getCustomerId(), account.getName());
    }

    /**
     * Returns a string representation of the current level of the tree and
     * recursively returns the string representation of the levels below it.
     *
     * @param depth the depth of the node
     * @param sb the string buffer containing the tree representation
     * @return the tree string representation
     */
    public StringBuffer toTreeString(int depth, StringBuffer sb) {
      sb.append(StringUtils.repeat("-", depth * 2)).append(this).append(SystemUtils.LINE_SEPARATOR);
      for (ManagedCustomerTreeNode childAccount : childAccounts) {
        childAccount.toTreeString(depth + 1, sb);
      }
      return sb;
    }
  }
}
