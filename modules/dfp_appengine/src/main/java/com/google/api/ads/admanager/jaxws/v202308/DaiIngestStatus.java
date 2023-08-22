// Copyright 2023 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202308;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DaiIngestStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DaiIngestStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SUCCESS"/&gt;
 *     &lt;enumeration value="WARNING"/&gt;
 *     &lt;enumeration value="INGESTED"/&gt;
 *     &lt;enumeration value="INGESTED_WITH_WARNINGS"/&gt;
 *     &lt;enumeration value="CONDITIONED"/&gt;
 *     &lt;enumeration value="CONDITIONED_WITH_WARNINGS"/&gt;
 *     &lt;enumeration value="FAILURE"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DaiIngestStatus")
@XmlEnum
public enum DaiIngestStatus {


    /**
     * 
     *                 The content was successfully ingested for DAI.
     *               
     * 
     */
    SUCCESS,

    /**
     * 
     *                 There was a non-fatal issue during the DAI ingestion process.
     *               
     * 
     */
    WARNING,

    /**
     * 
     *                 The preconditioned content was successfully ingested for DAI.
     *               
     * 
     */
    INGESTED,

    /**
     * 
     *                 There was a non-fatal issue during the DAI ingestion process on preconditioned content.
     *               
     * 
     */
    INGESTED_WITH_WARNINGS,

    /**
     * 
     *                 The unconditioned content was successfully conditioned for DAI.
     *               
     * 
     */
    CONDITIONED,

    /**
     * 
     *                 There was a non-fatal issue during the DAI conditioning process on originally unconditioned
     *                 content.
     *               
     * 
     */
    CONDITIONED_WITH_WARNINGS,

    /**
     * 
     *                 There was a non-fatal issue during the DAI ingestion process and the content is not available
     *                 for dynamic ad insertion.
     *               
     * 
     */
    FAILURE,

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

    public static DaiIngestStatus fromValue(String v) {
        return valueOf(v);
    }

}
