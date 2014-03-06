/**
 * NetworkRemote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public interface NetworkRemote extends java.rmi.Remote {
    public com.google.api.ads.dfa.axis.v1_20.Network getNetwork(long networkId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public void executeAgreement(long agreementId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.AgreementRecordSet getAgreements(com.google.api.ads.dfa.axis.v1_20.AgreementSearchCriteria criteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.Currency[] getCurrencies() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.NetworkSaveResult saveNetwork(com.google.api.ads.dfa.axis.v1_20.Network network) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.LanguageEncoding[] getLanguageEncodingList() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.TimeZone[] getTimeZoneList() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.Permission[] getAllPermissions() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.NetworkPermission[] getAllNetworkPermissions() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.AdministratorPermission[] getAdministratorPermissions() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.WidgetImageUploadResponse uploadNetworkWidgetImage(com.google.api.ads.dfa.axis.v1_20.WidgetImageUploadRequest request) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.NetworkRecordSet getNetworks(com.google.api.ads.dfa.axis.v1_20.NetworkSearchCriteria networkSearchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.NetworkPermission[] getAssignedNetworkPermissions(long networkId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
}
