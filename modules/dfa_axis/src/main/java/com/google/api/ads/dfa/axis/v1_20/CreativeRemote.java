/**
 * CreativeRemote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public interface CreativeRemote extends java.rmi.Remote {
    public com.google.api.ads.dfa.axis.v1_20.CreativeAssetRecordSet getCreativeAssets(com.google.api.ads.dfa.axis.v1_20.CreativeAssetSearchCriteria searchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.CreativeRecordSet getCreatives(com.google.api.ads.dfa.axis.v1_20.CreativeSearchCriteria searchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.CreativeSaveResult saveCreative(com.google.api.ads.dfa.axis.v1_20.CreativeBase creativeBase, long campaignId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.CreativeCopyResult[] copyCreative(com.google.api.ads.dfa.axis.v1_20.CreativeCopyRequest[] copyRequests) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.RichMediaCreativeBase uploadRichMediaAsset(com.google.api.ads.dfa.axis.v1_20.RichMediaAssetUploadRequest uploadRequest) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.RichMediaCreativeBase replaceRichMediaAsset(java.lang.String oldAssetFileName, com.google.api.ads.dfa.axis.v1_20.RichMediaAssetUploadRequest replaceRequest) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.RichMediaCreativeBase deleteRichMediaAsset(long creativeId, java.lang.String assetFileName) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.RichMediaCreativeBase uploadRichMediaCreativePackage(long advertiserId, byte[] fileData, boolean uploadAsFlashInFlashCreative) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.RichMediaCreativeBase replaceRichMediaCreativePackage(long creativeId, byte[] fileData) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public java.lang.String getRichMediaPreviewURL(long creativeId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.InStreamVideoCreative uploadInStreamAsset(com.google.api.ads.dfa.axis.v1_20.InStreamAssetUploadRequest assetUploadRequest) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.InStreamVideoCreative deleteInStreamAsset(long creativeId, java.lang.String assetName) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.InStreamVideoCreative replaceInStreamAsset(java.lang.String assetName, com.google.api.ads.dfa.axis.v1_20.InStreamAssetUploadRequest assetReplaceRequest) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.RichMediaStandardEvent[] getRichMediaStandardEvents() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.CreativeUploadSession generateCreativeUploadSession(com.google.api.ads.dfa.axis.v1_20.CreativeUploadSessionRequest creativeUploadSessionRequest) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.CreativeUploadSession uploadCreativeFiles(com.google.api.ads.dfa.axis.v1_20.CreativeUploadRequest uploadRequest) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.CreativeUploadSession getCompleteCreativeUploadSession(com.google.api.ads.dfa.axis.v1_20.CreativeUploadSessionSummary uploadSession) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.CreativeUploadSession createCreativesFromCreativeUploadSession(com.google.api.ads.dfa.axis.v1_20.CreativeUploadSession uploadSession) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public void deleteCreative(long creativeId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.CreativeAssetSaveResult saveCreativeAsset(com.google.api.ads.dfa.axis.v1_20.CreativeAsset creativeAsset) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.CreativeCampaignAssociationResult[] associateCreativesToCampaign(long campaignId, long[] creativeIds) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.CreativeRenderingResult[] getCreativeRenderings(com.google.api.ads.dfa.axis.v1_20.CreativeRenderingRequest request) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.CreativePlacementAssignmentResult[] assignCreativesToPlacements(com.google.api.ads.dfa.axis.v1_20.CreativePlacementAssignment[] creativePlacementAssignments) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.CreativeType[] getCreativeTypes() throws java.rmi.RemoteException;
    public com.google.api.ads.dfa.axis.v1_20.CreativeBase getCreative(long creativeId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
}
