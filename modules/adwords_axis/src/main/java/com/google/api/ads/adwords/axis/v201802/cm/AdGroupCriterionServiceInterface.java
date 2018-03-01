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
 * AdGroupCriterionServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public interface AdGroupCriterionServiceInterface extends java.rmi.Remote {

    /**
     * Gets adgroup criteria.
     *         
     *         
     * @param serviceSelector filters the adgroup criteria to be returned.
     * 
     * @return a page (subset) view of the criteria selected
     *         
     * @throws ApiException when there is at least one error with the request
     */
    public com.google.api.ads.adwords.axis.v201802.cm.AdGroupCriterionPage get(com.google.api.ads.adwords.axis.v201802.cm.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Adds, removes or updates adgroup criteria.
     *         
     *         
     * @param operations operations to do
     *         during checks on keywords to be added.
     *         
     * @return added and updated adgroup criteria (without optional parts)
     * 
     * @throws ApiException when there is at least one error with the request
     */
    public com.google.api.ads.adwords.axis.v201802.cm.AdGroupCriterionReturnValue mutate(com.google.api.ads.adwords.axis.v201802.cm.AdGroupCriterionOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Adds labels to the AdGroupCriterion or removes labels from
     * the AdGroupCriterion
     *         <p>Add - Apply an existing label to an existing
     *         {@linkplain AdGroupCriterion ad group criterion}. The {@code
     * adGroupId} and
     *         {@code criterionId}
     *         must reference an existing {@linkplain AdGroupCriterion ad
     * group criterion}. The
     *         {@code labelId} must reference an existing {@linkplain Label
     * label}.
     *         <p>Remove - Removes the link between the specified
     *         {@linkplain AdGroupCriterion ad group criterion} and {@linkplain
     * Label label}.</p>
     *         
     * @param operations the operations to apply
     *         
     * @return a list of AdGroupCriterionLabel where each entry in the list
     * is the result of
     *         applying the operation in the input list with the same index.
     * For an
     *         add operation, the returned AdGroupCriterionLabel contains
     * the AdGroupId, CriterionId and the
     *         LabelId. In the case of a remove operation, the returned AdGroupCriterionLabel
     * will only have
     *         AdGroupId and CriterionId.
     *         
     * @throws ApiException when there are one or more errors with the request
     */
    public com.google.api.ads.adwords.axis.v201802.cm.AdGroupCriterionLabelReturnValue mutateLabel(com.google.api.ads.adwords.axis.v201802.cm.AdGroupCriterionLabelOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Returns the list of AdGroupCriterion that match the query.
     *         
     *         
     * @param query The SQL-like AWQL query string
     *         
     * @returns A list of AdGroupCriterion
     *         
     * @throws ApiException when the query is invalid or there are errors
     * processing the request.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.AdGroupCriterionPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;
}
