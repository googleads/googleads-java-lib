/**
 * CustomerServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.mcm;

public interface CustomerServiceInterface extends java.rmi.Remote {

    /**
     * Returns details of the authorized customer.
     *         
     *         
     * @return customer associated with the caller
     */
    public com.google.api.ads.adwords.axis.v201306.mcm.Customer get() throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201306.cm.ApiException;
}
