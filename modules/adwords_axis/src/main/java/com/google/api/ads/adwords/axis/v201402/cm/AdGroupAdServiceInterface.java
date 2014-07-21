/**
 * AdGroupAdServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.cm;

public interface AdGroupAdServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of AdGroupAds.
     *         AdGroupAds that had been removed are not returned by default.
     * 
     *         
     * @param serviceSelector The selector specifying the {@link AdGroupAd}s
     * to return.
     *         
     * @return The page containing the AdGroupAds that meet the criteria
     * specified by the selector.
     *         
     * @throws ApiException when there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201402.cm.AdGroupAdPage get(com.google.api.ads.adwords.axis.v201402.cm.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201402.cm.ApiException;

    /**
     * Applies the list of mutate operations (ie. add, set, remove):
     * <p>Add - Creates a new {@linkplain AdGroupAd ad group ad}. The
     *         {@code adGroupId} must
     *         reference an existing ad group. The child {@code Ad} must
     * be sufficiently
     *         specified by constructing a concrete ad type (such as {@code
     * TextAd})
     *         and setting its fields accordingly.</p>
     *         <p>Set - Updates an ad group ad. Except for {@code status},
     * ad group ad fields are not mutable. Status updates are
     *         straightforward - the status of the ad group ad is updated
     * as
     *         specified. If any other field has changed, it will be ignored.
     * If
     *         you want to change any of the fields other than status, you
     * must
     *         make a new ad and then remove the old one.</p>
     *         <p>Remove - Removes the link between the specified AdGroup
     * and
     *         Ad.</p>
     *         
     * @param operations The operations to apply.
     *         
     * @return A list of AdGroupAds where each entry in the list is the result
     * of
     *         applying the operation in the input list with the same index.
     * For an
     *         add/set operation, the return AdGroupAd will be what is saved
     * to the db.
     *         In the case of the remove operation, the return AdGroupAd
     * will simply be
     *         an AdGroupAd containing an Ad with the id set to the Ad being
     * removed from
     *         the AdGroup.
     */
    public com.google.api.ads.adwords.axis.v201402.cm.AdGroupAdReturnValue mutate(com.google.api.ads.adwords.axis.v201402.cm.AdGroupAdOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201402.cm.ApiException;

    /**
     * Returns a list of AdGroupAds based on the query.
     *         
     *         
     * @param query The SQL-like AWQL query string.
     *         
     * @return A list of AdGroupAds.
     *         
     * @throws ApiException if problems occur while parsing the query or
     * fetching AdGroupAds.
     */
    public com.google.api.ads.adwords.axis.v201402.cm.AdGroupAdPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201402.cm.ApiException;
}
