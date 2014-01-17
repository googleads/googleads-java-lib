
package com.google.api.ads.adwords.jaxws.v201309.o;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@link SearchParameter} that specifies the level of search volume delta expected in results,
 *             and it is directly related to
 *             {@link com.google.ads.api.services.targetingideas.external.AttributeType#SEARCH_VOLUME_DELTA}.
 *             Absence of a {@link SearchVolumeDeltaSearchParameter} in a
 *             {@link com.google.ads.api.services.targetingideas.TargetingIdeaSelector} is
 *             equivalent to having no constraint on search volume delta specified.
 *             <p>This element is supported by following {@link IdeaType}s: KEYWORD.
 *             <p>This element is supported by following {@link RequestType}s: STATS.
 *           
 * 
 * <p>Java class for SearchVolumeDeltaSearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchVolumeDeltaSearchParameter">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/o/v201309}SearchParameter">
 *       &lt;sequence>
 *         &lt;element name="relative" type="{https://adwords.google.com/api/adwords/o/v201309}DoubleComparisonOperation" minOccurs="0"/>
 *         &lt;element name="absolute" type="{https://adwords.google.com/api/adwords/o/v201309}LongComparisonOperation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchVolumeDeltaSearchParameter", propOrder = {
    "relative",
    "absolute"
})
public class SearchVolumeDeltaSearchParameter
    extends SearchParameter
{

    protected DoubleComparisonOperation relative;
    protected LongComparisonOperation absolute;

    /**
     * Gets the value of the relative property.
     * 
     * @return
     *     possible object is
     *     {@link DoubleComparisonOperation }
     *     
     */
    public DoubleComparisonOperation getRelative() {
        return relative;
    }

    /**
     * Sets the value of the relative property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoubleComparisonOperation }
     *     
     */
    public void setRelative(DoubleComparisonOperation value) {
        this.relative = value;
    }

    /**
     * Gets the value of the absolute property.
     * 
     * @return
     *     possible object is
     *     {@link LongComparisonOperation }
     *     
     */
    public LongComparisonOperation getAbsolute() {
        return absolute;
    }

    /**
     * Sets the value of the absolute property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongComparisonOperation }
     *     
     */
    public void setAbsolute(LongComparisonOperation value) {
        this.absolute = value;
    }

}
