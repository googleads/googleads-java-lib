// Copyright 2012 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.axis.utility.extension;

import com.google.api.ads.adwords.axis.utility.extension.exception.UtilityLibraryException;
import com.google.api.ads.adwords.axis.utility.extension.util.AdWordsSessionUtil;
import com.google.api.ads.adwords.axis.v201309.billing.BillingAccount;
import com.google.api.ads.adwords.axis.v201309.mcm.ManagedCustomer;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.common.collect.Lists;

import java.rmi.RemoteException;
import java.util.List;

/**
 * ExtendedMcc encapsulates the MCC Level operations.
 *
 * This class does not guard its mutable reference for AdWordsSession
 *
 * @author Julian Toledo
 */
public final class ExtendedMcc {

  private final AdWordsSession adWordsSession;

  private final DelegateLocator delegateLocator;

  private final String clientCustomerId;

  /**
   * Constructs an ExtendedMcc from a AdWordsSession.
   *
   * @param adWordsSession the AdWordsSession for the MCC
   */
  public ExtendedMcc(AdWordsSession adWordsSession) {
    delegateLocator = new DelegateLocator(adWordsSession);
    this.adWordsSession = delegateLocator.getAdWordsSession();
    // Using clientCustomerId from builder
    clientCustomerId = delegateLocator.getClientCustomerId();
  }

  /**
   * Constructs an ExtendedMcc from a AdWordsSession.
   *
   * @param delegateLocator the DelegateLocator for the MCC
   */
  public ExtendedMcc(DelegateLocator delegateLocator) {
    this.adWordsSession = delegateLocator.getAdWordsSession();
    this.delegateLocator = delegateLocator;
    // Using clientCustomerId from DelegateLocator' builder
    clientCustomerId = delegateLocator.getClientCustomerId();
  }

  /**
   * Constructs an ExtendedMcc from a AdWordsSession and a clientCustomerId.
   *
   * @param adWordsSession the AdWordsSession for the MCC
   * @param clientCustomerId the clientCustomerId as String
   */
  public ExtendedMcc(AdWordsSession adWordsSession, String clientCustomerId) {
    this.clientCustomerId = clientCustomerId;
    delegateLocator = new DelegateLocator(adWordsSession, clientCustomerId);
    this.adWordsSession = delegateLocator.getAdWordsSession();
  }

  /**
   * Constructs an ExtendedMcc from a AdWordsSession and a ManagedCustomer.
   *
   * @param adWordsSession the AdWordsSession for the MCC
   * @param managedCustomer the ManagedCustomer to use in the session
   */
  public ExtendedMcc(AdWordsSession adWordsSession, ManagedCustomer managedCustomer) {
    this.clientCustomerId = managedCustomer.getCustomerId().toString();
    delegateLocator = new DelegateLocator(adWordsSession, managedCustomer);
    this.adWordsSession = delegateLocator.getAdWordsSession();
  }

  /**
   * Creates a new ExtendedMcc using the ads.properties file and using OAuth2.
   *
   * @return the ExtendedMcc associated with the file
   * @throws OAuthException if problem with OAuth2
   * @throws ConfigurationLoadException if problems loading the ad.properties file
   * @throws ValidationException if the {@code AdWordsSession} did not validate
   */
  public static ExtendedMcc withOAuth2FromFile()
      throws OAuthException, ValidationException, ConfigurationLoadException {
    return new ExtendedMcc(AdWordsSessionUtil.fromFileWithOAuth2());
  }

  /**
   * Transforms a regular list of (MCC) ManagedCustomer into a list of ExtendedManagedCustomers.
   *
   * <p class="note"><b>Note:</b> managedCustomer needs to be a MCC.</p>
   *
   * @param managedCustomers a list of (MCC) ManagedCustomers to convert
   * @return the converted list of ExtendedManagedCustomers
   */
  public static List<ExtendedMcc> as(List<ManagedCustomer> managedCustomers,
      AdWordsSession adWordsSession) {
    List<ExtendedMcc> listExtended = Lists.newArrayListWithCapacity(managedCustomers.size());
    for (ManagedCustomer managedCustomer : managedCustomers) {
      // Creating a specific DelegateLocator for the CustomerId
      listExtended.add(new ExtendedMcc(adWordsSession, managedCustomer));
    }
    return listExtended;
  }

  /**
   * Retrieves the AdWordsSession for MCC.
   *
   * @return the AdWordsSession for the MCC
   */
  public AdWordsSession getAdWordsSession() {
    return adWordsSession;
  }

  /**
   * Retrieves the DelegateLocator for the MCC.
   *
   * @return the DelegateLocator for the MCC
   */
  public DelegateLocator getDelegateLocator() {
    return delegateLocator;
  }

  /**
   * Retrieves the clientCustomerId for the MCC.
   *
   * @return the clientCustomerId for the MCC
   */
  public String getClientCustomerId() {
    return clientCustomerId;
  }

  /**
   * Gets the (sub)MCCs for the ExtendedMcc for a list of customerIds.
   *
   * @param customerIds the list of MCCs to retrieve
   * @return a list of (sub) MCCs for the ExtendedMcc from the customerIds list
   * @throws UtilityLibraryException if there is an error in the reflection call
   * @throws RemoteException for communication-related exceptions
   */
  public List<ManagedCustomer> getMccs(List<Long> customerIds) throws RemoteException {
    return delegateLocator.getManagedCustomerDelegate().getByCustomerIdCanManageClients(
        customerIds, true);
  }

  /**
   * Gets the (sub)MCCs for the ExtendedMcc for a list of customerIds.
   *
   * @param customerIds the list of MCCs to retrieve
   * @return a list of (sub) MCCs for the ExtendedMcc from the customerIds list
   * @throws UtilityLibraryException if there is an error in the reflection call
   * @throws RemoteException for communication-related exceptions
   */
  public List<ExtendedMcc> getExtendedMccs(List<Long> customerIds)
      throws RemoteException {
    return as(delegateLocator.getManagedCustomerDelegate().getByCustomerIdCanManageClients(
        customerIds, true), adWordsSession);
  }

  /**
   * Gets the (sub)MCCs for the ExtendedMcc.
   *
   * @return all the (sub) MCCs for the ExtendedMcc
   * @throws UtilityLibraryException if there is an error in the reflection call
   * @throws RemoteException for communication-related exceptions
   */
  public List<ManagedCustomer> getMccs() throws RemoteException {
    return getMccs(null);
  }

  /**
   * Gets the (sub)MCCs for the ExtendedMcc.
   *
   * @return all the (sub) MCCs for the ExtendedMcc
   * @throws UtilityLibraryException if there is an error in the reflection call
   * @throws RemoteException for communication-related exceptions
   */
  public List<ExtendedMcc> getExtendedMccs() throws RemoteException {
    return getExtendedMccs(null);
  }

  /**
   * Gets the (sub)MCCs for the ExtendedMcc for a list of customerIds.
   *
   * @param customerId the id of the MCC to retrieve
   * @return a (sub) MCCs for the ExtendedMcc for the customerId
   * @throws UtilityLibraryException if there is an error in the reflection call
   * @throws RemoteException for communication-related exceptions
   */
  public ManagedCustomer getMcc(Long customerId) throws RemoteException {
    ManagedCustomer mcc = getManagedCustomer(customerId);
    if (mcc.getCanManageClients()) {
      return mcc;
    } else {
      throw new UtilityLibraryException("Error: result empty for getMcc(Long customerId)");
    }
  }

  /**
   * Gets the (sub)MCCs for the ExtendedMcc for a list of customerIds.
   *
   * @param customerId the id of the MCC to retrieve
   * @return a (sub) MCCs for the ExtendedMcc for the customerId
   * @throws UtilityLibraryException if there is an error in the reflection call
   * @throws RemoteException for communication-related exceptions
   */
  public ExtendedMcc getExtendedMcc(Long customerId) throws RemoteException {
    ExtendedManagedCustomer mcc = getExtendedManagedCustomer(customerId);
    if (mcc.getManagedCustomer().getCanManageClients()) {
      return new ExtendedMcc(adWordsSession, mcc.getManagedCustomer());
    } else {
      throw new UtilityLibraryException("Error: result empty for getMcc(Long customerId)");
    }
  }

  /**
   * Gets the ManagedCustomers for the ExtendedMcc in the customerIds list.
   *
   * @param customerIds the list of ids of the ManagedCustomers to retrieve
   * @return a list of ManagedCustomer for the ExtendedMcc from the
   *         customerIds list
   * @throws UtilityLibraryException if there is an error in the reflection call
   * @throws RemoteException for communication-related exceptions
   */
  public List<ManagedCustomer> getManagedCustomers(List<Long> customerIds) throws RemoteException {
    return delegateLocator.getManagedCustomerDelegate().getByCustomerIdCanManageClients(
        customerIds, false);
  }

  /**
   * Gets the ManagedCustomers for the ExtendedMcc in the customerIds list.
   *
   * @param customerIds the list of ids of the ManagedCustomers to retrieve
   * @return a list of ExtendedManagedCustomer for the ExtendedMcc from the
   *         customerIds list
   * @throws UtilityLibraryException if there is an error in the reflection call
   * @throws RemoteException for communication-related exceptions
   */
  public List<ExtendedManagedCustomer> getExtendedManagedCustomers(List<Long> customerIds)
      throws RemoteException {
    return ExtendedManagedCustomer.as(delegateLocator.getManagedCustomerDelegate()
        .getByCustomerIdCanManageClients(customerIds, false), adWordsSession);
  }

  /**
   * Gets the ManagedCustomers for the ExtendedMcc in the customerIds list.
   *
   * <p class="note"><b>Note:</b> returns subMccs' ManagedCustomers as well.</p>
   * 
   * @return all the ManagedCustomer for the ExtendedMcc
   * @throws UtilityLibraryException if there is an error in the reflection call
   * @throws RemoteException for communication-related exceptions
   */
  public List<ManagedCustomer> getManagedCustomers() throws RemoteException {
    return getManagedCustomers(null);
  }

  /**
   * Gets the ManagedCustomers for the ExtendedMcc between startIndex and numberResults.
   *
   * <p class="note"><b>Note:</b> returns subMccs' ManagedCustomers as well.</p>
   * 
   * @param startIndex index of the first result to retrieve
   * @param numberResults total number of result to retrieve
   * @return all the ManagedCustomer for the ExtendedMcc
   * @throws UtilityLibraryException if there is an error in the reflection call
   * @throws RemoteException for communication-related exceptions
   */
  public List<ManagedCustomer> getManagedCustomers(int startIndex, int numberResults)
      throws RemoteException {
    return delegateLocator.getManagedCustomerDelegate().get(startIndex, numberResults);
  }

  /**
   * Gets the ManagedCustomers for the ExtendedMcc in the customerIds list.
   *
   * <p class="note"><b>Note:</b> returns subMccs' ManagedCustomers as well.</p>
   * 
   * @return all the ExtendedManagedCustomer for the ExtendedMcc
   * @throws UtilityLibraryException if there is an error in the reflection call
   * @throws RemoteException for communication-related exceptions
   */
  public List<ExtendedManagedCustomer> getExtendedManagedCustomers()
      throws RemoteException {
    return getExtendedManagedCustomers(null);
  }

  /**
   * Gets the ManagedCustomers for the ExtendedMcc  between startIndex and numberResults.
   *
   * <p class="note"><b>Note:</b> returns subMccs' ManagedCustomers as well.</p>
   * 
   * @param startIndex index of the first result to retrieve
   * @param numberResults total number of result to retrieve
   * @return all the ExtendedManagedCustomer for the ExtendedMcc
   * @throws UtilityLibraryException if there is an error in the reflection call
   * @throws RemoteException for communication-related exceptions
   */
  public List<ExtendedManagedCustomer> getExtendedManagedCustomers(
      int startIndex, int numberResults) throws RemoteException {
    return ExtendedManagedCustomer.as(
        getManagedCustomers(startIndex, numberResults), adWordsSession);
  }

  /**
   * Gets the ManagedCustomers for the ExtendedMcc in the customerIds list.
   *
   * @param customerId the customerId of the ManagedCustomer to retrieve
   * @return the ManagedCustomer for the customerId
   * @throws UtilityLibraryException if there is an error in the reflection call
   * @throws RemoteException for communication-related exceptions
   */
  public ManagedCustomer getManagedCustomer(Long customerId) throws RemoteException {
    return getManagedCustomer(String.valueOf(customerId));
  }

  /**
   * Gets the ManagedCustomers for the ExtendedMcc in the customerIds list.
   *
   * @param customerId the customerId of the ManagedCustomer to retrieve
   * @return the ManagedCustomer for the customerId
   * @throws UtilityLibraryException if there is an error in the reflection call
   * @throws RemoteException for communication-related exceptions
   */
  public ManagedCustomer getManagedCustomer(String customerId) throws RemoteException {
    return delegateLocator.getManagedCustomerDelegate().getByCustomerId(customerId);
  }

  /**
   * Gets the ManagedCustomers for the ExtendedMcc in the customerIds list.
   *
   * @param customerId the customerId of the ManagedCustomer to retrieve
   * @return the ExtendedManagedCustomer for the customerId
   * @throws UtilityLibraryException if there is an error in the reflection call
   * @throws RemoteException for communication-related exceptions
   */
  public ExtendedManagedCustomer getExtendedManagedCustomer(Long customerId)
      throws RemoteException {
    return new ExtendedManagedCustomer(delegateLocator.getManagedCustomerDelegate()
        .getByCustomerId(customerId), adWordsSession);
  }

  /**
   * Inserts ManagedCustomers into the ExtendedMcc.
   *
   * <p class="note"><b>Note:</b> ManagedCustomers cannot be updated/removed.</p>
   *
   * @param apiManagedCustomers the list of ManagedCustomers to be inserted
   * @return the updated list of ExtendedManagedCustomers
   * @throws UtilityLibraryException if there is an error in the reflection call
   * @throws RemoteException for communication-related exceptions
   */
  public List<ExtendedManagedCustomer> insertManagedCustomers(
      List<ManagedCustomer> apiManagedCustomers) throws RemoteException {
    return ExtendedManagedCustomer.as(
        delegateLocator.getManagedCustomerDelegate().insert(apiManagedCustomers), adWordsSession);
  }

  /**
   * Inserts a ManagedCustomer into the ExtendedMcc.
   *
   * <p class="note"><b>Note:</b> ManagedCustomers cannot be updated/removed.</p>
   *
   * @param apiManagedCustomer the ManagedCustomer to be inserted
   * @return the updated ExtendedManagedCustomer
   * @throws UtilityLibraryException if there is an error in the reflection call
   * @throws RemoteException for communication-related exceptions
   */
  public ExtendedManagedCustomer insertManagedCustomer(ManagedCustomer apiManagedCustomer)
      throws RemoteException {
    return new ExtendedManagedCustomer(
        delegateLocator.getManagedCustomerDelegate().insert(apiManagedCustomer), adWordsSession);
  }

  /**
   * Inserts a ManagedCustomer into the ExtendedMcc.
   *
   * <p class="note"><b>Note:</b> ManagedCustomers cannot be updated/removed.</p>
   *
   * @param name the ManagedCustomer's name
   * @param companyName the ManagedCustomer's company name
   * @param dateTimeZone the ManagedCustomer's time zone in POSIX:
   *        https://developers.google.com/adwords/api/docs/appendix/timezones
   * @param currencyCode the ManagedCustomer's currency in ISO 4217 format:
   *        https://developers.google.com/adwords/api/docs/appendix/currencycodes
   * @return the updated ExtendedManagedCustomer
   * @throws UtilityLibraryException if there is an error in the reflection call
   * @throws RemoteException for communication-related exceptions
   */
  public ExtendedManagedCustomer insertManagedCustomer(String name, String companyName,
      String dateTimeZone, String currencyCode) throws RemoteException {
    ManagedCustomer newManagedCustomer = new ManagedCustomer();
    newManagedCustomer.setName(name);
    newManagedCustomer.setCompanyName(companyName);
    newManagedCustomer.setDateTimeZone(dateTimeZone);
    newManagedCustomer.setCurrencyCode(currencyCode);
    return new ExtendedManagedCustomer(
        delegateLocator.getManagedCustomerDelegate().insert(newManagedCustomer), adWordsSession);
  }

  /**
   * Gets all the BillingAccounts for the ExtendedMcc.
   *
   * @return all the BillingAccounts for the ExtendedMcc
   * @throws RemoteException for communication-related exceptions
   */
  public List<BillingAccount> getBillingAccounts() throws RemoteException {
    return delegateLocator.getBudgetOrderDelegate().getBillingAccounts();
  }
}