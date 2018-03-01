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
 * LocationCriterionServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public interface LocationCriterionServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of {@link LocationCriterion}'s that match the
     * specified selector.
     *         
     *         
     * @param selector filters the LocationCriterion to be returned.
     *         
     * @return A list of location criterion.
     *         
     * @throws ApiException when there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.LocationCriterion[] get(com.google.api.ads.adwords.axis.v201802.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Returns the list of {@link LocationCriterion}s that match the
     * query.
     *         
     *         
     * @param query The SQL-like AWQL query string
     *         
     * @returns The list of location criteria
     *         
     * @throws ApiException when the query is invalid or there are errors
     * processing the request.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.LocationCriterion[] query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;
}
