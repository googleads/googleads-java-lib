// Copyright 2019 Google LLC
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
 * CmsMetadataServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v201908;

public interface CmsMetadataServiceInterface extends java.rmi.Remote {

    /**
     * Returns a page of {@link CmsMetadataKey}s matching the specified
     * {@link Statement}. The
     *         following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope = "col">PQL Property</th> <th scope="col">Object
     * Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link CmsMetadataKey#cmsMetadataKeyId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code cmsKey}</td>
     *         <td>{@link CmsMetadataKey#keyName}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link CmsMetadataKey#status}</td>
     *         </tr>
     *         </table>
     */
    public com.google.api.ads.admanager.axis.v201908.CmsMetadataKeyPage getCmsMetadataKeysByStatement(com.google.api.ads.admanager.axis.v201908.Statement statement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v201908.ApiException;

    /**
     * Returns a page of {@link CmsMetadataValue}s matching the specified
     * {@link Statement}. The
     *         following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope = "col">PQL Property</th> <th scope="col">Object
     * Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link CmsMetadataValue#cmsMetadataValueId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code cmsValue}</td>
     *         <td>{@link CmsMetadataValue#valueName}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code cmsKey}</td>
     *         <td>{@link CmsMetadataValue#key#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code cmsKeyId}</td>
     *         <td>{@link CmsMetadataValue#key#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code keyValueMemberContent}</td>
     *         <td>Content IDs tagged with a CMS metadata key-value</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link CmsMetadataValue#status}</td>
     *         </tr>
     *         </table>
     */
    public com.google.api.ads.admanager.axis.v201908.CmsMetadataValuePage getCmsMetadataValuesByStatement(com.google.api.ads.admanager.axis.v201908.Statement statement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v201908.ApiException;
}
