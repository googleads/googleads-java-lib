
package com.google.api.ads.adwords.jaxws.v201502.o;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201502.cm.NetworkSetting;


/**
 * 
 *             <p>A {@link SearchParameter} for setting the search network. Currently we
 *             support two network setting options:
 *             <ul>
 *             <li>Google search network</li>
 *             <li>Google search network and AFS</li>
 *             </ul>
 *             <p>This element is supported by following {@link IdeaType}s: KEYWORD.
 *             <p>This element is supported by following {@link RequestType}s: IDEAS, STATS.
 *           
 * 
 * <p>Java class for NetworkSearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkSearchParameter">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/o/v201502}SearchParameter">
 *       &lt;sequence>
 *         &lt;element name="networkSetting" type="{https://adwords.google.com/api/adwords/cm/v201502}NetworkSetting" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkSearchParameter", propOrder = {
    "networkSetting"
})
public class NetworkSearchParameter
    extends SearchParameter
{

    protected NetworkSetting networkSetting;

    /**
     * Gets the value of the networkSetting property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkSetting }
     *     
     */
    public NetworkSetting getNetworkSetting() {
        return networkSetting;
    }

    /**
     * Sets the value of the networkSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkSetting }
     *     
     */
    public void setNetworkSetting(NetworkSetting value) {
        this.networkSetting = value;
    }

}
