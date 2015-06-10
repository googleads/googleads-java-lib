/**
 * SiteRemote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public interface SiteRemote extends java.rmi.Remote {
    public com.google.api.ads.dfa.axis.v1_20.DfaSiteContactType[] getAvailableDfaSiteContactTypes() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.SiteRecordSet getSitesByCriteria(com.google.api.ads.dfa.axis.v1_20.SiteSearchCriteria searchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public void linkDfaSiteToSiteDirectorySite(long dfaSiteId, long siteDirectorySiteId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.SiteDirectoryDfaSiteMappingResult[] linkDfaSitesToSiteDirectorySites(com.google.api.ads.dfa.axis.v1_20.SiteDirectoryDfaSiteMappingRequest[] requests) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.SiteDirectorySiteImportResult[] importSiteDirectorySites(com.google.api.ads.dfa.axis.v1_20.SiteDirectorySiteImportRequest[] requests) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.SiteSaveResult saveSiteDirectorySite(com.google.api.ads.dfa.axis.v1_20.Site site) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.DfaSite getDfaSite(long dfaSiteId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.DfaSiteRecordSet getDfaSites(com.google.api.ads.dfa.axis.v1_20.DfaSiteSearchCriteria sc) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.DfaSiteSaveResult saveDfaSite(com.google.api.ads.dfa.axis.v1_20.DfaSite dfaSite) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.ContactRecordSet getContacts(com.google.api.ads.dfa.axis.v1_20.ContactSearchCriteria sc) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
}
