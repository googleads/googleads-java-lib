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
 * CreativeReviewServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202308;

public interface CreativeReviewServiceInterface extends java.rmi.Remote {

    /**
     * Gets a {@link CreativeReviewPage} of {@link CreativeReview}
     * objects that satisfy the given
     *         {@link Statement#query}. This will allow you to review creatives
     * that have displayed (or could
     *         have displayed) on your pages or apps in the last 30 days.
     * To ensure that you are always
     *         reviewing the most important creatives first, the {@link CreativeReview}
     * objects are ranked
     *         according to the number of impressions that they've received.
     * 
     *         <p>This feature is not yet openly available. Publishers will
     * need to apply for access for this
     *         feature through their account managers.
     */
    public com.google.api.ads.admanager.axis.v202308.CreativeReviewPage getCreativeReviewsByStatement(com.google.api.ads.admanager.axis.v202308.Statement statement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202308.ApiException;
}
