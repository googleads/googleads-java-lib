/**
 * SpotlightRemote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public interface SpotlightRemote extends java.rmi.Remote {
    public com.google.api.ads.dfa.axis.v1_19.SpotlightConfiguration getSpotlightConfiguration(long id) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.SpotlightActivityRecordSet getSpotlightActivities(com.google.api.ads.dfa.axis.v1_19.SpotlightActivitySearchCriteria searchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.SpotlightActivity getSpotlightActivity(long spotlightActivityId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.SpotlightActivitySaveResult saveSpotlightActivity(com.google.api.ads.dfa.axis.v1_19.SpotlightActivity spotlightActivity) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.SpotlightConfigurationSaveResult saveSpotlightConfiguration(com.google.api.ads.dfa.axis.v1_19.SpotlightConfiguration spotlightConfiguration) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.SpotlightActivityGroupSaveResult saveSpotlightActivityGroup(com.google.api.ads.dfa.axis.v1_19.SpotlightActivityGroup spotlightActivityGroup) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.SpotlightActivityImageTagsSaveResult[] updateActivityImageTags(com.google.api.ads.dfa.axis.v1_19.SpotlightActivityImageTagsSaveRequest request) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.CustomSpotlightVariable[] getAvailableCustomSpotlightVariables() throws java.rmi.RemoteException;
    public com.google.api.ads.dfa.axis.v1_19.SpotlightTagMethodType[] getSpotlightTagMethodTypes() throws java.rmi.RemoteException;
    public void deleteSpotlightActivity(long spolightActivityId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public void deleteSpotlightActivityGroup(long spolightActivityGroupId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.StandardVariable[] getAvailableStandardVariables() throws java.rmi.RemoteException;
    public com.google.api.ads.dfa.axis.v1_19.Country[] getCountriesByCriteria(com.google.api.ads.dfa.axis.v1_19.CountrySearchCriteria searchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.SpotlightActivityGroupRecordSet getSpotlightActivityGroups(com.google.api.ads.dfa.axis.v1_19.SpotlightActivityGroupSearchCriteria searchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.SpotlightActivityType[] getSpotlightActivityTypes() throws java.rmi.RemoteException;
    public com.google.api.ads.dfa.axis.v1_19.SpotlightTagCodeType[] getSpotlightTagCodeTypes() throws java.rmi.RemoteException;
    public com.google.api.ads.dfa.axis.v1_19.SpotlightTagFormatType[] getSpotlightTagFormatTypes() throws java.rmi.RemoteException;
    public java.lang.String generateTags(long[] activityIds) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
}
