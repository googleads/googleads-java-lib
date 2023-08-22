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


package com.google.api.ads.admanager.jaxws.v202305;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SiteError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INVALID_CHILD_NETWORK_CODE"/&gt;
 *     &lt;enumeration value="CANNOT_ARCHIVE_SITE_WITH_SUBSITES"/&gt;
 *     &lt;enumeration value="INVALID_URL_FOR_SITE"/&gt;
 *     &lt;enumeration value="MULTIPLE_UPDATES_FOR_SAME_SITE"/&gt;
 *     &lt;enumeration value="TOO_MANY_SITES_PER_REVIEW_REQUEST"/&gt;
 *     &lt;enumeration value="TOO_MANY_REVIEW_REQUESTS_FOR_SITE"/&gt;
 *     &lt;enumeration value="INVALID_APPROVAL_STATUS_FOR_REVIEW"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SiteError.Reason")
@XmlEnum
public enum SiteErrorReason {


    /**
     * 
     *                 The network code must belong to an MCM child network.
     *               
     * 
     */
    INVALID_CHILD_NETWORK_CODE,

    /**
     * 
     *                 Archive all subsites before archiving the site.
     *               
     * 
     */
    CANNOT_ARCHIVE_SITE_WITH_SUBSITES,

    /**
     * 
     *                 The URL is invalid for a top-level site.
     *               
     * 
     */
    INVALID_URL_FOR_SITE,

    /**
     * 
     *                 The batch of sites could not be updated because the same site was updated multiple times in
     *                 the batch.
     *               
     * 
     */
    MULTIPLE_UPDATES_FOR_SAME_SITE,

    /**
     * 
     *                 Too many sites in the request to submit them for review.
     *               
     * 
     */
    TOO_MANY_SITES_PER_REVIEW_REQUEST,

    /**
     * 
     *                 The site has been submitted for review too many times.
     *               
     * 
     */
    TOO_MANY_REVIEW_REQUESTS_FOR_SITE,

    /**
     * 
     *                 Only sites with approval status {@link ApprovalStatus#DRAFT}, {@link
     *                 ApprovalStatus#DISAPPROVED} and {@link ApprovalStatus#REQUIRES_REVIEW} can be submitted for
     *                 review.
     *               
     * 
     */
    INVALID_APPROVAL_STATUS_FOR_REVIEW,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static SiteErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
