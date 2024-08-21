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
 * <p>Java class for AuthenticationError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthenticationError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AMBIGUOUS_SOAP_REQUEST_HEADER"/&gt;
 *     &lt;enumeration value="INVALID_EMAIL"/&gt;
 *     &lt;enumeration value="AUTHENTICATION_FAILED"/&gt;
 *     &lt;enumeration value="INVALID_OAUTH_SIGNATURE"/&gt;
 *     &lt;enumeration value="INVALID_SERVICE"/&gt;
 *     &lt;enumeration value="MISSING_SOAP_REQUEST_HEADER"/&gt;
 *     &lt;enumeration value="MISSING_AUTHENTICATION_HTTP_HEADER"/&gt;
 *     &lt;enumeration value="MISSING_AUTHENTICATION"/&gt;
 *     &lt;enumeration value="NETWORK_API_ACCESS_DISABLED"/&gt;
 *     &lt;enumeration value="NO_NETWORKS_TO_ACCESS"/&gt;
 *     &lt;enumeration value="NETWORK_NOT_FOUND"/&gt;
 *     &lt;enumeration value="NETWORK_CODE_REQUIRED"/&gt;
 *     &lt;enumeration value="CONNECTION_ERROR"/&gt;
 *     &lt;enumeration value="GOOGLE_ACCOUNT_ALREADY_ASSOCIATED_WITH_NETWORK"/&gt;
 *     &lt;enumeration value="UNDER_INVESTIGATION"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AuthenticationError.Reason")
@XmlEnum
public enum AuthenticationErrorReason {


    /**
     * 
     *                 The SOAP message contains a request header with an ambiguous definition of the authentication
     *                 header fields. This means either the {@code authToken} and {@code oAuthToken} fields were
     *                 both null or both were specified. Exactly one value should be specified with each request.
     *               
     * 
     */
    AMBIGUOUS_SOAP_REQUEST_HEADER,

    /**
     * 
     *                 The login provided is invalid.
     *               
     * 
     */
    INVALID_EMAIL,

    /**
     * 
     *                 Tried to authenticate with provided information, but failed.
     *               
     * 
     */
    AUTHENTICATION_FAILED,

    /**
     * 
     *                 The OAuth provided is invalid.
     *               
     * 
     */
    INVALID_OAUTH_SIGNATURE,

    /**
     * 
     *                 The specified service to use was not recognized.
     *               
     * 
     */
    INVALID_SERVICE,

    /**
     * 
     *                 The SOAP message is missing a request header with an {@code authToken} and optional {@code
     *                 networkCode}.
     *               
     * 
     */
    MISSING_SOAP_REQUEST_HEADER,

    /**
     * 
     *                 The HTTP request is missing a request header with an {@code authToken}
     *               
     * 
     */
    MISSING_AUTHENTICATION_HTTP_HEADER,

    /**
     * 
     *                 The request is missing an {@code authToken}
     *               
     * 
     */
    MISSING_AUTHENTICATION,

    /**
     * 
     *                 The network does not have API access enabled.
     *               
     * 
     */
    NETWORK_API_ACCESS_DISABLED,

    /**
     * 
     *                 The user is not associated with any network.
     *               
     * 
     */
    NO_NETWORKS_TO_ACCESS,

    /**
     * 
     *                 No network for the given {@code networkCode} was found.
     *               
     * 
     */
    NETWORK_NOT_FOUND,

    /**
     * 
     *                 The user has access to more than one network, but did not provide a {@code networkCode}.
     *               
     * 
     */
    NETWORK_CODE_REQUIRED,

    /**
     * 
     *                 An error happened on the server side during connection to authentication service.
     *               
     * 
     */
    CONNECTION_ERROR,

    /**
     * 
     *                 The user tried to create a test network using an account that already is associated with a
     *                 network.
     *               
     * 
     */
    GOOGLE_ACCOUNT_ALREADY_ASSOCIATED_WITH_NETWORK,

    /**
     * 
     *                 The account is blocked and under investigation by the collections team. Please contact Google
     *                 for more information.
     *               
     * 
     */
    UNDER_INVESTIGATION,

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

    public static AuthenticationErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
