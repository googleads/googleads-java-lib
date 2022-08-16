// Copyright 2022 Google LLC
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
 * YieldGroupServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202208;

public interface YieldGroupServiceInterface extends java.rmi.Remote {

    /**
     * Creates yield groups in bulk.
     *         
     *         
     * @param yieldGroups the groups to create
     *         
     * @return the created groups
     */
    public com.google.api.ads.admanager.axis.v202208.YieldGroup[] createYieldGroups(com.google.api.ads.admanager.axis.v202208.YieldGroup[] yieldGroups) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202208.ApiException;

    /**
     * Gets a page of yield groups, with child tags, filtered by the
     * given statement.
     *         
     *         
     * @param statement the statement used to filter yield groups.
     *         
     * @return the page of yield groups
     */
    public com.google.api.ads.admanager.axis.v202208.YieldGroupPage getYieldGroupsByStatement(com.google.api.ads.admanager.axis.v202208.Statement statement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202208.ApiException;

    /**
     * Returns the available partners for yield groups, each one of
     * them is backed by a company.
     */
    public com.google.api.ads.admanager.axis.v202208.YieldPartner[] getYieldPartners() throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202208.ApiException;

    /**
     * Updates a list of yield groups.
     *         
     *         
     * @param yieldGroups the groups to update
     *         
     * @return the updated groups
     */
    public com.google.api.ads.admanager.axis.v202208.YieldGroup[] updateYieldGroups(com.google.api.ads.admanager.axis.v202208.YieldGroup[] yieldGroups) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202208.ApiException;
}
