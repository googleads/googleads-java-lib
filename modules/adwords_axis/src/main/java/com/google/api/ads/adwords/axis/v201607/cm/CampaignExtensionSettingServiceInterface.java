/**
 * CampaignExtensionSettingServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201607.cm;

public interface CampaignExtensionSettingServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of CampaignExtensionSettings that meet the selector
     * criteria.
     *         
     *         
     * @param selector Determines which CampaignExtensionSettings to return.
     * If empty, all
     *         CampaignExtensionSettings are returned.
     *         
     * @return The list of CampaignExtensionSettings specified by the selector.
     * 
     * @throws ApiException Indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201607.cm.CampaignExtensionSettingPage get(com.google.api.ads.adwords.axis.v201607.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201607.cm.ApiException;

    /**
     * Applies the list of mutate operations (add, remove, and set).
     * 
     *         <p> Beginning in v201509, add and set operations are treated
     * identically. Performing an add
     *         operation on a campaign with an existing ExtensionSetting
     * will cause the operation to be
     *         treated like a set operation. Performing a set operation on
     * a campaign with no
     *         ExtensionSetting will cause the operation to be treated like
     * an add operation.
     *         
     *         
     * @param operations The operations to apply. The same {@link CampaignExtensionSetting}
     * cannot be
     *         specified in more than one operation.
     *         
     * @return The changed {@link CampaignExtensionSetting}s.
     *         
     * @throws ApiException Indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201607.cm.CampaignExtensionSettingReturnValue mutate(com.google.api.ads.adwords.axis.v201607.cm.CampaignExtensionSettingOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201607.cm.ApiException;

    /**
     * Returns a list of CampaignExtensionSettings that match the
     * query.
     *         
     *         
     * @param query The SQL-like AWQL query string.
     *         
     * @return The list of CampaignExtensionSettings specified by the query.
     * 
     * @throws ApiException Indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201607.cm.CampaignExtensionSettingPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201607.cm.ApiException;
}
