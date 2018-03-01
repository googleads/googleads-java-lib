// Copyright 2018 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.adwords.jaxws.v201802.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a dynamic search ad. This ad will have its headline and final URL auto-generated at
 *             serving time according to domain name specific information provided by DynamicSearchAdsSetting at
 *             the campaign level.
 *             
 *             <p>Auto-generated fields: headline and final URL.</p>
 *             
 *             <p>Note: we recommend using the ExpandedDynamicSearchAd type, introduced in v201705, rather than
 *             the DynamicSearchAd type.</p>
 *             
 *             <p><b>Required fields:</b> {@code description1}, {@code description2}, {@code displayUrl}.</p>
 *             
 *             <p>The tracking URL field must contain at least one of the following placeholder tags
 *             (URL parameters):</p>
 *             <ul>
 *             <li>{unescapedlpurl}</li>
 *             <li>{escapedlpurl}</li>
 *             <li>{lpurl}</li>
 *             <li>{lpurl+2}</li>
 *             <li>{lpurl+3}</li>
 *             </ul>
 *             
 *             <ul>
 *             <li>{unescapedlpurl} will be replaced with the full landing page URL of the displayed ad.
 *             Extra query parameters can be added to the end, e.g.: "{unescapedlpurl}?lang=en".</li>
 *             
 *             <li>{escapedlpurl} will be replaced with the URL-encoded version of the full
 *             landing page URL. This makes it suitable for use as a query parameter
 *             value (e.g.: "http://www.3rdpartytracker.com/?lp={escapedlpurl}") but
 *             not at the beginning of the URL field.</li>
 *             
 *             <li>{lpurl} encodes the "?" and "=" of the landing page URL making it suitable
 *             for use as a query parameter. If found at the beginning of the URL field, it is
 *             replaced by the {unescapedlpurl} value.
 *             E.g.: "http://tracking.com/redir.php?tracking=xyz&url={lpurl}".</li>
 *             
 *             <li>{lpurl+2} and {lpurl+3}  will be replaced with the landing page URL escaped two or three
 *             times, respectively.  This makes it suitable if there is a chain of redirects in the tracking
 *             URL.</li>
 *             </ul>
 *             
 *             <p class="note">Note that {@code finalUrls} and {@code finalMobileUrls}
 *             cannot be set for dynamic search ads.</p>
 *             
 *             <p>For more information, see the article
 *             <a href="//support.google.com/adwords/answer/2549100">Using dynamic tracking URLs</a>.
 *             </p>
 *             <span class="constraint AdxEnabled">This is disabled for AdX when it is contained within Operators: ADD, SET.</span>
 *           
 * 
 * <p>Java class for DynamicSearchAd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DynamicSearchAd">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}Ad">
 *       &lt;sequence>
 *         &lt;element name="description1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicSearchAd", propOrder = {
    "description1",
    "description2"
})
public class DynamicSearchAd
    extends Ad
{

    protected String description1;
    protected String description2;

    /**
     * Gets the value of the description1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription1() {
        return description1;
    }

    /**
     * Sets the value of the description1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription1(String value) {
        this.description1 = value;
    }

    /**
     * Gets the value of the description2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription2() {
        return description2;
    }

    /**
     * Sets the value of the description2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription2(String value) {
        this.description2 = value;
    }

}
