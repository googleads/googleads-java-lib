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
 * <p>Java class for BatchJobStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BatchJobStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="AWAITING_FILE"/>
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="CANCELING"/>
 *     &lt;enumeration value="CANCELED"/>
 *     &lt;enumeration value="DONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BatchJobStatus")
@XmlEnum
public enum BatchJobStatus {


    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Initial state of a BatchJob. While a job has this status, it is awaiting a file
     *                 upload to Google Cloud Storage.
     *               
     * 
     */
    AWAITING_FILE,

    /**
     * 
     *                 Indicates that a job has an associated file and is being executed.
     *               
     * 
     */
    ACTIVE,

    /**
     * 
     *                 Indicates that a job is being canceled. It will remain in this status until any
     *                 partial results are written, and then will be marked CANCELED. Send this status
     *                 in a SET operation to cancel a job that is in progress. This is the only status
     *                 that can be explicitly set.
     *               
     * 
     */
    CANCELING,

    /**
     * 
     *                 Indicates that a job has been canceled. It will be garbage-collected 30 days
     *                 after cancellation.
     *               
     * 
     */
    CANCELED,

    /**
     * 
     *                 Indicates that a job has completed. It will be garbage-collected 30 days after
     *                 completion.
     *               
     * 
     */
    DONE;

    public String value() {
        return name();
    }

    public static BatchJobStatus fromValue(String v) {
        return valueOf(v);
    }

}
