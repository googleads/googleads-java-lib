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
 * AdParamServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public interface AdParamServiceInterface extends java.rmi.Remote {

    /**
     * Returns the ad parameters that match the criteria specified
     * in the
     *         selector.
     *         
     *         
     * @param serviceSelector Specifies which ad parameters to return.
     *         
     * @return A list of ad parameters.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.AdParamPage get(com.google.api.ads.adwords.axis.v201802.cm.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Sets and removes ad parameters.
     *         <p class="note"><b>Note:</b> {@code ADD} is not supported.
     * Use {@code SET}
     *         for new ad parameters.</p>
     *         
     *         <ul class="nolist">
     *         <li>{@code SET}: Creates or updates an ad parameter, setting
     * the new
     *         parameterized value for the given ad group / keyword pair.
     * <li>{@code REMOVE}: Removes an ad parameter. The <code><var>default-value</var>
     * </code> specified in the ad text will be used.</li>
     *         </ul>
     *         
     *         
     * @param operations The operations to perform.
     *         
     * @return A list of ad parameters, where each entry in the list is the
     * result of applying the operation in the input list with the same index.
     * For a {@code SET} operation, the returned ad parameter will contain
     * the
     *         updated values. For a {@code REMOVE} operation, the returned
     * ad parameter
     *         will simply be the ad parameter that was removed.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.AdParam[] mutate(com.google.api.ads.adwords.axis.v201802.cm.AdParamOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;
}
