/**
 * BaseRateServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201403;

public interface BaseRateServiceInterface extends java.rmi.Remote {

    /**
     * Creates a list of new {@link BaseRate} objects.
     *         
     *         
     * @param baseRates the base rates to be created
     *         
     * @return the base rates with their IDs filled in
     */
    public com.google.api.ads.dfp.axis.v201403.BaseRate[] createBaseRates(com.google.api.ads.dfp.axis.v201403.BaseRate[] baseRates) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201403.ApiException;

    /**
     * Gets a {@link BaseRatePage} of {@link BaseRate} objects that
     * satisfy the given
     *         {@link Statement#query}.
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
     *         <td>{@link BaseRate#rateCardId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link BaseRate#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code productTemplateId}</td>
     *         <td>{@link ProductTemplateBaseRate#id}<br><b>Note:</b>&nbsp;Cannot
     * be
     *         combined with {@code productId}.
     *         </tr>
     *         <td>{@code productId}</td>
     *         <td>{@link ProductBaseRate#id}<br><b>Note:</b>&nbsp;Cannot
     * be combined with
     *         {@code productTemplateId}.
     *         </tr>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of base rates.
     *         
     * @return the page of base rates that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201403.BaseRatePage getBaseRatesByStatement(com.google.api.ads.dfp.axis.v201403.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201403.ApiException;

    /**
     * Performs actions on {@link BaseRate} objects that satisfy the
     * given
     *         {@link Statement#query}.
     *         
     *         
     * @param baseRateAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of base rates.
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.axis.v201403.UpdateResult performBaseRateAction(com.google.api.ads.dfp.axis.v201403.BaseRateAction baseRateAction, com.google.api.ads.dfp.axis.v201403.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201403.ApiException;

    /**
     * Updates the specified {@link BaseRate} objects.
     *         
     *         
     * @param baseRates the base rates to be updated
     *         
     * @return the updated base rates
     */
    public com.google.api.ads.dfp.axis.v201403.BaseRate[] updateBaseRates(com.google.api.ads.dfp.axis.v201403.BaseRate[] baseRates) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201403.ApiException;
}
