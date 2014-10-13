/**
 * SizeRemote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public interface SizeRemote extends java.rmi.Remote {
    public com.google.api.ads.dfa.axis.v1_19.SizeSaveResult saveSize(com.google.api.ads.dfa.axis.v1_19.Size size) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.Size getSize(long id) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.SizeRecordSet getSizes(com.google.api.ads.dfa.axis.v1_19.SizeSearchCriteria searchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
}
