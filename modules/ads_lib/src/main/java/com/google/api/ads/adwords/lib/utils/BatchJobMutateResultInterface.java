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

import java.io.Serializable;

/**
 * The result of a single attempted operation from a batch job.
 */
public interface BatchJobMutateResultInterface<O, E> extends Serializable {
  /**
   * Returns the successfully modified object for the result. For a given result, either
   * this will not be null or {@link #getErrorList()} will not be null, but not both.
   */
  public O getOperand();

  /**
   * Returns the list of errors for the result. For a given result, either
   * this will not be null or {@link #getOperand()} will not be null, but not both.
   */
  public BatchJobErrorListInterface<E> getErrorList();

  /**
   * Returns the zero-based index of this result. This will be the same as the zero-based
   * index of the corresponding operation that was uploaded to the batch job.
   */
  public Long getIndex();

  /**
   * A list of errors for a single result.
   * @param <E> the {@code ApiError} type for a specific API version and SOAP toolkit.
   */
  public interface BatchJobErrorListInterface<E> extends Serializable {
    public E[] getErrors();
  }
}
