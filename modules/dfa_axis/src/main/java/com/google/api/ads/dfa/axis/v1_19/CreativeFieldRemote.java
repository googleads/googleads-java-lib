/**
 * CreativeFieldRemote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public interface CreativeFieldRemote extends java.rmi.Remote {
    public com.google.api.ads.dfa.axis.v1_19.CreativeFieldSaveResult saveCreativeField(com.google.api.ads.dfa.axis.v1_19.CreativeField creativeField) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public void deleteCreativeField(long creativeFieldId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.CreativeFieldRecordSet getCreativeFields(com.google.api.ads.dfa.axis.v1_19.CreativeFieldSearchCriteria creativeFieldSearchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.CreativeField getCreativeField(long creativeFieldId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.CreativeFieldValueRecordSet getCreativeFieldValues(com.google.api.ads.dfa.axis.v1_19.CreativeFieldValueSearchCriteria creativeFieldValueSearchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.CreativeFieldValue getCreativeFieldValue(long creativeFieldValueId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.CreativeFieldValueSaveResult saveCreativeFieldValue(com.google.api.ads.dfa.axis.v1_19.CreativeFieldValue creativeFieldValue) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public void deleteCreativeFieldValue(long creativeFieldValueId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
}
