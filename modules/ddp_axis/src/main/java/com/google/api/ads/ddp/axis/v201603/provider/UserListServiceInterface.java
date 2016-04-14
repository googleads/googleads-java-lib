/**
 * UserListServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.ddp.axis.v201603.provider;

public interface UserListServiceInterface extends java.rmi.Remote {

    /**
     * Returns the list of user lists that meet the selector criteria.
     * 
     *         
     * @param serviceSelector the selector specifying the {@link UserList}s
     * to return.
     *         
     * @return a list of UserList entities which meet the selector criteria.
     * 
     * @throws ApiException if problems occurred while fetching UserList
     * information.
     */
    public com.google.api.ads.ddp.axis.v201603.provider.UserListPage get(com.google.api.ads.ddp.axis.v201603.provider.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.ddp.axis.v201603.provider.ApiException;

    /**
     * Applies a list of mutate operations (i.e. add, set):
     * 
     *         Add - creates a set of user lists
     *         Set - updates a set of user lists
     *         Remove - not supported
     * 
     *         
     * @param operations the operations to apply
     *         
     * @return a list of UserList objects
     */
    public com.google.api.ads.ddp.axis.v201603.provider.UserListReturnValue mutate(com.google.api.ads.ddp.axis.v201603.provider.UserListOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.ddp.axis.v201603.provider.ApiException;
}
