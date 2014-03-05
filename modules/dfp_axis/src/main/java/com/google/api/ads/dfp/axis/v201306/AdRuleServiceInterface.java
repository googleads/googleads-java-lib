/**
 * AdRuleServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201306;

public interface AdRuleServiceInterface extends java.rmi.Remote {

    /**
     * Creates a new {@link AdRule}.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link AdRule#id}</li>
     *         <li>{@link AdRule#name}</li>
     *         <li>{@link AdRule#priority}</li>
     *         <li>{@link AdRule#startDateTime}</li>
     *         <li>{@link AdRule#endDateTime}</li>
     *         <li>{@link AdRule#preroll}</li>
     *         <li>{@link AdRule#midroll}</li>
     *         <li>{@link AdRule#postroll}</li>
     *         </ul>
     *         
     *         
     * @param adRule the ad rule to create
     *         
     * @return the ad rule with its ID filled in
     *         
     * @throws ApiException if there the ad rule is invalid or there is another
     * error
     */
    public com.google.api.ads.dfp.axis.v201306.AdRule createAdRule(com.google.api.ads.dfp.axis.v201306.AdRule adRule) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201306.ApiException;

    /**
     * Creates new {@link AdRule} objects.
     *         
     *         
     * @param adRules the ad rules to create
     *         
     * @return the created ad rules with their IDs filled in
     */
    public com.google.api.ads.dfp.axis.v201306.AdRule[] createAdRules(com.google.api.ads.dfp.axis.v201306.AdRule[] adRules) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201306.ApiException;

    /**
     * Returns the {@link AdRule} uniquely identified by the given
     * ID.
     *         
     *         
     * @param adRuleId the ID of the ad rule, which must already exist
     *         
     * @return the {@code AdRule} uniquely identified by the given ID
     *         
     * @throws ApiException if there is an error retrieving the ad rule
     *         or the ID is invalid
     */
    public com.google.api.ads.dfp.axis.v201306.AdRule getAdRule(java.lang.Integer adRuleId) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201306.ApiException;

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
    public com.google.api.ads.dfp.axis.v201306.AdRulePage getAdRulesByStatement(com.google.api.ads.dfp.axis.v201306.Statement statement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201306.ApiException;

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
    public com.google.api.ads.dfp.axis.v201306.UpdateResult performAdRuleAction(com.google.api.ads.dfp.axis.v201306.AdRuleAction adRuleAction, com.google.api.ads.dfp.axis.v201306.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201306.ApiException;

    /**
     * Updates a previously-created {@link AdRule}.
     *         
     *         
     * @param adRule the ad rule that should be updated
     *         
     * @return the updated ad rule
     *         
     * @throws ApiException if there is an error updating the ad rule
     */
    public com.google.api.ads.dfp.axis.v201306.AdRule updateAdRule(com.google.api.ads.dfp.axis.v201306.AdRule adRule) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201306.ApiException;

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
    public com.google.api.ads.dfp.axis.v201306.AdRule[] updateAdRules(com.google.api.ads.dfp.axis.v201306.AdRule[] adRules) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201306.ApiException;
}
