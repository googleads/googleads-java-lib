/**
 * TargetingIdeaServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.o;

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
     * each call.
     *         
     *         <p>Only a relatively small total number of results will be
     * available through this method.
     *         Much larger result sets may be available using
     *         {@link #getBulkKeywordIdeas(TargetingIdeaSelector)} at the
     * price of reduced flexibility in
     *         selector options.
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
    public com.google.api.ads.adwords.axis.v201406.o.TargetingIdeaPage get(com.google.api.ads.adwords.axis.v201406.o.TargetingIdeaSelector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201406.cm.ApiException;

    /**
     * Returns a page of ideas that match the query described by the
     * specified
     *         {@link TargetingIdeaSelector}.  This method is specialized
     * for returning
     *         bulk keyword ideas, and thus the selector must be set for
     *         {@link com.google.ads.api.services.targetingideas.attributes.RequestType#IDEAS}
     * and
     *         {@link com.google.ads.api.services.common.optimization.attributes.IdeaType#KEYWORD}.
     * A limited, fixed set of attributes will be returned.
     *         
     *         <p>A single-valued
     *         {@link com.google.ads.api.services.targetingideas.search.RelatedToUrlSearchParameter}
     * must be supplied.  Single-valued
     *         {@link com.google.ads.api.services.targetingideas.search.LanguageSearchParameter}
     * and
     *         {@link com.google.ads.api.services.targetingideas.search.LocationSearchParameter}
     * are
     *         both optional.  Other search parameters compatible with a
     * keyword query may also be
     *         supplied.
     *         
     *         <p>The selector must specify a {@code paging} value, with
     * {@code numberResults} set to 800
     *         or less. If a URL based search is performed it will return
     * up to 100 keywords when the site is
     *         not owned, or up to 800 if it is. Number of keywords returned
     * on a keyword based search is up
     *         to 800. Large result sets must be composed through multiple
     * calls to this method, advancing the
     *         paging {@code startIndex} value by {@code numberResults} with
     * each call.
     *         
     *         <p>This method can make many more results available than {@link
     * #get(TargetingIdeaSelector)},
     *         but allows less control over the query. For fine-tuned queries
     * that do not need large numbers
     *         of results, prefer {@link #get(TargetingIdeaSelector)}.
     *         
     *         
     * @param selector Query describing the bulk keyword ideas to return.
     * 
     * @return A {@link TargetingIdeaPage} of results, that is a subset of
     * the
     *         list of possible ideas meeting the criteria of the
     *         {@link TargetingIdeaSelector}.
     *         
     * @throws ApiException If problems occurred while querying for ideas.
     */
    public com.google.api.ads.adwords.axis.v201406.o.TargetingIdeaPage getBulkKeywordIdeas(com.google.api.ads.adwords.axis.v201406.o.TargetingIdeaSelector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201406.cm.ApiException;
}
