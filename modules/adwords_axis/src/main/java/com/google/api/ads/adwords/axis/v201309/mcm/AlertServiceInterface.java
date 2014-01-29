/**
 * AlertServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.mcm;

public interface AlertServiceInterface extends java.rmi.Remote {

    /**
     * Gets the list of alerts matching the specified clients and
     * time period.
     *         
     *         
     * @param selector selects the alerts for which to search.
     *         
     * @return a page of alerts.
     *         
     * @throws ApiException if an error occurs
     */
    public com.google.api.ads.adwords.axis.v201309.mcm.AlertPage get(com.google.api.ads.adwords.axis.v201309.mcm.AlertSelector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201309.cm.ApiException;
}
