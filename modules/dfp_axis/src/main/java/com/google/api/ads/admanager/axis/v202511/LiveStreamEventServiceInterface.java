// Copyright 2025 Google LLC
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
 * LiveStreamEventServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202511;

public interface LiveStreamEventServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link LiveStreamEvent} objects.
     *         
     *         <p>The following fields are required:
     *         
     *         <ul>
     *         <li>{@link LiveStreamEvent#name}
     *         <li>{@link LiveStreamEvent#startDateTime}
     *         <li>{@link LiveStreamEvent#endDateTime}
     *         <li>{@link LiveStreamEvent#contentUrls}
     *         <li>{@link LiveStreamEvent#adTags}
     *         </ul>
     */
    public com.google.api.ads.admanager.axis.v202511.LiveStreamEvent[] createLiveStreamEvents(com.google.api.ads.admanager.axis.v202511.LiveStreamEvent[] liveStreamEvents) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202511.ApiException;

    /**
     * Create new slates.
     *         
     *         <p>A slate creative is served as backup content in a live
     * stream event when no other creatives
     *         are eligible to be served.
     */
    public com.google.api.ads.admanager.axis.v202511.Slate[] createSlates(com.google.api.ads.admanager.axis.v202511.Slate[] slates) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202511.ApiException;

    /**
     * Gets a {@link LiveStreamEventPage} of {@link LiveStreamEvent}
     * objects that satisfy the given
     *         {@link Statement#query}. The following fields are supported
     * for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link LiveStreamEvent#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code slateCreativeId}</td>
     *         <td>{@link LiveStreamEvent#slateCreativeId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code assetKey}</td>
     *         <td>{@link LiveStreamEvent#assetKey}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code streamCreateDaiAuthenticationKeyIds}</td>
     *         <td>{@link LiveStreamEvent#streamCreateDaiAuthenticationKeyIds}</td>
     * </tr>
     *         <tr>
     *         <td>{@code dynamicAdInsertionType}</td>
     *         <td>{@link LiveStreamEvent#dynamicAdInsertionType}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code streamingFormat}</td>
     *         <td>{@link LiveStreamEvent#streamingFormat}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code customAssetKey}</td>
     *         <td>{@link LiveStreamEvent#customAssetKey}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code daiEncodingProfileIds}</td>
     *         <td>{@link LiveStreamEvent#daiEncodingProfileIds}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code segmentUrlAuthenticationKeyIds}</td>
     *         <td>{@link LiveStreamEvent#segmentUrlAuthenticationKeyIds}</td>
     * </tr>
     *         </table>
     */
    public com.google.api.ads.admanager.axis.v202511.LiveStreamEventPage getLiveStreamEventsByStatement(com.google.api.ads.admanager.axis.v202511.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202511.ApiException;

    /**
     * Gets a {@link SlatePage} of {@link Slate} objects that satisfy
     * the given {@link
     *         Statement#query}. The following fields are supported for filtering:
     * 
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Slate#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Slate#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link Slate#lastModifiedDateTime}</td>
     *         </tr>
     *         </table>
     */
    public com.google.api.ads.admanager.axis.v202511.SlatePage getSlatesByStatement(com.google.api.ads.admanager.axis.v202511.Statement statement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202511.ApiException;

    /**
     * Performs actions on {@link LiveStreamEvent} objects that match
     * the given {@link
     *         Statement#query}.
     */
    public com.google.api.ads.admanager.axis.v202511.UpdateResult performLiveStreamEventAction(com.google.api.ads.admanager.axis.v202511.LiveStreamEventAction liveStreamEventAction, com.google.api.ads.admanager.axis.v202511.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202511.ApiException;

    /**
     * Performs actions on slates that match the given {@link Statement}.
     */
    public com.google.api.ads.admanager.axis.v202511.UpdateResult performSlateAction(com.google.api.ads.admanager.axis.v202511.SlateAction slateAction, com.google.api.ads.admanager.axis.v202511.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202511.ApiException;

    /**
     * Updates the specified {@link LiveStreamEvent} objects.
     */
    public com.google.api.ads.admanager.axis.v202511.LiveStreamEvent[] updateLiveStreamEvents(com.google.api.ads.admanager.axis.v202511.LiveStreamEvent[] liveStreamEvents) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202511.ApiException;

    /**
     * Update existing slates.
     *         
     *         <p>Only the slateName is editable.
     */
    public com.google.api.ads.admanager.axis.v202511.Slate[] updateSlates(com.google.api.ads.admanager.axis.v202511.Slate[] slates) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202511.ApiException;
}
