/**
 * LocationCriterionServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.cm;

public interface LocationCriterionServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of {@link LocationCriterion}'s that match the
     * specified selector.
     *         
     *         
     * @param selector filters the LocationCriterion to be returned.
     *         
     * @return A list of location criterion.
     *         
     * @throws ApiException when there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201306.cm.LocationCriterion[] get(com.google.api.ads.adwords.axis.v201306.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201306.cm.ApiException;
}
