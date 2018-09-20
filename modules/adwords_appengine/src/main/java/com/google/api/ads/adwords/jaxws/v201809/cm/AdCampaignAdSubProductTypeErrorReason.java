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
 * <p>Java class for AdCampaignAdSubProductTypeError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdCampaignAdSubProductTypeError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_AD_SUB_PRODUCT_TYPE"/>
 *     &lt;enumeration value="CANNOT_CHANGE_AD_SUB_PRODUCT_TYPE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdCampaignAdSubProductTypeError.Reason")
@XmlEnum
public enum AdCampaignAdSubProductTypeErrorReason {


    /**
     * 
     *                 AdSubProductType is not allowed to be set to given value.
     *               
     * 
     */
    INVALID_AD_SUB_PRODUCT_TYPE,

    /**
     * 
     *                 Cannot change creative AdSubProduct type since it is not AD_VARIATIONS.
     *               
     * 
     */
    CANNOT_CHANGE_AD_SUB_PRODUCT_TYPE,

    /**
     * 
     *                 An unexpected or unknown error occurred.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static AdCampaignAdSubProductTypeErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
