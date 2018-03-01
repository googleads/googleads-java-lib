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
 * DataServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public interface DataServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of {@link AdGroupBidLandscape}s for the ad groups
     * specified in the selector.
     *         In the result, the returned {@link LandscapePoint}s are grouped
     * into
     *         {@link AdGroupBidLandscape}s by their ad groups, and numberResults
     * of paging limits the total
     *         number of {@link LandscapePoint}s instead of number of {@link
     * AdGroupBidLandscape}s.
     *         
     *         
     * @param serviceSelector Selects the entities to return bid landscapes
     * for.
     *         
     * @return A list of bid landscapes.
     *         
     * @throws ApiException when there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.AdGroupBidLandscapePage getAdGroupBidLandscape(com.google.api.ads.adwords.axis.v201802.cm.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Returns a list of {@link CriterionBidLandscape}s for the campaign
     * criteria specified in the
     *         selector. In the result, the returned {@link LandscapePoint}s
     * are grouped into
     *         {@link CriterionBidLandscape}s by their campaign id and criterion
     * id, and numberResults
     *         of paging limits the total number of {@link LandscapePoint}s
     * instead of number of
     *         {@link CriterionBidLandscape}s.
     *         
     *         
     * @param serviceSelector Selects the entities to return bid landscapes
     * for.
     *         
     * @return A list of bid landscapes.
     *         
     * @throws ApiException when there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.CriterionBidLandscapePage getCampaignCriterionBidLandscape(com.google.api.ads.adwords.axis.v201802.cm.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Returns a list of {@link CriterionBidLandscape}s for the criteria
     * specified in the selector.
     *         In the result, the returned {@link LandscapePoint}s are grouped
     * into
     *         {@link CriterionBidLandscape}s by their criteria, and numberResults
     * of paging limits the total
     *         number of {@link LandscapePoint}s instead of number of {@link
     * CriterionBidLandscape}s.
     *         
     *         
     * @param serviceSelector Selects the entities to return bid landscapes
     * for.
     *         
     * @return A list of bid landscapes.
     *         
     * @throws ApiException when there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.CriterionBidLandscapePage getCriterionBidLandscape(com.google.api.ads.adwords.axis.v201802.cm.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Returns a list of domain categories that can be used to create
     * {@link WebPage} criterion.
     *         
     *         
     * @param serviceSelector Selects the entities to return domain categories
     * for.
     *         
     * @return A list of domain categories.
     *         
     * @throws ApiException when there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.DomainCategoryPage getDomainCategory(com.google.api.ads.adwords.axis.v201802.cm.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Returns a list of {@link AdGroupBidLandscape}s for the ad groups
     * that match the query. In the
     *         result, the returned {@link LandscapePoint}s are grouped into
     * {@link AdGroupBidLandscape}s
     *         by their ad groups, and numberResults of paging limits the
     * total number of
     *         {@link LandscapePoint}s instead of number of {@link AdGroupBidLandscape}s.
     * 
     *         
     * @param query The SQL-like AWQL query string.
     *         
     * @return A list of bid landscapes.
     *         
     * @throws ApiException if problems occur while parsing the query or
     * fetching bid landscapes.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.AdGroupBidLandscapePage queryAdGroupBidLandscape(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Returns a list of {@link CriterionBidLandscape}s for the campaign
     * criteria that match the
     *         query. In the result, the returned {@link LandscapePoint}s
     * are grouped into
     *         {@link CriterionBidLandscape}s by their campaign id and criterion
     * id, and numberResults
     *         of paging limits the total number of {@link LandscapePoint}s
     * instead of number of
     *         {@link CriterionBidLandscape}s.
     *         
     *         
     * @param query The SQL-like AWQL query string.
     *         
     * @return A list of bid landscapes.
     *         
     * @throws ApiException if problems occur while parsing the query or
     * fetching bid landscapes.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.CriterionBidLandscapePage queryCampaignCriterionBidLandscape(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Returns a list of {@link CriterionBidLandscape}s for the criteria
     * that match the query. In the
     *         result, the returned {@link LandscapePoint}s are grouped into
     * {@link CriterionBidLandscape}s
     *         by their criteria, and numberResults of paging limits the
     * total number of
     *         {@link LandscapePoint}s instead of number of {@link CriterionBidLandscape}s.
     * 
     *         
     * @param query The SQL-like AWQL query string.
     *         
     * @return A list of bid landscapes.
     *         
     * @throws ApiException if problems occur while parsing the query or
     * fetching bid landscapes.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.CriterionBidLandscapePage queryCriterionBidLandscape(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Returns a list of domain categories that can be used to create
     * {@link WebPage} criterion.
     *         
     *         
     * @param query The SQL-like AWQL query string.
     *         
     * @return A list of domain categories.
     *         
     * @throws ApiException if problems occur while parsing the query
     *         or fetching domain categories.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.DomainCategoryPage queryDomainCategory(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;
}
