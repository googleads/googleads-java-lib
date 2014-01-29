
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProposalLineItemError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProposalLineItemError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_SAME_RATE_CARD"/>
 *     &lt;enumeration value="LINE_ITEM_TYPE_NOT_ALLOWED"/>
 *     &lt;enumeration value="END_DATE_TIME_NOT_AFTER_START_TIME"/>
 *     &lt;enumeration value="END_DATE_TIME_TOO_LATE"/>
 *     &lt;enumeration value="START_DATE_TIME_IS_IN_PAST"/>
 *     &lt;enumeration value="END_DATE_TIME_IS_IN_PAST"/>
 *     &lt;enumeration value="FRONTLOADED_NOT_ALLOWED"/>
 *     &lt;enumeration value="ALL_ROADBLOCK_NOT_ALLOWED"/>
 *     &lt;enumeration value="CREATIVE_SET_ROADBLOCK_NOT_ALLOWED"/>
 *     &lt;enumeration value="ALREADY_STARTED"/>
 *     &lt;enumeration value="CONFLICT_WITH_PRODUCT"/>
 *     &lt;enumeration value="MOBILE_TECH_CRITERIA_NOT_SUPPORTED"/>
 *     &lt;enumeration value="UNSUPPORTED_TARGETING_TYPE"/>
 *     &lt;enumeration value="WRONG_COST"/>
 *     &lt;enumeration value="INVALID_PRIORITY_FOR_LINE_ITEM_TYPE"/>
 *     &lt;enumeration value="UPDATE_PROPOSAL_LINE_ITEM_NOT_ALLOWED"/>
 *     &lt;enumeration value="CANNOT_UPDATE_TO_OR_FROM_CREATIVE_SET_ROADBLOCK"/>
 *     &lt;enumeration value="SEQUENTIAL_CREATIVE_ROTATION_NOT_ALLOWED"/>
 *     &lt;enumeration value="UPDATE_RESERVATION_NOT_ALLOWED"/>
 *     &lt;enumeration value="INVALID_COMPANION_DELIVERY_OPTION_FOR_ROADBLOCKING_TYPE"/>
 *     &lt;enumeration value="INCONSISTENT_ROADBLOCK_TYPE"/>
 *     &lt;enumeration value="INVALID_UNITS_BOUGHT_BUFFER"/>
 *     &lt;enumeration value="UPDATE_COST_ADJUSTMENT_NOT_ALLOWED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProposalLineItemError.Reason")
@XmlEnum
public enum ProposalLineItemErrorReason {


    /**
     * 
     *                 The proposal line item's rate card is not the same as other proposal line items
     *                 in the proposal.
     *               
     * 
     */
    NOT_SAME_RATE_CARD,

    /**
     * 
     *                 The proposal line item's type is not yet supported by xSM.
     *               
     * 
     */
    LINE_ITEM_TYPE_NOT_ALLOWED,

    /**
     * 
     *                 The proposal line item's end date time is not after its start date time.
     *               
     * 
     */
    END_DATE_TIME_NOT_AFTER_START_TIME,

    /**
     * 
     *                 The proposal line item's end date time is after 1/1/2037.
     *               
     * 
     */
    END_DATE_TIME_TOO_LATE,

    /**
     * 
     *                 The proposal line item's start date time is in past.
     *               
     * 
     */
    START_DATE_TIME_IS_IN_PAST,

    /**
     * 
     *                 The proposal line item's end date time is in past.
     *               
     * 
     */
    END_DATE_TIME_IS_IN_PAST,

    /**
     * 
     *                 Frontloaded delivery rate type is not allowed.
     *               
     * 
     */
    FRONTLOADED_NOT_ALLOWED,

    /**
     * 
     *                 Roadblocking to display all creatives is not allowed.
     *               
     * 
     */
    ALL_ROADBLOCK_NOT_ALLOWED,

    /**
     * 
     *                 Roadblocking to display all master and companion creative set is not allowed.
     *               
     * 
     */
    CREATIVE_SET_ROADBLOCK_NOT_ALLOWED,

    /**
     * 
     *                 Some changes may not be allowed because the related line item has already started.
     *               
     * 
     */
    ALREADY_STARTED,

    /**
     * 
     *                 The setting is conflict with product's restriction.
     *               
     * 
     */
    CONFLICT_WITH_PRODUCT,

    /**
     * 
     *                 Cannot target mobile-only targeting criteria.
     *               
     * 
     */
    MOBILE_TECH_CRITERIA_NOT_SUPPORTED,

    /**
     * 
     *                 The targeting criteria type is unsupported.
     *               
     * 
     */
    UNSUPPORTED_TARGETING_TYPE,

    /**
     * 
     *                 The contracted cost does not match with what calculated from final rate and units bought.
     *               
     * 
     */
    WRONG_COST,

    /**
     * 
     *                 The line item priority is invalid if it's different than the default.
     *               
     * 
     */
    INVALID_PRIORITY_FOR_LINE_ITEM_TYPE,

    /**
     * 
     *                 Propsoal line item cannot update when it is archived.
     *               
     * 
     */
    UPDATE_PROPOSAL_LINE_ITEM_NOT_ALLOWED,

    /**
     * 
     *                 A proposal line item cannot be updated from having
     *                 {@link RoadblockingType#CREATIVE_SET} to having a different
     *                 RoadblockingType, or vice versa.
     *               
     * 
     */
    CANNOT_UPDATE_TO_OR_FROM_CREATIVE_SET_ROADBLOCK,

    /**
     * 
     *                 Serving creatives exactly in sequential order is not allowed.
     *               
     * 
     */
    SEQUENTIAL_CREATIVE_ROTATION_NOT_ALLOWED,

    /**
     * 
     *                 Proposal line item cannot update its reservation detail once start delivering.
     *               
     * 
     */
    UPDATE_RESERVATION_NOT_ALLOWED,

    /**
     * 
     *                 The companion delivery option is not valid for the roadblocking type.
     *               
     * 
     */
    INVALID_COMPANION_DELIVERY_OPTION_FOR_ROADBLOCKING_TYPE,

    /**
     * 
     *                 Roadblocking type is inconsistent with creative placeholders. If the roadblocking
     *                 type is creative set, creative placeholders should contain companions,
     *                 and vice versa.
     *               
     * 
     */
    INCONSISTENT_ROADBLOCK_TYPE,

    /**
     * 
     *                 UnitsBoughtBuffer is only applicable to standard line item with CPC/CPM type.
     *               
     * 
     */
    INVALID_UNITS_BOUGHT_BUFFER,

    /**
     * 
     *                 Proposal line item cannot update its cost adjustment after first approval.
     *               
     * 
     */
    UPDATE_COST_ADJUSTMENT_NOT_ALLOWED,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static ProposalLineItemErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
