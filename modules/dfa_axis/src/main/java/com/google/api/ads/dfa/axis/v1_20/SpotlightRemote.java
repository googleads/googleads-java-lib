/**
 * SpotlightRemote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public interface SpotlightRemote extends java.rmi.Remote {
    public com.google.api.ads.dfa.axis.v1_20.SpotlightConfiguration getSpotlightConfiguration(long id) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.SpotlightActivityRecordSet getSpotlightActivities(com.google.api.ads.dfa.axis.v1_20.SpotlightActivitySearchCriteria searchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.SpotlightActivity getSpotlightActivity(long spotlightActivityId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.SpotlightActivitySaveResult saveSpotlightActivity(com.google.api.ads.dfa.axis.v1_20.SpotlightActivity spotlightActivity) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.SpotlightConfigurationSaveResult saveSpotlightConfiguration(com.google.api.ads.dfa.axis.v1_20.SpotlightConfiguration spotlightConfiguration) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.SpotlightActivityGroupSaveResult saveSpotlightActivityGroup(com.google.api.ads.dfa.axis.v1_20.SpotlightActivityGroup spotlightActivityGroup) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.CustomSpotlightVariable[] getAvailableCustomSpotlightVariables() throws java.rmi.RemoteException;
    public com.google.api.ads.dfa.axis.v1_20.StandardVariable[] getAvailableStandardVariables() throws java.rmi.RemoteException;
    public com.google.api.ads.dfa.axis.v1_20.Country[] getCountriesByCriteria(com.google.api.ads.dfa.axis.v1_20.CountrySearchCriteria searchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.SpotlightActivityGroupRecordSet getSpotlightActivityGroups(com.google.api.ads.dfa.axis.v1_20.SpotlightActivityGroupSearchCriteria searchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.SpotlightActivityType[] getSpotlightActivityTypes() throws java.rmi.RemoteException;
    public com.google.api.ads.dfa.axis.v1_20.SpotlightTagCodeType[] getSpotlightTagCodeTypes() throws java.rmi.RemoteException;
    public com.google.api.ads.dfa.axis.v1_20.SpotlightTagFormatType[] getSpotlightTagFormatTypes() throws java.rmi.RemoteException;
    public com.google.api.ads.dfa.axis.v1_20.SpotlightTagMethodType[] getSpotlightTagMethodTypes() throws java.rmi.RemoteException;
    public com.google.api.ads.dfa.axis.v1_20.SpotlightActivityImageTagsSaveResult[] updateActivityImageTags(com.google.api.ads.dfa.axis.v1_20.SpotlightActivityImageTagsSaveRequest request) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public void deleteSpotlightActivity(long spolightActivityId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public void deleteSpotlightActivityGroup(long spolightActivityGroupId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public java.lang.String generateTags(long[] activityIds) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
}
