
package com.google.api.ads.adwords.jaxws.v201502.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperatorError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperatorError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OPERATOR_NOT_SUPPORTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperatorError.Reason")
@XmlEnum
public enum OperatorErrorReason {

    OPERATOR_NOT_SUPPORTED;

    public String value() {
        return name();
    }

    public static OperatorErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
