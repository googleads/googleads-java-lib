/**
 * RateCardServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201502;

public interface RateCardServiceInterface extends java.rmi.Remote {

    /**
     * Creates a list of {@link RateCard} objects. Rate cards must
     * be activated
     *         before being associated with proposal line items and products.
     * 
     *         
     * @param rateCards the rate cards to be created
     *         
     * @return the created rate cards.
     */
    public com.google.api.ads.dfp.axis.v201502.RateCard[] createRateCards(com.google.api.ads.dfp.axis.v201502.RateCard[] rateCards) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201502.ApiException;

    /**
     * Gets a {@link RateCardPage} of {@link RateCard} objects that
     * satisfy the given
     *         {@link Statement#query}. The following fields are supported
     * for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link RateCard#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link RateCard#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link RateCard#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link RateCard#lastModifiedDateTime}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement to filter
     * a list of rate cards.
     *         
     * @return the rate cards that match the filter
     */
    public com.google.api.ads.dfp.axis.v201502.RateCardPage getRateCardsByStatement(com.google.api.ads.dfp.axis.v201502.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201502.ApiException;

    /**
     * Performs action on {@link RateCard} objects that satisfy the
     * given {@link Statement#query}.
     *         
     *         
     * @param rateCardAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of rate cards.
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.axis.v201502.UpdateResult performRateCardAction(com.google.api.ads.dfp.axis.v201502.RateCardAction rateCardAction, com.google.api.ads.dfp.axis.v201502.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201502.ApiException;

    /**
     * Updates a list of {@link RateCard} objects.
     *         
     *         
     * @param rateCards the rate cards to be updated
     *         
     * @return the updated rate cards
     */
    public com.google.api.ads.dfp.axis.v201502.RateCard[] updateRateCards(com.google.api.ads.dfp.axis.v201502.RateCard[] rateCards) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201502.ApiException;
}
