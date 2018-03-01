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
 * CustomerExtensionSettingServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public interface CustomerExtensionSettingServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of CustomerExtensionSettings that meet the selector
     * criteria.
     *         
     *         
     * @param selector Determines which CustomerExtensionSettings to return.
     * If empty, all
     *         CustomerExtensionSettings are returned.
     *         
     * @return The list of CustomerExtensionSettings specified by the selector.
     * 
     * @throws ApiException Indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.CustomerExtensionSettingPage get(com.google.api.ads.adwords.axis.v201802.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Applies the list of mutate operations (add, remove, and set).
     * 
     *         <p> Beginning in v201509, add and set operations are treated
     * identically. Performing an add
     *         operation when there is an existing ExtensionSetting will
     * cause the operation to be
     *         treated like a set operation. Performing a set operation when
     * there is no existing
     *         ExtensionSetting will cause the operation to be treated like
     * an add operation.
     *         
     *         
     * @param operations The operations to apply. The same {@link CustomerExtensionSetting}
     * cannot be
     *         specified in more than one operation.
     *         
     * @return The changed {@link CustomerExtensionSetting}s.
     *         
     * @throws ApiException Indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.CustomerExtensionSettingReturnValue mutate(com.google.api.ads.adwords.axis.v201802.cm.CustomerExtensionSettingOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Returns a list of CustomerExtensionSettings that match the
     * query.
     *         
     *         
     * @param query The SQL-like AWQL query string.
     *         
     * @return The list of CustomerExtensionSettings specified by the query.
     * 
     * @throws ApiException Indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.CustomerExtensionSettingPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;
}
