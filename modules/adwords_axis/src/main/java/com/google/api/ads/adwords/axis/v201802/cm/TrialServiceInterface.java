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
 * TrialServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public interface TrialServiceInterface extends java.rmi.Remote {

    /**
     * Loads a TrialPage containing a list of {@link Trial} objects
     * matching the selector.
     *         
     *         
     * @param selector defines which subset of all available trials to return,
     * the sort order, and
     *         which fields to include
     *         
     *         
     * @return Returns a page of matching trial objects.
     *         
     * @throws com.google.ads.api.services.common.error.ApiException if errors
     * occurred while
     *         retrieving the results.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.TrialPage get(com.google.api.ads.adwords.axis.v201802.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Creates new trials, updates properties and controls the life
     * cycle of existing trials.
     *         See {@link TrialService} for details on the trial life cycle.
     * 
     *         
     * @return Returns the list of updated Trials, in the same order as the
     * {@code operations} list.
     *         
     * @throws com.google.ads.api.services.common.error.ApiException if errors
     * occurred while
     *         processing the request.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.TrialReturnValue mutate(com.google.api.ads.adwords.axis.v201802.cm.TrialOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Loads a TrialPage containing a list of {@link Trial} objects
     * matching the query.
     *         
     *         
     * @param query defines which subset of all available trials to return,
     * the sort order, and
     *         which fields to include
     *         
     *         
     * @return Returns a page of matching trial objects.
     *         
     * @throws com.google.ads.api.services.common.error.ApiException if errors
     * occurred while
     *         retrieving the results.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.TrialPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;
}
