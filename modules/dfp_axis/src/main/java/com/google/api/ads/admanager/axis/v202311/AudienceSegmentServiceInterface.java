// Copyright 2023 Google LLC
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
 * AudienceSegmentServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202311;

public interface AudienceSegmentServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link FirstPartyAudienceSegment} objects.
     */
    public com.google.api.ads.admanager.axis.v202311.FirstPartyAudienceSegment[] createAudienceSegments(com.google.api.ads.admanager.axis.v202311.FirstPartyAudienceSegment[] segments) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202311.ApiException;

    /**
     * Gets an {@link AudienceSegmentPage} of {@link AudienceSegment}
     * objects that satisfy the given
     *         {@link Statement#query}. The following fields are supported
     * for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th>
     *         <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link AudienceSegment#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link AudienceSegment#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link AudienceSegment#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code type}</td>
     *         <td>{@link AudienceSegment#type}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code size}</td>
     *         <td>{@link AudienceSegment#size}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code dataProviderName}</td>
     *         <td>{@link AudienceSegmentDataProvider#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code segmentType}</td>
     *         <td>{@link AudienceSegment#type}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code approvalStatus}</td>
     *         <td>{@link ThirdPartyAudienceSegment#approvalStatus}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code cost}</td>
     *         <td>{@link ThirdPartyAudienceSegment#cost}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code startDateTime}</td>
     *         <td>{@link ThirdPartyAudienceSegment#startDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code endDateTime}</td>
     *         <td>{@link ThirdPartyAudienceSegment#endDateTime}</td>
     *         </tr>
     *         </table>
     */
    public com.google.api.ads.admanager.axis.v202311.AudienceSegmentPage getAudienceSegmentsByStatement(com.google.api.ads.admanager.axis.v202311.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202311.ApiException;

    /**
     * Performs the given {@link AudienceSegmentAction} on the set
     * of segments identified by the given
     *         statement.
     */
    public com.google.api.ads.admanager.axis.v202311.UpdateResult performAudienceSegmentAction(com.google.api.ads.admanager.axis.v202311.AudienceSegmentAction action, com.google.api.ads.admanager.axis.v202311.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202311.ApiException;

    /**
     * Updates the given {@link FirstPartyAudienceSegment} objects.
     */
    public com.google.api.ads.admanager.axis.v202311.FirstPartyAudienceSegment[] updateAudienceSegments(com.google.api.ads.admanager.axis.v202311.FirstPartyAudienceSegment[] segments) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202311.ApiException;
}
