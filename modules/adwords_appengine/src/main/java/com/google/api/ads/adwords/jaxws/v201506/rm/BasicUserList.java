
package com.google.api.ads.adwords.jaxws.v201506.rm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             User list targeting as a collection of conversion types.
 *           
 * 
 * <p>Java class for BasicUserList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicUserList">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/rm/v201506}UserList">
 *       &lt;sequence>
 *         &lt;element name="conversionTypes" type="{https://adwords.google.com/api/adwords/rm/v201506}UserListConversionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicUserList", propOrder = {
    "conversionTypes"
})
public class BasicUserList
    extends UserList
{

    protected List<UserListConversionType> conversionTypes;

    /**
     * Gets the value of the conversionTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conversionTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConversionTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserListConversionType }
     * 
     * 
     */
    public List<UserListConversionType> getConversionTypes() {
        if (conversionTypes == null) {
            conversionTypes = new ArrayList<UserListConversionType>();
        }
        return this.conversionTypes;
    }

}
