/**
 * DataServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.cm;

public interface DataServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of bid landscapes for the ad groups specified
     * in the selector.
     *         
     *         
     * @param serviceSelector Selects the entities to return bid landscapes
     * for.
     *         
     * @return A list of bid landscapes.
     *         
     * @throws ApiException when there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201306.cm.AdGroupBidLandscapePage getAdGroupBidLandscape(com.google.api.ads.adwords.axis.v201306.cm.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201306.cm.ApiException;

    /**
     * Returns a list of bid landscapes for the criteria specified
     * in the selector.
     *         
     *         
     * @param serviceSelector Selects the entities to return bid landscapes
     * for.
     *         
     * @return A list of bid landscapes.
     *         
     * @throws ApiException when there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201306.cm.CriterionBidLandscapePage getCriterionBidLandscape(com.google.api.ads.adwords.axis.v201306.cm.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201306.cm.ApiException;
}
