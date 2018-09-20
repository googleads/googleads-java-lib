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
 * AdServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201809.cm;

public interface AdServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of {@link Ad}s.
     *         
     *         
     * @param serviceSelector The selector specifying the {@link Ad}s to
     * return.
     *         
     * @return The page containing the {@link Ad}s that meet the criteria
     * specified by the selector.
     *         
     * @throws {@link ApiException} when there is at least one error with
     * the request.
     */
    public com.google.api.ads.adwords.axis.v201809.cm.AdPage get(com.google.api.ads.adwords.axis.v201809.cm.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201809.cm.ApiException;

    /**
     * Applies the list of mutate operations. For {@link AdService},
     * only SET operations are allowed.
     *         
     *         
     * @param operations The operations to apply.
     *         
     * @return A list of {@line Ad}s where each entry in the list is the
     * result of applying the
     *         operation in the input list with the same index. The returned
     * {@link Ad}s will be what is
     *         saved.
     */
    public com.google.api.ads.adwords.axis.v201809.cm.AdReturnValue mutate(com.google.api.ads.adwords.axis.v201809.cm.AdOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201809.cm.ApiException;
}
