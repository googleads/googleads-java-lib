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
 * BudgetSuggestionServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201603.express;

public interface BudgetSuggestionServiceInterface extends java.rmi.Remote {

    /**
     * Retrieves the budget suggestion for the specified criteria
     * in the given selector based on
     *         co-trigger data.
     *         
     * @param selector the selector specifying the budget suggestion to return
     * 
     * @return budget suggestion identified by the selector
     */
    public com.google.api.ads.adwords.axis.v201603.express.BudgetSuggestion get(com.google.api.ads.adwords.axis.v201603.express.BudgetSuggestionSelector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201603.cm.ApiException;
}
