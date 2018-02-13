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
 * PremiumRateServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public interface PremiumRateServiceInterface extends java.rmi.Remote {

    /**
     * Creates a list of new {@link PremiumRate} objects.
     *         
     *         
     * @param premiumRates the premium rates to be created
     *         
     * @return the premium rates with their IDs filled in
     */
    public com.google.api.ads.dfp.axis.v201802.PremiumRate[] createPremiumRates(com.google.api.ads.dfp.axis.v201802.PremiumRate[] premiumRates) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Gets a {@link PremiumRatePage} of {@link PremiumRate} objects
     * that
     *         satisfy the given {@link Statement#query}. The following fields
     * are
     *         supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link PremiumRate#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code rateCardId}</td>
     *         <td>{@link PremiumRate#rateCardId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code pricingMethod}</td>
     *         <td>{@link PremiumRate#pricingMethod}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement to filter
     * a
     *         list of premium rates.
     *         
     * @return the premium rates that match the filter
     */
    public com.google.api.ads.dfp.axis.v201802.PremiumRatePage getPremiumRatesByStatement(com.google.api.ads.dfp.axis.v201802.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Updates the specified {@link PremiumRate} objects.
     *         
     *         
     * @param premiumRates the premium rates to be updated
     *         
     * @return the updated premium rates
     */
    public com.google.api.ads.dfp.axis.v201802.PremiumRate[] updatePremiumRates(com.google.api.ads.dfp.axis.v201802.PremiumRate[] premiumRates) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;
}
