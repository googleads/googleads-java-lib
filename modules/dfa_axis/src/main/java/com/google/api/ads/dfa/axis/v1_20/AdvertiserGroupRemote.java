/**
 * AdvertiserGroupRemote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public interface AdvertiserGroupRemote extends java.rmi.Remote {
    public void assignAdvertisersToAdvertiserGroup(long advertiserGroupId, long[] advertiserIds) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.AdvertiserGroupSaveResult saveAdvertiserGroup(com.google.api.ads.dfa.axis.v1_20.AdvertiserGroup advertiserGroup) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public void deleteAdvertiserGroup(long advertiserGroupId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.AdvertiserGroupRecordSet getAdvertiserGroups(com.google.api.ads.dfa.axis.v1_20.AdvertiserGroupSearchCriteria searchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.AdvertiserGroup getAdvertiserGroup(long advertiserGroupId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
}
