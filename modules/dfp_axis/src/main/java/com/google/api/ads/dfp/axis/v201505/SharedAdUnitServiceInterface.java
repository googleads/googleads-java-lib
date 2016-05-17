/**
 * SharedAdUnitServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201505;

public interface SharedAdUnitServiceInterface extends java.rmi.Remote {

    /**
     * <b>This method is deprecated and returns null.
     *         <p>Instead, use {@link InventoryUnitService#getAdUnitsByStatement}
     * filtering on
     *         {@code isSharedByDistributor = true}.
     */
    public com.google.api.ads.dfp.axis.v201505.SharedAdUnitPage getSharedAdUnitsByStatement(com.google.api.ads.dfp.axis.v201505.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201505.ApiException;

    /**
     * <b>This method is deprecated and is a no-op.</b>
     *         
     *         <p>Performs actions on shared ad unit objects that match the
     * given
     *         {@link Statement#query}.
     *         
     *         
     * @param sharedAdUnitAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of shared ad units
     *         
     * @return the result of the update action, which contains the number
     * of shared ad units
     *         on which the action was performed.
     */
    public com.google.api.ads.dfp.axis.v201505.UpdateResult performSharedAdUnitAction(com.google.api.ads.dfp.axis.v201505.SharedAdUnitAction sharedAdUnitAction, com.google.api.ads.dfp.axis.v201505.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201505.ApiException;
}
