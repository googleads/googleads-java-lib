/**
 * LoginRemote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public interface LoginRemote extends java.rmi.Remote {
    public com.google.api.ads.dfa.axis.v1_20.UserProfile authenticate(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.UserProfile impersonateNetwork(java.lang.String username, java.lang.String token, long networkId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.UserProfile changePassword(com.google.api.ads.dfa.axis.v1_20.ChangePasswordRequest changePasswordRequest) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.UserProfile impersonateUser(java.lang.String username, java.lang.String token, java.lang.String userToImpersonate) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
}
