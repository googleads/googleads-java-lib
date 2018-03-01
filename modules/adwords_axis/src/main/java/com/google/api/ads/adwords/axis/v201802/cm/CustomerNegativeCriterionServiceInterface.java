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
 * CustomerNegativeCriterionServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public interface CustomerNegativeCriterionServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of CustomerNegativeCriterion that meets the
     * selector criteria
     *         
     *         
     * @param selector filters the criteria returned
     *         
     * @return The list of CustomerNegativeCriterion
     *         
     * @throws ApiException
     */
    public com.google.api.ads.adwords.axis.v201802.cm.CustomerNegativeCriterionPage get(com.google.api.ads.adwords.axis.v201802.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Adds, removes negative criteria for a customer. These negative
     * criteria apply to all
     *         campaigns of the customer.
     *         
     *         
     * @param operations A list of operations to apply
     *         
     * @throws ApiException
     */
    public com.google.api.ads.adwords.axis.v201802.cm.CustomerNegativeCriterionReturnValue mutate(com.google.api.ads.adwords.axis.v201802.cm.CustomerNegativeCriterionOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Returns the list of CustomerNegativeCriterion that match the
     * query.
     *         
     *         
     * @param query The SQL-like AWQL query string.
     *         
     * @return A list of CustomerNegativeCriterion.
     *         
     * @throws ApiException
     */
    public com.google.api.ads.adwords.axis.v201802.cm.CustomerNegativeCriterionPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;
}
