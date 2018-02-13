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


package com.google.api.ads.dfp.jaxws.v201802;

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
 *     &lt;enumeration value="INVALID_SIZE"/>
 *     &lt;enumeration value="UNEXPECTED_SIZE"/>
 *     &lt;enumeration value="OVERLAY_SIZE_TOO_LARGE"/>
 *     &lt;enumeration value="ANIMATED_NOT_ALLOWED"/>
 *     &lt;enumeration value="ANIMATION_TOO_LONG"/>
 *     &lt;enumeration value="CMYK_JPEG_NOT_ALLOWED"/>
 *     &lt;enumeration value="FLASH_NOT_ALLOWED"/>
 *     &lt;enumeration value="FLASH_WITHOUT_CLICKTAG"/>
 *     &lt;enumeration value="ANIMATED_VISUAL_EFFECT"/>
 *     &lt;enumeration value="FLASH_ERROR"/>
 *     &lt;enumeration value="LAYOUT_PROBLEM"/>
 *     &lt;enumeration value="FLASH_HAS_NETWORK_OBJECTS"/>
 *     &lt;enumeration value="FLASH_HAS_NETWORK_METHODS"/>
 *     &lt;enumeration value="FLASH_HAS_URL"/>
 *     &lt;enumeration value="FLASH_HAS_MOUSE_TRACKING"/>
 *     &lt;enumeration value="FLASH_HAS_RANDOM_NUM"/>
 *     &lt;enumeration value="FLASH_SELF_TARGETS"/>
 *     &lt;enumeration value="FLASH_BAD_GETURL_TARGET"/>
 *     &lt;enumeration value="FLASH_VERSION_NOT_SUPPORTED"/>
 *     &lt;enumeration value="FILE_TOO_LARGE"/>
 *     &lt;enumeration value="SYSTEM_ERROR"/>
 *     &lt;enumeration value="UNEXPECTED_PRIMARY_ASSET_DENSITY"/>
 *     &lt;enumeration value="DUPLICATE_ASSET_DENSITY"/>
 *     &lt;enumeration value="MISSING_DEFAULT_ASSET"/>
 *     &lt;enumeration value="UNKNOWN"/>
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
     *                 The file's format is invalid.
     *               
     * 
     */
    INVALID_IMAGE,

    /**
     * 
     *                 {@link Size#width} and {@link Size#height} cannot be negative.
     *               
     * 
     */
    INVALID_SIZE,

    /**
     * 
     *                 The actual image size does not match the expected image size.
     *               
     * 
     */
    UNEXPECTED_SIZE,

    /**
     * 
     *                 The size of the asset is larger than that of the overlay creative.
     *               
     * 
     */
    OVERLAY_SIZE_TOO_LARGE,

    /**
     * 
     *                 Animated images are not allowed.
     *               
     * 
     */
    ANIMATED_NOT_ALLOWED,

    /**
     * 
     *                 Animation length exceeded the allowed policy limit.
     *               
     * 
     */
    ANIMATION_TOO_LONG,

    /**
     * 
     *                 Images in CMYK color formats are not allowed.
     *               
     * 
     */
    CMYK_JPEG_NOT_ALLOWED,

    /**
     * 
     *                 Flash files are not allowed.
     *               
     * 
     */
    FLASH_NOT_ALLOWED,

    /**
     * 
     *                 If {@link FlashCreative#clickTagRequired} is {@code true}, then the flash
     *                 file is required to have a click tag embedded in it.
     *               
     * 
     */
    FLASH_WITHOUT_CLICKTAG,

    /**
     * 
     *                 Animated visual effect is not allowed.
     *               
     * 
     */
    ANIMATED_VISUAL_EFFECT,

    /**
     * 
     *                 An error was encountered in the flash file.
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
     *                 Flash files with network objects are not allowed.
     *               
     * 
     */
    FLASH_HAS_NETWORK_OBJECTS,

    /**
     * 
     *                 Flash files with network methods are not allowed.
     *               
     * 
     */
    FLASH_HAS_NETWORK_METHODS,

    /**
     * 
     *                 Flash files with hard-coded click thru URLs are not allowed.
     *               
     * 
     */
    FLASH_HAS_URL,

    /**
     * 
     *                 Flash files with mouse tracking are not allowed.
     *               
     * 
     */
    FLASH_HAS_MOUSE_TRACKING,

    /**
     * 
     *                 Flash files that generate or use random numbers are not allowed.
     *               
     * 
     */
    FLASH_HAS_RANDOM_NUM,

    /**
     * 
     *                 Flash files with self targets are not allowed.
     *               
     * 
     */
    FLASH_SELF_TARGETS,

    /**
     * 
     *                 Flash file contains a bad geturl target.
     *               
     * 
     */
    FLASH_BAD_GETURL_TARGET,

    /**
     * 
     *                 Flash or ActionScript version in the submitted file is not supported.
     *               
     * 
     */
    FLASH_VERSION_NOT_SUPPORTED,

    /**
     * 
     *                 The uploaded file is too large.
     *               
     * 
     */
    FILE_TOO_LARGE,

    /**
     * 
     *                 A system error occurred, please try again.
     *               
     * 
     */
    SYSTEM_ERROR,

    /**
     * 
     *                 The image density for a primary asset was not one of the expected image densities.
     *               
     * 
     */
    UNEXPECTED_PRIMARY_ASSET_DENSITY,

    /**
     * 
     *                 Two or more assets have the same image density.
     *               
     * 
     */
    DUPLICATE_ASSET_DENSITY,

    /**
     * 
     *                 The creative does not contain a primary asset. (For high-density creatives, the primary
     *                 asset must be a standard image file with 1x density.)
     *               
     * 
     */
    MISSING_DEFAULT_ASSET,

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

    public static ImageErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
