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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImageError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_IMAGE"/>
 *     &lt;enumeration value="STORAGE_ERROR"/>
 *     &lt;enumeration value="BAD_REQUEST"/>
 *     &lt;enumeration value="UNEXPECTED_SIZE"/>
 *     &lt;enumeration value="ANIMATED_NOT_ALLOWED"/>
 *     &lt;enumeration value="ANIMATION_TOO_LONG"/>
 *     &lt;enumeration value="SERVER_ERROR"/>
 *     &lt;enumeration value="CMYK_JPEG_NOT_ALLOWED"/>
 *     &lt;enumeration value="FLASH_NOT_ALLOWED"/>
 *     &lt;enumeration value="FLASH_WITHOUT_CLICKTAG"/>
 *     &lt;enumeration value="FLASH_ERROR_AFTER_FIXING_CLICK_TAG"/>
 *     &lt;enumeration value="ANIMATED_VISUAL_EFFECT"/>
 *     &lt;enumeration value="FLASH_ERROR"/>
 *     &lt;enumeration value="LAYOUT_PROBLEM"/>
 *     &lt;enumeration value="PROBLEM_READING_IMAGE_FILE"/>
 *     &lt;enumeration value="ERROR_STORING_IMAGE"/>
 *     &lt;enumeration value="ASPECT_RATIO_NOT_ALLOWED"/>
 *     &lt;enumeration value="FLASH_HAS_NETWORK_OBJECTS"/>
 *     &lt;enumeration value="FLASH_HAS_NETWORK_METHODS"/>
 *     &lt;enumeration value="FLASH_HAS_URL"/>
 *     &lt;enumeration value="FLASH_HAS_MOUSE_TRACKING"/>
 *     &lt;enumeration value="FLASH_HAS_RANDOM_NUM"/>
 *     &lt;enumeration value="FLASH_SELF_TARGETS"/>
 *     &lt;enumeration value="FLASH_BAD_GETURL_TARGET"/>
 *     &lt;enumeration value="FLASH_VERSION_NOT_SUPPORTED"/>
 *     &lt;enumeration value="FLASH_WITHOUT_HARD_CODED_CLICK_URL"/>
 *     &lt;enumeration value="INVALID_FLASH_FILE"/>
 *     &lt;enumeration value="FAILED_TO_FIX_CLICK_TAG_IN_FLASH"/>
 *     &lt;enumeration value="FLASH_ACCESSES_NETWORK_RESOURCES"/>
 *     &lt;enumeration value="FLASH_EXTERNAL_JS_CALL"/>
 *     &lt;enumeration value="FLASH_EXTERNAL_FS_CALL"/>
 *     &lt;enumeration value="FILE_TOO_LARGE"/>
 *     &lt;enumeration value="IMAGE_DATA_TOO_LARGE"/>
 *     &lt;enumeration value="IMAGE_PROCESSING_ERROR"/>
 *     &lt;enumeration value="IMAGE_TOO_SMALL"/>
 *     &lt;enumeration value="INVALID_INPUT"/>
 *     &lt;enumeration value="PROBLEM_READING_FILE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ImageError.Reason")
@XmlEnum
public enum ImageErrorReason {


    /**
     * 
     *                 The image is not valid.
     *               
     * 
     */
    INVALID_IMAGE,

    /**
     * 
     *                 The image could not be stored.
     *               
     * 
     */
    STORAGE_ERROR,

    /**
     * 
     *                 There was a problem with the request.
     *               
     * 
     */
    BAD_REQUEST,

    /**
     * 
     *                 The image is not of legal dimensions.
     *               
     * 
     */
    UNEXPECTED_SIZE,

    /**
     * 
     *                 Animated image are not permitted.
     *               
     * 
     */
    ANIMATED_NOT_ALLOWED,

    /**
     * 
     *                 Animation is too long.
     *               
     * 
     */
    ANIMATION_TOO_LONG,

    /**
     * 
     *                 There was an error on the server.
     *               
     * 
     */
    SERVER_ERROR,

    /**
     * 
     *                 Image cannot be in CMYK color format.
     *               
     * 
     */
    CMYK_JPEG_NOT_ALLOWED,

    /**
     * 
     *                 Flash images are not permitted.
     *               
     * 
     */
    FLASH_NOT_ALLOWED,

    /**
     * 
     *                 Flash images must support clickTag.
     *               
     * 
     */
    FLASH_WITHOUT_CLICKTAG,

    /**
     * 
     *                 A flash error has occurred after fixing the click tag.
     *               
     * 
     */
    FLASH_ERROR_AFTER_FIXING_CLICK_TAG,

    /**
     * 
     *                 Unacceptable visual effects.
     *               
     * 
     */
    ANIMATED_VISUAL_EFFECT,

    /**
     * 
     *                 There was a problem with the flash image.
     *               
     * 
     */
    FLASH_ERROR,

    /**
     * 
     *                 Incorrect image layout.
     *               
     * 
     */
    LAYOUT_PROBLEM,

    /**
     * 
     *                 There was a problem reading the image file.
     *               
     * 
     */
    PROBLEM_READING_IMAGE_FILE,

    /**
     * 
     *                 There was an error storing the image.
     *               
     * 
     */
    ERROR_STORING_IMAGE,

    /**
     * 
     *                 The aspect ratio of the image is not allowed.
     *               
     * 
     */
    ASPECT_RATIO_NOT_ALLOWED,

    /**
     * 
     *                 Flash cannot have network objects.
     *               
     * 
     */
    FLASH_HAS_NETWORK_OBJECTS,

    /**
     * 
     *                 Flash cannot have network methods.
     *               
     * 
     */
    FLASH_HAS_NETWORK_METHODS,

    /**
     * 
     *                 Flash cannot have a Url.
     *               
     * 
     */
    FLASH_HAS_URL,

    /**
     * 
     *                 Flash cannot use mouse tracking.
     *               
     * 
     */
    FLASH_HAS_MOUSE_TRACKING,

    /**
     * 
     *                 Flash cannot have a random number.
     *               
     * 
     */
    FLASH_HAS_RANDOM_NUM,

    /**
     * 
     *                 Ad click target cannot be '_self'.
     *               
     * 
     */
    FLASH_SELF_TARGETS,

    /**
     * 
     *                 GetUrl method should only use '_blank'.
     *               
     * 
     */
    FLASH_BAD_GETURL_TARGET,

    /**
     * 
     *                 Flash version is not supported.
     *               
     * 
     */
    FLASH_VERSION_NOT_SUPPORTED,

    /**
     * 
     *                 Flash movies need to have hard coded click URL or clickTAG
     *               
     * 
     */
    FLASH_WITHOUT_HARD_CODED_CLICK_URL,

    /**
     * 
     *                 Uploaded flash file is corrupted.
     *               
     * 
     */
    INVALID_FLASH_FILE,

    /**
     * 
     *                 Uploaded flash file can be parsed, but the click tag can not be fixed properly.
     *               
     * 
     */
    FAILED_TO_FIX_CLICK_TAG_IN_FLASH,

    /**
     * 
     *                 Flash movie accesses network resources
     *               
     * 
     */
    FLASH_ACCESSES_NETWORK_RESOURCES,

    /**
     * 
     *                 Flash movie attempts to call external javascript code
     *               
     * 
     */
    FLASH_EXTERNAL_JS_CALL,

    /**
     * 
     *                 Flash movie attempts to call flash system commands
     *               
     * 
     */
    FLASH_EXTERNAL_FS_CALL,

    /**
     * 
     *                 Image file is too large.
     *               
     * 
     */
    FILE_TOO_LARGE,

    /**
     * 
     *                 Image data is too large.
     *               
     * 
     */
    IMAGE_DATA_TOO_LARGE,

    /**
     * 
     *                 Error while processing the image.
     *               
     * 
     */
    IMAGE_PROCESSING_ERROR,

    /**
     * 
     *                 Image is too small.
     *               
     * 
     */
    IMAGE_TOO_SMALL,

    /**
     * 
     *                 Input was invalid.
     *               
     * 
     */
    INVALID_INPUT,

    /**
     * 
     *                 There was a problem reading the image file.
     *               
     * 
     */
    PROBLEM_READING_FILE;

    public String value() {
        return name();
    }

    public static ImageErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
