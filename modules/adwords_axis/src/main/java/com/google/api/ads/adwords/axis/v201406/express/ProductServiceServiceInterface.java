/**
 * ProductServiceServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.express;

public interface ProductServiceServiceInterface extends java.rmi.Remote {

    /**
     * Retrieves the {@link ProductService}s that meet the criteria
     * set in the given selector. Only a
     *         limited number of {@link ProductService}s are returned.
     *         
     *         
     * @param selector the selector specifying the product services to return
     * 
     * @return list of product services identified by the selector
     */
    public com.google.api.ads.adwords.axis.v201406.express.ProductServicePage get(com.google.api.ads.adwords.axis.v201406.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201406.cm.ApiException;
}
