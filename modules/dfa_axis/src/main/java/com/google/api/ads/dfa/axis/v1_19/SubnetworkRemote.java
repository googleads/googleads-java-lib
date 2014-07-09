/**
 * SubnetworkRemote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public interface SubnetworkRemote extends java.rmi.Remote {
    public com.google.api.ads.dfa.axis.v1_19.Permission[] getAllAvailablePermissions() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.Permission[] getDefaultPermissions() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.SubnetworkRecordSet getSubnetworks(com.google.api.ads.dfa.axis.v1_19.SubnetworkSearchCriteria subnetworkSearchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.SubnetworkSummaryRecordSet getSubnetworkSummaries(com.google.api.ads.dfa.axis.v1_19.SubnetworkSearchCriteria subnetworkSearchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.SubnetworkSaveResult saveSubnetwork(com.google.api.ads.dfa.axis.v1_19.Subnetwork subnetwork) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.Subnetwork getSubnetwork(long subnetworkId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
}
