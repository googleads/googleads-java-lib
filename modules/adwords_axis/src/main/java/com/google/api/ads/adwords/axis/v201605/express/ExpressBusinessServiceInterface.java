/**
 * ExpressBusinessServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201605.express;

public interface ExpressBusinessServiceInterface extends java.rmi.Remote {

    /**
     * Retrieves the Express businesses that meet the criteria set
     * in the given selector.
     *         
     *         
     * @param selector the selector specifying the AdWords Express businesses
     * to return
     *         
     * @return list of AdWords Express businesses identified by the selector
     */
    public com.google.api.ads.adwords.axis.v201605.express.ExpressBusinessPage get(com.google.api.ads.adwords.axis.v201605.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201605.cm.ApiException;

    /**
     * Performs the given {@link ExpressBusinessOperation}.
     *         
     *         
     * @param operations list of unique operations; the same AdWords Express
     * business cannot be
     *         specified in more than one operation
     *         
     * @return the updated AdWords Express businesses
     */
    public com.google.api.ads.adwords.axis.v201605.express.ExpressBusiness[] mutate(com.google.api.ads.adwords.axis.v201605.express.ExpressBusinessOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201605.cm.ApiException;
}
