/**
 * AdRuleServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201605;

public interface AdRuleServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link AdRule} objects.
     *         
     *         
     * @param adRules the ad rules to create
     *         
     * @return the created ad rules with their IDs filled in
     */
    public com.google.api.ads.dfp.axis.v201605.AdRule[] createAdRules(com.google.api.ads.dfp.axis.v201605.AdRule[] adRules) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201605.ApiException;

    /**
     * Gets an {@link AdRulePage} of {@link AdRule} objects that satisfy
     * the given
     *         {@link Statement#query}. The following fields are supported
     * for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link AdRule#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link AdRule#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code priority}</td>
     *         <td>{@link AdRule#priority}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link AdRule#status}</td>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of ad rules
     *         
     * @return the ad rules that match the given filter
     *         
     * @throws ApiException if the ID of the active network does not exist
     * or
     *         there is a backend error
     */
    public com.google.api.ads.dfp.axis.v201605.AdRulePage getAdRulesByStatement(com.google.api.ads.dfp.axis.v201605.Statement statement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201605.ApiException;

    /**
     * Performs actions on {@link AdRule} objects that match the given
     * {@link Statement#query}.
     *         
     *         
     * @param adRuleAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of ad rules
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.axis.v201605.UpdateResult performAdRuleAction(com.google.api.ads.dfp.axis.v201605.AdRuleAction adRuleAction, com.google.api.ads.dfp.axis.v201605.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201605.ApiException;

    /**
     * Updates the specified {@link AdRule} objects.
     *         
     *         
     * @param adRules the ad rules to update
     *         
     * @return the updated ad rules
     *         
     * @throws ApiException if there is an error updating the ad rules
     */
    public com.google.api.ads.dfp.axis.v201605.AdRule[] updateAdRules(com.google.api.ads.dfp.axis.v201605.AdRule[] adRules) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201605.ApiException;
}
