
package com.google.api.ads.adwords.jaxws.v201603.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a criterion for targeting paid apps.
 *             
 *             <p>Possible IDs: {@code 30} ({@code APP_PAYMENT_MODEL_PAID}).</p>
 *             <p>A criterion of this type can only be created using an ID. A criterion of this type is only targetable.
 *             <span class="constraint AdxEnabled">This is disabled for AdX when it is contained within Operators: ADD, SET.</span>
 *           
 * 
 * <p>Java class for AppPaymentModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppPaymentModel">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201603}Criterion">
 *       &lt;sequence>
 *         &lt;element name="appPaymentModelType" type="{https://adwords.google.com/api/adwords/cm/v201603}AppPaymentModel.AppPaymentModelType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppPaymentModel", propOrder = {
    "appPaymentModelType"
})
public class AppPaymentModel
    extends Criterion
{

    @XmlSchemaType(name = "string")
    protected AppPaymentModelAppPaymentModelType appPaymentModelType;

    /**
     * Gets the value of the appPaymentModelType property.
     * 
     * @return
     *     possible object is
     *     {@link AppPaymentModelAppPaymentModelType }
     *     
     */
    public AppPaymentModelAppPaymentModelType getAppPaymentModelType() {
        return appPaymentModelType;
    }

    /**
     * Sets the value of the appPaymentModelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppPaymentModelAppPaymentModelType }
     *     
     */
    public void setAppPaymentModelType(AppPaymentModelAppPaymentModelType value) {
        this.appPaymentModelType = value;
    }

}
