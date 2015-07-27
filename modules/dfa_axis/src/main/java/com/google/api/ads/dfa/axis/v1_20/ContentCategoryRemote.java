/**
 * ContentCategoryRemote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public interface ContentCategoryRemote extends java.rmi.Remote {
    public com.google.api.ads.dfa.axis.v1_20.ContentCategoryRecordSet getContentCategories(com.google.api.ads.dfa.axis.v1_20.ContentCategorySearchCriteria searchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public void deleteContentCategory(long contentCategoryId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.ContentCategorySaveResult saveContentCategory(com.google.api.ads.dfa.axis.v1_20.ContentCategory contentCategory) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.ContentCategory getContentCategory(long contentCategoryId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
}
