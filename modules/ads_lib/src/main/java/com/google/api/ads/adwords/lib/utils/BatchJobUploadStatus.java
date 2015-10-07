// Copyright 2015 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib.utils;

import com.google.common.base.Preconditions;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.net.URI;

import javax.annotation.Nullable;

/**
 * Status of the upload process for a batch job.
 */
public class BatchJobUploadStatus {
  private final long totalContentLength;
  private final URI resumableUploadUri;

  /**
   * @param totalContentLength total length (in bytes) of the content already uploaded for the job
   * @param resumableUploadUri the resumable upload URI of the job. If this is the first upload
   * in a series of uploads, pass the {@code BatchJob.uploadUrl} as a {@link URI}.
   */
  public BatchJobUploadStatus(long totalContentLength, @Nullable URI resumableUploadUri) {
    Preconditions.checkArgument(
        totalContentLength >= 0L, "Total content length %s is < 0", totalContentLength);
    this.totalContentLength = totalContentLength;
    this.resumableUploadUri = resumableUploadUri;
  }

  /**
   * Returns total length (in bytes) of the content already uploaded for the job.
   */
  public long getTotalContentLength() {
    return totalContentLength;
  }

  /**
   * Returns the resumable upload URI of the job.
   */
  @Nullable
  public URI getResumableUploadUri() {
    return resumableUploadUri;
  }
  
  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
        .append("totalContentLength", totalContentLength)
        .append("resumableUploadUri", resumableUploadUri)
        .toString();
  }
}
