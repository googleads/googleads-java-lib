
package com.google.api.ads.adwords.jaxws.v201406.rm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An interface for a logical user list operand. A logical user list is a
 *             combination of logical rules. Each rule is defined as a logical operator and
 *             a list of operands. Those operands can be of type UserList.
 *           
 * 
 * <p>Java class for LogicalUserListOperand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogicalUserListOperand">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="UserList" type="{https://adwords.google.com/api/adwords/rm/v201406}UserList"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogicalUserListOperand", propOrder = {
    "userList"
})
public class LogicalUserListOperand {

    @XmlElement(name = "UserList")
    protected UserList userList;

    /**
     * Gets the value of the userList property.
     * 
     * @return
     *     possible object is
     *     {@link UserList }
     *     
     */
    public UserList getUserList() {
        return userList;
    }

    /**
     * Sets the value of the userList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserList }
     *     
     */
    public void setUserList(UserList value) {
        this.userList = value;
    }

}
