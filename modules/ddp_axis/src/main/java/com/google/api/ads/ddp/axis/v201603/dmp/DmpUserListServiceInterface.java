/**
 * DmpUserListServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.ddp.axis.v201603.dmp;

public interface DmpUserListServiceInterface extends java.rmi.Remote {

    /**
     * Returns the list of user lists that meet the selector criteria
     * for a DMP.
     *                 The DMP customer must have permission to get or modify
     * the data, in the
     *                 given client customer.
     * 
     *                 
     * @param clientCustomerId id of the client customer.
     *                 
     * @param selector the selector specifying the {@link UserList}s to return.
     * 
     * @return a list of UserList entities which meet the selector criteria.
     * 
     * @throws ApiException if problems occurred while fetching UserList
     * information.
     */
    public com.google.api.ads.ddp.axis.v201603.dmp.UserListPage get(com.google.api.ads.ddp.axis.v201603.dmp.ClientCustomerId clientCustomerId, com.google.api.ads.ddp.axis.v201603.dmp.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.ddp.axis.v201603.dmp.ApiException;

    /**
     * Applies a list of mutate operations (i.e. add, set):
     * 
     *                 Add - creates a set of user lists
     *                 Set - updates a set of user list
     *                 Remove - not supported
     * 
     *                 for a DMP. The DMP customer must have permission to
     * get or modify the data,
     *                 in the given client customer.
     * 
     *                 
     * @param clientCustomerId id of the client customer.
     *                 
     * @param operations the operations to apply
     *                 
     * @return a list of UserList objects
     */
    public com.google.api.ads.ddp.axis.v201603.dmp.UserListReturnValue mutate(com.google.api.ads.ddp.axis.v201603.dmp.ClientCustomerId clientCustomerId, com.google.api.ads.ddp.axis.v201603.dmp.UserListOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.ddp.axis.v201603.dmp.ApiException;
}
