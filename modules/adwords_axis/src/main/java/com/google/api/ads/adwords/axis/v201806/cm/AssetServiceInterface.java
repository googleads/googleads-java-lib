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
 * AssetServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201806.cm;

public interface AssetServiceInterface extends java.rmi.Remote {

    /**
     * Loads an AssetPage containing a list of {@link Asset} objects
     * matching the selector.
     *         
     *         
     * @param selector defines which subset of all available assets to return,
     * the sort order, and
     *         which fields to include
     *         
     *         
     * @return Returns a page of matching asset objects.
     *         
     * @throws com.google.ads.api.services.common.error.ApiException if errors
     * occurred while
     *         retrieving the results.
     */
    public com.google.api.ads.adwords.axis.v201806.cm.AssetPage get(com.google.api.ads.adwords.axis.v201806.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201806.cm.ApiException;

    /**
     * Applies the list of mutate operations. For {@link AssetService},
     * only ADD and REMOVE operations
     *         are currently allowed.
     *         
     *         
     * @param operations The operations to apply.
     *         
     * @return A list of {@link Asset}s where each entry in the list is the
     * result of applying the
     *         operation in the input list with the same index.
     */
    public com.google.api.ads.adwords.axis.v201806.cm.AssetReturnValue mutate(com.google.api.ads.adwords.axis.v201806.cm.AssetOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201806.cm.ApiException;
}
