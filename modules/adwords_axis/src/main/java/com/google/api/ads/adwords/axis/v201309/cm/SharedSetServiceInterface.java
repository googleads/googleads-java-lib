/**
 * SharedSetServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;

public interface SharedSetServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of SharedSets based on the given selector.
     *         
     * @param selector the selector specifying the query
     *         
     * @return a list of SharedSet entities that meet the criterion specified
     * by the selector
     *         
     * @throws ApiException
     */
    public com.google.api.ads.adwords.axis.v201309.cm.SharedSetPage get(com.google.api.ads.adwords.axis.v201309.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201309.cm.ApiException;

    /**
     * Applies the list of mutate operations.
     *         
     * @param operations the operations to apply
     *         
     * @return the modified CriterionList entities
     *         
     * @throws ApiException
     */
    public com.google.api.ads.adwords.axis.v201309.cm.SharedSetReturnValue mutate(com.google.api.ads.adwords.axis.v201309.cm.SharedSetOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201309.cm.ApiException;
}
