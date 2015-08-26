
package com.google.api.ads.dfp.jaxws.v201411;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a file asset variable defined in a creative template.
 *             <p>
 *             Use {@link AssetCreativeTemplateVariableValue} to specify the value
 *             for this variable when creating {@link TemplateCreative} from the {@link TemplateCreative}.
 *           
 * 
 * <p>Java class for AssetCreativeTemplateVariable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetCreativeTemplateVariable">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201411}CreativeTemplateVariable">
 *       &lt;sequence>
 *         &lt;element name="mimeTypes" type="{https://www.google.com/apis/ads/publisher/v201411}AssetCreativeTemplateVariable.MimeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetCreativeTemplateVariable", propOrder = {
    "mimeTypes"
})
public class AssetCreativeTemplateVariable
    extends CreativeTemplateVariable
{

    @XmlSchemaType(name = "string")
    protected List<AssetCreativeTemplateVariableMimeType> mimeTypes;

    /**
     * Gets the value of the mimeTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mimeTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMimeTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetCreativeTemplateVariableMimeType }
     * 
     * 
     */
    public List<AssetCreativeTemplateVariableMimeType> getMimeTypes() {
        if (mimeTypes == null) {
            mimeTypes = new ArrayList<AssetCreativeTemplateVariableMimeType>();
        }
        return this.mimeTypes;
    }

}
