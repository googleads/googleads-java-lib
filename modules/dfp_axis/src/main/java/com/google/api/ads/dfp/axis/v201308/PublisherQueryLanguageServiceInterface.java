/**
 * PublisherQueryLanguageServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201308;

public interface PublisherQueryLanguageServiceInterface extends java.rmi.Remote {

    /**
     * Retrieves rows of data that satisfy the given {@link Statement#query}
     * from
     *         the system.
     *         
     *         
     * @param selectStatement a Publisher Query Language statement used to
     * specify what data needs to returned
     *         
     *         
     * @return a result set of data that matches the given filter
     */
    public com.google.api.ads.dfp.axis.v201308.ResultSet select(com.google.api.ads.dfp.axis.v201308.Statement selectStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201308.ApiException;
}
