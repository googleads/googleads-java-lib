/**
 * SiteRemote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public interface SiteRemote extends java.rmi.Remote {
    public void linkDfaSiteToSiteDirectorySite(long dfaSiteId, long siteDirectorySiteId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.SiteDirectoryDfaSiteMappingResult[] linkDfaSitesToSiteDirectorySites(com.google.api.ads.dfa.axis.v1_19.SiteDirectoryDfaSiteMappingRequest[] requests) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.SiteDirectorySiteImportResult[] importSiteDirectorySites(com.google.api.ads.dfa.axis.v1_19.SiteDirectorySiteImportRequest[] requests) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.SiteSaveResult saveSiteDirectorySite(com.google.api.ads.dfa.axis.v1_19.Site site) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.DfaSite getDfaSite(long dfaSiteId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.DfaSiteRecordSet getDfaSites(com.google.api.ads.dfa.axis.v1_19.DfaSiteSearchCriteria sc) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.DfaSiteSaveResult saveDfaSite(com.google.api.ads.dfa.axis.v1_19.DfaSite dfaSite) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.DfaSiteContactType[] getAvailableDfaSiteContactTypes() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.SiteRecordSet getSitesByCriteria(com.google.api.ads.dfa.axis.v1_19.SiteSearchCriteria searchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.ContactRecordSet getContacts(com.google.api.ads.dfa.axis.v1_19.ContactSearchCriteria sc) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
}
