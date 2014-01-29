/**
 * ChangeLogRemote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public interface ChangeLogRemote extends java.rmi.Remote {
    public com.google.api.ads.dfa.axis.v1_19.ChangeLogRecord getChangeLogRecordForObjectType(long id, long objectTypeId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.ChangeLogRecordSet getChangeLogRecords(com.google.api.ads.dfa.axis.v1_19.ChangeLogRecordSearchCriteria criteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.ChangeLogObjectType[] getChangeLogObjectTypes() throws java.rmi.RemoteException;
    public void updateChangeLogRecordComments(long changeLogRecordId, java.lang.String comments) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public void updateChangeLogRecordCommentsForObjectType(long changeLogRecordId, java.lang.String comments, long objectTypeId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.ChangeLogRecord getChangeLogRecord(long id) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
}
