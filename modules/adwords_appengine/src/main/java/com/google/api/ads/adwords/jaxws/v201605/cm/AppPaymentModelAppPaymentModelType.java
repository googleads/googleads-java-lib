
package com.google.api.ads.adwords.jaxws.v201605.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppPaymentModel.AppPaymentModelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AppPaymentModel.AppPaymentModelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APP_PAYMENT_MODEL_PAID"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AppPaymentModel.AppPaymentModelType")
@XmlEnum
public enum AppPaymentModelAppPaymentModelType {


    /**
     * 
     *                 Represents paid-for apps.
     *               
     * 
     */
    APP_PAYMENT_MODEL_PAID,

    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static AppPaymentModelAppPaymentModelType fromValue(String v) {
        return valueOf(v);
    }

}
