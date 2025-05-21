// Copyright 2025 Google LLC
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
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202505;

public interface YieldGroupServiceInterface extends java.rmi.Remote {

    /**
     * Creates yield groups in bulk.
     */
    public com.google.api.ads.admanager.axis.v202505.YieldGroup[] createYieldGroups(com.google.api.ads.admanager.axis.v202505.YieldGroup[] yieldGroups) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202505.ApiException;

    /**
     * Gets a page of yield groups, with child tags, filtered by the
     * given statement.
     */
    public com.google.api.ads.admanager.axis.v202505.YieldGroupPage getYieldGroupsByStatement(com.google.api.ads.admanager.axis.v202505.Statement statement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202505.ApiException;

    /**
     * Returns the available partners for yield groups, each one of
     * them is backed by a company.
     */
    public com.google.api.ads.admanager.axis.v202505.YieldPartner[] getYieldPartners() throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202505.ApiException;

    /**
     * Updates a list of yield groups.
     */
    public com.google.api.ads.admanager.axis.v202505.YieldGroup[] updateYieldGroups(com.google.api.ads.admanager.axis.v202505.YieldGroup[] yieldGroups) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202505.ApiException;
}
