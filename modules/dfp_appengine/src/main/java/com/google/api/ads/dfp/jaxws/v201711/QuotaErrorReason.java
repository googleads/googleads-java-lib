// Copyright 2017 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201711;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuotaError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuotaError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXCEEDED_QUOTA"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="REPORT_JOB_LIMIT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QuotaError.Reason")
@XmlEnum
public enum QuotaErrorReason {


    /**
     * 
     *                 The number of requests made per second is too high and has exceeded the
     *                 allowable limit. The recommended approach to handle this error is to wait
     *                 about 5 seconds and then retry the request. Note that this does not
     *                 guarantee the request will succeed. If it fails again, try increasing the
     *                 wait time.
     *                 <p>Another way to mitigate this error is to limit requests to 2 per second for
     *                 Small Business networks, or 8 per second for Premium networks. Once again
     *                 this does not guarantee that every request will succeed, but may help
     *                 reduce the number of times you receive this error.
     *               
     * 
     */
    EXCEEDED_QUOTA,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 This user has exceeded the allowed number of new report requests per hour
     *                 (this includes both reports run via the UI and reports
     *                 run via {@link ReportService#runReportJob}).
     *                 The recommended approach to handle this error is to wait about 10 minutes
     *                 and then retry the request. Note that this does not guarantee the request
     *                 will succeed. If it fails again, try increasing the wait time.
     *                 <p>Another way to mitigate this error is to limit the number of new report
     *                 requests to 250 per hour per user. Once again, this does not guarantee that
     *                 every request will succeed, but may help reduce the number of times you
     *                 receive this error.
     *               
     * 
     */
    REPORT_JOB_LIMIT;

    public String value() {
        return name();
    }

    public static QuotaErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
