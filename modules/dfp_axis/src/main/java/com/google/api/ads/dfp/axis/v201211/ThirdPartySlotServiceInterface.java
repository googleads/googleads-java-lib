/**
 * ThirdPartySlotServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201211;

public interface ThirdPartySlotServiceInterface extends java.rmi.Remote {

    /**
     * Creates a new {@link ThirdPartySlot}.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link ThirdPartySlot#companyId}</li>
     *         <li>{@link ThirdPartySlot#externalUniqueId}</li>
     *         <li>{@link ThirdPartySlot#externalUniqueName}</li>
     *         <li>{@link ThirdPartySlot#description}</li>
     *         </ul>
     *         
     *         
     * @param thirdPartySlot the third-party slot to create
     *         
     * @return the new third-party slot with its ID filled in
     */
    public com.google.api.ads.dfp.axis.v201211.ThirdPartySlot createThirdPartySlot(com.google.api.ads.dfp.axis.v201211.ThirdPartySlot thirdPartySlot) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201211.ApiException;

    /**
     * Gets a {@link ThirdPartySlotPage} of {@link ThirdPartySlot}
     * objects that
     *         satisfy the filter query.
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of third-party slots
     *         
     * @return the third-party slots that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201211.ThirdPartySlotPage getThirdPartySlotsByStatement(com.google.api.ads.dfp.axis.v201211.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201211.ApiException;

    /**
     * Performs actions on {@link ThirdPartySlot} objects that match
     * the given
     *         {@link Statement#query}.
     *         
     *         
     * @param thirdPartySlotAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of third-party slots
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.axis.v201211.UpdateResult performThirdPartySlotAction(com.google.api.ads.dfp.axis.v201211.ThirdPartySlotAction thirdPartySlotAction, com.google.api.ads.dfp.axis.v201211.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201211.ApiException;

    /**
     * Updates the specified {@link ThirdPartySlot}.
     *         
     *         
     * @param thirdPartySlot the third-party slot to update
     *         
     * @return the updated third-party slot
     */
    public com.google.api.ads.dfp.axis.v201211.ThirdPartySlot updateThirdPartySlot(com.google.api.ads.dfp.axis.v201211.ThirdPartySlot thirdPartySlot) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201211.ApiException;
}
