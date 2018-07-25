// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.jaxws.utils;

import com.google.api.ads.adwords.lib.utils.BatchJobHelperUtility;
import com.google.api.ads.common.lib.soap.jaxb.JaxBDeserializer;
import com.google.inject.Inject;
import java.io.InputStream;
import java.net.URL;
import javax.xml.transform.stream.StreamSource;

/** Utility for deserializing XML to JAX-WS objects. */
public class JaxWsBatchJobResponseDeserializer {

  private final BatchJobHelperUtility batchJobHelperUtility;

  @Inject
  JaxWsBatchJobResponseDeserializer(BatchJobHelperUtility batchJobHelperUtility) {
    this.batchJobHelperUtility = batchJobHelperUtility;
  }

  /**
   * @param clazz
   * @param url
   * @return the batch job response
   * @throws Exception
   */
  public <T> T deserializeBatchJobMutateResults(Class<T> clazz, URL url) throws Exception {
    return this.deserializeBatchJobMutateResults(clazz, url, 0, Integer.MAX_VALUE);
  }

  /**
   * @param clazz
   * @param url
   * @param startIndex
   * @param numberResults
   * @return the batch job response with pagination
   * @throws Exception
   */
  public <T> T deserializeBatchJobMutateResults(
      Class<T> clazz, URL url, int startIndex, int numberResults) throws Exception {
    // Build a wrapped input stream from the response.
    InputStream wrappedStream =
        batchJobHelperUtility.buildWrappedByteSource(url, startIndex, numberResults).openStream();

    return new JaxBDeserializer<>(clazz).deserialize(new StreamSource(wrappedStream));
  }
}
