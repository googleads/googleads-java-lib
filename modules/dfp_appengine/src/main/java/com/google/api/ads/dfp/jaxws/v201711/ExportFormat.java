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
 * <p>Java class for ExportFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExportFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TSV"/>
 *     &lt;enumeration value="TSV_EXCEL"/>
 *     &lt;enumeration value="CSV_DUMP"/>
 *     &lt;enumeration value="XML"/>
 *     &lt;enumeration value="XLSX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExportFormat")
@XmlEnum
public enum ExportFormat {


    /**
     * 
     *                 The report file is generated as a list of Tab Separated Values.
     *               
     * 
     */
    TSV,

    /**
     * 
     *                 The report file is generated as a list of tab-separated values for Excel.
     *               
     * 
     */
    TSV_EXCEL,

    /**
     * 
     *                 The report file is generated as a list of Comma Separated Values,
     *                 to be used with automated machine processing.
     *                 <p>
     *                 <ul>
     *                 <li>There is no pretty printing for the output, and no total row.</li>
     *                 <li>Column headers are the qualified name e.g. "Dimension.ORDER_NAME".</li>
     *                 <li>Network currency Monetary amounts are represented as micros in the
     *                 {@link Network#currencyCode currency of the network}.</li>
     *                 <li>Starting from v201705, local currency Monetary amounts are represented
     *                 as currency symbol + ' ' + micros. </li>
     *                 <li>Dates are formatted according to the ISO 8601 standard YYYY-MM-DD</li>
     *                 <li>DateTimes are formatted according to the ISO 8601 standard
     *                 YYYY-MM-DDThh:mm:ss[+-]hh:mm</li>
     *                 </ul>
     *               
     * 
     */
    CSV_DUMP,

    /**
     * 
     *                 The report file is generated as XML.
     *               
     * 
     */
    XML,

    /**
     * 
     *                 The report file is generated as an Office Open XML spreadsheet
     *                 designed for Excel 2007+.
     *               
     * 
     */
    XLSX;

    public String value() {
        return name();
    }

    public static ExportFormat fromValue(String v) {
        return valueOf(v);
    }

}
