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


package com.google.api.ads.admanager.jaxws.v202502;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApprovalStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ApprovalStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DRAFT"/&gt;
 *     &lt;enumeration value="UNCHECKED"/&gt;
 *     &lt;enumeration value="APPROVED"/&gt;
 *     &lt;enumeration value="DISAPPROVED"/&gt;
 *     &lt;enumeration value="REQUIRES_REVIEW"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ApprovalStatus")
@XmlEnum
public enum ApprovalStatus {

    DRAFT,
    UNCHECKED,
    APPROVED,
    DISAPPROVED,
    REQUIRES_REVIEW,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static ApprovalStatus fromValue(String v) {
        return valueOf(v);
    }

}
