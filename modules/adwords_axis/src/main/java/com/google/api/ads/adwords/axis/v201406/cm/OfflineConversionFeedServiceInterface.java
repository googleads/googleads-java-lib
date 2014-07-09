/**
 * OfflineConversionFeedServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.cm;

public interface OfflineConversionFeedServiceInterface extends java.rmi.Remote {

    /**
     * Reports an offline conversion for each entry in {@code operations}.
     * <p>
     *         This bulk operation does not have any transactional guarantees.
     * Some operations can succeed
     *         while others fail.
     *         
     *         
     * @param operations A list of offline conversion feed operations.
     *         
     * @return The list of offline conversion feed results (in the same order
     * as the operations).
     *         
     * @throws {@link ApiException} if problems occurred while applying offline
     * conversions.
     */
    public com.google.api.ads.adwords.axis.v201406.cm.OfflineConversionFeedReturnValue mutate(com.google.api.ads.adwords.axis.v201406.cm.OfflineConversionFeedOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201406.cm.ApiException;
}
