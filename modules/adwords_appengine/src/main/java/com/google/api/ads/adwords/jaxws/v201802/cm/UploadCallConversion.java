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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A conversion that happens when a user performs one the following sequences of actions:
 *             <ul>
 *             <li>User clicks on an advertiser's ad which takes the user to the advertiser's website, where
 *             special javascript installed on the page produces a dynamically-generated phone number.
 *             Then, user calls that number from their home (or other) phone</li>
 *             </li>User makes a phone call from conversion-tracked call extensions </li>
 *             </ul>
 *             
 *             After successfully creating a new UploadCallConversion, send the name of this conversion type
 *             along with your conversion details to the OfflineCallConversionFeedService
 *             to attribute those conversions to this conversion type.
 *           
 * 
 * <p>Java class for UploadCallConversion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UploadCallConversion">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}ConversionTracker">
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
@XmlType(name = "UploadCallConversion")
public class UploadCallConversion
    extends ConversionTracker
{


}
