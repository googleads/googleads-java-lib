// Copyright 2016 Google Inc. All Rights Reserved.
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
 * ExperimentServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201605.cm;

public interface ExperimentServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of experiments specified by the experiment selector
     * from
     *         the customer's account.
     *         
     * @param serviceSelector The selector specifying the {@link Experiment}s
     * to return.
     *         If selector is empty, all experiments are returned.
     *         
     * @return List of experiments meeting all the criteria of each selector.
     * 
     * @throws ApiException if problems occurred while fetching experiment
     * information.
     */
    public com.google.api.ads.adwords.axis.v201605.cm.ExperimentPage get(com.google.api.ads.adwords.axis.v201605.cm.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201605.cm.ApiException;

    /**
     * Mutates (add, update or remove) experiments.
     *         <b>Note:</b> To REMOVE use SET and mark status to REMOVED.
     * 
     * @param operations A list of unique operations.
     *         The same experiment cannot be specified in more than one operation.
     * 
     * @return The updated experiments. The list of experiments is returned
     * in
     *         the same order in which it came in as input.
     *         
     * @throws ApiException if problems occurred while updating experiment
     * information.
     */
    public com.google.api.ads.adwords.axis.v201605.cm.ExperimentReturnValue mutate(com.google.api.ads.adwords.axis.v201605.cm.ExperimentOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201605.cm.ApiException;
}
