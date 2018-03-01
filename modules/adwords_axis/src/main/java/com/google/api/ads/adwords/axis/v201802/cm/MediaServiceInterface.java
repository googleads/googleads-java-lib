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
 * MediaServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public interface MediaServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of media that meet the criteria specified by
     * the selector.
     *         <p class="note"><b>Note:</b> {@code MediaService} will not
     * return any
     *         {@link ImageAd} image files.</p>
     *         
     *         
     * @param serviceSelector Selects which media objects to return.
     *         
     * @return A list of {@code Media} objects.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.MediaPage get(com.google.api.ads.adwords.axis.v201802.cm.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Returns the list of {@link Media} objects that match the query.
     * 
     *         
     * @param query The SQL-like AWQL query string
     *         
     * @returns A list of {@code Media} objects.
     *         
     * @throws ApiException when the query is invalid or there are errors
     * processing the request.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.MediaPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Uploads new media. Currently, you can upload {@link Image}
     * files and {@link MediaBundle}s.
     *         
     *         
     * @param media A list of {@code Media} objects, each containing the
     * data to
     *         be uploaded.
     *         
     * @return A list of uploaded media in the same order as the argument
     * list.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Media[] upload(com.google.api.ads.adwords.axis.v201802.cm.Media[] media) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;
}
