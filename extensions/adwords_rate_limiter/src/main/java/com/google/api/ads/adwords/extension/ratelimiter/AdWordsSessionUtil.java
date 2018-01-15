// Copyright 2016 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.extension.ratelimiter;

import com.google.api.ads.adwords.lib.client.AdWordsSession;

/**
 * Utilities of AdWordsSession
 */
class AdWordsSessionUtil {
  public static final long VIRTUAL_CID = -1L;

  /**
   * Get client customer ID from the adwords session, and convert it to Long type.
   *
   * @param session the AdWords session
   * @return the client customer ID in the AdWords session, or VIRTUAL_CID if absent
   */
  public static long getClientCustomerId(AdWordsSession session) {
    String accountIdStr = session.getClientCustomerId();

    // clientCustomerId might be absent from AdWordsSession, e.g., for
    // ReportDefinitionService.getReportFields() and CustomerService.getCustomers().
    // In this case, use ONE virtual account to handle rate limit of ALL unknown accounts combined.
    if (accountIdStr == null) {
      return VIRTUAL_CID;
    }

    try {
      return Long.parseLong(accountIdStr.replace("-", ""));
    } catch (NumberFormatException e) {
      throw new RateLimiterException("Encountered invalid CID: " + accountIdStr, e);
    }
  }
}
