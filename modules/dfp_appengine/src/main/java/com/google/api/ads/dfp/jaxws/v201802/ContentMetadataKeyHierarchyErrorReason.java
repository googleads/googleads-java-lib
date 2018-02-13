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


package com.google.api.ads.dfp.jaxws.v201802;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentMetadataKeyHierarchyError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContentMetadataKeyHierarchyError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LEVEL_MISSING"/>
 *     &lt;enumeration value="INVALID_DSM_HIERARCHY"/>
 *     &lt;enumeration value="CANNOT_USE_BROWSE_BY_KEY_WITH_HIERARCHY_FEATURE_ENABLED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContentMetadataKeyHierarchyError.Reason")
@XmlEnum
public enum ContentMetadataKeyHierarchyErrorReason {


    /**
     * 
     *                 One or more levels of the hierarchy are missing. For example, if the levels are {1, 2, 2}
     *                 or {1, 3, 4}, this error will be thrown.
     *               
     * 
     */
    LEVEL_MISSING,

    /**
     * 
     *                 DSM networks can only have one hierarchy per network and that hierarchy can only have
     *                 one level.
     *               
     * 
     */
    INVALID_DSM_HIERARCHY,

    /**
     * 
     *                 Cannot load or save the network browse by key when the content metadata key hierarchy
     *                 feature is enabled.
     *               
     * 
     */
    CANNOT_USE_BROWSE_BY_KEY_WITH_HIERARCHY_FEATURE_ENABLED,

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

    public static ContentMetadataKeyHierarchyErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
