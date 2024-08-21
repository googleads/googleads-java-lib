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
 * <p>Java class for ComputedStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ComputedStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DELIVERY_EXTENDED"/&gt;
 *     &lt;enumeration value="DELIVERING"/&gt;
 *     &lt;enumeration value="READY"/&gt;
 *     &lt;enumeration value="PAUSED"/&gt;
 *     &lt;enumeration value="INACTIVE"/&gt;
 *     &lt;enumeration value="PAUSED_INVENTORY_RELEASED"/&gt;
 *     &lt;enumeration value="PENDING_APPROVAL"/&gt;
 *     &lt;enumeration value="COMPLETED"/&gt;
 *     &lt;enumeration value="DISAPPROVED"/&gt;
 *     &lt;enumeration value="DRAFT"/&gt;
 *     &lt;enumeration value="CANCELED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ComputedStatus")
@XmlEnum
public enum ComputedStatus {


    /**
     * 
     *                 The {@link LineItem} has past its {@link LineItem#endDateTime} with an auto extension, but
     *                 hasn't met its goal.
     *               
     * 
     */
    DELIVERY_EXTENDED,

    /**
     * 
     *                 The {@link LineItem} has begun serving.
     *               
     * 
     */
    DELIVERING,

    /**
     * 
     *                 The {@link LineItem} has been activated and is ready to serve.
     *               
     * 
     */
    READY,

    /**
     * 
     *                 The {@link LineItem} has been paused from serving.
     *               
     * 
     */
    PAUSED,

    /**
     * 
     *                 The {@link LineItem} is inactive. It is either caused by missing creatives or
     *                 the network disabling auto-activation.
     *               
     * 
     */
    INACTIVE,

    /**
     * 
     *                 The {@link LineItem} has been paused and its reserved inventory has been
     *                 released. The {@code LineItem} will not serve.
     *               
     * 
     */
    PAUSED_INVENTORY_RELEASED,

    /**
     * 
     *                 The {@link LineItem} has been submitted for approval.
     *               
     * 
     */
    PENDING_APPROVAL,

    /**
     * 
     *                 The {@link LineItem} has completed its run.
     *               
     * 
     */
    COMPLETED,

    /**
     * 
     *                 The {@link LineItem} has been disapproved and is not eligible to serve.
     *               
     * 
     */
    DISAPPROVED,

    /**
     * 
     *                 The {@link LineItem} is still being drafted.
     *               
     * 
     */
    DRAFT,

    /**
     * 
     *                 The {@link LineItem} has been canceled and is no longer eligible to serve.
     *                 This is a legacy status imported from Google Ad Manager orders.
     *               
     * 
     */
    CANCELED;

    public String value() {
        return name();
    }

    public static ComputedStatus fromValue(String v) {
        return valueOf(v);
    }

}
