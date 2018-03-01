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
 * CampaignCriterionServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public interface CampaignCriterionServiceInterface extends java.rmi.Remote {

    /**
     * Gets campaign criteria.
     *         
     *         
     * @param serviceSelector The selector specifying the {@link CampaignCriterion}s
     * to return.
     *         
     * @return A list of campaign criteria.
     *         
     * @throws ApiException when there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.CampaignCriterionPage get(com.google.api.ads.adwords.axis.v201802.cm.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Adds, removes or updates campaign criteria.
     *         
     *         
     * @param operations The operations to apply.
     *         
     * @return The added campaign criteria (without any optional parts).
     *         
     * @throws ApiException when there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.CampaignCriterionReturnValue mutate(com.google.api.ads.adwords.axis.v201802.cm.CampaignCriterionOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Returns the list of campaign criteria that match the query.
     * 
     *         
     * @param query The SQL-like AWQL query string.
     *         
     * @return A list of campaign criteria.
     *         
     * @throws ApiException if problems occur while parsing the query or
     * fetching campaign criteria.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.CampaignCriterionPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;
}
