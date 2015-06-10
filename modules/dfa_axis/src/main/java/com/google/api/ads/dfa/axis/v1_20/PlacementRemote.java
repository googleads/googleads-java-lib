/**
 * PlacementRemote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public interface PlacementRemote extends java.rmi.Remote {
    public com.google.api.ads.dfa.axis.v1_20.PlacementSaveResult savePlacement(com.google.api.ads.dfa.axis.v1_20.Placement placement) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public void deletePlacement(long id) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.PlacementGroupSaveResult savePlacementGroup(com.google.api.ads.dfa.axis.v1_20.PlacementGroup placementGroup) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public void deletePlacementGroup(long id) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.PlacementGroupType[] getPlacementGroupTypes() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.PlacementType[] getPlacementTypes() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.PlacementTagData getPlacementTagData(long campaignId, com.google.api.ads.dfa.axis.v1_20.PlacementTagCriteria[] placementTagCriterias) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.PlacementTagOption[] getRegularPlacementTagOptions() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.PlacementTagOption[] getMobilePlacementTagOptions() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.PlacementTagOption[] getInterstitialPlacementTagOptions() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.PlacementTagOption[] getInStreamVideoPlacementTagOptions() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.PlacementRecordSet getPlacementsByCriteria(com.google.api.ads.dfa.axis.v1_20.PlacementSearchCriteria searchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.PlacementGroupRecordSet getPlacementGroupsByCriteria(com.google.api.ads.dfa.axis.v1_20.PlacementGroupSearchCriteria searchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.PlacementUpdateResultSet updatePlacements(com.google.api.ads.dfa.axis.v1_20.PlacementUpdateRequest request) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.PlacementSummaryRecordSet getPlacementSummaryRecordSet(com.google.api.ads.dfa.axis.v1_20.PlacementSummarySearchCriteria criteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public boolean updateProgrammaticSetting(long placementId, com.google.api.ads.dfa.axis.v1_20.ProgrammaticSetting request) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.PricingType[] getPricingTypes() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.ProgrammaticSetting getProgrammaticSetting(long placementId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.Placement getPlacement(long id) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.PlacementGroup getPlacementGroup(long id) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
}
