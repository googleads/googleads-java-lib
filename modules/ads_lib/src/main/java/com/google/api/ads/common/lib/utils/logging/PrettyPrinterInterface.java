// Copyright 2011, Google Inc. All Rights Reserved.
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

package com.google.api.ads.common.lib.utils.logging;

/** Interface capable of pretty printing messages (e.g., XML). */
public interface PrettyPrinterInterface {

  /**
   * Transforms the message into a pretty-printed format. Implementations should:
   *
   * <ol>
   *   <li>Sanitize the message by replacing any sensitive information with a token such as {@code
   *       REDACTED}.
   *   <li>Return the original message if an exception occurs during formatting.
   * </ol>
   *
   * @param message the message to be pretty printed
   * @return the given message in pretty-printed format
   */
  public String prettyPrint(String message);

  /** Default implementation that simply returns the message. */
  public static PrettyPrinterInterface NO_OP_PRETTY_PRINTER =
      new PrettyPrinterInterface() {

        @Override
        public String prettyPrint(String message) {
          return message;
        }
      };
}
