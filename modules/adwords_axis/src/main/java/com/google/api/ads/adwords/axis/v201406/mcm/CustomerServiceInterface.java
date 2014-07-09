/**
 * CustomerServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.mcm;

public interface CustomerServiceInterface extends java.rmi.Remote {

    /**
     * Returns details of the authorized customer.
     *         
     *         
     * @return customer associated with the caller
     */
    public com.google.api.ads.adwords.axis.v201406.mcm.Customer get() throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201406.cm.ApiException;

    /**
     * Update an authorized customer. The only update currently provided
     * is to enable or disable <a
     *         href="https://support.google.com/analytics/answer/1033981?hl=en">
     * auto-tagging </a>; see that
     *         link for special cases affecting the use of auto-tagging.
     *         
     *         
     * @param customer the requested updated value for the customer.
     *         
     * @throws ApiException
     */
    public com.google.api.ads.adwords.axis.v201406.mcm.Customer mutate(com.google.api.ads.adwords.axis.v201406.mcm.Customer customer) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201406.cm.ApiException;
}
