/**
 * CustomFieldServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201208;

public interface CustomFieldServiceInterface extends java.rmi.Remote {

    /**
     * Creates a new {@link CustomField}.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link CustomField#name}</li>
     *         <li>{@link CustomField#entityType}</li>
     *         <li>{@link CustomField#dataType}</li>
     *         <li>{@link CustomField#visibility}</li>
     *         </ul>
     *         
     *         
     * @param customField the custom field to create
     *         
     * @return the custom field with its ID filled in
     */
    public com.google.api.ads.dfp.axis.v201208.CustomField createCustomField(com.google.api.ads.dfp.axis.v201208.CustomField customField) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201208.ApiException;

    /**
     * Creates a new {@link CustomFieldOption}.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link CustomFieldOption#displayName}</li>
     *         <li>{@link CustomFieldOption#customFieldId}</li>
     *         </ul>
     *         
     *         
     * @param customFieldOption the custom field to create
     *         
     * @return the custom field option with its ID filled in
     */
    public com.google.api.ads.dfp.axis.v201208.CustomFieldOption createCustomFieldOption(com.google.api.ads.dfp.axis.v201208.CustomFieldOption customFieldOption) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201208.ApiException;

    /**
     * Creates new {@link CustomFieldOption} objects.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link CustomFieldOption#displayName}</li>
     *         <li>{@link CustomFieldOption#customFieldId}</li>
     *         </ul>
     *         
     *         
     * @param customFieldOptions the custom fields to create
     *         
     * @return the created custom field options with their IDs filled in
     */
    public com.google.api.ads.dfp.axis.v201208.CustomFieldOption[] createCustomFieldOptions(com.google.api.ads.dfp.axis.v201208.CustomFieldOption[] customFieldOptions) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201208.ApiException;

    /**
     * Creates new {@link CustomField} objects.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link CustomField#name}</li>
     *         <li>{@link CustomField#entityType}</li>
     *         <li>{@link CustomField#dataType}</li>
     *         <li>{@link CustomField#visibility}</li>
     *         </ul>
     *         
     *         
     * @param customFields the custom fields to create
     *         
     * @return the created custom fields with their IDs filled in
     */
    public com.google.api.ads.dfp.axis.v201208.CustomField[] createCustomFields(com.google.api.ads.dfp.axis.v201208.CustomField[] customFields) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201208.ApiException;

    /**
     * Returns the {@link CustomField} uniquely identified by the
     * given ID.
     *         
     *         
     * @param customFieldId the ID of the custom field, which must already
     * exist
     *         
     * @return the {@code CustomField} uniquely identified by the given ID
     */
    public com.google.api.ads.dfp.axis.v201208.CustomField getCustomField(java.lang.Long customFieldId) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201208.ApiException;

    /**
     * Returns the {@link CustomFieldOption} uniquely identified by
     * the given ID.
     *         
     *         
     * @param customFieldOptionId the ID of the custom field option, which
     * must already exist
     *         
     * @return the {@code CustomFieldOption} uniquely identified by the given
     * ID
     */
    public com.google.api.ads.dfp.axis.v201208.CustomFieldOption getCustomFieldOption(java.lang.Long customFieldOptionId) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201208.ApiException;

    /**
     * Gets a {@link CustomFieldPage} of {@link CustomField} objects
     * that satisfy the
     *         given {@link Statement#query}.
     *         The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link CustomField#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code entityType}</td>
     *         <td>{@link CustomField#entityType}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link CustomField#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code isActive}</td>
     *         <td>{@link CustomField#isActive}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code visibility}</td>
     *         <td>{@link CustomField#visibility}</td>
     *         </tr>
     *         </table>
     *         
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of custom fields.
     *         
     * @return the custom fields that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201208.CustomFieldPage getCustomFieldsByStatement(com.google.api.ads.dfp.axis.v201208.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201208.ApiException;

    /**
     * Performs actions on {@link CustomField} objects that match
     * the given
     *         {@link Statement#query}.
     *         
     *         
     * @param customFieldAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of custom fields
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.axis.v201208.UpdateResult performCustomFieldAction(com.google.api.ads.dfp.axis.v201208.CustomFieldAction customFieldAction, com.google.api.ads.dfp.axis.v201208.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201208.ApiException;

    /**
     * Updates the specified {@link CustomField}.
     *         
     *         
     * @param customField the custom field to update
     *         
     * @return the updated customField
     */
    public com.google.api.ads.dfp.axis.v201208.CustomField updateCustomField(com.google.api.ads.dfp.axis.v201208.CustomField customField) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201208.ApiException;

    /**
     * Updates the specified {@link CustomFieldOption}.
     *         
     *         
     * @param customFieldOption the custom field option to update
     *         
     * @return the updated customFieldOption
     */
    public com.google.api.ads.dfp.axis.v201208.CustomFieldOption updateCustomFieldOption(com.google.api.ads.dfp.axis.v201208.CustomFieldOption customFieldOption) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201208.ApiException;

    /**
     * Updates the specified {@link CustomFieldOption} objects.
     *         
     *         
     * @param customFieldOptions the custom field options to update
     *         
     * @return the updated custom field options
     */
    public com.google.api.ads.dfp.axis.v201208.CustomFieldOption[] updateCustomFieldOptions(com.google.api.ads.dfp.axis.v201208.CustomFieldOption[] customFieldOptions) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201208.ApiException;

    /**
     * Updates the specified {@link CustomField} objects.
     *         
     *         
     * @param customFields the custom fields to update
     *         
     * @return the updated custom fields
     */
    public com.google.api.ads.dfp.axis.v201208.CustomField[] updateCustomFields(com.google.api.ads.dfp.axis.v201208.CustomField[] customFields) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201208.ApiException;
}
