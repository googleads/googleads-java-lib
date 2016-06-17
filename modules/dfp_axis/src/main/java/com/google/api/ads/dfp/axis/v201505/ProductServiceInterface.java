/**
 * ProductServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201505;

public interface ProductServiceInterface extends java.rmi.Remote {

    /**
     * Gets a {@link ProductPage} of {@link Product} objects that
     * satisfy the criteria specified by
     *         given {@link Statement#query}.
     *         <p>
     *         When using sales management, the following fields are supported
     * for filtering and/or sorting.
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th>
     *         <th scope="col">Object Property</th>
     *         <th scope="col">Filterable</th>
     *         <th scope="col">Sortable</th>
     *         </tr>
     *         <tr>
     *         <td>{@code rateCardId}</td>
     *         <td>Rate card ID which the product is associated with</td>
     * <td>Yes</td>
     *         <td>No</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link Product#status}</td>
     *         <td>Yes</td>
     *         <td>Yes</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lineItemType}</td>
     *         <td>{@link Product#lineItemType}</td>
     *         <td>Yes</td>
     *         <td>Yes</td>
     *         </tr>
     *         <tr>
     *         <td>{@code productType}</td>
     *         <td>{@link Product#productType}</td>
     *         <td>Yes</td>
     *         <td>Yes</td>
     *         </tr>
     *         <tr>
     *         <td>{@code rateType}</td>
     *         <td>{@link Product#rateType}</td>
     *         <td>Yes</td>
     *         <td>Yes</td>
     *         </tr>
     *         <tr>
     *         <td>{@code productTemplateId}</td>
     *         <td>{@link Product#productTemplateId}</td>
     *         <td>Yes</td>
     *         <td>No</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Product#name}</td>
     *         <td>Yes</td>
     *         <td>Yes</td>
     *         </tr>
     *         <tr>
     *         <td>{@code description}</td>
     *         <td>{@link Product#description}</td>
     *         <td>Yes</td>
     *         <td>No</td>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Product#id}</td>
     *         <td>Yes</td>
     *         <td>Yes</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link Product#lastModifiedDateTime}</td>
     *         <td>Yes</td>
     *         <td>Yes</td>
     *         </tr>
     *         </table>
     *         
     *         When using programmatic guaranteed and not sales management,
     * the following fields are supported for filtering and/or sorting.
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th>
     *         <th scope="col">Object Property</th>
     *         <th scope="col">Filterable</th>
     *         <th scope="col">Sortable</th>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link Product#status}</td>
     *         <td>Yes</td>
     *         <td>Yes</td>
     *         </tr>
     *         <tr>
     *         <td>{@code rateType}</td>
     *         <td>{@link Product#rateType}</td>
     *         <td>Yes</td>
     *         <td>Yes</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Product#name}</td>
     *         <td>Yes</td>
     *         <td>Yes</td>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Product#id}</td>
     *         <td>Yes</td>
     *         <td>Yes</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link Product#lastModifiedDateTime}</td>
     *         <td>Yes</td>
     *         <td>Yes</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param statement a Publisher Query Language statement which specifies
     * the filtering
     *         criteria over products
     *         
     * @return the products that match the given statement
     */
    public com.google.api.ads.dfp.axis.v201505.ProductPage getProductsByStatement(com.google.api.ads.dfp.axis.v201505.Statement statement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201505.ApiException;

    /**
     * Performs action on {@link Product} objects that satisfy the
     * given {@link Statement}.
     *         
     *         
     * @param productAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter a set of products.
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.axis.v201505.UpdateResult performProductAction(com.google.api.ads.dfp.axis.v201505.ProductAction productAction, com.google.api.ads.dfp.axis.v201505.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201505.ApiException;

    /**
     * Updates the specified {@link Product} objects.
     *         Note non-updatable fields will not be backfilled.
     *         
     *         
     * @param products the products to update
     *         
     * @return the updated products
     */
    public com.google.api.ads.dfp.axis.v201505.Product[] updateProducts(com.google.api.ads.dfp.axis.v201505.Product[] products) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201505.ApiException;
}
