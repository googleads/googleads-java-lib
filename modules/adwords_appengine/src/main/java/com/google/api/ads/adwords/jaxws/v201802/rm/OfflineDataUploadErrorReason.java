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


package com.google.api.ads.adwords.jaxws.v201802.rm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfflineDataUploadError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OfflineDataUploadError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="INCOMPATIBLE_USERIDENTIFIER_TYPE"/>
 *     &lt;enumeration value="INVALID_UPLOAD_TYPE"/>
 *     &lt;enumeration value="MISSING_UPLOAD_METADATA"/>
 *     &lt;enumeration value="INVALID_UPLOAD_METADATA"/>
 *     &lt;enumeration value="INVALID_PARTNER_ID"/>
 *     &lt;enumeration value="MISSING_TRANSACTION_INFO"/>
 *     &lt;enumeration value="INVALID_CONVERSION_TYPE"/>
 *     &lt;enumeration value="FUTURE_TRANSACTION_TIME"/>
 *     &lt;enumeration value="NEGATIVE_TRANSACTION_AMOUNT"/>
 *     &lt;enumeration value="COUNTRY_CODE_HASHED"/>
 *     &lt;enumeration value="ZIPCODE_HASHED"/>
 *     &lt;enumeration value="EMAIL_NOT_HASHED"/>
 *     &lt;enumeration value="FIRST_NAME_NOT_HASHED"/>
 *     &lt;enumeration value="LAST_NAME_NOT_HASHED"/>
 *     &lt;enumeration value="PHONE_NOT_HASHED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OfflineDataUploadError.Reason")
@XmlEnum
public enum OfflineDataUploadErrorReason {

    UNKNOWN,

    /**
     * 
     *                 Indicates a row error due to the incompatible {@code OfflineDataUploadUserIdentifierType},
     *                 like using EXTERNAL_USER_ID for first party uploads or not using EXTERNAL_USER_ID for third
     *                 party uploads.
     *               
     * 
     */
    INCOMPATIBLE_USERIDENTIFIER_TYPE,

    /**
     * 
     *                 Indicates an upload error due to the invalid upload type.
     *               
     * 
     */
    INVALID_UPLOAD_TYPE,

    /**
     * 
     *                 Indicates an upload error due to missing metadata.
     *               
     * 
     */
    MISSING_UPLOAD_METADATA,

    /**
     * 
     *                 Indicates an upload error due to missing metadata.
     *               
     * 
     */
    INVALID_UPLOAD_METADATA,

    /**
     * 
     *                 Indicates an upload error due to invalid partner id in metadata.
     *               
     * 
     */
    INVALID_PARTNER_ID,

    /**
     * 
     *                 Indicates a row error due to missing transaction data.
     *               
     * 
     */
    MISSING_TRANSACTION_INFO,

    /**
     * 
     *                 The name specified in store_sales_attributes is used to report conversions to a conversion
     *                 type configured in AdWords with the same name. A row generates this error if there is no such
     *                 name configured in the account.
     *               
     * 
     */
    INVALID_CONVERSION_TYPE,

    /**
     * 
     *                 Indicates a row error due to a conversion with a transaction time in the future.
     *               
     * 
     */
    FUTURE_TRANSACTION_TIME,

    /**
     * 
     *                 Indicates a row error due to a negative transaction amount.
     *               
     * 
     */
    NEGATIVE_TRANSACTION_AMOUNT,

    /**
     * 
     *                 Country code hashed.
     *               
     * 
     */
    COUNTRY_CODE_HASHED,

    /**
     * 
     *                 ZIP Code hashed.
     *               
     * 
     */
    ZIPCODE_HASHED,

    /**
     * 
     *                 Email not hashed.
     *               
     * 
     */
    EMAIL_NOT_HASHED,

    /**
     * 
     *                 First Name not hashed.
     *               
     * 
     */
    FIRST_NAME_NOT_HASHED,

    /**
     * 
     *                 Last Name not hashed.
     *               
     * 
     */
    LAST_NAME_NOT_HASHED,

    /**
     * 
     *                 Phone not hashed.
     *               
     * 
     */
    PHONE_NOT_HASHED;

    public String value() {
        return name();
    }

    public static OfflineDataUploadErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
