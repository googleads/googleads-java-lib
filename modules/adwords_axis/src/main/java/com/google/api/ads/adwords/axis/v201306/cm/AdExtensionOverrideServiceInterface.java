/**
 * AdExtensionOverrideServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.cm;

public interface AdExtensionOverrideServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of AdExtensionOverrides based on an
     *         AdExtensionOverrideSelector.
     *         
     * @param selector The selector specifying the query.
     *         
     * @return The page containing the AdExtensionOverride which meet the
     * criteria specified by the selector.
     */
    public com.google.api.ads.adwords.axis.v201306.cm.AdExtensionOverridePage get(com.google.api.ads.adwords.axis.v201306.cm.AdExtensionOverrideSelector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201306.cm.ApiException;

    /**
     * Applies the list of mutate operations.
     *         
     *         <p>Conditions for adding an ad-level AdExtension override
     * using an AdExtension
     *         under the Ad's campaign:</p>
     *         <ol>
     *         <li>If the text ad has never been overridden, an AdExtension
     * override may
     *         be set on the creative using an extension under the campaign,
     * along with
     *         any override info.</li>
     *         <li>If the text ad has been overriden before, the latitude/longitude
     * of the
     *         new extension override must be the same as the previous override
     * and
     *         no override info can be specified (i.e. the override info
     * will inherit from
     *         the previous override info).</li>
     *         </ol>
     *         
     *         
     * @param operations The operations to apply. The same ad extension override
     * cannot be specified in more than one operation.
     *         
     * @return The applied ad extension overrides.
     */
    public com.google.api.ads.adwords.axis.v201306.cm.AdExtensionOverrideReturnValue mutate(com.google.api.ads.adwords.axis.v201306.cm.AdExtensionOverrideOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201306.cm.ApiException;
}
