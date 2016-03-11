/**
 * PackageServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201602;

public interface PackageServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link Package} objects.
     *         
     *         For each package, the following fields are required:
     *         <ul>
     *         <li>{@link Package#proposalId}</li>
     *         <li>{@link Package#productPackageId}</li>
     *         <li>{@link Package#name}</li>
     *         </ul>
     *         
     *         
     * @param packages the packages to create
     *         
     * @return the created packages with their IDs filled in
     */
    public com.google.api.ads.dfp.axis.v201602.Package[] createPackages(com.google.api.ads.dfp.axis.v201602.Package[] packages) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201602.ApiException;

    /**
     * Gets a {@link PackagePage} of {@link Package} objects
     *         that satisfy the given {@link Statement#query}.  The following
     * fields are supported for
     *         filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Package#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Package#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code proposalId}</td>
     *         <td>{@link Package#proposalId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code productPackageId}</td>
     *         <td>{@link Package#productPackageId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code isArchived}</td>
     *         <td>{@link Package#isArchived}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link Package#lastModifiedDateTime}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of packages
     *         
     * @return the packages that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201602.PackagePage getPackagesByStatement(com.google.api.ads.dfp.axis.v201602.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201602.ApiException;

    /**
     * Performs actions on {@link Package} objects that match the
     * given {@link Statement}.
     *         
     *         
     * @param packageAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter a set of packages
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.axis.v201602.UpdateResult performPackageAction(com.google.api.ads.dfp.axis.v201602.PackageAction packageAction, com.google.api.ads.dfp.axis.v201602.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201602.ApiException;

    /**
     * Updates the specified {@link Package} objects.
     *         
     *         
     * @param packages the packages to update
     *         
     * @return the updated packages
     */
    public com.google.api.ads.dfp.axis.v201602.Package[] updatePackages(com.google.api.ads.dfp.axis.v201602.Package[] packages) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201602.ApiException;
}
