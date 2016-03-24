/**
 * PromotionServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201603.express;

public interface PromotionServiceInterface extends java.rmi.Remote {

    /**
     * Retrieves the promotions that meet the criteria set in the
     * given selector.
     *         
     * @param selector the selector specifying the AdWords Express promotion
     * to return
     *         
     * @return list of AdWords Express promotion identified by the selector
     */
    public com.google.api.ads.adwords.axis.v201603.express.PromotionPage get(com.google.api.ads.adwords.axis.v201603.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201603.cm.ApiException;

    /**
     * Performs the given {@link PromotionOperation}.
     *         
     * @param operations list of unique operations; the same AdWords Express
     * promotion cannot be
     *         specified in more than one operation
     *         
     * @return the updated AdWords Express promotion
     */
    public com.google.api.ads.adwords.axis.v201603.express.Promotion[] mutate(com.google.api.ads.adwords.axis.v201603.express.PromotionOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201603.cm.ApiException;
}
