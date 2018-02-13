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
 * LabelServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public interface LabelServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link Label} objects.
     *         
     *         
     * @param labels the labels to create
     *         
     * @return the created labels with their IDs filled in
     */
    public com.google.api.ads.dfp.axis.v201802.Label[] createLabels(com.google.api.ads.dfp.axis.v201802.Label[] labels) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Gets a {@link LabelPage} of {@link Label} objects that satisfy
     * the
     *         given {@link Statement#query}. The following fields are supported
     * for
     *         filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Label#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code type}</td>
     *         <td>{@link Label#type}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Label#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code description}</td>
     *         <td>{@link Label#description}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code isActive}</td>
     *         <td>{@link Label#isActive}</td>
     *         </tr>
     *         </table>
     *         
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of labels.
     *         
     * @return the labels that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201802.LabelPage getLabelsByStatement(com.google.api.ads.dfp.axis.v201802.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Performs actions on {@link Label} objects that match the given
     * {@link Statement#query}.
     *         
     *         
     * @param labelAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of labels
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.axis.v201802.UpdateResult performLabelAction(com.google.api.ads.dfp.axis.v201802.LabelAction labelAction, com.google.api.ads.dfp.axis.v201802.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Updates the specified {@link Label} objects.
     *         
     *         
     * @param labels the labels to update
     *         
     * @return the updated labels
     */
    public com.google.api.ads.dfp.axis.v201802.Label[] updateLabels(com.google.api.ads.dfp.axis.v201802.Label[] labels) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;
}
