/**
 * ConversionTrackerServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.cm;

public interface ConversionTrackerServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of the conversion trackers that match the selector.
     * The
     *         actual objects contained in the page's list of entries will
     * be specific
     *         subclasses of the abstract {@link ConversionTracker} class.
     * 
     *         
     * @param serviceSelector The selector specifying the
     *         {@link ConversionTracker}s to return.
     *         
     * @return List of conversion trackers specified by the selector.
     *         
     * @throws com.google.ads.api.services.common.error.ApiException if problems
     * occurred while retrieving results.
     */
    public com.google.api.ads.adwords.axis.v201402.cm.ConversionTrackerPage get(com.google.api.ads.adwords.axis.v201402.cm.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201402.cm.ApiException;

    /**
     * Applies the list of mutate operations such as adding or updating
     * conversion trackers.
     *         <p class="note"><b>Note:</b> {@link ConversionTrackerOperation}
     * does not support the
     *         <code>REMOVE</code> operator. In order to 'disable' a conversion
     * type, send a
     *         <code>SET</code> operation for the conversion tracker with
     * the <code>status</code>
     *         property set to <code>DISABLED</code></p>
     *         
     *         
     * @param operations A list of mutate operations to perform.
     *         
     * @return The list of the conversion trackers as they appear after mutation,
     * in the same order as they appeared in the list of operations.
     *         
     * @throws com.google.ads.api.services.common.error.ApiException if problems
     * occurred while updating the data.
     */
    public com.google.api.ads.adwords.axis.v201402.cm.ConversionTrackerReturnValue mutate(com.google.api.ads.adwords.axis.v201402.cm.ConversionTrackerOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201402.cm.ApiException;
}
