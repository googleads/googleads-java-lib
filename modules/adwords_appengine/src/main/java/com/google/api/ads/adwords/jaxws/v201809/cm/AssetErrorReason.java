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


package com.google.api.ads.adwords.jaxws.v201809.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="ASSET_TYPE_NOT_SUPPORTED"/>
 *     &lt;enumeration value="CANNOT_REMOVE_ASSET_WITH_REMOVED_STATUS"/>
 *     &lt;enumeration value="CANNOT_MODIFY_ASSET_NAME"/>
 *     &lt;enumeration value="DUPLICATE_ASSET"/>
 *     &lt;enumeration value="DUPLICATE_ASSET_NAME"/>
 *     &lt;enumeration value="ASSET_DATA_IS_MISSING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AssetError.Reason")
@XmlEnum
public enum AssetErrorReason {

    UNKNOWN,

    /**
     * 
     *                 The asset type is not supported by asset service.
     *               
     * 
     */
    ASSET_TYPE_NOT_SUPPORTED,

    /**
     * 
     *                 Cannot remove an asset with status REMOVED.
     *               
     * 
     */
    CANNOT_REMOVE_ASSET_WITH_REMOVED_STATUS,

    /**
     * 
     *                 The asset has a name which is different from an existing duplicate that represents the same
     *                 content.
     *               
     * 
     */
    CANNOT_MODIFY_ASSET_NAME,

    /**
     * 
     *                 The asset is duplicated across operations.
     *               
     * 
     */
    DUPLICATE_ASSET,

    /**
     * 
     *                 The asset name is duplicated, either across operations, or with an existing asset.
     *               
     * 
     */
    DUPLICATE_ASSET_NAME,

    /**
     * 
     *                 No asset type specific data are set.
     *               
     * 
     */
    ASSET_DATA_IS_MISSING;

    public String value() {
        return name();
    }

    public static AssetErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
