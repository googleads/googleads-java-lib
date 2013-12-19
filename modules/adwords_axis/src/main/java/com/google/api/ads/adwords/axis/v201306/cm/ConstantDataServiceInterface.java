/**
 * ConstantDataServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.cm;

public interface ConstantDataServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of all age range criteria.
     *         
     *         
     * @return A list of age ranges.
     *         
     * @throws ApiException when there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201306.cm.AgeRange[] getAgeRangeCriterion() throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201306.cm.ApiException;

    /**
     * Returns a list of all carrier criteria.
     *         
     *         
     * @return A list of carriers.
     *         
     * @throws ApiException when there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201306.cm.Carrier[] getCarrierCriterion() throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201306.cm.ApiException;

    /**
     * Returns a list of all gender criteria.
     *         
     *         
     * @return A list of genders.
     *         
     * @throws ApiException when there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201306.cm.Gender[] getGenderCriterion() throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201306.cm.ApiException;

    /**
     * Returns a list of all language criteria.
     *         
     *         
     * @return A list of languages.
     *         
     * @throws ApiException when there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201306.cm.Language[] getLanguageCriterion() throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201306.cm.ApiException;

    /**
     * Returns a list of all mobile devices.
     *         
     *         
     * @return A list of mobile devices.
     *         
     * @throws ApiException when there is at least one error with the request.
     * <span class="constraint Beta">This is a beta feature.</span>
     */
    public com.google.api.ads.adwords.axis.v201306.cm.MobileDevice[] getMobileDeviceCriterion() throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201306.cm.ApiException;

    /**
     * Returns a list of all operating system version criteria.
     *         
     *         
     * @return A list of operating system versions.
     *         
     * @throws ApiException when there is at least one error with the request.
     * <span class="constraint Beta">This is a beta feature.</span>
     */
    public com.google.api.ads.adwords.axis.v201306.cm.OperatingSystemVersion[] getOperatingSystemVersionCriterion() throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201306.cm.ApiException;

    /**
     * Returns a list of user interests.
     *         
     *         
     * @return A list of user interests.
     *         
     * @throws ApiException when there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201306.cm.CriterionUserInterest[] getUserInterestCriterion() throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201306.cm.ApiException;

    /**
     * Returns a list of content verticals.
     *         
     *         
     * @return A list of verticals.
     *         
     * @throws ApiException when there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201306.cm.Vertical[] getVerticalCriterion() throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201306.cm.ApiException;
}
