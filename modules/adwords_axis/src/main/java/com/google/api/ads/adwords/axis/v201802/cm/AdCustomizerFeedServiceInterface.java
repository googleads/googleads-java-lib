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
 * AdCustomizerFeedServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public interface AdCustomizerFeedServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of AdCustomizerFeeds that meet the selector
     * criteria.
     *         
     *         
     * @param selector Determines which AdCustomizerFeeds to return. If empty,
     * all AdCustomizerFeeds
     *         are returned.
     *         
     * @return The list of AdCustomizerFeeds.
     *         
     * @throws ApiException Indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.AdCustomizerFeedPage get(com.google.api.ads.adwords.axis.v201802.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Adds, removes, or modifies AdCustomizerFeeds.
     *         
     *         
     * @param operations The operations to apply.
     *         
     * @return The resulting AdCustomizerFeeds.
     *         
     * @throws ApiException Indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.AdCustomizerFeedReturnValue mutate(com.google.api.ads.adwords.axis.v201802.cm.AdCustomizerFeedOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;
}
