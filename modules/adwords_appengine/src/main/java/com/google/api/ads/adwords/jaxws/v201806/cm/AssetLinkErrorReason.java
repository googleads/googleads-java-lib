// Copyright 2018 Google LLC
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


package com.google.api.ads.adwords.jaxws.v201806.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetLinkError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetLinkError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_ASSET_TYPE_FOR_FIELD"/>
 *     &lt;enumeration value="PINNING_UNSUPPORTED"/>
 *     &lt;enumeration value="INVALID_PINNED_FIELD"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AssetLinkError.Reason")
@XmlEnum
public enum AssetLinkErrorReason {


    /**
     * 
     *                 Provided asset's type is invalid for use in the specified field.
     *               
     * 
     */
    INVALID_ASSET_TYPE_FOR_FIELD,

    /**
     * 
     *                 Pinning is not supported for the given AssetLink field.
     *               
     * 
     */
    PINNING_UNSUPPORTED,

    /**
     * 
     *                 The input pinnedField is not valid for the given AssetLink field.
     *               
     * 
     */
    INVALID_PINNED_FIELD,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static AssetLinkErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
