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
 * NativeStyleServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public interface NativeStyleServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link NativeStyle} objects.
     *         
     *         
     * @param nativeStyles the native styles to create
     *         
     * @return the created native styles with their IDs filled in
     */
    public com.google.api.ads.dfp.axis.v201802.NativeStyle[] createNativeStyles(com.google.api.ads.dfp.axis.v201802.NativeStyle[] nativeStyles) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Gets a {@link NativeStylePage NativeStylePage} of {@link NativeStyle}
     * objects that satisfy
     *         the given {@link Statement}. The following fields are supported
     * for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th>
     *         <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link NativeStyle#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link NativeStyle#name}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter a set of
     *         native styles.
     *         
     * @return the native styles that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201802.NativeStylePage getNativeStylesByStatement(com.google.api.ads.dfp.axis.v201802.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Performs actions on {@link NativeStyle native styles} that
     * match the given {@link Statement}.
     *         
     *         
     * @param nativeStyleAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement to filter
     * a set of native styles
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.axis.v201802.UpdateResult performNativeStyleAction(com.google.api.ads.dfp.axis.v201802.NativeStyleAction nativeStyleAction, com.google.api.ads.dfp.axis.v201802.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Updates the specified {@link NativeStyle} objects.
     *         
     *         
     * @param nativeStyles the native styles to be updated
     *         
     * @return the updated native styles
     */
    public com.google.api.ads.dfp.axis.v201802.NativeStyle[] updateNativeStyles(com.google.api.ads.dfp.axis.v201802.NativeStyle[] nativeStyles) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;
}
