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


package com.google.api.ads.adwords.jaxws.v201802.o;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetingIdeaError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TargetingIdeaError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DUPLICATE_SEARCH_FILTER_TYPES_PRESENT"/>
 *     &lt;enumeration value="INSUFFICIENT_SEARCH_PARAMETERS"/>
 *     &lt;enumeration value="INVALID_ATTRIBUTE_TYPE"/>
 *     &lt;enumeration value="INVALID_SEARCH_PARAMETERS"/>
 *     &lt;enumeration value="INVALID_DOMAIN_SUFFIX"/>
 *     &lt;enumeration value="MUTUALLY_EXCLUSIVE_SEARCH_PARAMETERS_IN_QUERY"/>
 *     &lt;enumeration value="SERVICE_UNAVAILABLE"/>
 *     &lt;enumeration value="INVALID_URL_IN_SEARCH_PARAMETER"/>
 *     &lt;enumeration value="TOO_MANY_RESULTS_REQUESTED"/>
 *     &lt;enumeration value="NO_PAGING_IN_SELECTOR"/>
 *     &lt;enumeration value="INVALID_INCLUDED_EXCLUDED_KEYWORDS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TargetingIdeaError.Reason")
@XmlEnum
public enum TargetingIdeaErrorReason {


    /**
     * 
     *                 Error returned when there are multiple instance of same type of {@link SearchParameter}s.
     *               
     * 
     */
    DUPLICATE_SEARCH_FILTER_TYPES_PRESENT,

    /**
     * 
     *                 Error returned when the {@link TargetingIdeaSelector} doesn't have enough
     *                 {@link SearchParameter}s to execute request.
     *               
     * 
     */
    INSUFFICIENT_SEARCH_PARAMETERS,

    /**
     * 
     *                 Error returned when an {@link AttributeType} doesn't match the {@link IdeaType} specified in
     *                 the {@link TargetingIdeaSelector}. For example, if the {@code KEYWORD} {@code IDEAS} selector
     *                 contains an {@code STATS} only AttributeType, this error will be returned.
     *               
     * 
     */
    INVALID_ATTRIBUTE_TYPE,

    /**
     * 
     *                 Error returned when a {@link SearchParameter} doesn't match the {@link IdeaType} specified in
     *                 the {@link TargetingIdeaSelector} or is otherwise invalid.  Error trigger usually contains
     *                 the parameter name, and error details contain a more detailed explanation.
     *               
     * 
     */
    INVALID_SEARCH_PARAMETERS,

    /**
     * 
     *                 Error returned when the {@link TargetingIdeaSelector} contains a
     *                 {@link DomainSuffixSearchParameter}s that contains an invalid domain suffix.
     *               
     * 
     */
    INVALID_DOMAIN_SUFFIX,

    /**
     * 
     *                 Error returned when a selector contains mutually exclusive parameters.
     *               
     * 
     */
    MUTUALLY_EXCLUSIVE_SEARCH_PARAMETERS_IN_QUERY,

    /**
     * 
     *                 Error returned when the {@link TargetingIdeaService} is not available.
     *               
     * 
     */
    SERVICE_UNAVAILABLE,

    /**
     * 
     *                 Error returned when the URL value specified in the {@link TargetingIdeaSelector}, such as
     *                 {@link RelatedToUrlSearchParameter}, is not a valid URL.
     *               
     * 
     */
    INVALID_URL_IN_SEARCH_PARAMETER,

    /**
     * 
     *                 Error returned when the requested number of entries in {@link TargetingIdeaSelector}'s
     *                 {@link Paging} is greater than the maximum allowed.
     *               
     * 
     */
    TOO_MANY_RESULTS_REQUESTED,

    /**
     * 
     *                 Error returned when the requested {@link Paging} is missing from the
     *                 {@link TargetingIdeaSelector} when required.
     *               
     * 
     */
    NO_PAGING_IN_SELECTOR,

    /**
     * 
     *                 Error returned when included keywords and excluded keywords in
     *                 {@link IdeaTextFilterSearchParameter}, {@link IdeaTextMatchesSearchParameter}
     *                 or {@link ExcludedKeywordSearchParameter} are overlapped.
     *               
     * 
     */
    INVALID_INCLUDED_EXCLUDED_KEYWORDS;

    public String value() {
        return name();
    }

    public static TargetingIdeaErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
