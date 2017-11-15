// Copyright 2017 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201711;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DaiIngestErrorReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DaiIngestErrorReason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_INGEST_URL"/>
 *     &lt;enumeration value="INVALID_CLOSED_CAPTION_URL"/>
 *     &lt;enumeration value="MISSING_CLOSED_CAPTION_URL"/>
 *     &lt;enumeration value="COULD_NOT_FETCH_HLS"/>
 *     &lt;enumeration value="COULD_NOT_FETCH_SUBTITLES"/>
 *     &lt;enumeration value="MISSING_SUBTITLE_LANGUAGE"/>
 *     &lt;enumeration value="COULD_NOT_FETCH_MEDIA"/>
 *     &lt;enumeration value="MALFORMED_MEDIA_BYTES"/>
 *     &lt;enumeration value="CHAPTER_TIME_OUT_OF_BOUNDS"/>
 *     &lt;enumeration value="INTERNAL_ERROR"/>
 *     &lt;enumeration value="CONTENT_HAS_CHAPTER_TIMES_BUT_NO_MIDROLL_SETTINGS"/>
 *     &lt;enumeration value="MALFORMED_MEDIA_PLAYLIST"/>
 *     &lt;enumeration value="MALFORMED_SUBTITLES"/>
 *     &lt;enumeration value="PLAYLIST_ITEM_URL_DOES_NOT_MATCH_INGEST_COMMON_PATH"/>
 *     &lt;enumeration value="COULD_NOT_UPLOAD_SPLIT_MEDIA_AUTHENTICATION_FAILED"/>
 *     &lt;enumeration value="COULD_NOT_UPLOAD_SPLIT_MEDIA_CONNECTION_FAILED"/>
 *     &lt;enumeration value="COULD_NOT_UPLOAD_SPLIT_MEDIA_WRITE_FAILED"/>
 *     &lt;enumeration value="PLAYLISTS_HAVE_DIFFERENT_NUMBER_OF_DISCONTINUITIES"/>
 *     &lt;enumeration value="PLAYIST_HAS_NO_STARTING_PTS_VALUE"/>
 *     &lt;enumeration value="PLAYLIST_DISCONTINUITY_PTS_VALUES_DIFFER_TOO_MUCH"/>
 *     &lt;enumeration value="SEGMENT_HAS_NO_PTS"/>
 *     &lt;enumeration value="SUBTITLE_LANGUAGE_DOES_NOT_MATCH_LANGUAGE_IN_FEED"/>
 *     &lt;enumeration value="CANNOT_DETERMINE_CORRECT_SUBTITLES_FOR_LANGUAGE"/>
 *     &lt;enumeration value="NO_CDN_CONFIGURATION_FOUND"/>
 *     &lt;enumeration value="CONTENT_HAS_MIDROLLS_BUT_NO_SPLIT_CONTENT_CONFIG"/>
 *     &lt;enumeration value="CONTENT_HAS_MIDROLLS_BUT_SOURCE_HAS_MIDROLLS_DISABLED"/>
 *     &lt;enumeration value="ADTS_PARSE_ERROR"/>
 *     &lt;enumeration value="AAC_SPLIT_ERROR"/>
 *     &lt;enumeration value="AAC_PARSE_ERROR"/>
 *     &lt;enumeration value="TS_PARSE_ERROR"/>
 *     &lt;enumeration value="TS_SPLIT_ERROR"/>
 *     &lt;enumeration value="UNSUPPORTED_CONTAINER_FORMAT"/>
 *     &lt;enumeration value="UNSUPPORTED_TS_MEDIA_FORMAT"/>
 *     &lt;enumeration value="NO_IFRAMES_NEAR_CUE_POINT"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DaiIngestErrorReason")
@XmlEnum
public enum DaiIngestErrorReason {


    /**
     * 
     *                 The ingest URL provided in the publisher's content source feed is invalid. The trigger for
     *                 this error is the ingest URL specified in the publisher's feed.
     *               
     * 
     */
    INVALID_INGEST_URL,

    /**
     * 
     *                 The closed caption URL provided in the publisher's content source feed is invalid. The
     *                 trigger for this error is the closed caption URL specified in the publisher's feed.
     *               
     * 
     */
    INVALID_CLOSED_CAPTION_URL,

    /**
     * 
     *                 There is no closed caption URL for a content in the publisher's content source feed. There
     *                 is no trigger for this error.
     *               
     * 
     */
    MISSING_CLOSED_CAPTION_URL,

    /**
     * 
     *                 There was an error while trying to fetch the HLS from the specified ingest URL. The trigger
     *                 for this error is the ingest URL specified in the publisher's feed.
     *               
     * 
     */
    COULD_NOT_FETCH_HLS,

    /**
     * 
     *                 There was an error while trying to fetch the subtitles from the specified closed caption url.
     *                 The trigger for this error is the closed caption URL specified in the publisher's feed.
     *               
     * 
     */
    COULD_NOT_FETCH_SUBTITLES,

    /**
     * 
     *                 One of the subtitles from the closed caption URL is missing a language. The trigger for this
     *                 error is the closed caption URL that does not have a language associated with it.
     *               
     * 
     */
    MISSING_SUBTITLE_LANGUAGE,

    /**
     * 
     *                 Error fetching the media files from the URLs specified in the master HLS playlist. The trigger
     *                 for this error is a media playlist URL within the publisher's HLS playlist that could not
     *                 be fetched.
     *               
     * 
     */
    COULD_NOT_FETCH_MEDIA,

    /**
     * 
     *                 The media from the publisher's CDN is malformed and cannot be conditioned. The trigger
     *                 for this error is a media playlist URL within the publisher's HLS playlist that is malformed.
     *               
     * 
     */
    MALFORMED_MEDIA_BYTES,

    /**
     * 
     *                 A chapter time for the content is outside of the range of the content's duration. The trigger
     *                 for this error is the chapter time (a parsable long representing the time in ms) that is out
     *                 of bounds.
     *               
     * 
     */
    CHAPTER_TIME_OUT_OF_BOUNDS,

    /**
     * 
     *                 An internal error occurred while conditioning the content. There is no trigger for this
     *                 error.
     *               
     * 
     */
    INTERNAL_ERROR,

    /**
     * 
     *                 The content has chapter times but the content's source has no CDN settings for midrolls.
     *                 There is no trigger for this error.
     *               
     * 
     */
    CONTENT_HAS_CHAPTER_TIMES_BUT_NO_MIDROLL_SETTINGS,

    /**
     * 
     *                 There is bad/missing/malformed data in a media playlist. The trigger for this error is the
     *                 URL that points to the malformed media playlist.
     *               
     * 
     */
    MALFORMED_MEDIA_PLAYLIST,

    /**
     * 
     *                 There is bad/missing/malformed data in a subtitles file. The trigger for this error is the
     *                 URL that points to the malformed subtitles.
     *               
     * 
     */
    MALFORMED_SUBTITLES,

    /**
     * 
     *                 A playlist item has a URL that does not begin with the ingest common path provided in the DAI
     *                 settings. The trigger for this error is the playlist item URL.
     *               
     * 
     */
    PLAYLIST_ITEM_URL_DOES_NOT_MATCH_INGEST_COMMON_PATH,

    /**
     * 
     *                 Uploading split media segments failed due to an authentication error.
     *               
     * 
     */
    COULD_NOT_UPLOAD_SPLIT_MEDIA_AUTHENTICATION_FAILED,

    /**
     * 
     *                 Uploading spit media segments failed due to a connection error.
     *               
     * 
     */
    COULD_NOT_UPLOAD_SPLIT_MEDIA_CONNECTION_FAILED,

    /**
     * 
     *                 Uploading split media segments failed due to a write error.
     *               
     * 
     */
    COULD_NOT_UPLOAD_SPLIT_MEDIA_WRITE_FAILED,

    /**
     * 
     *                 Variants in a playlist do not have the same number of discontinuities. The trigger for this
     *                 error is the master playlist URI.
     *               
     * 
     */
    PLAYLISTS_HAVE_DIFFERENT_NUMBER_OF_DISCONTINUITIES,

    /**
     * 
     *                 The playlist does not have a starting PTS value. The trigger for this error is the master
     *                 playlist URI.
     *               
     * 
     */
    PLAYIST_HAS_NO_STARTING_PTS_VALUE,

    /**
     * 
     *                 The PTS at a discontinuity varies too much between the different variants. The trigger for this
     *                 error is the master playlist URI.
     *               
     * 
     */
    PLAYLIST_DISCONTINUITY_PTS_VALUES_DIFFER_TOO_MUCH,

    /**
     * 
     *                 A media segment has no PTS. The trigger for this error is the segment data URI.
     *               
     * 
     */
    SEGMENT_HAS_NO_PTS,

    /**
     * 
     *                 The language in the subtitles file does not match the language specified in the feed. The
     *                 trigger for this error is the feed language and the parsed language separated by a semi-colon,
     *                 e.g. "en;sp".
     *               
     * 
     */
    SUBTITLE_LANGUAGE_DOES_NOT_MATCH_LANGUAGE_IN_FEED,

    /**
     * 
     *                 There are multiple subtitles files at the closed caption URI, and none of them match the
     *                 language defined in the feed. The trigger for this error is language in the feed.
     *               
     * 
     */
    CANNOT_DETERMINE_CORRECT_SUBTITLES_FOR_LANGUAGE,

    /**
     * 
     *                 No CDN configuration found for the content. The trigger for this error is the content's master
     *                 playlist URI.
     *               
     * 
     */
    NO_CDN_CONFIGURATION_FOUND,

    /**
     * 
     *                 The content has midrolls but there was no split content config on the CDN configuration for
     *                 that content so the content was not conditioned. There is no trigger for this error.
     *               
     * 
     */
    CONTENT_HAS_MIDROLLS_BUT_NO_SPLIT_CONTENT_CONFIG,

    /**
     * 
     *                 The content has midrolls but the source the content was ingested from has mid-rolls disabled,
     *                 so the content was not conditioned. There is no trigger for this error.
     *               
     * 
     */
    CONTENT_HAS_MIDROLLS_BUT_SOURCE_HAS_MIDROLLS_DISABLED,

    /**
     * 
     *                 Error parsing ADTS while splitting the content. The trigger for this error is the
     *                 variant URL and the cue-point separated by a semi-colon, e.g. "www.variant2.com;5000".
     *               
     * 
     */
    ADTS_PARSE_ERROR,

    /**
     * 
     *                 Error splitting an AAC segment. The trigger for this error is the variant URL and the
     *                 cue-point separated by a semi-colon, e.g. "www.variant2.com;5000".
     *               
     * 
     */
    AAC_SPLIT_ERROR,

    /**
     * 
     *                 Error parsing an AAC file while splitting the content. The trigger for this error is
     *                 the variant URL and the cue-point separated by a semi-colon, e.g. "www.variant2.com;5000".
     *               
     * 
     */
    AAC_PARSE_ERROR,

    /**
     * 
     *                 Error parsing a TS file while splitting the content. The trigger for this error is the
     *                 variant URL and the cue-point separated by a semi-colon, e.g. "www.variant2.com;5000".
     *               
     * 
     */
    TS_PARSE_ERROR,

    /**
     * 
     *                 Error splitting a TS file while splitting the content. The trigger for this error is
     *                 the variant URL and the cue-point separated by a semi-colon, e.g. "www.variant2.com;5000".
     *               
     * 
     */
    TS_SPLIT_ERROR,

    /**
     * 
     *                 Encountered an unsupported container format while splitting the content. The trigger for this
     *                 error is the variant URL and the cue-point separated by a semi-colon, e.g.
     *                 "www.variant2.com;5000".
     *               
     * 
     */
    UNSUPPORTED_CONTAINER_FORMAT,

    /**
     * 
     *                 Encountered an unsupported TS media format while splitting the content. The trigger for this
     *                 error is the variant URL and the cue-point separated by a semi-colon, e.g.
     *                 "www.variant2.com;5000".
     *               
     * 
     */
    UNSUPPORTED_TS_MEDIA_FORMAT,

    /**
     * 
     *                 Error splitting because there were no i-frames near the target split point. The trigger for
     *                 this error is the variant URL and the cue-point separated by a semi-colon, e.g.
     *                 "www.variant2.com;5000".
     *               
     * 
     */
    NO_IFRAMES_NEAR_CUE_POINT,

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

    public static DaiIngestErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
