// Copyright 2024 Google LLC
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
 * LineItemCreativeAssociationServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202402;

public interface LineItemCreativeAssociationServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link LineItemCreativeAssociation} objects
     */
    public com.google.api.ads.admanager.axis.v202402.LineItemCreativeAssociation[] createLineItemCreativeAssociations(com.google.api.ads.admanager.axis.v202402.LineItemCreativeAssociation[] lineItemCreativeAssociations) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202402.ApiException;

    /**
     * Gets a {@link LineItemCreativeAssociationPage} of {@link LineItemCreativeAssociation}
     * objects
     *         that satisfy the given {@link Statement#query}. The following
     * fields are supported for
     *         filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code creativeId}</td>
     *         <td>{@link LineItemCreativeAssociation#creativeId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code manualCreativeRotationWeight}</td>
     *         <td>{@link LineItemCreativeAssociation#manualCreativeRotationWeight}</td>
     * </tr>
     *         <tr>
     *         <td>{@code destinationUrl}</td>
     *         <td>{@link LineItemCreativeAssociation#destinationUrl}</td>
     * </tr>
     *         <tr>
     *         <td>{@code lineItemId}</td>
     *         <td>{@link LineItemCreativeAssociation#lineItemId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link LineItemCreativeAssociation#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link LineItemCreativeAssociation#lastModifiedDateTime}</td>
     * </tr>
     *         </table>
     */
    public com.google.api.ads.admanager.axis.v202402.LineItemCreativeAssociationPage getLineItemCreativeAssociationsByStatement(com.google.api.ads.admanager.axis.v202402.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202402.ApiException;

    /**
     * Returns an insite preview URL that references the specified
     * site URL with the specified
     *         creative from the association served to it. For Creative Set
     * previewing you may specify the
     *         master creative Id.
     */
    public java.lang.String getPreviewUrl(java.lang.Long lineItemId, java.lang.Long creativeId, java.lang.String siteUrl) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202402.ApiException;

    /**
     * Returns a list of URLs that reference the specified site URL
     * with the specified creative from
     *         the association served to it. For Creative Set previewing
     * you may specify the master creative
     *         Id. Each URL corresponds to one available native style for
     * previewing the specified creative.
     */
    public com.google.api.ads.admanager.axis.v202402.CreativeNativeStylePreview[] getPreviewUrlsForNativeStyles(java.lang.Long lineItemId, java.lang.Long creativeId, java.lang.String siteUrl) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202402.ApiException;

    /**
     * Performs actions on {@link LineItemCreativeAssociation} objects
     * that match the given {@link
     *         Statement#query}.
     */
    public com.google.api.ads.admanager.axis.v202402.UpdateResult performLineItemCreativeAssociationAction(com.google.api.ads.admanager.axis.v202402.LineItemCreativeAssociationAction lineItemCreativeAssociationAction, com.google.api.ads.admanager.axis.v202402.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202402.ApiException;

    /**
     * Pushes a creative to devices that that satisfy the given {@link
     * Statement#query}. *
     */
    public com.google.api.ads.admanager.axis.v202402.UpdateResult pushCreativeToDevices(com.google.api.ads.admanager.axis.v202402.Statement filterStatement, com.google.api.ads.admanager.axis.v202402.CreativePushOptions options) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202402.ApiException;

    /**
     * Updates the specified {@link LineItemCreativeAssociation} objects
     */
    public com.google.api.ads.admanager.axis.v202402.LineItemCreativeAssociation[] updateLineItemCreativeAssociations(com.google.api.ads.admanager.axis.v202402.LineItemCreativeAssociation[] lineItemCreativeAssociations) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202402.ApiException;
}
