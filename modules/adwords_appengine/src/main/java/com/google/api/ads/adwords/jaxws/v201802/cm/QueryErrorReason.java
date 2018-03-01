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
 * <p>Java class for QueryError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PARSING_FAILED"/>
 *     &lt;enumeration value="MISSING_QUERY"/>
 *     &lt;enumeration value="MISSING_SELECT_CLAUSE"/>
 *     &lt;enumeration value="MISSING_FROM_CLAUSE"/>
 *     &lt;enumeration value="INVALID_SELECT_CLAUSE"/>
 *     &lt;enumeration value="INVALID_FROM_CLAUSE"/>
 *     &lt;enumeration value="INVALID_WHERE_CLAUSE"/>
 *     &lt;enumeration value="INVALID_ORDER_BY_CLAUSE"/>
 *     &lt;enumeration value="INVALID_LIMIT_CLAUSE"/>
 *     &lt;enumeration value="INVALID_START_INDEX_IN_LIMIT_CLAUSE"/>
 *     &lt;enumeration value="INVALID_PAGE_SIZE_IN_LIMIT_CLAUSE"/>
 *     &lt;enumeration value="INVALID_DURING_CLAUSE"/>
 *     &lt;enumeration value="INVALID_MIN_DATE_IN_DURING_CLAUSE"/>
 *     &lt;enumeration value="INVALID_MAX_DATE_IN_DURING_CLAUSE"/>
 *     &lt;enumeration value="MAX_LESS_THAN_MIN_IN_DURING_CLAUSE"/>
 *     &lt;enumeration value="VALIDATION_FAILED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QueryError.Reason")
@XmlEnum
public enum QueryErrorReason {


    /**
     * 
     *                 Exception that happens when trying to parse a query that doesn't match the AWQL grammar.
     *               
     * 
     */
    PARSING_FAILED,

    /**
     * 
     *                 The provided query is an empty string.
     *               
     * 
     */
    MISSING_QUERY,

    /**
     * 
     *                 The query does not contain the required SELECT clause or it is not in the
     *                 correct location.
     *               
     * 
     */
    MISSING_SELECT_CLAUSE,

    /**
     * 
     *                 The query does not contain the required FROM clause or it is not in the correct location.
     *               
     * 
     */
    MISSING_FROM_CLAUSE,

    /**
     * 
     *                 The SELECT clause could not be parsed.
     *               
     * 
     */
    INVALID_SELECT_CLAUSE,

    /**
     * 
     *                 The FROM clause could not be parsed.
     *               
     * 
     */
    INVALID_FROM_CLAUSE,

    /**
     * 
     *                 The WHERE clause could not be parsed.
     *               
     * 
     */
    INVALID_WHERE_CLAUSE,

    /**
     * 
     *                 The ORDER BY clause could not be parsed.
     *               
     * 
     */
    INVALID_ORDER_BY_CLAUSE,

    /**
     * 
     *                 The LIMIT clause could not be parsed.
     *               
     * 
     */
    INVALID_LIMIT_CLAUSE,

    /**
     * 
     *                 The startIndex in the LIMIT clause does not contain a valid integer.
     *               
     * 
     */
    INVALID_START_INDEX_IN_LIMIT_CLAUSE,

    /**
     * 
     *                 The pageSize in the LIMIT clause does not contain a valid integer.
     *               
     * 
     */
    INVALID_PAGE_SIZE_IN_LIMIT_CLAUSE,

    /**
     * 
     *                 The DURING clause could not be parsed.
     *               
     * 
     */
    INVALID_DURING_CLAUSE,

    /**
     * 
     *                 The minimum date in the DURING clause is not a valid date in YYYYMMDD format.
     *               
     * 
     */
    INVALID_MIN_DATE_IN_DURING_CLAUSE,

    /**
     * 
     *                 The maximum date in the DURING clause is not a valid date in YYYYMMDD format.
     *               
     * 
     */
    INVALID_MAX_DATE_IN_DURING_CLAUSE,

    /**
     * 
     *                 The minimum date in the DURING is after the maximum date.
     *               
     * 
     */
    MAX_LESS_THAN_MIN_IN_DURING_CLAUSE,

    /**
     * 
     *                 The query matched the grammar, but is invalid in some way such as using a service that
     *                 isn't supported.
     *               
     * 
     */
    VALIDATION_FAILED;

    public String value() {
        return name();
    }

    public static QueryErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
