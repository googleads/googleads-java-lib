
package com.google.api.ads.adwords.jaxws.v201603.o;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@link SearchParameter} that specifies the level of search volume expected in results,
 *             and it has a direct relationship to
 *             {@link com.google.ads.api.services.targetingideas.external.AttributeType#SEARCH_VOLUME}.
 *             Absence of a {@link SearchVolumeSearchParameter} in a
 *             {@link com.google.ads.api.services.targetingideas.TargetingIdeaSelector} is
 *             equivalent to having no constraint on search volume specified.
 *             <p>This element is supported by following {@link IdeaType}s: KEYWORD.
 *             <p>This element is supported by following {@link RequestType}s: IDEAS, STATS.
 *           
 * 
 * <p>Java class for SearchVolumeSearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchVolumeSearchParameter">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/o/v201603}SearchParameter">
 *       &lt;sequence>
 *         &lt;element name="operation" type="{https://adwords.google.com/api/adwords/o/v201603}LongComparisonOperation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchVolumeSearchParameter", propOrder = {
    "operation"
})
public class SearchVolumeSearchParameter
    extends SearchParameter
{

    protected LongComparisonOperation operation;

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link LongComparisonOperation }
     *     
     */
    public LongComparisonOperation getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongComparisonOperation }
     *     
     */
    public void setOperation(LongComparisonOperation value) {
        this.operation = value;
    }

}
