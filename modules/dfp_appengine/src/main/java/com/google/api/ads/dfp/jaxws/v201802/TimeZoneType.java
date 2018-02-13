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


package com.google.api.ads.dfp.jaxws.v201802;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeZoneType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeZoneType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="PROPOSAL_LOCAL"/>
 *     &lt;enumeration value="PUBLISHER"/>
 *     &lt;enumeration value="AD_EXCHANGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimeZoneType")
@XmlEnum
public enum TimeZoneType {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Use the proposal or proposal line item time zone. This time zone is only compatible with sales
     *                 metrics and attributes.
     *                 
     *                 <p>For example, if
     *                 {@link com.google.ads.publisher.api.service.reports.Column#SALES_CONTRACT_CONTRACTED_CLICKS} is
     *                 included in a report with this flag set to {@code true}, then it will be calculated using the
     *                 {@link ProposalLineItem#timeZoneId} of the proposal line item the metric is for. If
     *                 {@link com.google.ads.publisher.api.service.reports.DimensionAttribute#PROPOSAL_CREATION_DATE_TIME}
     *                 is included in a report with this flag set to {@code true}, then a proposal's creation date
     *                 time will be formatted in {@link Proposal#timeZoneId} of that proposal.
     *               
     * 
     */
    PROPOSAL_LOCAL,

    /**
     * 
     *                 Use the publisher's time zone. For DFP reports, this time zone is compatible with all
     *                 metrics. For Ad Exchange reports, this time zone is not compatible with "Bids" and "Deals"
     *                 metrics.
     *                 
     *                 <p><b>Note:</b> if your report includes "time unit" dimensions, only the DFP "time unit"
     *                 dimensions are compatible with this timezone, e.g.:
     *                 <ul>
     *                 <li> {@link com.google.ads.publisher.api.service.reports.Dimension.DATE}
     *                 <li> {@link com.google.ads.publisher.api.service.reports.Dimension.WEEK}
     *                 <li> {@link com.google.ads.publisher.api.service.reports.Dimension.MONTH_AND_YEAR}
     *                 </ul>
     *               
     * 
     */
    PUBLISHER,

    /**
     * 
     *                 Use the Ad Exchange time zone (Pacific Time Zone). This time zone is only compatible with
     *                 Ad Exchange metrics.
     *                 
     *                 <p><b>Note:</b> if your report includes "time unit" dimensions, only the Ad Exchange
     *                 "time unit" dimensions are compatible with this timezone, e.g.:
     *                 <ul>
     *                 <li> {@link com.google.ads.publisher.api.service.reports.Dimension.AD_EXCHANGE_DATE}
     *                 <li> {@link com.google.ads.publisher.api.service.reports.Dimension.AD_EXCHANGE_WEEK}
     *                 <li> {@link com.google.ads.publisher.api.service.reports.Dimension.AD_EXCHANGE_MONTH}
     *                 </ul>
     *               
     * 
     */
    AD_EXCHANGE;

    public String value() {
        return name();
    }

    public static TimeZoneType fromValue(String v) {
        return valueOf(v);
    }

}
