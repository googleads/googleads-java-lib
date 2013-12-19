/**
 * AdRemote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public interface AdRemote extends java.rmi.Remote {
    public com.google.api.ads.dfa.axis.v1_20.DomainNameRecordSet getDomainNamesBySearchCriteria(com.google.api.ads.dfa.axis.v1_20.DomainNameSearchCriteria searchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.UserListGroup[] getUserListGroupsByCriteria(com.google.api.ads.dfa.axis.v1_20.UserListSearchCriteria searchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.UserList[] getUserListsByCriteria(com.google.api.ads.dfa.axis.v1_20.UserListSearchCriteria searchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.AdSaveResult saveAd(com.google.api.ads.dfa.axis.v1_20.AdBase ad) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.CreativeAdAssociationSaveResultSet updateCreativeAssignmentProperties(com.google.api.ads.dfa.axis.v1_20.CreativeAdAssociationUpdateRequest associationUpdateRequest) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public void deleteAd(long adId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.AdRecordSet getAds(com.google.api.ads.dfa.axis.v1_20.AdSearchCriteria adSearchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.AreaCode[] getAreaCodes(long[] countryIds) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.DesignatedMarketArea[] getDesignatedMarketAreas() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.State[] getStates(long[] countryIds) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.Bandwidth[] getBandwidths() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.DomainType[] getDomainTypes() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.ISP[] getISPs() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.OSP[] getOSPs() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.MobilePlatform[] getMobilePlatforms() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.AdBase getAd(long adId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.AdCopyResult[] copyAds(com.google.api.ads.dfa.axis.v1_20.AdCopyRequest[] adCopyRequests) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.AdType[] getAdTypes() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.Country[] getCountries() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.Browser[] getBrowsers() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.City[] getCities(com.google.api.ads.dfa.axis.v1_20.CitySearchCriteria criteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.OperatingSystem[] getOperatingSystems() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
    public com.google.api.ads.dfa.axis.v1_20.Region[] getRegions(long[] countryIds) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
}
