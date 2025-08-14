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
 * PublisherQueryLanguageServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202508;

public interface PublisherQueryLanguageServiceInterface extends java.rmi.Remote {

    /**
     * Retrieves rows of data that satisfy the given {@link Statement#query}
     * from the system.
     */
    public com.google.api.ads.admanager.axis.v202508.ResultSet select(com.google.api.ads.admanager.axis.v202508.Statement selectStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202508.ApiException;
}
