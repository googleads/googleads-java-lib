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
 * <p>Java class for BatchJobProcessingError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BatchJobProcessingError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="INPUT_FILE_CORRUPTION"/>
 *     &lt;enumeration value="INTERNAL_ERROR"/>
 *     &lt;enumeration value="DEADLINE_EXCEEDED"/>
 *     &lt;enumeration value="FILE_FORMAT_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BatchJobProcessingError.Reason")
@XmlEnum
public enum BatchJobProcessingErrorReason {

    UNKNOWN,

    /**
     * 
     *                 The input file was corrupted.
     *               
     * 
     */
    INPUT_FILE_CORRUPTION,

    /**
     * 
     *                 An internal API error occurred while processing the batch.
     *               
     * 
     */
    INTERNAL_ERROR,

    /**
     * 
     *                 Unable to complete a batch in the allotted time.
     *               
     * 
     */
    DEADLINE_EXCEEDED,

    /**
     * 
     *                 The input file had a format error.
     *               
     * 
     */
    FILE_FORMAT_ERROR;

    public String value() {
        return name();
    }

    public static BatchJobProcessingErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
