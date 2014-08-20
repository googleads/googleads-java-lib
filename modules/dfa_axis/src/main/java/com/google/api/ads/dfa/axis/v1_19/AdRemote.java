/**
 * AdRemote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public interface AdRemote extends java.rmi.Remote {
    public com.google.api.ads.dfa.axis.v1_19.AreaCode[] getAreaCodes(long[] countryIds) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.DesignatedMarketArea[] getDesignatedMarketAreas() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.State[] getStates(long[] countryIds) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.Bandwidth[] getBandwidths() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.DomainType[] getDomainTypes() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.ISP[] getISPs() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.OSP[] getOSPs() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public void deleteAd(long adId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.MobilePlatform[] getMobilePlatforms() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.AdRecordSet getAds(com.google.api.ads.dfa.axis.v1_19.AdSearchCriteria adSearchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.DomainNameRecordSet getDomainNamesBySearchCriteria(com.google.api.ads.dfa.axis.v1_19.DomainNameSearchCriteria searchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.UserListGroup[] getUserListGroupsByCriteria(com.google.api.ads.dfa.axis.v1_19.UserListSearchCriteria searchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.UserList[] getUserListsByCriteria(com.google.api.ads.dfa.axis.v1_19.UserListSearchCriteria searchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.AdSaveResult saveAd(com.google.api.ads.dfa.axis.v1_19.AdBase ad) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.CreativeAdAssociationSaveResultSet updateCreativeAssignmentProperties(com.google.api.ads.dfa.axis.v1_19.CreativeAdAssociationUpdateRequest associationUpdateRequest) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.AdType[] getAdTypes() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.AdCopyResult[] copyAds(com.google.api.ads.dfa.axis.v1_19.AdCopyRequest[] adCopyRequests) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.Country[] getCountries() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.Browser[] getBrowsers() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.City[] getCities(com.google.api.ads.dfa.axis.v1_19.CitySearchCriteria criteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.OperatingSystem[] getOperatingSystems() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.Region[] getRegions(long[] countryIds) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
    public com.google.api.ads.dfa.axis.v1_19.AdBase getAd(long adId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException;
}
