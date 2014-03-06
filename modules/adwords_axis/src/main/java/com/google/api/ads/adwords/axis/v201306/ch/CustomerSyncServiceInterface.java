/**
 * CustomerSyncServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.ch;

public interface CustomerSyncServiceInterface extends java.rmi.Remote {

    /**
     * Returns information about changed entities inside a customer's
     * account.
     *         
     *         
     * @param selector Specifies the filter for selecting changehistory events
     * for a customer.
     *         
     * @return A Customer->Campaign->AdGroup hierarchy containing information
     * about the objects
     *         changed at each level.  All Campaigns that are requested in
     * the selector will be returned,
     *         regardless of whether or not they have changed, but unchanged
     * AdGroups will be ignored.
     */
    public com.google.api.ads.adwords.axis.v201306.ch.CustomerChangeData get(com.google.api.ads.adwords.axis.v201306.ch.CustomerSyncSelector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201306.cm.ApiException;
}
