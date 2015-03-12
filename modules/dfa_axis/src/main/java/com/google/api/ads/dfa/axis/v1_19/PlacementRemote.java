/**
 * PlacementRemote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public interface PlacementRemote extends java.rmi.Remote {
    public com.google.api.ads.dfa.axis.v1_19.PlacementSaveResult savePlacement(com.google.api.ads.dfa.axis.v1_19.Placement placement) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.PlacementGroupRecordSet getPlacementGroupsByCriteria(com.google.api.ads.dfa.axis.v1_19.PlacementGroupSearchCriteria searchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.PlacementUpdateResultSet updatePlacements(com.google.api.ads.dfa.axis.v1_19.PlacementUpdateRequest request) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public void deletePlacement(long id) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.PlacementGroupSaveResult savePlacementGroup(com.google.api.ads.dfa.axis.v1_19.PlacementGroup placementGroup) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public void deletePlacementGroup(long id) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.PlacementGroupType[] getPlacementGroupTypes() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.PlacementType[] getPlacementTypes() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.PlacementTagData getPlacementTagData(long campaignId, com.google.api.ads.dfa.axis.v1_19.PlacementTagCriteria[] placementTagCriterias) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.PlacementTagOption[] getRegularPlacementTagOptions() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.PlacementTagOption[] getMobilePlacementTagOptions() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.PlacementTagOption[] getInterstitialPlacementTagOptions() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.PlacementTagOption[] getInStreamVideoPlacementTagOptions() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.PlacementRecordSet getPlacementsByCriteria(com.google.api.ads.dfa.axis.v1_19.PlacementSearchCriteria searchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.PricingType[] getPricingTypes() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.Placement getPlacement(long id) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.PlacementGroup getPlacementGroup(long id) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
}
