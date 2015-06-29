/**
 * UserRemote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public interface UserRemote extends java.rmi.Remote {
    public java.lang.String generateUniqueUsername(java.lang.String username) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public void sendUserInvitationEmail(com.google.api.ads.dfa.axis.v1_19.UserInvitationEmailRequest emailRequest) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.UserFilterType[] getAvailableUserFilterTypes() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.UserFilterCriteriaType[] getAvailableUserFilterCriteriaTypes() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.TraffickerType[] getAvailableTraffickerTypes() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.UserRecordSet getUsersByCriteria(com.google.api.ads.dfa.axis.v1_19.UserSearchCriteria searchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.UserSaveResult saveUser(com.google.api.ads.dfa.axis.v1_19.User user) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.User getUser(long userId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
}
