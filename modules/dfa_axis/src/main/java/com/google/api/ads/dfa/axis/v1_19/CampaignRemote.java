/**
 * CampaignRemote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public interface CampaignRemote extends java.rmi.Remote {
    public void deleteCampaign(long campaignId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.LandingPageRecordSet getLandingPagesForCampaign(long nCampaignId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public boolean addLandingPageToCampaign(long nCampaignId, com.google.api.ads.dfa.axis.v1_19.LandingPage[] landingPages) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.CampaignRecordSet getCampaignsByCriteria(com.google.api.ads.dfa.axis.v1_19.CampaignSearchCriteria searchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.CampaignMigrationResult migrateCampaign(com.google.api.ads.dfa.axis.v1_19.CampaignMigrationRequest campaignMigrationRequest) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.CampaignCopyResult[] copyCampaigns(com.google.api.ads.dfa.axis.v1_19.CampaignCopyRequest[] campaignCopyRequests) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.CampaignSaveResult saveCampaign(com.google.api.ads.dfa.axis.v1_19.Campaign campaign) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.Campaign getCampaign(long id) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.LandingPageSaveResult saveLandingPage(com.google.api.ads.dfa.axis.v1_19.LandingPage landingPage) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
}
