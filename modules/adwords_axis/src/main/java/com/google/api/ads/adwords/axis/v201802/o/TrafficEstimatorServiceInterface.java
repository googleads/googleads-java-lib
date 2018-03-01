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
 * TrafficEstimatorServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.o;

public interface TrafficEstimatorServiceInterface extends java.rmi.Remote {

    /**
     * Returns traffic estimates for specified criteria.
     *         
     *         
     * @param selector Campaigns, ad groups and keywords for which traffic
     * should be estimated.
     *         
     * @return Traffic estimation results.
     *         
     * @throws ApiException if problems occurred while retrieving estimates
     */
    public com.google.api.ads.adwords.axis.v201802.o.TrafficEstimatorResult get(com.google.api.ads.adwords.axis.v201802.o.TrafficEstimatorSelector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;
}
