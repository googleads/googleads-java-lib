/**
 * CreativeRemote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public interface CreativeRemote extends java.rmi.Remote {
    public com.google.api.ads.dfa.axis.v1_19.CreativeAssetRecordSet getCreativeAssets(com.google.api.ads.dfa.axis.v1_19.CreativeAssetSearchCriteria searchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.CreativeSaveResult saveCreative(com.google.api.ads.dfa.axis.v1_19.CreativeBase creativeBase, long campaignId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.CreativeRecordSet getCreatives(com.google.api.ads.dfa.axis.v1_19.CreativeSearchCriteria searchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.CreativeAssetSaveResult saveCreativeAsset(com.google.api.ads.dfa.axis.v1_19.CreativeAsset creativeAsset) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.CreativeCampaignAssociationResult[] associateCreativesToCampaign(long campaignId, long[] creativeIds) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.CreativeCopyResult[] copyCreative(com.google.api.ads.dfa.axis.v1_19.CreativeCopyRequest[] copyRequests) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.CreativeRenderingResult[] getCreativeRenderings(com.google.api.ads.dfa.axis.v1_19.CreativeRenderingRequest request) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.RichMediaCreativeBase uploadRichMediaAsset(com.google.api.ads.dfa.axis.v1_19.RichMediaAssetUploadRequest uploadRequest) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.RichMediaCreativeBase replaceRichMediaAsset(java.lang.String oldAssetFileName, com.google.api.ads.dfa.axis.v1_19.RichMediaAssetUploadRequest replaceRequest) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.RichMediaCreativeBase deleteRichMediaAsset(long creativeId, java.lang.String assetFileName) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.RichMediaCreativeBase uploadRichMediaCreativePackage(long advertiserId, byte[] fileData, boolean uploadAsFlashInFlashCreative) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.RichMediaCreativeBase replaceRichMediaCreativePackage(long creativeId, byte[] fileData) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public java.lang.String getRichMediaPreviewURL(long creativeId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.InStreamVideoCreative uploadInStreamAsset(com.google.api.ads.dfa.axis.v1_19.InStreamAssetUploadRequest assetUploadRequest) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.InStreamVideoCreative deleteInStreamAsset(long creativeId, java.lang.String assetName) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.InStreamVideoCreative replaceInStreamAsset(java.lang.String assetName, com.google.api.ads.dfa.axis.v1_19.InStreamAssetUploadRequest assetReplaceRequest) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.CreativeUploadSession generateCreativeUploadSession(com.google.api.ads.dfa.axis.v1_19.CreativeUploadSessionRequest creativeUploadSessionRequest) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.CreativeUploadSession uploadCreativeFiles(com.google.api.ads.dfa.axis.v1_19.CreativeUploadRequest uploadRequest) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.CreativeUploadSession getCompleteCreativeUploadSession(com.google.api.ads.dfa.axis.v1_19.CreativeUploadSessionSummary uploadSession) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.CreativeUploadSession createCreativesFromCreativeUploadSession(com.google.api.ads.dfa.axis.v1_19.CreativeUploadSession uploadSession) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public void deleteCreative(long creativeId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.CreativePlacementAssignmentResult[] assignCreativesToPlacements(com.google.api.ads.dfa.axis.v1_19.CreativePlacementAssignment[] creativePlacementAssignments) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.CreativeType[] getCreativeTypes() throws java.rmi.RemoteException;
    public com.google.api.ads.dfa.axis.v1_19.CreativeBase getCreative(long creativeId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
}
