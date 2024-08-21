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


package com.google.api.ads.admanager.jaxws.v202408;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DaiAuthenticationKeyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DaiAuthenticationKeyType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="API"/&gt;
 *     &lt;enumeration value="HMAC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DaiAuthenticationKeyType")
@XmlEnum
public enum DaiAuthenticationKeyType {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Indicates that the key is a standard API key and should be used with the api-key SDK parameter
     *                 when authenticating stream create requests.
     *               
     * 
     */
    API,

    /**
     * 
     *                 Indicates that the key is an HMAC key and should be used to generate a signature for the stream
     *                 create request with the auth-token SDK parameter.
     *               
     * 
     */
    HMAC;

    public String value() {
        return name();
    }

    public static DaiAuthenticationKeyType fromValue(String v) {
        return valueOf(v);
    }

}
