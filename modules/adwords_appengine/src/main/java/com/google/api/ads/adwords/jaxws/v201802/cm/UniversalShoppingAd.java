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
 *             Represents a universal shopping ad. A universal shopping ad targets multiple advertising channels
 *             across Search, Google Display Network, and YouTube with a focus on retail. This supports ads
 *             that display product data (managed using the Google Merchant Center) as specified in the parent
 *             campaign's {@linkplain ShoppingSetting shopping setting} as well as ads using advertiser provided
 *             asset data.
 *             
 *             <p class="caution"><b>Caution:</b> Product ads do not use {@link #url url},
 *             {@link #finalUrls finalUrls}, {@link #finalMobileUrls finalMobileUrls},
 *             {@link #finalAppUrls finalAppUrls}, or {@link #displayUrl displayUrl};
 *             setting these fields on a product ad will cause an error.
 *             <span class="constraint AdxEnabled">This is enabled for AdX.</span>
 *           
 * 
 * <p>Java class for UniversalShoppingAd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UniversalShoppingAd">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}Ad">
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
@XmlType(name = "UniversalShoppingAd")
public class UniversalShoppingAd
    extends Ad
{


}
