/**
 * RateCardCustomizationGroupServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201405;

public interface RateCardCustomizationGroupServiceInterface extends java.rmi.Remote {

    /**
     * Creates a list of new {@link RateCardCustomizationGroup} objects.
     * 
     *         
     * @param rateCardCustomizationGroups the rate card customization groups
     * to be created
     *         
     * @return the rate card customization groups with their IDs filled in
     */
    public com.google.api.ads.dfp.axis.v201405.RateCardCustomizationGroup[] createRateCardCustomizationGroups(com.google.api.ads.dfp.axis.v201405.RateCardCustomizationGroup[] rateCardCustomizationGroups) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201405.ApiException;

    /**
     * Gets a {@link RateCardCustomizationGroupPage} of
     *         {@link RateCardCustomizationGroup} objects that satisfy the
     * given
     *         {@link Statement#query}. The following fields are supported
     * for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link RateCardCustomizationGroup#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code rateCardId}</td>
     *         <td>{@link RateCardCustomizationGroup#rateCardId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code pricingMethod}</td>
     *         <td>{@link RateCardCustomizationGroup#pricingMethod}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement to filter
     * a
     *         list of rate card customization groups.
     *         
     * @return the rate card customization groups that match the filter
     */
    public com.google.api.ads.dfp.axis.v201405.RateCardCustomizationGroupPage getRateCardCustomizationGroupsByStatement(com.google.api.ads.dfp.axis.v201405.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201405.ApiException;

    /**
     * Updates the specified {@link RateCardCustomizationGroup} objects.
     * 
     *         
     * @param rateCardCustomizationGroups the rate card customization groups
     * to be updated
     *         
     * @return the updated rate card customization groups
     */
    public com.google.api.ads.dfp.axis.v201405.RateCardCustomizationGroup[] updateRateCardCustomizationGroups(com.google.api.ads.dfp.axis.v201405.RateCardCustomizationGroup[] rateCardCustomizationGroups) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201405.ApiException;
}
