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
 * ProductTemplateServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public interface ProductTemplateServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link ProductTemplate} objects.
     *         
     *         
     * @param productTemplates the productTemplates to create
     *         
     * @return the persisted product templates with their Ids filled in
     */
    public com.google.api.ads.dfp.axis.v201802.ProductTemplate[] createProductTemplates(com.google.api.ads.dfp.axis.v201802.ProductTemplate[] productTemplates) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Gets a {@link ProductTemplatePage} of {@link ProductTemplate}
     * objects
     *         that satisfy the filtering criteria specified by given {@link
     * Statement#query}.
     *         The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link ProductTemplate#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link ProductTemplate#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code nameMacro}</td>
     *         <td>{@link ProductTemplate#nameMacro}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code description}</td>
     *         <td>{@link ProductTemplate#description}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link ProductTemplate#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link ProductTemplate#lastModifiedDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lineItemType}</td>
     *         <td>{@link LineItemType}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code productType}</td>
     *         <td>{@link ProductType}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code rateType}</td>
     *         <td>{@link RateType}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param statement a Publisher Query Language statement which specifies
     * the
     *         filtering criteria over productTemplates
     *         
     * @return the productTemplates that match the given statement
     */
    public com.google.api.ads.dfp.axis.v201802.ProductTemplatePage getProductTemplatesByStatement(com.google.api.ads.dfp.axis.v201802.Statement statement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Performs action on {@link ProductTemplate} objects that satisfy
     * the given
     *         {@link Statement#query}.
     *         
     *         
     * @param action the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of product templates
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.axis.v201802.UpdateResult performProductTemplateAction(com.google.api.ads.dfp.axis.v201802.ProductTemplateAction action, com.google.api.ads.dfp.axis.v201802.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Updates the specified {@link ProductTemplate} objects.
     *         
     *         
     * @param productTemplates the product templates to update
     *         
     * @return the updated product templates
     */
    public com.google.api.ads.dfp.axis.v201802.ProductTemplate[] updateProductTemplates(com.google.api.ads.dfp.axis.v201802.ProductTemplate[] productTemplates) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;
}
