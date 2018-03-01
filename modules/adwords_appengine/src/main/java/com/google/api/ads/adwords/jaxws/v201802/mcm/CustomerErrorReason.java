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


package com.google.api.ads.adwords.jaxws.v201802.mcm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_SERVICE_LINK"/>
 *     &lt;enumeration value="INVALID_STATUS"/>
 *     &lt;enumeration value="ACCOUNT_NOT_SET_UP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomerError.Reason")
@XmlEnum
public enum CustomerErrorReason {


    /**
     * 
     *                 Referenced service link does not exist
     *               
     * 
     */
    INVALID_SERVICE_LINK,

    /**
     * 
     *                 An {@code ACTIVE} link cannot be made {@code PENDING}
     *               
     * 
     */
    INVALID_STATUS,

    /**
     * 
     *                 CustomerService cannot {@link CustomerService#get() get} an account that is not fully set up.
     *               
     * 
     */
    ACCOUNT_NOT_SET_UP;

    public String value() {
        return name();
    }

    public static CustomerErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
