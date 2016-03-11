
package com.google.api.ads.adwords.jaxws.v201509.rm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A container for return value from {@code UserListService#mutateMembers}
 *             method.
 *           
 * 
 * <p>Java class for MutateMembersReturnValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MutateMembersReturnValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userLists" type="{https://adwords.google.com/api/adwords/rm/v201509}UserList" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MutateMembersReturnValue", propOrder = {
    "userLists"
})
public class MutateMembersReturnValue {

    protected List<UserList> userLists;

    /**
     * Gets the value of the userLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserList }
     * 
     * 
     */
    public List<UserList> getUserLists() {
        if (userLists == null) {
            userLists = new ArrayList<UserList>();
        }
        return this.userLists;
    }

}
