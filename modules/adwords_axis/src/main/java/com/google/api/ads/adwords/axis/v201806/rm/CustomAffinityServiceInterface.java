// Copyright 2018 Google LLC
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
 * CustomAffinityServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201806.rm;

public interface CustomAffinityServiceInterface extends java.rmi.Remote {

    /**
     * Provides the ability to get one or more custom affinity audience
     * with the ability
     *         to filter based various criteria.
     *         
     *         
     * @param serviceSelector a selector describing the subset of custom
     * affinity audience
     *         for this customer.
     *         
     * @return A page of custom affinity audience as described by the selector.
     */
    public com.google.api.ads.adwords.axis.v201806.rm.CustomAffinityPage get(com.google.api.ads.adwords.axis.v201806.cm.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201806.cm.ApiException;

    /**
     * Applies a list of mutate operations (i.e. add, set) to custom
     * affinity audience:
     *         
     *         <p>
     *         Add - creates a custom affinity audience
     *         Set - updates a custom affinity audience
     *         
     *         <p>
     *         Notice that custom affinity tokens are not managed by this
     * method. They are created/deleted by
     *         <code>mutateToken</code> method. But when a new custom affinity
     * audience is added, its tokens
     *         are also added.
     *         
     *         
     * @param operations the operations to apply
     *         
     * @return a list of CustomAffinity objects
     */
    public com.google.api.ads.adwords.axis.v201806.rm.CustomAffinityReturnValue mutate(com.google.api.ads.adwords.axis.v201806.rm.CustomAffinityOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201806.cm.ApiException;

    /**
     * Applies a list of mutate operations (i.e. add, remove) to custom
     * affinity tokens:
     *         
     *         <p>
     *         Add - creates a custom affinity token
     *         Set - set operation for custom affinity token is not supported
     * Remove - deletes a custom affinity token
     *         
     *         
     * @param operations the operations to apply
     *         
     * @return a list of CustomAffinityToken objects
     */
    public com.google.api.ads.adwords.axis.v201806.rm.CustomAffinityTokenReturnValue mutateToken(com.google.api.ads.adwords.axis.v201806.rm.CustomAffinityTokenOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201806.cm.ApiException;

    /**
     * Returns the list of CustomAffinity that match the query.
     *         
     *         
     * @param query The SQL-like AWQL query string
     *         
     * @return A list of CustomAffinity
     *         
     * @throws ApiException when the query is invalid or there are errors
     * processing the request.
     */
    public com.google.api.ads.adwords.axis.v201806.rm.CustomAffinityPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201806.cm.ApiException;
}
