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
 * TrialAsyncErrorServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public interface TrialAsyncErrorServiceInterface extends java.rmi.Remote {

    /**
     * Returns a TrialAsyncErrorPage that contains a list of TrialAsyncErrors
     * matching the selector.
     *         
     *         
     * @throws {#link com.google.ads.api.services.common.error.ApiException}
     * if problems occurred
     *         while retrieving the results.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.TrialAsyncErrorPage get(com.google.api.ads.adwords.axis.v201802.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Returns a TrialAsyncErrorPage that contains a list of TrialAsyncError
     * matching the query.
     *         
     *         
     * @throws {#link com.google.ads.api.services.common.error.ApiException}
     * if problems occurred
     *         while retrieving the results.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.TrialAsyncErrorPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;
}
