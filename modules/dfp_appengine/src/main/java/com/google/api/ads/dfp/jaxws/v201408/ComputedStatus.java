
package com.google.api.ads.dfp.jaxws.v201408;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComputedStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ComputedStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DELIVERY_EXTENDED"/>
 *     &lt;enumeration value="DELIVERING"/>
 *     &lt;enumeration value="READY"/>
 *     &lt;enumeration value="PAUSED"/>
 *     &lt;enumeration value="NEEDS_CREATIVES"/>
 *     &lt;enumeration value="PAUSED_INVENTORY_RELEASED"/>
 *     &lt;enumeration value="PENDING_APPROVAL"/>
 *     &lt;enumeration value="COMPLETED"/>
 *     &lt;enumeration value="DISAPPROVED"/>
 *     &lt;enumeration value="DRAFT"/>
 *     &lt;enumeration value="CANCELED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ComputedStatus")
@XmlEnum
public enum ComputedStatus {


    /**
     * 
     *                 The {@link LineItem} has past its {@link LineItem#endDateTime} with an auto extension, but
     *                 hasn't met its goal.
     *               
     * 
     */
    DELIVERY_EXTENDED,

    /**
     * 
     *                 The {@link LineItem} has begun serving.
     *               
     * 
     */
    DELIVERING,

    /**
     * 
     *                 The {@link LineItem} has been activated and is ready to serve.
     *               
     * 
     */
    READY,

    /**
     * 
     *                 The {@link LineItem} has been paused from serving.
     *               
     * 
     */
    PAUSED,

    /**
     * 
     *                 The {@link LineItem} needs at least one more creative to be associated with it.
     *                 <p> Replaced with {@code INACTIVE} beginning in V201411.
     *               
     * 
     */
    NEEDS_CREATIVES,

    /**
     * 
     *                 The {@link LineItem} has been paused and its reserved inventory has been
     *                 released. The {@code LineItem} will not serve.
     *               
     * 
     */
    PAUSED_INVENTORY_RELEASED,

    /**
     * 
     *                 The {@link LineItem} has been submitted for approval.
     *               
     * 
     */
    PENDING_APPROVAL,

    /**
     * 
     *                 The {@link LineItem} has completed its run.
     *               
     * 
     */
    COMPLETED,

    /**
     * 
     *                 The {@link LineItem} has been disapproved and is not eligible to serve.
     *               
     * 
     */
    DISAPPROVED,

    /**
     * 
     *                 The {@link LineItem} is still being drafted.
     *               
     * 
     */
    DRAFT,

    /**
     * 
     *                 The {@link LineItem} has been canceled and is no longer eligible to serve.
     *                 This is a legacy status imported from Google Ad Manager orders.
     *               
     * 
     */
    CANCELED;

    public String value() {
        return name();
    }

    public static ComputedStatus fromValue(String v) {
        return valueOf(v);
    }

}
