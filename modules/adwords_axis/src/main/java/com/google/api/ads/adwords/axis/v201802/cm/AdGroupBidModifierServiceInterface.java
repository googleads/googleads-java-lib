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
 * AdGroupBidModifierServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public interface AdGroupBidModifierServiceInterface extends java.rmi.Remote {

    /**
     * Gets ad group level criterion bid modifiers.
     *         
     *         
     * @param selector The selector specifying the {@link AdGroupBidModifier}s
     * to return.
     *         
     * @return A list of ad group bid modifiers.
     *         
     * @throws ApiException when there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.AdGroupBidModifierPage get(com.google.api.ads.adwords.axis.v201802.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Adds, removes or updates ad group bid modifier overrides.
     *         
     *         
     * @param operations The operations to apply.
     *         
     * @return The added ad group bid modifier overrides.
     *         
     * @throws ApiException when there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.AdGroupBidModifierReturnValue mutate(com.google.api.ads.adwords.axis.v201802.cm.AdGroupBidModifierOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Returns a list of {@link AdGroupBidModifier}s that match the
     * query.
     *         
     *         
     * @param query The SQL-like AWQL query string.
     *         
     * @throws ApiException when there are one or more errors with the request.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.AdGroupBidModifierPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;
}
