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

package dfp.axis.v201311.customfieldservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201311.BaseCustomFieldValue;
import com.google.api.ads.dfp.axis.v201311.CustomFieldServiceInterface;
import com.google.api.ads.dfp.axis.v201311.CustomFieldValue;
import com.google.api.ads.dfp.axis.v201311.DropDownCustomFieldValue;
import com.google.api.ads.dfp.axis.v201311.LineItem;
import com.google.api.ads.dfp.axis.v201311.LineItemServiceInterface;
import com.google.api.ads.dfp.axis.v201311.NumberValue;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

/**
 * This example sets custom field values on a line item. To determine which
 * custom fields exist, run GetAllCustomFields.java. To determine
 * which line items exist, run GetAllLineItems.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: CustomFieldService.getCustomField
 * Tags: LineItemService.getLineItem
 * Tags: LineItemService.updateLineItems
 *
 * @author Adam Rogal
 */
public class SetLineItemCustomFieldValue {

  // Set the ID of the number typed custom field to set on the line item.
  private static final String NUMBER_CUSTOM_FIELD_ID = "INSERT_NUMBER_CUSTOM_FIELD_ID_HERE";

  // Set the ID of the option for the drop-down custom field.
  private static final String CUSTOM_FIELD_OPTION_ID = "INSERT_DROP_DOWN_CUSTOM_FIELD_VALUE_HERE";

  // Set the ID of the line item to set these custom fields.
  private static final String LINE_ITEM_ID = "INSERT_LINE_ITEM_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session,
      long numberCustomFieldId, long customFieldOptionId, long lineItemId)
      throws Exception {
    // Get the CustomFieldService.
    CustomFieldServiceInterface customFieldService =
        dfpServices.get(session, CustomFieldServiceInterface.class);

    // Get the LineItemService.
    LineItemServiceInterface lineItemService =
        dfpServices.get(session, LineItemServiceInterface.class);

    // Get the drop-down custom field ID.
    long dropDownCustomFieldId =
        customFieldService.getCustomFieldOption(customFieldOptionId).getCustomFieldId();

    // Get the line item.
    LineItem lineItem = lineItemService.getLineItem(lineItemId);

    // Create number custom field value.
    NumberValue numberValue = new NumberValue();
    numberValue.setValue("12345");

    CustomFieldValue numberCustomFieldValue = new CustomFieldValue();
    numberCustomFieldValue.setCustomFieldId(numberCustomFieldId);
    numberCustomFieldValue.setValue(numberValue);

    // Create drop-down custom field value.
    DropDownCustomFieldValue dropDownCustomFieldValue = new DropDownCustomFieldValue();
    dropDownCustomFieldValue.setCustomFieldId(dropDownCustomFieldId);
    dropDownCustomFieldValue.setCustomFieldOptionId(customFieldOptionId);

    // Create a combined custom field value list of existing different custom
    // field values and new ones.
    List<BaseCustomFieldValue> combinedCustomFieldValues = Lists.newArrayList();
    if (lineItem.getCustomFieldValues() != null) {
      for (BaseCustomFieldValue existingCustomFieldValue : lineItem.getCustomFieldValues()) {
        if (!existingCustomFieldValue.getCustomFieldId().equals(numberCustomFieldId)
            && !existingCustomFieldValue.getCustomFieldId().equals(dropDownCustomFieldId)) {
          combinedCustomFieldValues.add(existingCustomFieldValue);
        }
      }
    }
    combinedCustomFieldValues.addAll(
        Arrays.asList(numberCustomFieldValue, dropDownCustomFieldValue));

    // Set the combined custom field values.
    lineItem.setCustomFieldValues(combinedCustomFieldValues.toArray(new BaseCustomFieldValue[]{}));

    // Update the line item on the server.
    LineItem[] lineItems = lineItemService.updateLineItems(new LineItem[] {lineItem});

    for (LineItem updatedLineItem : lineItems) {
      // Get a string representation of the custom field values.
      List<String> customFieldValueStrings = Lists.transform(
          Arrays.asList(updatedLineItem.getCustomFieldValues()),
          new Function<BaseCustomFieldValue, String>() {
            public String apply(BaseCustomFieldValue baseCustomFieldValue) {
              if (baseCustomFieldValue instanceof CustomFieldValue
                  && ((CustomFieldValue) baseCustomFieldValue).getValue() instanceof NumberValue) {
                return String.format("{ID: \"%d\", value: \"%.0f\"}",
                    baseCustomFieldValue
                        .getCustomFieldId(),
                    Double.parseDouble(((NumberValue) ((CustomFieldValue) baseCustomFieldValue)
                        .getValue()).getValue()));
              } else if (baseCustomFieldValue instanceof DropDownCustomFieldValue) {
                return String.format("{ID: \"%d\", customFieldOptionId: \"%d\"}",
                    baseCustomFieldValue.getCustomFieldId(),
                    ((DropDownCustomFieldValue) baseCustomFieldValue).getCustomFieldOptionId());
              } else {
                return "{Unrecognized value}";
              }
            }
          });

      System.out.printf("A line item with ID \"%d\" was updated with custom field values \"%s\"\n",
          updatedLineItem.getId(), Joiner.on(",").join(customFieldValueStrings));
    }
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential similar to a ClientLogin token
    // and can be used in place of a service account.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFP)
        .fromFile()
        .build()
        .generateCredential();

    // Construct a DfpSession.
    DfpSession session = new DfpSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfpServices dfpServices = new DfpServices();

    runExample(dfpServices, session, Long.parseLong(NUMBER_CUSTOM_FIELD_ID),
        Long.parseLong(CUSTOM_FIELD_OPTION_ID), Long.parseLong(LINE_ITEM_ID));
  }
}
