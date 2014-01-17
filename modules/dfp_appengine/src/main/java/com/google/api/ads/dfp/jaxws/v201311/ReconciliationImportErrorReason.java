
package com.google.api.ads.dfp.jaxws.v201311;

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
 *     &lt;enumeration value="ILLEGAL_CONVERTION"/>
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
    ILLEGAL_CONVERTION,

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
