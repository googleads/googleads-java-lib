/**
 * CreativeGroupRemote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public interface CreativeGroupRemote extends java.rmi.Remote {
    public void deleteCreativeGroup(long creativeGroupId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.CreativeGroupSaveResult saveCreativeGroup(com.google.api.ads.dfa.axis.v1_20.CreativeGroup creativeGroup) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.CreativeGroupRecordSet getCreativeGroups(com.google.api.ads.dfa.axis.v1_20.CreativeGroupSearchCriteria searchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.CreativeGroup getCreativeGroup(long id) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
}
