/**
 * PlacementStrategyRemote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public interface PlacementStrategyRemote extends java.rmi.Remote {
    public void deletePlacementStrategy(long placementStrategyId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.PlacementStrategyRecordSet getPlacementStrategiesByCriteria(com.google.api.ads.dfa.axis.v1_20.PlacementStrategySearchCriteria placementStrategySearchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.PlacementStrategySaveResult savePlacementStrategy(com.google.api.ads.dfa.axis.v1_20.PlacementStrategy placementStrategy) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.PlacementStrategy getPlacementStrategy(long placementStrategyId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
}
