// Copyright 2018 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * TargetingIdeaServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.o;

public interface TargetingIdeaServiceInterface extends java.rmi.Remote {

    /**
     * Returns a page of ideas that match the query described by the
     * specified
     *         {@link TargetingIdeaSelector}.
     *         
     *         <p>The selector must specify a {@code paging} value, with
     * {@code numberResults} set to 700 or
     *         less.  Large result sets must be composed through multiple
     * calls to this method, advancing the
     *         paging {@code startIndex} value by {@code numberResults} with
     * each call.</p>
     *         
     *         
     * @param selector Query describing the types of results to return when
     * finding matches (similar keyword ideas).
     *         
     * @return A {@link TargetingIdeaPage} of results, that is a subset of
     * the
     *         list of possible ideas meeting the criteria of the
     *         {@link TargetingIdeaSelector}.
     *         
     * @throws ApiException If problems occurred while querying for ideas.
     */
    public com.google.api.ads.adwords.axis.v201802.o.TargetingIdeaPage get(com.google.api.ads.adwords.axis.v201802.o.TargetingIdeaSelector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;
}
