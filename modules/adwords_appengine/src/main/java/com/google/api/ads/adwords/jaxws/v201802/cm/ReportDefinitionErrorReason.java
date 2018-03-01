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
 * <p>Java class for ReportDefinitionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportDefinitionError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_DATE_RANGE_FOR_REPORT"/>
 *     &lt;enumeration value="INVALID_FIELD_NAME_FOR_REPORT"/>
 *     &lt;enumeration value="UNABLE_TO_FIND_MAPPING_FOR_THIS_REPORT"/>
 *     &lt;enumeration value="INVALID_COLUMN_NAME_FOR_REPORT"/>
 *     &lt;enumeration value="INVALID_REPORT_DEFINITION_ID"/>
 *     &lt;enumeration value="REPORT_SELECTOR_CANNOT_BE_NULL"/>
 *     &lt;enumeration value="NO_ENUMS_FOR_THIS_COLUMN_NAME"/>
 *     &lt;enumeration value="INVALID_VIEW"/>
 *     &lt;enumeration value="SORTING_NOT_SUPPORTED"/>
 *     &lt;enumeration value="PAGING_NOT_SUPPORTED"/>
 *     &lt;enumeration value="CUSTOMER_SERVING_TYPE_REPORT_MISMATCH"/>
 *     &lt;enumeration value="CLIENT_SELECTOR_NO_CUSTOMER_IDENTIFIER"/>
 *     &lt;enumeration value="CLIENT_SELECTOR_INVALID_CUSTOMER_ID"/>
 *     &lt;enumeration value="REPORT_DEFINITION_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportDefinitionError.Reason")
@XmlEnum
public enum ReportDefinitionErrorReason {


    /**
     * 
     *                 Customer passed in invalid date range for a report type.
     *               
     * 
     */
    INVALID_DATE_RANGE_FOR_REPORT,

    /**
     * 
     *                 Customer passed in invalid field name for a report type
     *               
     * 
     */
    INVALID_FIELD_NAME_FOR_REPORT,

    /**
     * 
     *                 Unable to locate a field mapping for this report type.
     *               
     * 
     */
    UNABLE_TO_FIND_MAPPING_FOR_THIS_REPORT,

    /**
     * 
     *                 Customer passed in invalid column name for a report type
     *               
     * 
     */
    INVALID_COLUMN_NAME_FOR_REPORT,

    /**
     * 
     *                 Customer passed in invalid report definition id.
     *               
     * 
     */
    INVALID_REPORT_DEFINITION_ID,

    /**
     * 
     *                 Report selector cannot be null.
     *               
     * 
     */
    REPORT_SELECTOR_CANNOT_BE_NULL,

    /**
     * 
     *                 No Enums exist for this column name.
     *               
     * 
     */
    NO_ENUMS_FOR_THIS_COLUMN_NAME,

    /**
     * 
     *                 Invalid view name.
     *               
     * 
     */
    INVALID_VIEW,

    /**
     * 
     *                 Sorting is not supported for reports.
     *               
     * 
     */
    SORTING_NOT_SUPPORTED,

    /**
     * 
     *                 Paging is not supported for reports.
     *               
     * 
     */
    PAGING_NOT_SUPPORTED,

    /**
     * 
     *                 Customer can not create report of a selected type.
     *               
     * 
     */
    CUSTOMER_SERVING_TYPE_REPORT_MISMATCH,

    /**
     * 
     *                 Cross client report has an client selector without any valid identifier
     *                 for a customer.
     *               
     * 
     */
    CLIENT_SELECTOR_NO_CUSTOMER_IDENTIFIER,

    /**
     * 
     *                 Cross client report has an invalid external customer ID in the client
     *                 selector.
     *               
     * 
     */
    CLIENT_SELECTOR_INVALID_CUSTOMER_ID,
    REPORT_DEFINITION_ERROR;

    public String value() {
        return name();
    }

    public static ReportDefinitionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
