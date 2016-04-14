package ddp.axis.v201603.userservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.ddp.axis.factory.DdpServices;
import com.google.api.ads.ddp.axis.v201603.provider.*;
import com.google.api.ads.ddp.lib.client.DdpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * Created by ying on 14/4/16.
 */
public class Mutate {

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(OfflineCredentials.Api.DDP)
        .fromFile()
        .build()
        .generateCredential();

    // Construct an DdpSession.
    DdpSession session = new DdpSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DdpServices adWordsServices = new DdpServices();

    runExample(adWordsServices, session);
  }

  public static void runExample(
      DdpServices ddpServices, DdpSession session) throws Exception {

    UserListServiceInterface userListService = ddpServices.get(session, UserListServiceInterface.class);

    UserList userList = new BasicUserList();
    userList.setName("Demographic segment #" + System.currentTimeMillis());
    userList.setDescription("Target dempographic description");
    userList.setIntegrationCode("12345");
    userList.setMembershipLifeSpan(365L);


    UserListOperation operation = new UserListOperation();
    operation.setOperand(userList);
    operation.setOperator(Operator.ADD);
    UserListOperation[] operations = new UserListOperation[] {operation};


    UserListReturnValue result = userListService.mutate(operations);

    if (result != null && result.getValue() != null) {
      for (UserList userListResult : result.getValue()) {
        System.out.println("UserList with name \""
            + userListResult.getName() + "\" and id \""
            + userListResult.getId() + "\" was added.");
      }
    } else {
      System.out.println("No user lists were added.");
    }
  }
}
