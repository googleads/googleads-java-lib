/**
 * UserRemote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public interface UserRemote extends java.rmi.Remote {
    public com.google.api.ads.dfa.axis.v1_20.UserSaveResult saveUser(com.google.api.ads.dfa.axis.v1_20.User user) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public java.lang.String generateUniqueUsername(java.lang.String username) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.UserRecordSet getUsersByCriteria(com.google.api.ads.dfa.axis.v1_20.UserSearchCriteria searchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public void sendUserInvitationEmail(com.google.api.ads.dfa.axis.v1_20.UserInvitationEmailRequest emailRequest) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.UserFilterType[] getAvailableUserFilterTypes() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.UserFilterCriteriaType[] getAvailableUserFilterCriteriaTypes() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.TraffickerType[] getAvailableTraffickerTypes() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.User getUser(long userId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
}
