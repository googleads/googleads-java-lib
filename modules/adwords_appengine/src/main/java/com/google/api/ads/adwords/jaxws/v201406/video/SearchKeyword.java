
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             SearchKeyword represents a keyword to be used for targeting YouTube search
 *             network exclusively.
 *             
 *             Note that this is a specialization of Keyword, except that it has different
 *             scopes, returned only when explicitly asking for SEARCH_KEYWORD type.
 *           
 * 
 * <p>Java class for SearchKeyword complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchKeyword">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/video/v201406}BaseKeyword">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchKeyword")
public class SearchKeyword
    extends BaseKeyword
{


}
