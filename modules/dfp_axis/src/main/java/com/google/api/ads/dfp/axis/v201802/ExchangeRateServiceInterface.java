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
 * ExchangeRateServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public interface ExchangeRateServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link ExchangeRate} objects.
     *         
     *         For each exchange rate, the following fields are required:
     * <ul>
     *         <li>{@link ExchangeRate#currencyCode}</li>
     *         <li>{@link ExchangeRate#exchangeRate} when {@link ExchangeRate#refreshRate}
     * is
     *         {@link ExchangeRateRefreshRate#FIXED}</li>
     *         </ul>
     *         
     *         
     * @param exchangeRates the exchange rates to create
     *         
     * @return the created exchange rates with their exchange rate values
     * filled in
     */
    public com.google.api.ads.dfp.axis.v201802.ExchangeRate[] createExchangeRates(com.google.api.ads.dfp.axis.v201802.ExchangeRate[] exchangeRates) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Gets a {@link ExchangeRatePage} of {@link ExchangeRate} objects
     * that satisfy the given
     *         {@link Statement#query}. The following fields are supported
     * for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link ExchangeRate#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code currencyCode}</td>
     *         <td>{@link ExchangeRate#currencyCode}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code refreshRate}</td>
     *         <td>{@link ExchangeRate#refreshRate}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code direction}</td>
     *         <td>{@link ExchangeRate#direction}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code exchangeRate}</td>
     *         <td>{@link ExchangeRate#exchangeRate}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of exchange rates
     *         
     * @return the exchange rates that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201802.ExchangeRatePage getExchangeRatesByStatement(com.google.api.ads.dfp.axis.v201802.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Performs an action on {@link ExchangeRate} objects that satisfy
     * the given
     *         {@link Statement#query}. The following fields are supported
     * for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link ExchangeRate#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code currencyCode}</td>
     *         <td>{@link ExchangeRate#currencyCode}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code refreshRate}</td>
     *         <td>{@link ExchangeRate#refreshRate}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code direction}</td>
     *         <td>{@link ExchangeRate#direction}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code exchangeRate}</td>
     *         <td>{@link ExchangeRate#exchangeRate}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param exchangeRateAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of exchange rates
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.axis.v201802.UpdateResult performExchangeRateAction(com.google.api.ads.dfp.axis.v201802.ExchangeRateAction exchangeRateAction, com.google.api.ads.dfp.axis.v201802.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Updates the specified {@link ExchangeRate} objects.
     *         
     *         
     * @param exchangeRates the exchange rates to update
     *         
     * @return the updated exchange rates
     */
    public com.google.api.ads.dfp.axis.v201802.ExchangeRate[] updateExchangeRates(com.google.api.ads.dfp.axis.v201802.ExchangeRate[] exchangeRates) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;
}
