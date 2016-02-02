
package com.google.api.ads.adwords.jaxws.v201601.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConstantDataService.UserInterestTaxonomyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConstantDataService.UserInterestTaxonomyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BRAND"/>
 *     &lt;enumeration value="IN_MARKET"/>
 *     &lt;enumeration value="MOBILE_APP_INSTALL_USER"/>
 *     &lt;enumeration value="VERTICAL_GEO"/>
 *     &lt;enumeration value="NEW_SMART_PHONE_USER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConstantDataService.UserInterestTaxonomyType")
@XmlEnum
public enum ConstantDataServiceUserInterestTaxonomyType {

    BRAND,
    IN_MARKET,
    MOBILE_APP_INSTALL_USER,
    VERTICAL_GEO,
    NEW_SMART_PHONE_USER;

    public String value() {
        return name();
    }

    public static ConstantDataServiceUserInterestTaxonomyType fromValue(String v) {
        return valueOf(v);
    }

}
