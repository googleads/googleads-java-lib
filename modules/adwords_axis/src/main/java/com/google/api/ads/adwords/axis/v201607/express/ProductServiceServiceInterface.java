// Copyright 2016 Google Inc. All Rights Reserved.
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
 * ProductServiceServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201607.express;

public interface ProductServiceServiceInterface extends java.rmi.Remote {

    /**
     * Retrieves the {@link ProductService}s that meet the criteria
     * set in the given selector. Only a
     *         limited number of {@link ProductService}s are returned.
     *         
     *         
     * @param selector the selector specifying the product services to return
     * 
     * @return list of product services identified by the selector
     */
    public com.google.api.ads.adwords.axis.v201607.express.ProductServicePage get(com.google.api.ads.adwords.axis.v201607.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201607.cm.ApiException;
}
