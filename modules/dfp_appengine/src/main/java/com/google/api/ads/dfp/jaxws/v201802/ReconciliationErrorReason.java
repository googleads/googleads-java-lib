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
 * <p>Java class for ReconciliationError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReconciliationError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CANNOT_CREATE_RECONCILIATION_REPORT_VERSION"/>
 *     &lt;enumeration value="INVALID_RECONCILIATION_REPORT_STATE_TRANSITION"/>
 *     &lt;enumeration value="INVALID_RECONCILIATION_PROPOSAL_SUBMISSION_SEQUENCE"/>
 *     &lt;enumeration value="USER_CANNOT_RECONCILE_RECONCILIATION_REPORT"/>
 *     &lt;enumeration value="CONTRACTED_VOLUME_CANNOT_BE_NULL"/>
 *     &lt;enumeration value="DFP_VOLUME_CANNOT_BE_NULL"/>
 *     &lt;enumeration value="MANUAL_VOLUME_CANNOT_BE_NULL"/>
 *     &lt;enumeration value="THIRD_PARTY_VOLUME_CANNOT_BE_NULL"/>
 *     &lt;enumeration value="DUPLICATE_LINE_ITEM_AND_CREATIVE"/>
 *     &lt;enumeration value="CANNOT_RECONCILE_LINE_ITEM_CREATIVE"/>
 *     &lt;enumeration value="LINE_ITEM_DAYS_MISMATCH"/>
 *     &lt;enumeration value="LINE_ITEM_BILL_OFF_OF_MISMATCH"/>
 *     &lt;enumeration value="CANNOT_MODIFY_RECONCILED_ORDER"/>
 *     &lt;enumeration value="CANNOT_MODIFY_ACROSS_MULTIPLE_RECONCILIATION_REPORTS"/>
 *     &lt;enumeration value="CANNOT_QUERY_ACROSS_MULTIPLE_RECONCILIATION_REPORTS"/>
 *     &lt;enumeration value="CANNOT_UPDATE_VOLUME_WHEN_BILLABLE_REVENUE_OVERRIDDEN"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReconciliationError.Reason")
@XmlEnum
public enum ReconciliationErrorReason {


    /**
     * 
     *                 Reconciliation report is reconciled, and need to revert.
     *                 Or reconciliation report is Deleted, and not possible.
     *               
     * 
     */
    CANNOT_CREATE_RECONCILIATION_REPORT_VERSION,

    /**
     * 
     *                 Reconciliation report can't be put into that reconciliation state.
     *               
     * 
     */
    INVALID_RECONCILIATION_REPORT_STATE_TRANSITION,

    /**
     * 
     *                 Previous cycles of the proposal must be reconciled first.
     *               
     * 
     */
    INVALID_RECONCILIATION_PROPOSAL_SUBMISSION_SEQUENCE,

    /**
     * 
     *                 User does not have permission to put reconciliation report into reconciled state.
     *               
     * 
     */
    USER_CANNOT_RECONCILE_RECONCILIATION_REPORT,

    /**
     * 
     *                 The billed from is contracted, but the contracted volume cannot be null.
     *               
     * 
     */
    CONTRACTED_VOLUME_CANNOT_BE_NULL,

    /**
     * 
     *                 The billed from is DFP, but the DFP volume cannot be null.
     *               
     * 
     */
    DFP_VOLUME_CANNOT_BE_NULL,

    /**
     * 
     *                 The billed from is manual, but the manual volume cannot be null.
     *               
     * 
     */
    MANUAL_VOLUME_CANNOT_BE_NULL,

    /**
     * 
     *                 The billed from is third-party, but the third-party volume cannot be null.
     *               
     * 
     */
    THIRD_PARTY_VOLUME_CANNOT_BE_NULL,

    /**
     * 
     *                 Duplicate tuples of (line item ID, creative ID).
     *               
     * 
     */
    DUPLICATE_LINE_ITEM_AND_CREATIVE,

    /**
     * 
     *                 Cannot reconcile the {@link ReconciliationReportRow}
     *                 as the line item ID and the creative ID association is invalid.
     *               
     * 
     */
    CANNOT_RECONCILE_LINE_ITEM_CREATIVE,

    /**
     * 
     *                 Third-party days delivered and manual days delivered cannot differ
     *                 for rows with same line item ID when line item cost type is CPD.
     *               
     * 
     */
    LINE_ITEM_DAYS_MISMATCH,

    /**
     * 
     *                 {@link ReconciliationReportRow#billFrom} field cannot differ for rows with same line item id
     *                 when line item cost type is CPD.
     *               
     * 
     */
    LINE_ITEM_BILL_OFF_OF_MISMATCH,

    /**
     * 
     *                 The order of the modifying rows in under reconciled status. The row couldn't
     *                 be changed.
     *               
     * 
     */
    CANNOT_MODIFY_RECONCILED_ORDER,

    /**
     * 
     *                 Can not modify across multiple reconciliation reports.
     *               
     * 
     */
    CANNOT_MODIFY_ACROSS_MULTIPLE_RECONCILIATION_REPORTS,

    /**
     * 
     *                 Can not query across multiple reconciliation reports.
     *               
     * 
     */
    CANNOT_QUERY_ACROSS_MULTIPLE_RECONCILIATION_REPORTS,

    /**
     * 
     *                 Cannot update reconciled volume when a billable revenue override is set.
     *               
     * 
     */
    CANNOT_UPDATE_VOLUME_WHEN_BILLABLE_REVENUE_OVERRIDDEN,

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

    public static ReconciliationErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
