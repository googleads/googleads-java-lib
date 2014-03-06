
package com.google.api.ads.adwords.jaxws.v201402.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExperimentStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExperimentStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="DELETED"/>
 *     &lt;enumeration value="PROMOTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExperimentStatus")
@XmlEnum
public enum ExperimentStatus {


    /**
     * 
     *                 Experiment is currently active and can get traffic.
     *               
     * 
     */
    ACTIVE,

    /**
     * 
     *                 Experiment has been deleted.
     *               
     * 
     */
    DELETED,

    /**
     * 
     *                 Changes from the experiment have been applied.
     *               
     * 
     */
    PROMOTED;

    public String value() {
        return name();
    }

    public static ExperimentStatus fromValue(String v) {
        return valueOf(v);
    }

}
