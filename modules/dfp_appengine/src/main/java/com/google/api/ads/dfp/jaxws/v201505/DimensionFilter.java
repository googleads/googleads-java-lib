
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DimensionFilter.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DimensionFilter">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADVERTISERS"/>
 *     &lt;enumeration value="ACTIVE_ADVERTISERS"/>
 *     &lt;enumeration value="HOUSE_ADVERTISERS"/>
 *     &lt;enumeration value="NON_HOUSE_ADVERTISERS"/>
 *     &lt;enumeration value="ALL_SALESPEOPLE"/>
 *     &lt;enumeration value="WHOLE_NETWORK"/>
 *     &lt;enumeration value="CURRENT_USER_ORDERS"/>
 *     &lt;enumeration value="STARTED_ORDERS"/>
 *     &lt;enumeration value="COMPLETED_ORDERS"/>
 *     &lt;enumeration value="MOBILE_LINE_ITEMS"/>
 *     &lt;enumeration value="WEB_LINE_ITEMS"/>
 *     &lt;enumeration value="ACTIVE_AD_UNITS"/>
 *     &lt;enumeration value="INACTIVE_AD_UNITS"/>
 *     &lt;enumeration value="MOBILE_INVENTORY_UNITS"/>
 *     &lt;enumeration value="WEB_INVENTORY_UNITS"/>
 *     &lt;enumeration value="ARCHIVED_AD_UNITS"/>
 *     &lt;enumeration value="ACTIVE_PLACEMENTS"/>
 *     &lt;enumeration value="INACTIVE_PLACEMENTS"/>
 *     &lt;enumeration value="ARCHIVED_PLACEMENTS"/>
 *     &lt;enumeration value="OPTIMIZABLE_ORDERS"/>
 *     &lt;enumeration value="PARTNER_STATS_TYPE_ESTIMATED"/>
 *     &lt;enumeration value="PARTNER_STATS_TYPE_RECONCILED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DimensionFilter")
@XmlEnum
public enum DimensionFilter {


    /**
     * 
     *                 Filters the results to include only advertisers. That is,
     *                 {@link Company#type} is either {@link Company.Type#HOUSE_ADVERTISER} or
     *                 {@link Company.Type#ADVERTISER}.
     *               
     * 
     */
    ADVERTISERS,

    /**
     * 
     *                 Filters the results to include only active advertisers. That is,
     *                 {@link Company#type} is either {@link Company.Type#HOUSE_ADVERTISER} or
     *                 {@link Company.Type#ADVERTISER} and the {@link Company} is active. This
     *                 filter is applied by default when {@link Dimension#ADVERTISER} is chosen.
     *               
     * 
     */
    ACTIVE_ADVERTISERS,

    /**
     * 
     *                 Filters the results to include only the publisher's own advertiser. That
     *                 is, {@link Company.Type} is {@link Company.Type#HOUSE_ADVERTISER}.
     *               
     * 
     */
    HOUSE_ADVERTISERS,

    /**
     * 
     *                 Filters the results to include only advertisers that do not belong to the
     *                 publisher. That is {@link Company.Type} is {@link Company.Type#ADVERTISER}.
     *               
     * 
     */
    NON_HOUSE_ADVERTISERS,

    /**
     * 
     *                 Filters the results to include only salespeople. This filter is applied by
     *                 default when {@link Dimension#SALESPERSON} is chosen.
     *               
     * 
     */
    ALL_SALESPEOPLE,

    /**
     * 
     *                 Results for the entire network are returned. This is the default filter if
     *                 none are specified.
     *               
     * 
     */
    WHOLE_NETWORK,

    /**
     * 
     *                 Filters the results to include only {@link Order} objects that are visible
     *                 to the {@link User}.
     *               
     * 
     */
    CURRENT_USER_ORDERS,

    /**
     * 
     *                 Filters the results to include only {@link Order} objects that have their
     *                 {@link Order#startDateTime} in the past and their {@link Order#endDateTime} in the future.
     *               
     * 
     */
    STARTED_ORDERS,

    /**
     * 
     *                 Filters the results to include only {@link Order} objects that have
     *                 their {@link Order#endDateTime} in the past.
     *               
     * 
     */
    COMPLETED_ORDERS,

    /**
     * 
     *                 Filters the results to include only {@link LineItem} objects delivered on
     *                 the platform {@link TargetPlatform#MOBILE}.
     *               
     * 
     */
    MOBILE_LINE_ITEMS,

    /**
     * 
     *                 Filters the results to include only {@link LineItem} objects delivered on
     *                 the platform {@link TargetPlatform#WEB}.
     *               
     * 
     */
    WEB_LINE_ITEMS,

    /**
     * 
     *                 Filters the results to include only {@link AdUnit} objects whose status is
     *                 {@link InventoryStatus#ACTIVE}.
     *               
     * 
     */
    ACTIVE_AD_UNITS,

    /**
     * 
     *                 Filters the results to include only {@link AdUnit} objects whose status is
     *                 {@link InventoryStatus#INACTIVE}.
     *               
     * 
     */
    INACTIVE_AD_UNITS,

    /**
     * 
     *                 Filters the results to include only {@link AdUnit} objects delivered on
     *                 the platform {@link TargetPlatform#MOBILE}.
     *               
     * 
     */
    MOBILE_INVENTORY_UNITS,

    /**
     * 
     *                 Filters the results to include only {@link AdUnit} objects delivered on
     *                 the platform {@link TargetPlatform#WEB}.
     *               
     * 
     */
    WEB_INVENTORY_UNITS,

    /**
     * 
     *                 Filters the results to include only {@link AdUnit} objects whose status is
     *                 {@link InventoryStatus#ARCHIVED}.
     *               
     * 
     */
    ARCHIVED_AD_UNITS,

    /**
     * 
     *                 Filters the results to include only {@link Placement} objects whose status
     *                 is {@link InventoryStatus#ACTIVE}.
     *               
     * 
     */
    ACTIVE_PLACEMENTS,

    /**
     * 
     *                 Filters the results to include only {@link Placement} objects whose status
     *                 is {@link InventoryStatus#INACTIVE}.
     *               
     * 
     */
    INACTIVE_PLACEMENTS,

    /**
     * 
     *                 Filters the results to include only {@link Placement} objects whose status
     *                 is {@link InventoryStatus#ARCHIVED}.
     *               
     * 
     */
    ARCHIVED_PLACEMENTS,

    /**
     * 
     *                 Filters the results to include only {@link Order} objects for which the
     *                 optimization feature has been turned on.
     *               
     * 
     */
    OPTIMIZABLE_ORDERS,

    /**
     * 
     *                 Filters the results to include only estimated partner stats.
     *               
     * 
     */
    PARTNER_STATS_TYPE_ESTIMATED,

    /**
     * 
     *                 Filters the results to include only reconciled partner stats.
     *               
     * 
     */
    PARTNER_STATS_TYPE_RECONCILED;

    public String value() {
        return name();
    }

    public static DimensionFilter fromValue(String v) {
        return valueOf(v);
    }

}
