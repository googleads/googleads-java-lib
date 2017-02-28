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
import com.google.api.ads.adwords.lib.utils.BatchJobHelperInterface;
import com.google.api.ads.adwords.lib.utils.logging.AdWordsLoggingModule;
import com.google.api.ads.common.lib.AdsModule;
import com.google.api.ads.common.lib.utils.XmlFieldExtractor;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;

/** Guice module for AdWords bindings. */
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
    install(
        new AdWordsLoggingModule(
            loggerPrefix,
            AdHocReportDownloadHelper.class.getPackage().getName(),
            BatchJobHelperInterface.class.getPackage().getName()));
  }
}
