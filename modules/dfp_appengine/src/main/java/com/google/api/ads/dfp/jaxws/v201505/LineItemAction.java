
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the actions that can be performed on {@link LineItem} objects.
 *           
 * 
 * <p>Java class for LineItemAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineItemAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItemAction")
@XmlSeeAlso({
    ArchiveLineItems.class,
    PauseLineItems.class,
    ActivateLineItems.class,
    DeleteLineItems.class,
    ReleaseLineItems.class,
    ReserveLineItems.class,
    UnarchiveLineItems.class,
    ResumeLineItems.class
})
public abstract class LineItemAction {


}
