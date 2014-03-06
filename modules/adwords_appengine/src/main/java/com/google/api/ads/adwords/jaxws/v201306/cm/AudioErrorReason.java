
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudioError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AudioError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_AUDIO"/>
 *     &lt;enumeration value="PROBLEM_READING_AUDIO_FILE"/>
 *     &lt;enumeration value="ERROR_STORING_AUDIO"/>
 *     &lt;enumeration value="FILE_TOO_LARGE"/>
 *     &lt;enumeration value="UNSUPPORTED_AUDIO"/>
 *     &lt;enumeration value="ERROR_GENERATING_STREAMING_URL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AudioError.Reason")
@XmlEnum
public enum AudioErrorReason {

    INVALID_AUDIO,
    PROBLEM_READING_AUDIO_FILE,
    ERROR_STORING_AUDIO,
    FILE_TOO_LARGE,
    UNSUPPORTED_AUDIO,
    ERROR_GENERATING_STREAMING_URL;

    public String value() {
        return name();
    }

    public static AudioErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
