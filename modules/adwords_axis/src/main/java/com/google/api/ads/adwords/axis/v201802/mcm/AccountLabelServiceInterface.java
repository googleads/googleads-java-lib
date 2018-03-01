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
 * AccountLabelServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.mcm;

public interface AccountLabelServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of labels specified by the selector for the
     * authenticated user.
     *         
     *         
     * @param selector filters the list of labels to return
     *         
     * @return response containing lists of labels that meet all the criteria
     * of the selector
     *         
     * @throws ApiException if a problem occurs fetching the information
     * requested
     */
    public com.google.api.ads.adwords.axis.v201802.mcm.AccountLabelPage get(com.google.api.ads.adwords.axis.v201802.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Possible actions:
     *         <ul>
     *         <li> Create a new label - create a new {@link Label} and call
     * mutate with ADD operator
     *         <li> Edit the label name - set the appropriate fields in your
     * {@linkplain Label} and call
     *         mutate with the SET operator. Null fields will be interpreted
     * to mean "no change"
     *         <li> Delete the label - call mutate with REMOVE operator
     *         </ul>
     *         
     *         
     * @param operations list of unique operations to be executed in a single
     * transaction, in the
     *         order specified.
     *         
     * @return the mutated labels, in the same order that they were in as
     * the parameter
     *         
     * @throws ApiException if problems occurs while modifying label information
     */
    public com.google.api.ads.adwords.axis.v201802.mcm.AccountLabelReturnValue mutate(com.google.api.ads.adwords.axis.v201802.mcm.AccountLabelOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;
}
