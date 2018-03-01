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


package com.google.api.ads.adwords.jaxws.v201802.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationAccessDenied.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperationAccessDenied.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTION_NOT_PERMITTED"/>
 *     &lt;enumeration value="ADD_OPERATION_NOT_PERMITTED"/>
 *     &lt;enumeration value="REMOVE_OPERATION_NOT_PERMITTED"/>
 *     &lt;enumeration value="SET_OPERATION_NOT_PERMITTED"/>
 *     &lt;enumeration value="MUTATE_ACTION_NOT_PERMITTED_FOR_CLIENT"/>
 *     &lt;enumeration value="OPERATION_NOT_PERMITTED_FOR_CAMPAIGN_TYPE"/>
 *     &lt;enumeration value="ADD_AS_REMOVED_NOT_PERMITTED"/>
 *     &lt;enumeration value="OPERATION_NOT_PERMITTED_FOR_REMOVED_ENTITY"/>
 *     &lt;enumeration value="OPERATION_NOT_PERMITTED_FOR_AD_GROUP_TYPE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperationAccessDenied.Reason")
@XmlEnum
public enum OperationAccessDeniedReason {


    /**
     * 
     *                 Unauthorized invocation of a service's method (get, mutate, etc.)
     *               
     * 
     */
    ACTION_NOT_PERMITTED,

    /**
     * 
     *                 Unauthorized ADD operation in invoking a service's mutate method.
     *               
     * 
     */
    ADD_OPERATION_NOT_PERMITTED,

    /**
     * 
     *                 Unauthorized REMOVE operation in invoking a service's mutate method.
     *               
     * 
     */
    REMOVE_OPERATION_NOT_PERMITTED,

    /**
     * 
     *                 Unauthorized SET operation in invoking a service's mutate method.
     *               
     * 
     */
    SET_OPERATION_NOT_PERMITTED,

    /**
     * 
     *                 A mutate action is not allowed on this campaign, from this client.
     *               
     * 
     */
    MUTATE_ACTION_NOT_PERMITTED_FOR_CLIENT,

    /**
     * 
     *                 This operation is not permitted on this campaign type
     *               
     * 
     */
    OPERATION_NOT_PERMITTED_FOR_CAMPAIGN_TYPE,

    /**
     * 
     *                 An ADD operation may not set status to REMOVED.
     *               
     * 
     */
    ADD_AS_REMOVED_NOT_PERMITTED,

    /**
     * 
     *                 This operation is not allowed because the campaign or adgroup is removed.
     *               
     * 
     */
    OPERATION_NOT_PERMITTED_FOR_REMOVED_ENTITY,

    /**
     * 
     *                 This operation is not permitted on this ad group type.
     *               
     * 
     */
    OPERATION_NOT_PERMITTED_FOR_AD_GROUP_TYPE,

    /**
     * 
     *                 The reason the invoked method or operation is prohibited is not known
     *                 (the client may be of an older version than the server).
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static OperationAccessDeniedReason fromValue(String v) {
        return valueOf(v);
    }

}
