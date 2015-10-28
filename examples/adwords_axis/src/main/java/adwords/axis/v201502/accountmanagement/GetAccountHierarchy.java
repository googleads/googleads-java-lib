// Copyright 2015 Google Inc. All Rights Reserved.
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

package adwords.axis.v201502.accountmanagement;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201502.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201502.cm.Selector;
import com.google.api.ads.adwords.axis.v201502.mcm.ManagedCustomer;
import com.google.api.ads.adwords.axis.v201502.mcm.ManagedCustomerLink;
import com.google.api.ads.adwords.axis.v201502.mcm.ManagedCustomerPage;
import com.google.api.ads.adwords.axis.v201502.mcm.ManagedCustomerServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.selectorfields.v201502.cm.ManagedCustomerField;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This example gets the account hierarchy under the current account.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * <p>Note: this code example won't work with test accounts. See
 * https://developers.google.com/adwords/api/docs/test-accounts
 */
public class GetAccountHierarchy {

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.ADWORDS)
        .fromFile()
        .build()
        .generateCredential();

    // Construct an AdWordsSession.
    AdWordsSession session = new AdWordsSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session);
  }

  public static void runExample(AdWordsServices adWordsServices, AdWordsSession session)
      throws Exception {
    // Get the ServicedAccountService.
    ManagedCustomerServiceInterface managedCustomerService =
        adWordsServices.get(session, ManagedCustomerServiceInterface.class);

    // Create selector.
    Selector selector = new SelectorBuilder()
        .fields(ManagedCustomerField.CustomerId, ManagedCustomerField.Name)
        .build();

    // Get results.
    ManagedCustomerPage page = managedCustomerService.get(selector);

    // Display serviced account graph.
    if (page.getEntries() != null) {
      // Create map from customerId to customer node.
      Map<Long, ManagedCustomerTreeNode> customerIdToCustomerNode =
          new HashMap<Long, ManagedCustomerTreeNode>();

      // Create account tree nodes for each customer.
      for (ManagedCustomer customer : page.getEntries()) {
        ManagedCustomerTreeNode node = new ManagedCustomerTreeNode();
        node.account = customer;
        customerIdToCustomerNode.put(customer.getCustomerId(), node);
      }

      // For each link, connect nodes in tree.
      if (page.getLinks() != null) {
        for (ManagedCustomerLink link : page.getLinks()) {
          ManagedCustomerTreeNode managerNode = customerIdToCustomerNode.get(
              link.getManagerCustomerId());
          ManagedCustomerTreeNode childNode = customerIdToCustomerNode.get(
              link.getClientCustomerId());
          childNode.parentNode = managerNode;
          if (managerNode != null) {
            managerNode.childAccounts.add(childNode);
          }
        }
      }

      // Find the root account node in the tree.
      ManagedCustomerTreeNode rootNode = null;
      for (ManagedCustomer account : page.getEntries()) {
        if (customerIdToCustomerNode.get(account.getCustomerId()).parentNode == null) {
          rootNode = customerIdToCustomerNode.get(account.getCustomerId());
          break;
        }
      }

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
      sb.append(StringUtils.repeat("-", depth * 2)).append(this).append("\n");
      for (ManagedCustomerTreeNode childAccount : childAccounts) {
        childAccount.toTreeString(depth + 1, sb);
      }
      return sb;
    }
  }
}
