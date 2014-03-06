/**
 * ConstantDataServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.cm;

public interface ConstantDataServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of all age range criteria.
     *         
     *         
     * @return A list of age ranges.
     *         
     * @throws ApiException when there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201402.cm.AgeRange[] getAgeRangeCriterion() throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201402.cm.ApiException;

    /**
     * Returns a list of all carrier criteria.
     *         
     *         
     * @return A list of carriers.
     *         
     * @throws ApiException when there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201402.cm.Carrier[] getCarrierCriterion() throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201402.cm.ApiException;

    /**
     * Returns a list of all gender criteria.
     *         
     *         
     * @return A list of genders.
     *         
     * @throws ApiException when there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201402.cm.Gender[] getGenderCriterion() throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201402.cm.ApiException;

    /**
     * Returns a list of all language criteria.
     *         
     *         
     * @return A list of languages.
     *         
     * @throws ApiException when there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201402.cm.Language[] getLanguageCriterion() throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201402.cm.ApiException;

    /**
     * Returns a list of all mobile devices.
     *         
     *         
     * @return A list of mobile devices.
     *         
     * @throws ApiException when there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201402.cm.MobileDevice[] getMobileDeviceCriterion() throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201402.cm.ApiException;

    /**
     * Returns a list of all operating system version criteria.
     *         
     *         
     * @return A list of operating system versions.
     *         
     * @throws ApiException when there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201402.cm.OperatingSystemVersion[] getOperatingSystemVersionCriterion() throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201402.cm.ApiException;

    /**
     * Returns a list of shopping bidding categories.
     *         
     *         A country predicate must be included in the selector.
     *         An empty parentDimensionType predicate will filter for root
     * categories.
     *         
     *         
     * @return A list of shopping bidding categories.
     *         
     * @throws ApiException when there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201402.cm.ProductBiddingCategoryData[] getProductBiddingCategoryData(com.google.api.ads.adwords.axis.v201402.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201402.cm.ApiException;

    /**
     * Returns a list of user interests.
     *         
     *         
     * @param userInterestTaxonomyType The type of taxonomy to use when requesting
     * user interests.
     *         
     * @return A list of user interests.
     *         
     * @throws ApiException when there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201402.cm.CriterionUserInterest[] getUserInterestCriterion(com.google.api.ads.adwords.axis.v201402.cm.ConstantDataServiceUserInterestTaxonomyType userInterestTaxonomyType) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201402.cm.ApiException;

    /**
     * Returns a list of content verticals.
     *         
     *         
     * @return A list of verticals.
     *         
     * @throws ApiException when there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201402.cm.Vertical[] getVerticalCriterion() throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201402.cm.ApiException;
}
