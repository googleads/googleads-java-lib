
package com.google.api.ads.dfp.jaxws.v201411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Contains an object value.
 *             <p>
 *             <b>This object is experimental!
 *             <code>ObjectValue</code> is an experimental, innovative, and rapidly
 *             changing new feature for DFP. Unfortunately, being on the bleeding edge means that we may make
 *             backwards-incompatible changes to
 *             <code>ObjectValue</code>. We will inform the community when this feature
 *             is no longer experimental.</b>
 *           
 * 
 * <p>Java class for ObjectValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectValue">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201411}Value">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectValue")
@XmlSeeAlso({
    TargetingValue.class
})
public abstract class ObjectValue
    extends Value
{


}
