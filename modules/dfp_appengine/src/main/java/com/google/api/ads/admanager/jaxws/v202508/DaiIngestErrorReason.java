// Copyright 2025 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202508;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DaiIngestErrorReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DaiIngestErrorReason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INVALID_INGEST_URL"/&gt;
 *     &lt;enumeration value="INVALID_CLOSED_CAPTION_URL"/&gt;
 *     &lt;enumeration value="MISSING_CLOSED_CAPTION_URL"/&gt;
 *     &lt;enumeration value="COULD_NOT_FETCH_HLS"/&gt;
 *     &lt;enumeration value="COULD_NOT_FETCH_SUBTITLES"/&gt;
 *     &lt;enumeration value="MISSING_SUBTITLE_LANGUAGE"/&gt;
 *     &lt;enumeration value="COULD_NOT_FETCH_MEDIA"/&gt;
 *     &lt;enumeration value="MALFORMED_MEDIA_BYTES"/&gt;
 *     &lt;enumeration value="CHAPTER_TIME_OUT_OF_BOUNDS"/&gt;
 *     &lt;enumeration value="INTERNAL_ERROR"/&gt;
 *     &lt;enumeration value="CONTENT_HAS_CHAPTER_TIMES_BUT_NO_MIDROLL_SETTINGS"/&gt;
 *     &lt;enumeration value="MALFORMED_MEDIA_PLAYLIST"/&gt;
 *     &lt;enumeration value="MIXED_AD_BREAK_TAGS"/&gt;
 *     &lt;enumeration value="AD_BREAK_TAGS_INCONSISTENT_ACROSS_VARIANTS"/&gt;
 *     &lt;enumeration value="MALFORMED_SUBTITLES"/&gt;
 *     &lt;enumeration value="SUBTITLES_TOO_LARGE"/&gt;
 *     &lt;enumeration value="PLAYLIST_ITEM_URL_DOES_NOT_MATCH_INGEST_COMMON_PATH"/&gt;
 *     &lt;enumeration value="COULD_NOT_UPLOAD_SPLIT_MEDIA_AUTHENTICATION_FAILED"/&gt;
 *     &lt;enumeration value="COULD_NOT_UPLOAD_SPLIT_MEDIA_CONNECTION_FAILED"/&gt;
 *     &lt;enumeration value="COULD_NOT_UPLOAD_SPLIT_MEDIA_WRITE_FAILED"/&gt;
 *     &lt;enumeration value="PLAYLISTS_HAVE_DIFFERENT_NUMBER_OF_DISCONTINUITIES"/&gt;
 *     &lt;enumeration value="PLAYIST_HAS_NO_STARTING_PTS_VALUE"/&gt;
 *     &lt;enumeration value="PLAYLIST_DISCONTINUITY_PTS_VALUES_DIFFER_TOO_MUCH"/&gt;
 *     &lt;enumeration value="SEGMENT_HAS_NO_PTS"/&gt;
 *     &lt;enumeration value="SUBTITLE_LANGUAGE_DOES_NOT_MATCH_LANGUAGE_IN_FEED"/&gt;
 *     &lt;enumeration value="CANNOT_DETERMINE_CORRECT_SUBTITLES_FOR_LANGUAGE"/&gt;
 *     &lt;enumeration value="NO_CDN_CONFIGURATION_FOUND"/&gt;
 *     &lt;enumeration value="CONTENT_HAS_MIDROLLS_BUT_NO_SPLIT_CONTENT_CONFIG"/&gt;
 *     &lt;enumeration value="CONTENT_HAS_MIDROLLS_BUT_SOURCE_HAS_MIDROLLS_DISABLED"/&gt;
 *     &lt;enumeration value="ADTS_PARSE_ERROR"/&gt;
 *     &lt;enumeration value="AAC_SPLIT_ERROR"/&gt;
 *     &lt;enumeration value="AAC_PARSE_ERROR"/&gt;
 *     &lt;enumeration value="TS_PARSE_ERROR"/&gt;
 *     &lt;enumeration value="TS_SPLIT_ERROR"/&gt;
 *     &lt;enumeration value="UNSUPPORTED_CONTAINER_FORMAT"/&gt;
 *     &lt;enumeration value="MULTIPLE_ELEMENTARY_STREAMS_OF_SAME_MEDIA_TYPE_IN_TS"/&gt;
 *     &lt;enumeration value="UNSUPPORTED_TS_MEDIA_FORMAT"/&gt;
 *     &lt;enumeration value="NO_IFRAMES_NEAR_CUE_POINT"/&gt;
 *     &lt;enumeration value="AC3_SPLIT_ERROR"/&gt;
 *     &lt;enumeration value="AC3_PARSE_ERROR"/&gt;
 *     &lt;enumeration value="EAC3_SPLIT_ERROR"/&gt;
 *     &lt;enumeration value="INVALID_ENCRYPTION_KEY"/&gt;
 *     &lt;enumeration value="EAC3_PARSE_ERROR"/&gt;
 *     &lt;enumeration value="CUE_POINT_COUNT_DOES_NOT_MATCH_PTS_COUNT"/&gt;
 *     &lt;enumeration value="DISCONTINUITY_COUNT_DOES_NOT_MATCH_PTS_COUNT"/&gt;
 *     &lt;enumeration value="DASH_CUE_POINT_EVENT_MISMATCH"/&gt;
 *     &lt;enumeration value="DASH_MANIFEST_CONDITIONING_FAILED"/&gt;
 *     &lt;enumeration value="DASH_MANIFEST_CONDITIONING_SEGMENT_BOUNDARY_ERROR"/&gt;
 *     &lt;enumeration value="CLOSED_CAPTION_LANGUAGE_VALUE_INVALID"/&gt;
 *     &lt;enumeration value="CLOSED_CAPTION_NAME_VALUE_INVALID"/&gt;
 *     &lt;enumeration value="CLOSED_CAPTION_CHARACTERISTICS_VALUE_UNEXPECTED"/&gt;
 *     &lt;enumeration value="CLOSED_CAPTIONS_WITH_DUPLICATE_KEYS"/&gt;
 *     &lt;enumeration value="SUBTITLES_PRESENT_IN_FEED_AND_MANIFEST"/&gt;
 *     &lt;enumeration value="INVALID_MEDIA_PROFILE"/&gt;
 *     &lt;enumeration value="CHAPTER_PTS_MISMATCH"/&gt;
 *     &lt;enumeration value="CHAPTER_RENDITION_ERROR"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DaiIngestErrorReason")
@XmlEnum
public enum DaiIngestErrorReason {


    /**
     * 
     *                 The ingest URL provided in the publisher's content source feed is invalid. The trigger for this
     *                 error is the ingest URL specified in the publisher's feed.
     *               
     * 
     */
    INVALID_INGEST_URL("INVALID_INGEST_URL"),

    /**
     * 
     *                 The closed caption URL provided in the publisher's content source feed is invalid. The trigger
     *                 for this error is the closed caption URL specified in the publisher's feed.
     *               
     * 
     */
    INVALID_CLOSED_CAPTION_URL("INVALID_CLOSED_CAPTION_URL"),

    /**
     * 
     *                 There is no closed caption URL for a content in the publisher's content source feed. There is
     *                 no trigger for this error.
     *               
     * 
     */
    MISSING_CLOSED_CAPTION_URL("MISSING_CLOSED_CAPTION_URL"),

    /**
     * 
     *                 There was an error while trying to fetch the HLS from the specified ingest URL. The trigger for
     *                 this error is the ingest URL specified in the publisher's feed.
     *               
     * 
     */
    COULD_NOT_FETCH_HLS("COULD_NOT_FETCH_HLS"),

    /**
     * 
     *                 There was an error while trying to fetch the subtitles from the specified closed caption url.
     *                 The trigger for this error is the closed caption URL specified in the publisher's feed.
     *               
     * 
     */
    COULD_NOT_FETCH_SUBTITLES("COULD_NOT_FETCH_SUBTITLES"),

    /**
     * 
     *                 One of the subtitles from the closed caption URL is missing a language. The trigger for this
     *                 error is the closed caption URL that does not have a language associated with it.
     *               
     * 
     */
    MISSING_SUBTITLE_LANGUAGE("MISSING_SUBTITLE_LANGUAGE"),

    /**
     * 
     *                 Error fetching the media files from the URLs specified in the master HLS playlist. The trigger
     *                 for this error is a media playlist URL within the publisher's HLS playlist that could not be
     *                 fetched.
     *               
     * 
     */
    COULD_NOT_FETCH_MEDIA("COULD_NOT_FETCH_MEDIA"),

    /**
     * 
     *                 The media from the publisher's CDN is malformed and cannot be conditioned. The trigger for this
     *                 error is a media playlist URL within the publisher's HLS playlist that is malformed.
     *               
     * 
     */
    MALFORMED_MEDIA_BYTES("MALFORMED_MEDIA_BYTES"),

    /**
     * 
     *                 A chapter time for the content is outside of the range of the content's duration. The trigger
     *                 for this error is the chapter time (a parsable long representing the time in ms) that is out of
     *                 bounds.
     *               
     * 
     */
    CHAPTER_TIME_OUT_OF_BOUNDS("CHAPTER_TIME_OUT_OF_BOUNDS"),

    /**
     * 
     *                 An internal error occurred while conditioning the content. There is no trigger for this error.
     *               
     * 
     */
    INTERNAL_ERROR("INTERNAL_ERROR"),

    /**
     * 
     *                 The content has chapter times but the content's source has no CDN settings for midrolls. There
     *                 is no trigger for this error.
     *               
     * 
     */
    CONTENT_HAS_CHAPTER_TIMES_BUT_NO_MIDROLL_SETTINGS("CONTENT_HAS_CHAPTER_TIMES_BUT_NO_MIDROLL_SETTINGS"),

    /**
     * 
     *                 There is bad/missing/malformed data in a media playlist. The trigger for this error is the URL
     *                 that points to the malformed media playlist.
     *               
     * 
     */
    MALFORMED_MEDIA_PLAYLIST("MALFORMED_MEDIA_PLAYLIST"),

    /**
     * 
     *                 Multiple ways of denoting ad breaks were detected in a media playlist (e.g. placement
     *                 opportunity tags, cue markers, etc.)
     *               
     * 
     */
    MIXED_AD_BREAK_TAGS("MIXED_AD_BREAK_TAGS"),

    /**
     * 
     *                 The ad break tags in the preconditioned content are not in the same locations across all
     *                 variant playlists.
     *               
     * 
     */
    AD_BREAK_TAGS_INCONSISTENT_ACROSS_VARIANTS("AD_BREAK_TAGS_INCONSISTENT_ACROSS_VARIANTS"),

    /**
     * 
     *                 There is bad/missing/malformed data in a subtitles file. The trigger for this error is the URL
     *                 that points to the malformed subtitles.
     *               
     * 
     */
    MALFORMED_SUBTITLES("MALFORMED_SUBTITLES"),

    /**
     * 
     *                 The subtitles sent to DAI are too large. The trigger for this error is the URL that points to
     *                 the master playlist.
     *               
     * 
     */
    SUBTITLES_TOO_LARGE("SUBTITLES_TOO_LARGE"),

    /**
     * 
     *                 A playlist item has a URL that does not begin with the ingest common path provided in the DAI
     *                 settings. The trigger for this error is the playlist item URL.
     *               
     * 
     */
    PLAYLIST_ITEM_URL_DOES_NOT_MATCH_INGEST_COMMON_PATH("PLAYLIST_ITEM_URL_DOES_NOT_MATCH_INGEST_COMMON_PATH"),

    /**
     * 
     *                 Uploading split media segments failed due to an authentication error.
     *               
     * 
     */
    COULD_NOT_UPLOAD_SPLIT_MEDIA_AUTHENTICATION_FAILED("COULD_NOT_UPLOAD_SPLIT_MEDIA_AUTHENTICATION_FAILED"),

    /**
     * 
     *                 Uploading spit media segments failed due to a connection error.
     *               
     * 
     */
    COULD_NOT_UPLOAD_SPLIT_MEDIA_CONNECTION_FAILED("COULD_NOT_UPLOAD_SPLIT_MEDIA_CONNECTION_FAILED"),

    /**
     * 
     *                 Uploading split media segments failed due to a write error.
     *               
     * 
     */
    COULD_NOT_UPLOAD_SPLIT_MEDIA_WRITE_FAILED("COULD_NOT_UPLOAD_SPLIT_MEDIA_WRITE_FAILED"),

    /**
     * 
     *                 Variants in a playlist do not have the same number of discontinuities. The trigger for this
     *                 error is the master playlist URI.
     *               
     * 
     */
    PLAYLISTS_HAVE_DIFFERENT_NUMBER_OF_DISCONTINUITIES("PLAYLISTS_HAVE_DIFFERENT_NUMBER_OF_DISCONTINUITIES"),

    /**
     * 
     *                 The playlist does not have a starting PTS value. The trigger for this error is the master
     *                 playlist URI.
     *               
     * 
     */
    PLAYIST_HAS_NO_STARTING_PTS_VALUE("PLAYIST_HAS_NO_STARTING_PTS_VALUE"),

    /**
     * 
     *                 The PTS at a discontinuity varies too much between the different variants. The trigger for this
     *                 error is the master playlist URI.
     *               
     * 
     */
    PLAYLIST_DISCONTINUITY_PTS_VALUES_DIFFER_TOO_MUCH("PLAYLIST_DISCONTINUITY_PTS_VALUES_DIFFER_TOO_MUCH"),

    /**
     * 
     *                 A media segment has no PTS. The trigger for this error is the segment data URI.
     *               
     * 
     */
    SEGMENT_HAS_NO_PTS("SEGMENT_HAS_NO_PTS"),

    /**
     * 
     *                 The language in the subtitles file does not match the language specified in the feed. The
     *                 trigger for this error is the feed language and the parsed language separated by a semi-colon,
     *                 e.g. "en;sp".
     *               
     * 
     */
    SUBTITLE_LANGUAGE_DOES_NOT_MATCH_LANGUAGE_IN_FEED("SUBTITLE_LANGUAGE_DOES_NOT_MATCH_LANGUAGE_IN_FEED"),

    /**
     * 
     *                 There are multiple subtitles files at the closed caption URI, and none of them match the
     *                 language defined in the feed. The trigger for this error is language in the feed.
     *               
     * 
     */
    CANNOT_DETERMINE_CORRECT_SUBTITLES_FOR_LANGUAGE("CANNOT_DETERMINE_CORRECT_SUBTITLES_FOR_LANGUAGE"),

    /**
     * 
     *                 No CDN configuration found for the content. The trigger for this error is the content's master
     *                 playlist URI.
     *               
     * 
     */
    NO_CDN_CONFIGURATION_FOUND("NO_CDN_CONFIGURATION_FOUND"),

    /**
     * 
     *                 The content has midrolls but there was no split content config on the CDN configuration for
     *                 that content so the content was not conditioned. There is no trigger for this error.
     *               
     * 
     */
    CONTENT_HAS_MIDROLLS_BUT_NO_SPLIT_CONTENT_CONFIG("CONTENT_HAS_MIDROLLS_BUT_NO_SPLIT_CONTENT_CONFIG"),

    /**
     * 
     *                 The content has midrolls but the source the content was ingested from has mid-rolls disabled,
     *                 so the content was not conditioned. There is no trigger for this error.
     *               
     * 
     */
    CONTENT_HAS_MIDROLLS_BUT_SOURCE_HAS_MIDROLLS_DISABLED("CONTENT_HAS_MIDROLLS_BUT_SOURCE_HAS_MIDROLLS_DISABLED"),

    /**
     * 
     *                 Error parsing ADTS while splitting the content. The trigger for this error is the variant URL
     *                 and the cue-point separated by a semi-colon, e.g. "www.variant2.com;5000".
     *               
     * 
     */
    ADTS_PARSE_ERROR("ADTS_PARSE_ERROR"),

    /**
     * 
     *                 Error splitting an AAC segment. The trigger for this error is the variant URL and the cue-point
     *                 separated by a semi-colon, e.g. "www.variant2.com;5000".
     *               
     * 
     */
    AAC_SPLIT_ERROR("AAC_SPLIT_ERROR"),

    /**
     * 
     *                 Error parsing an AAC file while splitting the content. The trigger for this error is the
     *                 variant URL and the cue-point separated by a semi-colon, e.g. "www.variant2.com;5000".
     *               
     * 
     */
    AAC_PARSE_ERROR("AAC_PARSE_ERROR"),

    /**
     * 
     *                 Error parsing a TS file while splitting the content. The trigger for this error is the variant
     *                 URL and the cue-point separated by a semi-colon, e.g. "www.variant2.com;5000".
     *               
     * 
     */
    TS_PARSE_ERROR("TS_PARSE_ERROR"),

    /**
     * 
     *                 Error splitting a TS file while splitting the content. The trigger for this error is the
     *                 variant URL and the cue-point separated by a semi-colon, e.g. "www.variant2.com;5000".
     *               
     * 
     */
    TS_SPLIT_ERROR("TS_SPLIT_ERROR"),

    /**
     * 
     *                 Encountered an unsupported container format while splitting the content. The trigger for this
     *                 error is the variant URL and the cue-point separated by a semi-colon, e.g.
     *                 "www.variant2.com;5000".
     *               
     * 
     */
    UNSUPPORTED_CONTAINER_FORMAT("UNSUPPORTED_CONTAINER_FORMAT"),

    /**
     * 
     *                 Encountered multiple elementary streams of the same media type (audio, video) within a
     *                 transport stream. The trigger for this error is the variant URL and the cue-point separated by
     *                 a semi-colon, e.g. "www.variant2.com;5000".
     *               
     * 
     */
    MULTIPLE_ELEMENTARY_STREAMS_OF_SAME_MEDIA_TYPE_IN_TS("MULTIPLE_ELEMENTARY_STREAMS_OF_SAME_MEDIA_TYPE_IN_TS"),

    /**
     * 
     *                 Encountered an unsupported TS media format while splitting the content. The trigger for this
     *                 error is the variant URL and the cue-point separated by a semi-colon, e.g.
     *                 "www.variant2.com;5000".
     *               
     * 
     */
    UNSUPPORTED_TS_MEDIA_FORMAT("UNSUPPORTED_TS_MEDIA_FORMAT"),

    /**
     * 
     *                 Error splitting because there were no i-frames near the target split point. The trigger for
     *                 this error is the variant URL and the cue-point separated by a semi-colon, e.g.
     *                 "www.variant2.com;5000".
     *               
     * 
     */
    NO_IFRAMES_NEAR_CUE_POINT("NO_IFRAMES_NEAR_CUE_POINT"),

    /**
     * 
     *                 Error splitting an AC-3 segment. The trigger for this error is the variant URL and the
     *                 cue-point separated by a semi-colon, e.g. "www.variant2.com;5000".
     *               
     * 
     */
    @XmlEnumValue("AC3_SPLIT_ERROR")
    AC_3_SPLIT_ERROR("AC3_SPLIT_ERROR"),

    /**
     * 
     *                 Error parsing an AC-3 file while splitting the content. The trigger for this error is the
     *                 variant URL and the cue-point separated by a semi-colon, e.g. "www.variant2.com;5000".
     *               
     * 
     */
    @XmlEnumValue("AC3_PARSE_ERROR")
    AC_3_PARSE_ERROR("AC3_PARSE_ERROR"),

    /**
     * 
     *                 Error splitting an E-AC-3 segment. The trigger for this error is the variant URL and the
     *                 cue-point separated by a semi-colon, e.g. "www.variant2.com;5000".
     *               
     * 
     */
    @XmlEnumValue("EAC3_SPLIT_ERROR")
    EAC_3_SPLIT_ERROR("EAC3_SPLIT_ERROR"),

    /**
     * 
     *                 Error caused by an invalid encryption key. The trigger for this error is a media playlist URL
     *                 within the publisher's HLS playlist that has the invalid encryption key.
     *               
     * 
     */
    INVALID_ENCRYPTION_KEY("INVALID_ENCRYPTION_KEY"),

    /**
     * 
     *                 Error parsing an E-AC-3 file while splitting the content. The trigger for this error is the
     *                 variant URL and the cue-point separated by a semi-colon, e.g. "www.variant2.com;5000".
     *               
     * 
     */
    @XmlEnumValue("EAC3_PARSE_ERROR")
    EAC_3_PARSE_ERROR("EAC3_PARSE_ERROR"),

    /**
     * 
     *                 Error caused by the number of PTS being a different value than the number of cue points + 1.
     *               
     * 
     */
    CUE_POINT_COUNT_DOES_NOT_MATCH_PTS_COUNT("CUE_POINT_COUNT_DOES_NOT_MATCH_PTS_COUNT"),

    /**
     * 
     *                 Error caused by the number of PTS being a different value than the number of discontinuity tags
     *                 + 1.
     *               
     * 
     */
    DISCONTINUITY_COUNT_DOES_NOT_MATCH_PTS_COUNT("DISCONTINUITY_COUNT_DOES_NOT_MATCH_PTS_COUNT"),

    /**
     * 
     *                 The DASH content has cue points but they do not match the Event durations from the DASH
     *                 manifest EventStream, if present.
     *               
     * 
     */
    DASH_CUE_POINT_EVENT_MISMATCH("DASH_CUE_POINT_EVENT_MISMATCH"),

    /**
     * 
     *                 The DASH manifest cannot be conditioned for midrolls.
     *               
     * 
     */
    DASH_MANIFEST_CONDITIONING_FAILED("DASH_MANIFEST_CONDITIONING_FAILED"),

    /**
     * 
     *                 The DASH manifest cannot be conditioned for midrolls because one or more of the cue points do
     *                 not lie on a media segment boundary.
     *               
     * 
     */
    DASH_MANIFEST_CONDITIONING_SEGMENT_BOUNDARY_ERROR("DASH_MANIFEST_CONDITIONING_SEGMENT_BOUNDARY_ERROR"),

    /**
     * 
     *                 The subtitle language code should not contain "$$$$$".
     *               
     * 
     */
    CLOSED_CAPTION_LANGUAGE_VALUE_INVALID("CLOSED_CAPTION_LANGUAGE_VALUE_INVALID"),

    /**
     * 
     *                 The subtitle name should not contain "$$$$$".
     *               
     * 
     */
    CLOSED_CAPTION_NAME_VALUE_INVALID("CLOSED_CAPTION_NAME_VALUE_INVALID"),

    /**
     * 
     *                 The common subtitle characteristics values listed in the HLS spec are:
     *                 1)"public.accessibility.transcribes-spoken-dialog",
     *                 2)"public.accessibility.describes-music-and-sound", 3)"public.easy-to-read";
     *               
     * 
     */
    CLOSED_CAPTION_CHARACTERISTICS_VALUE_UNEXPECTED("CLOSED_CAPTION_CHARACTERISTICS_VALUE_UNEXPECTED"),

    /**
     * 
     *                 Closed captions for a content should be unique by 'language + name'.
     *               
     * 
     */
    CLOSED_CAPTIONS_WITH_DUPLICATE_KEYS("CLOSED_CAPTIONS_WITH_DUPLICATE_KEYS"),

    /**
     * 
     *                 Subtitles are defined in the content source feed as well as inside the stream manifest. Only
     *                 feed subtitles will be ingested.
     *               
     * 
     */
    SUBTITLES_PRESENT_IN_FEED_AND_MANIFEST("SUBTITLES_PRESENT_IN_FEED_AND_MANIFEST"),

    /**
     * 
     *                 The media profile is invalid due to missing data.
     *               
     * 
     */
    INVALID_MEDIA_PROFILE("INVALID_MEDIA_PROFILE"),

    /**
     * 
     *                 Error caused when the PTS values do not align across chapters.
     *               
     * 
     */
    CHAPTER_PTS_MISMATCH("CHAPTER_PTS_MISMATCH"),

    /**
     * 
     *                 Error occurred while chaptering renditions in the content.
     *               
     * 
     */
    CHAPTER_RENDITION_ERROR("CHAPTER_RENDITION_ERROR"),

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN("UNKNOWN");
    private final String value;

    DaiIngestErrorReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DaiIngestErrorReason fromValue(String v) {
        for (DaiIngestErrorReason c: DaiIngestErrorReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
