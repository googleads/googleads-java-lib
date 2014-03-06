/**
 * CampaignAdExtensionServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.cm;

public interface CampaignAdExtensionServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of {@link CampaignAdExtension}s.
     *         
     *         
     * @param serviceSelector The selector specifying the {@link CampaignAdExtension}s
     * to return.
     *         
     * @return The page containing the {@link CampaignAdExtension}s which
     * meet the
     *         criteria specified by the selector.
     *         
     * @throws ApiException when there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201402.cm.CampaignAdExtensionPage get(com.google.api.ads.adwords.axis.v201402.cm.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201402.cm.ApiException;

    /**
     * Applies the list of mutate operations.
     *         
     * @param operations The operations to apply. The same {@link CampaignAdExtension}
     * cannot be specified in more than one operation.
     *         
     * @return The changed {@link CampaignAdExtension}s.
     */
    public com.google.api.ads.adwords.axis.v201402.cm.CampaignAdExtensionReturnValue mutate(com.google.api.ads.adwords.axis.v201402.cm.CampaignAdExtensionOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201402.cm.ApiException;
}
