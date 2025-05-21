// Copyright 2025 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202505;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportJobStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportJobStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COMPLETED"/&gt;
 *     &lt;enumeration value="IN_PROGRESS"/&gt;
 *     &lt;enumeration value="FAILED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReportJobStatus")
@XmlEnum
public enum ReportJobStatus {


    /**
     * 
     *                 The {@link ReportJob} has completed successfully and is ready to download.
     *               
     * 
     */
    COMPLETED,

    /**
     * 
     *                 The {@link ReportJob} is still being executed.
     *               
     * 
     */
    IN_PROGRESS,

    /**
     * 
     *                 The {@link ReportJob} has failed to run to completion.
     *               
     * 
     */
    FAILED;

    public String value() {
        return name();
    }

    public static ReportJobStatus fromValue(String v) {
        return valueOf(v);
    }

}
