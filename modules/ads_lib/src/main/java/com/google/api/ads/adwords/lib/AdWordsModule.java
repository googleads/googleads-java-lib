// Copyright 2012 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.lib;

import com.google.api.ads.adwords.lib.client.AdWordsServiceClient;
import com.google.api.ads.adwords.lib.conf.AdWordsConfigurationModule;
import com.google.api.ads.adwords.lib.utils.AdHocReportDownloadHelper;
import com.google.api.ads.adwords.lib.utils.AdWordsInternals;
import com.google.api.ads.adwords.lib.utils.BatchJobHelperInterface;
import com.google.api.ads.adwords.lib.utils.logging.AdWordsLoggingModule;
import com.google.api.ads.common.lib.AdsModule;
import com.google.api.ads.common.lib.utils.Internals;
import com.google.api.ads.common.lib.utils.XmlFieldExtractor;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.inject.Provides;

/**
 * Guice module for AdWords bindings.
 */
public class AdWordsModule extends AdsModule {

  public AdWordsModule() {}

  @Override
  protected void configure() {
    super.configure();
    configureLogging(AdWordsServiceClient.class.getName());
    install(new AdWordsConfigurationModule());
    bind(HttpTransport.class).to(NetHttpTransport.class);
    bind(XmlFieldExtractor.class);
  }
  
  @Override
  protected void configureLogging(String loggerPrefix) {
    install(new AdWordsLoggingModule(
        loggerPrefix, AdHocReportDownloadHelper.class.getPackage().getName(),
        BatchJobHelperInterface.class.getPackage().getName()));
  }

  /**
   * Provider method required by Guice. Unlike with DFP and DFA, AdWords has its own subclass
   * of Internals. This method and its Provides annotation tell Guice to bind the
   * {@link Internals} type to the singleton of {@link AdWordsInternals}. Without this method
   * and annotation, Guice would automatically construct an instance of {@link Internals} and
   * bind it to the {@link Internals} type, and as a result, Guice injected objects would use
   * a different Internals object from code that calls {@code AdWordsInternals.getInstance()}.  
   */
  @Provides
  private Internals getInternals() {
    return AdWordsInternals.getInstance();
  }
}
