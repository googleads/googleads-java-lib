
package com.google.api.ads.adwords.jaxws.v201607.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedItemQualityDisapprovalReasons.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeedItemQualityDisapprovalReasons">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="TABLE_REPETITIVE_HEADERS"/>
 *     &lt;enumeration value="TABLE_REPETITIVE_DESCRIPTION"/>
 *     &lt;enumeration value="TABLE_INCONSISTENT_ROWS"/>
 *     &lt;enumeration value="TABLE_ROW_HEADER_TABLE_TYPE_MISMATCH"/>
 *     &lt;enumeration value="TABLE_ROW_HEADER_HAS_PROMOTIONAL_TEXT"/>
 *     &lt;enumeration value="TABLE_ROW_DESCRIPTION_NOT_RELEVANT"/>
 *     &lt;enumeration value="TABLE_ROW_DESCRIPTION_HAS_PROMOTIONAL_TEXT"/>
 *     &lt;enumeration value="TABLE_ROW_HEADER_DESCRIPTION_REPETITIVE"/>
 *     &lt;enumeration value="TABLE_ROW_UNRATEABLE"/>
 *     &lt;enumeration value="TABLE_ROW_PRICE_INVALID"/>
 *     &lt;enumeration value="TABLE_ROW_URL_INVALID"/>
 *     &lt;enumeration value="STRUCTURED_SNIPPETS_HEADER_POLICY_VIOLATED"/>
 *     &lt;enumeration value="STRUCTURED_SNIPPETS_REPEATED_VALUES"/>
 *     &lt;enumeration value="STRUCTURED_SNIPPETS_EDITORIAL_GUIDELINES"/>
 *     &lt;enumeration value="STRUCTURED_SNIPPETS_HAS_PROMOTIONAL_TEXT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeedItemQualityDisapprovalReasons")
@XmlEnum
public enum FeedItemQualityDisapprovalReasons {

    UNKNOWN,

    /**
     * 
     *                 Table contains repetitive headers
     *               
     * 
     */
    TABLE_REPETITIVE_HEADERS,

    /**
     * 
     *                 Table contains repetitive description
     *               
     * 
     */
    TABLE_REPETITIVE_DESCRIPTION,

    /**
     * 
     *                 Table contains inconsistent rows
     *               
     * 
     */
    TABLE_INCONSISTENT_ROWS,

    /**
     * 
     *                 Table row header is not relevant to the table type
     *               
     * 
     */
    TABLE_ROW_HEADER_TABLE_TYPE_MISMATCH,

    /**
     * 
     *                 Table row header has promotional text
     *               
     * 
     */
    TABLE_ROW_HEADER_HAS_PROMOTIONAL_TEXT,

    /**
     * 
     *                 Table row description is not relevant to the row header
     *               
     * 
     */
    TABLE_ROW_DESCRIPTION_NOT_RELEVANT,

    /**
     * 
     *                 Table row description contains promotional text
     *               
     * 
     */
    TABLE_ROW_DESCRIPTION_HAS_PROMOTIONAL_TEXT,

    /**
     * 
     *                 Table row header and description are repetitive
     *               
     * 
     */
    TABLE_ROW_HEADER_DESCRIPTION_REPETITIVE,

    /**
     * 
     *                 Table row is in a foreign language, nonsense, or can't be rated
     *               
     * 
     */
    TABLE_ROW_UNRATEABLE,

    /**
     * 
     *                 Table row price is invalid or inaccurate
     *               
     * 
     */
    TABLE_ROW_PRICE_INVALID,

    /**
     * 
     *                 Table row url is invalid or irrelevant
     *               
     * 
     */
    TABLE_ROW_URL_INVALID,

    /**
     * 
     *                 Snippet values do not match the header
     *               
     * 
     */
    STRUCTURED_SNIPPETS_HEADER_POLICY_VIOLATED,

    /**
     * 
     *                 Snippet values are repeated
     *               
     * 
     */
    STRUCTURED_SNIPPETS_REPEATED_VALUES,

    /**
     * 
     *                 Snippet values violate editorial guidelines like punctuation
     *               
     * 
     */
    STRUCTURED_SNIPPETS_EDITORIAL_GUIDELINES,

    /**
     * 
     *                 Snippets contain promotional text
     *               
     * 
     */
    STRUCTURED_SNIPPETS_HAS_PROMOTIONAL_TEXT;

    public String value() {
        return name();
    }

    public static FeedItemQualityDisapprovalReasons fromValue(String v) {
        return valueOf(v);
    }

}
