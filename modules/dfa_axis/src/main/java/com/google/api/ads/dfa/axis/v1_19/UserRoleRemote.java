/**
 * UserRoleRemote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public interface UserRoleRemote extends java.rmi.Remote {
    public com.google.api.ads.dfa.axis.v1_19.UserRoleSaveResult saveUserRole(com.google.api.ads.dfa.axis.v1_19.UserRole userGroup) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public void deleteUserRole(long id) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.UserRoleSummaryRecordSet getUserRoleSummaries(com.google.api.ads.dfa.axis.v1_19.UserRoleSearchCriteria searchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.UserRoleRecordSet getUserRoles(com.google.api.ads.dfa.axis.v1_19.UserRoleSearchCriteria criteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.Permission[] getAvailablePermissions(long subnetworkId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.UserRole getUserRole(long id) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
}
