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
 * ProductPackageItemServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public interface ProductPackageItemServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link ProductPackageItem} objects.
     *         
     *         
     * @param productPackageItems the product package items to create
     *         
     * @return the created product package items with their IDs filled in
     */
    public com.google.api.ads.dfp.axis.v201802.ProductPackageItem[] createProductPackageItems(com.google.api.ads.dfp.axis.v201802.ProductPackageItem[] productPackageItems) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Gets a {@link ProductPackageItemPage} of {@code ProductPackageItem}
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
     *         <td>{@link ProductPackageItem#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code productPackageId}</td>
     *         <td>{@link ProductPackageItem#productPackageId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code productId}</td>
     *         <td>{@link ProductPackageItem#productId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code productTemplateId}</td>
     *         <td>{@link ProductPackageItem#productTemplateId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code mandatory}</td>
     *         <td>{@link ProductPackageItem#mandatory}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code archived}</td>
     *         <td>{@link ProductPackageItem#archived}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param statement a Publisher Query Language statement which specifies
     * the
     *         filtering criteria over product packages
     *         
     * @return the product package items that match the given statement
     */
    public com.google.api.ads.dfp.axis.v201802.ProductPackageItemPage getProductPackageItemsByStatement(com.google.api.ads.dfp.axis.v201802.Statement statement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Performs actions on {@link ProductPackageItem} objects that
     * satisfy the given
     *         {@link Statement#query}.
     *         
     *         
     * @param productPackageItemAction the action to perform
     *         
     * @param statement a Publisher Query Language statement used to filter
     * a set of product package items
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.axis.v201802.UpdateResult performProductPackageItemAction(com.google.api.ads.dfp.axis.v201802.ProductPackageItemAction productPackageItemAction, com.google.api.ads.dfp.axis.v201802.Statement statement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Updates the specified {@link ProductPackageItem} objects.
     *         
     *         
     * @param productPackageItems the product package items to update
     *         
     * @return the updated product package items
     */
    public com.google.api.ads.dfp.axis.v201802.ProductPackageItem[] updateProductPackageItems(com.google.api.ads.dfp.axis.v201802.ProductPackageItem[] productPackageItems) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;
}
