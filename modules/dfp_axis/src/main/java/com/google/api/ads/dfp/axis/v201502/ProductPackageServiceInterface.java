/**
 * ProductPackageServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201502;

public interface ProductPackageServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link ProductPackage} objects.
     *         
     *         
     * @param productPackages the product packages to create
     *         
     * @return the persisted product packages with their ID filled in
     */
    public com.google.api.ads.dfp.axis.v201502.ProductPackage[] createProductPackages(com.google.api.ads.dfp.axis.v201502.ProductPackage[] productPackages) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201502.ApiException;

    /**
     * Gets a {@link ProductPackagePage} of {@link ProductPackage}
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
     *         <td>{@link ProductPackage#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link ProductPackage#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code notes}</td>
     *         <td>{@link ProductPackage#notes}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link ProductPackage#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code isArchived}</td>
     *         <td>{@link ProductPackage#isArchived}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link ProductPackage#lastModifiedDateTime}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param statement a Publisher Query Language statement which specifies
     * the
     *         filtering criteria over product packages
     *         
     * @return the product packages that match the given statement
     */
    public com.google.api.ads.dfp.axis.v201502.ProductPackagePage getProductPackagesByStatement(com.google.api.ads.dfp.axis.v201502.Statement statement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201502.ApiException;

    /**
     * Performs actions on {@link ProductPackage} objects that match
     * the given
     *         {@link Statement#query}.
     *         
     *         
     * @param action the action to perform
     *         
     * @param statement a Publisher Query Language statement used to filter
     * a set of product packages
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.axis.v201502.UpdateResult performProductPackageAction(com.google.api.ads.dfp.axis.v201502.ProductPackageAction action, com.google.api.ads.dfp.axis.v201502.Statement statement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201502.ApiException;

    /**
     * Updates the specified {@link ProductPackage} objects.
     *         
     *         
     * @param productPackages the product packages to update
     *         
     * @return the updated product packages
     */
    public com.google.api.ads.dfp.axis.v201502.ProductPackage[] updateProductPackages(com.google.api.ads.dfp.axis.v201502.ProductPackage[] productPackages) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201502.ApiException;
}
