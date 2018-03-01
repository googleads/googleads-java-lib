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
 * BudgetServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public interface BudgetServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of budgets that match the selector.
     *         
     *         
     * @return List of budgets specified by the selector.
     *         
     * @throws com.google.ads.api.services.common.error.ApiException if problems
     * occurred while retrieving results.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.BudgetPage get(com.google.api.ads.adwords.axis.v201802.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Applies the list of mutate operations.
     *         
     *         
     * @param operations The operations to apply.
     *         
     * @return The modified list of Budgets, returned in the same order as
     * <code>operations</code>.
     *         
     * @throws ApiException
     */
    public com.google.api.ads.adwords.axis.v201802.cm.BudgetReturnValue mutate(com.google.api.ads.adwords.axis.v201802.cm.BudgetOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Returns the list of budgets that match the query.
     *         
     *         
     * @param query The SQL-like AWQL query string
     *         
     * @returns A list of Budget
     *         
     * @throws ApiException when the query is invalid or there are errors
     * processing the request.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.BudgetPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;
}
