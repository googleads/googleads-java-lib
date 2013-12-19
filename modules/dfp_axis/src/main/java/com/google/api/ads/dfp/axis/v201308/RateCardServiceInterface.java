/**
 * RateCardServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201308;

public interface RateCardServiceInterface extends java.rmi.Remote {

    /**
     * Creates a new {@link RateCard}. Rate cards must be activated
     * before being
     *         associated with proposal line items and products.
     *         
     *         
     * @param rateCard the rate card to be created
     *         
     * @return the rate card with corresponding fields set by Google.
     */
    public com.google.api.ads.dfp.axis.v201308.RateCard createRateCard(com.google.api.ads.dfp.axis.v201308.RateCard rateCard) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201308.ApiException;

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
    public com.google.api.ads.dfp.axis.v201308.RateCard[] createRateCards(com.google.api.ads.dfp.axis.v201308.RateCard[] rateCards) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201308.ApiException;

    /**
     * Returns the {@link RateCard} uniquely identified by the given
     * ID.
     *         
     *         
     * @param rateCardId the ID of the rate card, which must already exist
     */
    public com.google.api.ads.dfp.axis.v201308.RateCard getRateCard(java.lang.Long rateCardId) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201308.ApiException;

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
    public com.google.api.ads.dfp.axis.v201308.RateCardPage getRateCardsByStatement(com.google.api.ads.dfp.axis.v201308.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201308.ApiException;

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
    public com.google.api.ads.dfp.axis.v201308.UpdateResult performRateCardAction(com.google.api.ads.dfp.axis.v201308.RateCardAction rateCardAction, com.google.api.ads.dfp.axis.v201308.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201308.ApiException;

    /**
     * Updates the specified {@link RateCard}.
     *         
     *         
     * @param rateCard the rate card to be updated
     *         
     * @return the updated rate card
     */
    public com.google.api.ads.dfp.axis.v201308.RateCard updateRateCard(com.google.api.ads.dfp.axis.v201308.RateCard rateCard) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201308.ApiException;

    /**
     * Updates a list of {@link RateCard} objects.
     *         
     *         
     * @param rateCards the rate cards to be updated
     *         
     * @return the updated rate cards
     */
    public com.google.api.ads.dfp.axis.v201308.RateCard[] updateRateCards(com.google.api.ads.dfp.axis.v201308.RateCard[] rateCards) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201308.ApiException;
}
