
package com.google.api.ads.adwords.jaxws.v201509.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExperimentServingStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExperimentServingStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RUNNING"/>
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="ENDED"/>
 *     &lt;enumeration value="REMOVED"/>
 *     &lt;enumeration value="PROMOTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExperimentServingStatus")
@XmlEnum
public enum ExperimentServingStatus {


    /**
     * 
     *                 Experiment is currently active and receiving traffic
     *               
     * 
     */
    RUNNING,

    /**
     * 
     *                 Experiment has not started running yet i.e. start date has not reached yet
     *               
     * 
     */
    PENDING,

    /**
     * 
     *                 Experiment has already ended, but not promoted or removed.
     *               
     * 
     */
    ENDED,

    /**
     * 
     *                 Experiment has been removed.
     *               
     * 
     */
    REMOVED,

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

    public static ExperimentServingStatus fromValue(String v) {
        return valueOf(v);
    }

}
