/**
 * TargetingIdeaServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201509.o;

public interface TargetingIdeaServiceInterface extends java.rmi.Remote {

    /**
     * Returns a page of ideas that match the query described by the
     * specified
     *         {@link TargetingIdeaSelector}.
     *         
     *         <p>The selector must specify a {@code paging} value, with
     * {@code numberResults} set to 800 or
     *         less.  Large result sets must be composed through multiple
     * calls to this method, advancing the
     *         paging {@code startIndex} value by {@code numberResults} with
     * each call.</p>
     *         
     *         
     * @param selector Query describing the types of results to return when
     * finding matches (similar keyword ideas/placement ideas).
     *         
     * @return A {@link TargetingIdeaPage} of results, that is a subset of
     * the
     *         list of possible ideas meeting the criteria of the
     *         {@link TargetingIdeaSelector}.
     *         
     * @throws ApiException If problems occurred while querying for ideas.
     */
    public com.google.api.ads.adwords.axis.v201509.o.TargetingIdeaPage get(com.google.api.ads.adwords.axis.v201509.o.TargetingIdeaSelector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201509.cm.ApiException;
}
