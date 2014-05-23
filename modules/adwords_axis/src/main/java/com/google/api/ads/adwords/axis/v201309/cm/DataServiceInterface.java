/**
 * DataServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;

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
    public com.google.api.ads.adwords.axis.v201309.cm.AdGroupBidLandscapePage getAdGroupBidLandscape(com.google.api.ads.adwords.axis.v201309.cm.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201309.cm.ApiException;

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
    public com.google.api.ads.adwords.axis.v201309.cm.CriterionBidLandscapePage getCriterionBidLandscape(com.google.api.ads.adwords.axis.v201309.cm.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201309.cm.ApiException;
}
