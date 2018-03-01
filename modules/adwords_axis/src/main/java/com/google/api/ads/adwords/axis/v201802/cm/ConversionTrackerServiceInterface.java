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
 * ConversionTrackerServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public interface ConversionTrackerServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of the conversion trackers that match the selector.
     * The
     *         actual objects contained in the page's list of entries will
     * be specific
     *         subclasses of the abstract {@link ConversionTracker} class.
     * 
     *         
     * @param serviceSelector The selector specifying the
     *         {@link ConversionTracker}s to return.
     *         
     * @return List of conversion trackers specified by the selector.
     *         
     * @throws com.google.ads.api.services.common.error.ApiException if problems
     * occurred while retrieving results.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ConversionTrackerPage get(com.google.api.ads.adwords.axis.v201802.cm.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Applies the list of mutate operations such as adding or updating
     * conversion trackers.
     *         <p class="note"><b>Note:</b> {@link ConversionTrackerOperation}
     * does not support the
     *         <code>REMOVE</code> operator. In order to 'disable' a conversion
     * type, send a
     *         <code>SET</code> operation for the conversion tracker with
     * the <code>status</code>
     *         property set to <code>DISABLED</code></p>
     *         
     *         <p>You can mutate any ConversionTracker that belongs to your
     * account. You may not
     *         mutate a ConversionTracker that belongs to some other account.
     * You may not directly
     *         mutate a system-defined ConversionTracker, but you can create
     * a mutable copy of it
     *         in your account by sending a mutate request with an ADD operation
     * specifying
     *         an originalConversionTypeId matching a system-defined conversion
     * tracker's ID. That new
     *         ADDed ConversionTracker will inherit the statistics and properties
     * of the system-defined type, but will be editable as usual.</p>
     *         
     *         
     * @param operations A list of mutate operations to perform.
     *         
     * @return The list of the conversion trackers as they appear after mutation,
     * in the same order as they appeared in the list of operations.
     *         
     * @throws com.google.ads.api.services.common.error.ApiException if problems
     * occurred while updating the data.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ConversionTrackerReturnValue mutate(com.google.api.ads.adwords.axis.v201802.cm.ConversionTrackerOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Returns a list of conversion trackers that match the query.
     * 
     *         
     * @param query The SQL-like AWQL query string.
     *         
     * @return A list of conversion trackers.
     *         
     * @throws ApiException if problems occur while parsing the query or
     * fetching conversion trackers.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ConversionTrackerPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;
}
