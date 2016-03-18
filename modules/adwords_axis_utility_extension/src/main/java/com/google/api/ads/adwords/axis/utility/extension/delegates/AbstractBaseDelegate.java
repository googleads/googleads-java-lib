// Copyright 2012 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.axis.utility.extension.delegates;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utility.extension.util.AdWordsSessionUtil;
import com.google.api.ads.adwords.lib.client.AdWordsSession;

/**
 * Base class that handles AdWordsServices.
 *
 * @param <S> the service interface class. This is a class representing a SOAP service.
 *
 * <p>
 * Implementation is not thread-safe,
 * because AdWordsSession and Apache Axis service objects are not thread-safe.
 * </p>
 */
public abstract class AbstractBaseDelegate<S> {
  
  static final int MAX_RETRY_COUNT = 3;

  private final AdWordsSession adWordsSession;

  private final AdWordsServices adWordsServices = new AdWordsServices();

  private final S service;

  final Class<?> classS;

  /**
   * Default Constructor.
   * Copies (if needed) the AdWordsSession and Adds USER_AGENT to the userAgent.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the service
   * @param classS the service interface class for the SOAP service
   */
  protected AbstractBaseDelegate(AdWordsSession adWordsSession, Class<S> classS) {
    this.adWordsSession = AdWordsSessionUtil.copyIfNeededWithUtilityUserAgent(adWordsSession);
    this.classS = classS;
    this.service = adWordsServices.get(adWordsSession, classS);
  }
  
  /**
   * Constructor with Service instance.
   * Copies (if needed) the AdWordsSession and Adds USER_AGENT to the userAgent.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the service
   * @param service the custom service class for the SOAP service
   */
  protected AbstractBaseDelegate(AdWordsSession adWordsSession, S service) {
    this.classS = service.getClass();
    this.adWordsSession = AdWordsSessionUtil.copyIfNeededWithUtilityUserAgent(adWordsSession);
    this.service = service;
  }

  /**
   * Gets the {@code adWordsSession} associated with the service.
   */
  protected AdWordsSession getAdWordsSession() {
    return adWordsSession;
  }

  /**
   * Gets the service interface class for the SOAP service.
   */
  public S getService() {
    return service;
  }
}
