/**
 * RateCardCustomizationServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201308;

public interface RateCardCustomizationServiceInterface extends java.rmi.Remote {

    /**
     * Creates a new {@link RateCardCustomization} object.
     *         
     *         
     * @param rateCardCustomization the {@link RateCardCustomization} to
     * be
     *         created
     *         
     * @return the {@link RateCardCustomization} with its ID filled in
     */
    public com.google.api.ads.dfp.axis.v201308.RateCardCustomization createRateCardCustomization(com.google.api.ads.dfp.axis.v201308.RateCardCustomization rateCardCustomization) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201308.ApiException;

    /**
     * Creates a list of new {@link RateCardCustomization} objects.
     * 
     *         
     * @param rateCardCustomizations the rate card customizations to be created
     * 
     * @return the rate card customizations with their IDs filled in
     */
    public com.google.api.ads.dfp.axis.v201308.RateCardCustomization[] createRateCardCustomizations(com.google.api.ads.dfp.axis.v201308.RateCardCustomization[] rateCardCustomizations) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201308.ApiException;

    /**
     * Returns the {@link RateCardCustomization} object uniquely identified
     * by the
     *         given ID.
     *         
     *         
     * @param rateCardCustomizationId the ID of the rate card customization,
     * which
     *         must already exist.
     */
    public com.google.api.ads.dfp.axis.v201308.RateCardCustomization getRateCardCustomization(java.lang.Long rateCardCustomizationId) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201308.ApiException;

    /**
     * Gets a {@link RateCardCustomizationPage} of {@link RateCardCustomization}
     * objects that satisfy the given {@link Statement#query}.
     *         
     *         The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th>
     *         <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code rateCardId}</td>
     *         <td>{@link RateCardCustomization#rateCardId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code rateCardCustomizationGroupId}</td>
     *         <td>{@link RateCardCustomization#rateCardCustomizationGroupId}</td>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link RateCardCustomization#id}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of rate card customizations.
     *         
     * @return the rate card customizations that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201308.RateCardCustomizationPage getRateCardCustomizationsByStatement(com.google.api.ads.dfp.axis.v201308.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201308.ApiException;

    /**
     * Performs actions on {@link RateCardCustomization} objects that
     * satisfy the
     *         given {@link Statement#query}.
     *         
     *         
     * @param rateCardCustomizationAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of rate card customizations.
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.axis.v201308.UpdateResult performRateCardCustomizationAction(com.google.api.ads.dfp.axis.v201308.RateCardCustomizationAction rateCardCustomizationAction, com.google.api.ads.dfp.axis.v201308.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201308.ApiException;

    /**
     * Updates the specified {@link RateCardCustomization} object.
     * 
     *         
     * @param rateCardCustomization the rate card customization to be updated
     * 
     * @return the updated rate card customization
     */
    public com.google.api.ads.dfp.axis.v201308.RateCardCustomization updateRateCardCustomization(com.google.api.ads.dfp.axis.v201308.RateCardCustomization rateCardCustomization) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201308.ApiException;

    /**
     * Updates the specified {@link RateCardCustomization} objects.
     * 
     *         
     * @param rateCardCustomizations the rate card customizations to be updated
     * 
     * @return the updated rate card customizations
     */
    public com.google.api.ads.dfp.axis.v201308.RateCardCustomization[] updateRateCardCustomizations(com.google.api.ads.dfp.axis.v201308.RateCardCustomization[] rateCardCustomizations) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201308.ApiException;
}
