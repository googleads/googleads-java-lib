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
 * <p>Java class for CreativeTranscode.IdType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreativeTranscode.IdType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AD_ID"/&gt;
 *     &lt;enumeration value="CREATIVE_ID"/&gt;
 *     &lt;enumeration value="CREATIVE_ADID"/&gt;
 *     &lt;enumeration value="UNIVERSAL_AD_ID"/&gt;
 *     &lt;enumeration value="MEDIA_URI"/&gt;
 *     &lt;enumeration value="MEDIA_URI_PATH"/&gt;
 *     &lt;enumeration value="CREATIVE_ADID_WITH_FALLBACK"/&gt;
 *     &lt;enumeration value="CANONICALIZED_MEDIA_URI"/&gt;
 *     &lt;enumeration value="GV_REGISTRY_ID"/&gt;
 *     &lt;enumeration value="UNKNOWN_ID_TYPE"/&gt;
 *     &lt;enumeration value="MEDIA_URI_HASH"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CreativeTranscode.IdType")
@XmlEnum
public enum CreativeTranscodeIdType {

    AD_ID,
    CREATIVE_ID,
    CREATIVE_ADID,
    UNIVERSAL_AD_ID,
    MEDIA_URI,
    MEDIA_URI_PATH,
    CREATIVE_ADID_WITH_FALLBACK,
    CANONICALIZED_MEDIA_URI,
    GV_REGISTRY_ID,
    UNKNOWN_ID_TYPE,
    MEDIA_URI_HASH,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static CreativeTranscodeIdType fromValue(String v) {
        return valueOf(v);
    }

}
