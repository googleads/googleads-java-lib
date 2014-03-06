/**
 * SubnetworkRemote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public interface SubnetworkRemote extends java.rmi.Remote {
    public com.google.api.ads.dfa.axis.v1_20.Subnetwork getSubnetwork(long subnetworkId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.Permission[] getDefaultPermissions() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.SubnetworkRecordSet getSubnetworks(com.google.api.ads.dfa.axis.v1_20.SubnetworkSearchCriteria subnetworkSearchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.SubnetworkSummaryRecordSet getSubnetworkSummaries(com.google.api.ads.dfa.axis.v1_20.SubnetworkSearchCriteria subnetworkSearchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.SubnetworkSaveResult saveSubnetwork(com.google.api.ads.dfa.axis.v1_20.Subnetwork subnetwork) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.Permission[] getAllAvailablePermissions() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
}
