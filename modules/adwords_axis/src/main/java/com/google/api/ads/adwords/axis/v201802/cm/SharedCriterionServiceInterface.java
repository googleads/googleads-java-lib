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
 * SharedCriterionServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public interface SharedCriterionServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of SharedCriterion that meets the selector criteria.
     * 
     *         
     * @param selector filters the criteria returned
     *         
     * @return The list of SharedCriterion
     *         
     * @throws ApiException
     */
    public com.google.api.ads.adwords.axis.v201802.cm.SharedCriterionPage get(com.google.api.ads.adwords.axis.v201802.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Adds, removes criteria in a shared set.
     *         
     *         
     * @param operations A list of unique operations
     *         
     * @return The list of updated SharedCriterion, returned in the same
     * order as the
     *         {@code operations} array.
     *         
     * @throws ApiException
     */
    public com.google.api.ads.adwords.axis.v201802.cm.SharedCriterionReturnValue mutate(com.google.api.ads.adwords.axis.v201802.cm.SharedCriterionOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Returns the list of SharedCriterion that match the query.
     *         
     *         
     * @param query The SQL-like AWQL query string.
     *         
     * @return A list of SharedCriterion.
     *         
     * @throws ApiException
     */
    public com.google.api.ads.adwords.axis.v201802.cm.SharedCriterionPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;
}
