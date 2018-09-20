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
 * OfflineConversionAdjustmentFeedServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201809.cm;

public interface OfflineConversionAdjustmentFeedServiceInterface extends java.rmi.Remote {

    /**
     * Reports a conversion adjustment for each entry in {@code operations}.
     * 
     *         <p><b>Note:</b> {@link OfflineConversionAdjustmentFeedOperation}
     * supports only the
     *         {@code ADD} operator. ({@code SET} and {@code REMOVE} are
     * not supported.)
     *         
     *         
     * @param operations A list of offline conversion adjustment feed operations.
     * 
     * @return The list of offline conversion adjustment feed results in
     * the same order
     *         as the operations.
     *         
     * @throws {@link ApiException} If problems occurred while applying offline
     * adjustment conversions.
     */
    public com.google.api.ads.adwords.axis.v201809.cm.OfflineConversionAdjustmentFeedReturnValue mutate(com.google.api.ads.adwords.axis.v201809.cm.OfflineConversionAdjustmentFeedOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201809.cm.ApiException;
}
