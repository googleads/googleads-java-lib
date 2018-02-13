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
 * <p>Java class for ReconciliationImportError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReconciliationImportError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MISSING_EDITABLE_COLUMN"/>
 *     &lt;enumeration value="INCONSISTENT_IMPORT_COLUMNS"/>
 *     &lt;enumeration value="COLUMN_CONVERSION_TYPE_ERROR"/>
 *     &lt;enumeration value="INCONSISTENT_COLUMNS_COUNT"/>
 *     &lt;enumeration value="IMPORT_INTERNAL_ERROR"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReconciliationImportError.Reason")
@XmlEnum
public enum ReconciliationImportErrorReason {


    /**
     * 
     *                 The imported CSV missing some editable and essential columns.
     *               
     * 
     */
    MISSING_EDITABLE_COLUMN,

    /**
     * 
     *                 The imported CSV columns count doesn't equal with defined columns count.
     *               
     * 
     */
    INCONSISTENT_IMPORT_COLUMNS,

    /**
     * 
     *                 The imported CSV column value cannot be converted to defined entity type.
     *               
     * 
     */
    COLUMN_CONVERSION_TYPE_ERROR,

    /**
     * 
     *                 The imported CSV column values count are less or more than field headers count.
     *               
     * 
     */
    INCONSISTENT_COLUMNS_COUNT,

    /**
     * 
     *                 The imported CSV cause an internal error which is out of expectation.
     *               
     * 
     */
    IMPORT_INTERNAL_ERROR,

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

    public static ReconciliationImportErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
