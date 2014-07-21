
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConversionCategoryKey.ConversionCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConversionCategoryKey.ConversionCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONVERSION_CATEGORY_PURCHASE"/>
 *     &lt;enumeration value="CONVERSION_CATEGORY_SIGNUP"/>
 *     &lt;enumeration value="CONVERSION_CATEGORY_LEAD"/>
 *     &lt;enumeration value="CONVERSION_CATEGORY_PAGE_VIEW"/>
 *     &lt;enumeration value="CONVERSION_CATEGORY_OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConversionCategoryKey.ConversionCategory")
@XmlEnum
public enum ConversionCategoryKeyConversionCategory {

    CONVERSION_CATEGORY_PURCHASE,
    CONVERSION_CATEGORY_SIGNUP,
    CONVERSION_CATEGORY_LEAD,
    CONVERSION_CATEGORY_PAGE_VIEW,
    CONVERSION_CATEGORY_OTHER;

    public String value() {
        return name();
    }

    public static ConversionCategoryKeyConversionCategory fromValue(String v) {
        return valueOf(v);
    }

}
