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
 * RateCardServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public interface RateCardServiceInterface extends java.rmi.Remote {

    /**
     * Creates a list of {@link RateCard} objects. Rate cards must
     * be activated
     *         before being associated with proposal line items and products.
     * 
     *         
     * @param rateCards the rate cards to be created
     *         
     * @return the created rate cards.
     */
    public com.google.api.ads.dfp.axis.v201802.RateCard[] createRateCards(com.google.api.ads.dfp.axis.v201802.RateCard[] rateCards) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Gets a {@link RateCardPage} of {@link RateCard} objects that
     * satisfy the given
     *         {@link Statement#query}. The following fields are supported
     * for filtering:
     *         
     *         <table><tr><th>PQL property</th><th>Entity property</th></tr><tr><td><code>ForMarketplace</code></td><td>{@link
     * RateCard#forMarketplace}</td></tr><tr><td><code>Id</code></td><td>{@link
     * RateCard#id}</td></tr><tr><td><code>LastModifiedDateTime</code></td><td>{@link
     * RateCard#lastModifiedDateTime}</td></tr><tr><td><code>Name</code></td><td>{@link
     * RateCard#name}</td></tr><tr><td><code>Status</code></td><td>{@link
     * RateCard#status}</td></tr></table>
     *         
     * @param filterStatement a Publisher Query Language statement to filter
     * a list of rate cards.
     *         
     * @return the rate cards that match the filter
     */
    public com.google.api.ads.dfp.axis.v201802.RateCardPage getRateCardsByStatement(com.google.api.ads.dfp.axis.v201802.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Performs action on {@link RateCard} objects that satisfy the
     * given {@link Statement#query}.
     *         
     *         
     * @param rateCardAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of rate cards.
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.axis.v201802.UpdateResult performRateCardAction(com.google.api.ads.dfp.axis.v201802.RateCardAction rateCardAction, com.google.api.ads.dfp.axis.v201802.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Updates a list of {@link RateCard} objects.
     *         
     *         
     * @param rateCards the rate cards to be updated
     *         
     * @return the updated rate cards
     */
    public com.google.api.ads.dfp.axis.v201802.RateCard[] updateRateCards(com.google.api.ads.dfp.axis.v201802.RateCard[] rateCards) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;
}
