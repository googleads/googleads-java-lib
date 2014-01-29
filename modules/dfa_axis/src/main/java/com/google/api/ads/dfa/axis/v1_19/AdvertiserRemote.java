/**
 * AdvertiserRemote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public interface AdvertiserRemote extends java.rmi.Remote {
    public void deleteAdvertiser(long advertiserId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.AdvertiserSaveResult saveAdvertiser(com.google.api.ads.dfa.axis.v1_19.Advertiser advertiser) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.AdvertiserRecordSet getAdvertisers(com.google.api.ads.dfa.axis.v1_19.AdvertiserSearchCriteria advertiserSearchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
}
