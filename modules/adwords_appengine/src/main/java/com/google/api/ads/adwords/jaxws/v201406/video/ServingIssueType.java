
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServingIssue.Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServingIssue.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BLOCKING"/>
 *     &lt;enumeration value="ISSUE"/>
 *     &lt;enumeration value="NOTIFICATION"/>
 *     &lt;enumeration value="PENDING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServingIssue.Type")
@XmlEnum
public enum ServingIssueType {

    BLOCKING,
    ISSUE,
    NOTIFICATION,
    PENDING;

    public String value() {
        return name();
    }

    public static ServingIssueType fromValue(String v) {
        return valueOf(v);
    }

}
