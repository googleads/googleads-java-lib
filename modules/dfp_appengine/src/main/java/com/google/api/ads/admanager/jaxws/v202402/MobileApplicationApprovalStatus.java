// Copyright 2024 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202402;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobileApplication.ApprovalStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MobileApplication.ApprovalStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="DRAFT"/&gt;
 *     &lt;enumeration value="UNCHECKED"/&gt;
 *     &lt;enumeration value="APPROVED"/&gt;
 *     &lt;enumeration value="DISAPPROVED"/&gt;
 *     &lt;enumeration value="APPEALING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MobileApplication.ApprovalStatus")
@XmlEnum
public enum MobileApplicationApprovalStatus {


    /**
     * 
     *                 Unknown approval status.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 The application is not yet ready for review.
     *               
     * 
     */
    DRAFT,

    /**
     * 
     *                 The application has not yet been reviewed.
     *               
     * 
     */
    UNCHECKED,

    /**
     * 
     *                 The application can serve ads.
     *               
     * 
     */
    APPROVED,

    /**
     * 
     *                 The application failed approval checks and it cannot serve any ads.
     *               
     * 
     */
    DISAPPROVED,

    /**
     * 
     *                 The application is disapproved but has a pending review status, signaling an appeal.
     *               
     * 
     */
    APPEALING;

    public String value() {
        return name();
    }

    public static MobileApplicationApprovalStatus fromValue(String v) {
        return valueOf(v);
    }

}
