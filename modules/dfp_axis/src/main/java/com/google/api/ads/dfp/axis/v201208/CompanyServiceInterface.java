/**
 * CompanyServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201208;

public interface CompanyServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link Company} objects.
     *         
     *         
     * @param companies the companies to create
     *         
     * @return the created companies with their IDs filled in
     */
    public com.google.api.ads.dfp.axis.v201208.Company[] createCompanies(com.google.api.ads.dfp.axis.v201208.Company[] companies) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201208.ApiException;

    /**
     * Creates a new {@link Company}.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link Company#name}</li>
     *         <li>{@link Company#type}</li>
     *         </ul>
     *         
     *         
     * @param company the company to create
     *         
     * @return the new company with its ID filled in
     */
    public com.google.api.ads.dfp.axis.v201208.Company createCompany(com.google.api.ads.dfp.axis.v201208.Company company) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201208.ApiException;

    /**
     * Gets a {@link CompanyPage} of {@link Company} objects that
     * satisfy the
     *         given {@link Statement#query}. The following fields are supported
     * for
     *         filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Company#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Company#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code type}</td>
     *         <td>{@link Company#type}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link Company#lastModifiedDateTime}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of companies
     *         
     * @return the companies that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201208.CompanyPage getCompaniesByStatement(com.google.api.ads.dfp.axis.v201208.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201208.ApiException;

    /**
     * Returns the {@link Company} uniquely identified by the given
     * ID.
     *         
     *         
     * @param companyId ID of the company, which must already exist
     *         
     * @return the {@code Company} uniquely identified by the given ID
     */
    public com.google.api.ads.dfp.axis.v201208.Company getCompany(java.lang.Long companyId) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201208.ApiException;

    /**
     * Updates the specified {@link Company} objects.
     *         
     *         
     * @param companies the companies to update
     *         
     * @return the updated companies
     */
    public com.google.api.ads.dfp.axis.v201208.Company[] updateCompanies(com.google.api.ads.dfp.axis.v201208.Company[] companies) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201208.ApiException;

    /**
     * Updates the specified {@link Company}.
     *         
     *         
     * @param company the company to update
     *         
     * @return the updated company
     */
    public com.google.api.ads.dfp.axis.v201208.Company updateCompany(com.google.api.ads.dfp.axis.v201208.Company company) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201208.ApiException;
}
