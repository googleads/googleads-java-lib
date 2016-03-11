
package com.google.api.ads.dfp.jaxws.v201602;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Gets a {@link ProductPackagePage} of {@link ProductPackage} objects
 *             that satisfy the filtering criteria specified by given {@link Statement#query}.
 *             The following fields are supported for filtering:
 *             
 *             <table>
 *             <tr>
 *             <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
 *             </tr>
 *             <tr>
 *             <td>{@code id}</td>
 *             <td>{@link ProductPackage#id}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code name}</td>
 *             <td>{@link ProductPackage#name}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code notes}</td>
 *             <td>{@link ProductPackage#notes}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code status}</td>
 *             <td>{@link ProductPackage#status}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code isArchived}</td>
 *             <td>{@link ProductPackage#isArchived}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code lastModifiedDateTime}</td>
 *             <td>{@link ProductPackage#lastModifiedDateTime}</td>
 *             </tr>
 *             </table>
 *             
 *             @param statement a Publisher Query Language statement which specifies the
 *             filtering criteria over product packages
 *             @return the product packages that match the given statement
 *           
 * 
 * <p>Java class for getProductPackagesByStatement element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getProductPackagesByStatement">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="statement" type="{https://www.google.com/apis/ads/publisher/v201602}Statement" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "statement"
})
@XmlRootElement(name = "getProductPackagesByStatement")
public class ProductPackageServiceInterfacegetProductPackagesByStatement {

    protected Statement statement;

    /**
     * Gets the value of the statement property.
     * 
     * @return
     *     possible object is
     *     {@link Statement }
     *     
     */
    public Statement getStatement() {
        return statement;
    }

    /**
     * Sets the value of the statement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement }
     *     
     */
    public void setStatement(Statement value) {
        this.statement = value;
    }

}
