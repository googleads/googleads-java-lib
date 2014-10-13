/**
 * TrafficEstimatorServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.o;

public interface TrafficEstimatorServiceInterface extends java.rmi.Remote {

    /**
     * Returns traffic estimates for specified criteria.
     *         
     *         
     * @param selector Campaigns, ad groups and keywords for which traffic
     * should be estimated.
     *         
     * @return Traffic estimation results.
     *         
     * @throws ApiException if problems occurred while retrieving estimates
     */
    public com.google.api.ads.adwords.axis.v201409.o.TrafficEstimatorResult get(com.google.api.ads.adwords.axis.v201409.o.TrafficEstimatorSelector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201409.cm.ApiException;
}
