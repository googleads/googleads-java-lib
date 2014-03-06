// Copyright 2013 Google Inc. All Rights Reserved.
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

package dfp.axis.v201302.customfieldservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201302.CustomField;
import com.google.api.ads.dfp.axis.v201302.CustomFieldDataType;
import com.google.api.ads.dfp.axis.v201302.CustomFieldEntityType;
import com.google.api.ads.dfp.axis.v201302.CustomFieldOption;
import com.google.api.ads.dfp.axis.v201302.CustomFieldServiceInterface;
import com.google.api.ads.dfp.axis.v201302.CustomFieldVisibility;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

import java.util.Random;

/**
 * This example creates custom fields and options. To determine which custom
 * fields exist, run GetAllCustomFields.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: CustomFieldService.createCustomFields
 * Tags: CustomFieldService.createCustomFieldOptions
 *
 * @author Adam Rogal
 */
public class CreateCustomFieldsAndOptions {

  public static void runExample(DfpServices dfpServices, DfpSession session) throws Exception {
    // Get the CustomFieldService.
    CustomFieldServiceInterface customFieldService =
        dfpServices.get(session, CustomFieldServiceInterface.class);

    // Create a number custom field that can be used for an external ID in the
    // API.
    CustomField numberCustomField = new CustomField();
    numberCustomField.setName("External ID #" + new Random().nextInt(Integer.MAX_VALUE));
    numberCustomField.setEntityType(CustomFieldEntityType.LINE_ITEM);
    numberCustomField.setDataType(CustomFieldDataType.NUMBER);
    numberCustomField.setVisibility(CustomFieldVisibility.API_ONLY);

    // Create a drop-down custom field that can be used in the UI.
    CustomField dropDownCustomField = new CustomField();
    dropDownCustomField.setName(
        "Internal approval status #" + new Random().nextInt(Integer.MAX_VALUE));
    dropDownCustomField.setEntityType(CustomFieldEntityType.LINE_ITEM);
    dropDownCustomField.setDataType(CustomFieldDataType.DROP_DOWN);
    dropDownCustomField.setVisibility(CustomFieldVisibility.FULL);

    // Create the custom fields on the server.
    CustomField[] customFields = customFieldService.createCustomFields(
        new CustomField[] {numberCustomField, dropDownCustomField});

    for (CustomField createdCustomField : customFields) {
      System.out.printf("A custom field with ID \"%d\" and name \"%s\" was created.\n",
          createdCustomField.getId(), createdCustomField.getName());
    }

    // Set the created drop-down custom field.
    dropDownCustomField = customFields[1];

    // Create approved custom field option.
    CustomFieldOption approvedCustomFieldOption = new CustomFieldOption();
    approvedCustomFieldOption.setDisplayName("APPROVED");
    approvedCustomFieldOption.setCustomFieldId(dropDownCustomField.getId());

    // Create unapproved custom field option.
    CustomFieldOption unapprovedCustomFieldOption = new CustomFieldOption();
    unapprovedCustomFieldOption.setDisplayName("UNAPPROVED");
    unapprovedCustomFieldOption.setCustomFieldId(dropDownCustomField.getId());

    // Create the custom field options on the server.
    CustomFieldOption[] customFieldOptions = customFieldService.createCustomFieldOptions(
        new CustomFieldOption[] {approvedCustomFieldOption, unapprovedCustomFieldOption});

    for (CustomFieldOption createdCustomFieldOption : customFieldOptions) {
      System.out.printf(
          "A custom field option with ID \"%d\" and display name \"%s\" was created.\n",
          createdCustomFieldOption.getId(), createdCustomFieldOption.getDisplayName());
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

    runExample(dfpServices, session);
  }
}
