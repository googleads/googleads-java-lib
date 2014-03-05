/**
 * ProductTemplateServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201311;

public interface ProductTemplateServiceInterface extends java.rmi.Remote {

    /**
     * Creates a new {@link ProductTemplate}.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link ProductTemplate#name}</li>
     *         <li>{@link ProductTemplate#nameMacro}</li>
     *         <li>{@link ProductTemplate#productType}</li>
     *         <li>{@link ProductTemplate#rateType}</li>
     *         <li>{@link ProductTemplate#creativePlaceholders}
     *         (only when {@link ProductTemplate#productType} is {@link ProductType#DFP})</li>
     * <li>{@link ProductTemplate#lineItemType}
     *         (only when {@link ProductTemplate#productType} is {@link ProductType#DFP})</li>
     * <li>{@link ProductTemplate#targeting} (only if {@link ProductTemplate#productType}
     * is
     *         {@link ProductType#DFP} and {@link ProductTemplate#productSegmentation}
     * is not specified)</li>
     *         </ul>
     *         
     *         
     * @param productTemplate the product template to create
     *         
     * @return the persisted product template with tis ID filled in
     */
    public com.google.api.ads.dfp.axis.v201311.ProductTemplate createProductTemplate(com.google.api.ads.dfp.axis.v201311.ProductTemplate productTemplate) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201311.ApiException;

    /**
     * Creates new {@link ProductTemplate} objects.
     *         
     *         
     * @param productTemplates the productTemplates to create
     *         
     * @return the persisted product templates with their Ids filled in
     */
    public com.google.api.ads.dfp.axis.v201311.ProductTemplate[] createProductTemplates(com.google.api.ads.dfp.axis.v201311.ProductTemplate[] productTemplates) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201311.ApiException;

    /**
     * Returns the {@link ProductTemplate} uniquely identified by
     * the given ID.
     *         
     *         
     * @param productTemplateId the ID of the product template, which must
     * already
     *         exist
     *         
     * @return the {@code ProductTemplate} uniquely identified by the given
     * ID
     */
    public com.google.api.ads.dfp.axis.v201311.ProductTemplate getProductTemplate(java.lang.Long productTemplateId) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201311.ApiException;

    /**
     * Gets a {@link ProductTemplatePage} of {@link ProductTemplate}
     * objects
     *         that satisfy the filtering criteria specified by given {@link
     * Statement#query}.
     *         The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link ProductTemplate#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link ProductTemplate#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code nameMacro}</td>
     *         <td>{@link ProductTemplate#nameMacro}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code description}</td>
     *         <td>{@link ProductTemplate#description}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link ProductTemplate#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link ProductTemplate#lastModifiedDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lineItemType}</td>
     *         <td>{@link LineItemType}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code productType}</td>
     *         <td>{@link ProductType}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code rateType}</td>
     *         <td>{@link RateType}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param statement a Publisher Query Language statement which specifies
     * the
     *         filtering criteria over productTemplates
     *         
     * @return the productTemplates that match the given statement
     */
    public com.google.api.ads.dfp.axis.v201311.ProductTemplatePage getProductTemplatesByStatement(com.google.api.ads.dfp.axis.v201311.Statement statement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201311.ApiException;

    /**
     * Performs action on {@link ProductTemplate} objects that satisfy
     * the given
     *         {@link Statement#query}.
     *         
     *         
     * @param action the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of product templates
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.axis.v201311.UpdateResult performProductTemplateAction(com.google.api.ads.dfp.axis.v201311.ProductTemplateAction action, com.google.api.ads.dfp.axis.v201311.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201311.ApiException;

    /**
     * Updates the specified {@link ProductTemplate}.
     *         
     *         
     * @param productTemplate the product template to update
     *         
     * @return the updated product template
     */
    public com.google.api.ads.dfp.axis.v201311.ProductTemplate updateProductTemplate(com.google.api.ads.dfp.axis.v201311.ProductTemplate productTemplate) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201311.ApiException;

    /**
     * Updates the specified {@link ProductTemplate} objects.
     *         
     *         
     * @param productTemplates the product templates to update
     *         
     * @return the updated product templates
     */
    public com.google.api.ads.dfp.axis.v201311.ProductTemplate[] updateProductTemplates(com.google.api.ads.dfp.axis.v201311.ProductTemplate[] productTemplates) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201311.ApiException;
}
