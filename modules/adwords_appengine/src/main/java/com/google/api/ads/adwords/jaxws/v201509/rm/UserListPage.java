
package com.google.api.ads.adwords.jaxws.v201509.rm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201509.cm.Page;


/**
 * 
 *             Contains a list of user lists resulting from the filtering and paging of the
 *             {@link UserListService#get} call.
 *           
 * 
 * <p>Java class for UserListPage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserListPage">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201509}Page">
 *       &lt;sequence>
 *         &lt;element name="entries" type="{https://adwords.google.com/api/adwords/rm/v201509}UserList" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserListPage", propOrder = {
    "entries"
})
public class UserListPage
    extends Page
{

    protected List<UserList> entries;

    /**
     * Gets the value of the entries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserList }
     * 
     * 
     */
    public List<UserList> getEntries() {
        if (entries == null) {
            entries = new ArrayList<UserList>();
        }
        return this.entries;
    }

}
