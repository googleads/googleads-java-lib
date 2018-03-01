// Copyright 2018 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * CustomerServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.mcm;

public interface CustomerServiceInterface extends java.rmi.Remote {

    /**
     * Returns details of all the customers directly accessible by
     * the user authenticating the call.
     *         <p>
     *         Note: This method will return only test accounts if the developer
     * token used has not been
     *         approved.
     *         <p>
     *         Starting with v201607, if {@code clientCustomerId} is specified
     * in the request header,
     *         only details of that customer will be returned. To do this
     * for prior versions, use the
     *         {@code get()} method instead.
     */
    public com.google.api.ads.adwords.axis.v201802.mcm.Customer[] getCustomers() throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Retrieves the list of service links for the authorized customer.
     * See {@link ServiceType} for information on the various linking types
     * supported.
     *         
     *         
     * @param selector describing which links to retrieve
     *         
     * @throws ApiException
     */
    public com.google.api.ads.adwords.axis.v201802.mcm.ServiceLink[] getServiceLinks(com.google.api.ads.adwords.axis.v201802.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Update the authorized customer.
     *         
     *         <p>While there are a limited set of properties available to
     * update, please read this
     *         <a href="https://support.google.com/analytics/answer/1033981">help
     * center article
     *         on auto-tagging</a> before updating {@code customer.autoTaggingEnabled}.
     * 
     *         
     * @param customer the requested updated value for the customer.
     *         
     * @throws ApiException
     */
    public com.google.api.ads.adwords.axis.v201802.mcm.Customer mutate(com.google.api.ads.adwords.axis.v201802.mcm.Customer customer) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Modifies links to other services for the authorized customer.
     * See {@link ServiceType} for information on the various linking types
     * supported.
     *         
     *         
     * @param operations to perform
     *         
     * @throws ApiException
     */
    public com.google.api.ads.adwords.axis.v201802.mcm.ServiceLink[] mutateServiceLinks(com.google.api.ads.adwords.axis.v201802.mcm.ServiceLinkOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;
}
