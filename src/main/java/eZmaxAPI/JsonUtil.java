/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.43
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package eZmaxAPI;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Date;
import org.openapitools.client.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    gsonBuilder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
      public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return new Date(json.getAsJsonPrimitive().getAsLong());
      }
    });
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("ActivesessionGetCurrentV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<List<ActivesessionGetCurrentV1Response>>(){}.getType();
    }
    
    if ("ActivesessionGetCurrentV1ResponseMPayload".equalsIgnoreCase(className)) {
      return new TypeToken<List<ActivesessionGetCurrentV1ResponseMPayload>>(){}.getType();
    }
    
    if ("AddressRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<AddressRequest>>(){}.getType();
    }
    
    if ("ApikeyCreateObjectV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApikeyCreateObjectV1Request>>(){}.getType();
    }
    
    if ("ApikeyCreateObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApikeyCreateObjectV1Response>>(){}.getType();
    }
    
    if ("ApikeyCreateObjectV1ResponseMPayload".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApikeyCreateObjectV1ResponseMPayload>>(){}.getType();
    }
    
    if ("ApikeyRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApikeyRequest>>(){}.getType();
    }
    
    if ("ApikeyRequestCompound".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApikeyRequestCompound>>(){}.getType();
    }
    
    if ("ApikeyResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApikeyResponse>>(){}.getType();
    }
    
    if ("AttemptResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AttemptResponse>>(){}.getType();
    }
    
    if ("AuthenticateAuthenticateV2Request".equalsIgnoreCase(className)) {
      return new TypeToken<List<AuthenticateAuthenticateV2Request>>(){}.getType();
    }
    
    if ("AuthenticateAuthenticateV2Response".equalsIgnoreCase(className)) {
      return new TypeToken<List<AuthenticateAuthenticateV2Response>>(){}.getType();
    }
    
    if ("AuthenticateAuthenticateV2ResponseMPayload".equalsIgnoreCase(className)) {
      return new TypeToken<List<AuthenticateAuthenticateV2ResponseMPayload>>(){}.getType();
    }
    
    if ("CommonAudit".equalsIgnoreCase(className)) {
      return new TypeToken<List<CommonAudit>>(){}.getType();
    }
    
    if ("CommonGetAutocompleteV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<List<CommonGetAutocompleteV1Response>>(){}.getType();
    }
    
    if ("CommonGetAutocompleteV1ResponseMPayload".equalsIgnoreCase(className)) {
      return new TypeToken<List<CommonGetAutocompleteV1ResponseMPayload>>(){}.getType();
    }
    
    if ("CommonResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CommonResponse>>(){}.getType();
    }
    
    if ("CommonResponseError".equalsIgnoreCase(className)) {
      return new TypeToken<List<CommonResponseError>>(){}.getType();
    }
    
    if ("CommonResponseObjDebug".equalsIgnoreCase(className)) {
      return new TypeToken<List<CommonResponseObjDebug>>(){}.getType();
    }
    
    if ("CommonResponseObjDebugPayload".equalsIgnoreCase(className)) {
      return new TypeToken<List<CommonResponseObjDebugPayload>>(){}.getType();
    }
    
    if ("CommonResponseObjSQLQuery".equalsIgnoreCase(className)) {
      return new TypeToken<List<CommonResponseObjSQLQuery>>(){}.getType();
    }
    
    if ("CommonWebhook".equalsIgnoreCase(className)) {
      return new TypeToken<List<CommonWebhook>>(){}.getType();
    }
    
    if ("ContactRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContactRequest>>(){}.getType();
    }
    
    if ("ContactRequestCompound".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContactRequestCompound>>(){}.getType();
    }
    
    if ("ContactRequestCompoundAllOf".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContactRequestCompoundAllOf>>(){}.getType();
    }
    
    if ("ContactinformationsRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContactinformationsRequest>>(){}.getType();
    }
    
    if ("ContactinformationsRequestCompound".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContactinformationsRequestCompound>>(){}.getType();
    }
    
    if ("EmailRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<EmailRequest>>(){}.getType();
    }
    
    if ("EzsigndocumentApplyEzsigntemplateV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsigndocumentApplyEzsigntemplateV1Request>>(){}.getType();
    }
    
    if ("EzsigndocumentApplyEzsigntemplateV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsigndocumentApplyEzsigntemplateV1Response>>(){}.getType();
    }
    
    if ("EzsigndocumentCreateObjectV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsigndocumentCreateObjectV1Request>>(){}.getType();
    }
    
    if ("EzsigndocumentCreateObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsigndocumentCreateObjectV1Response>>(){}.getType();
    }
    
    if ("EzsigndocumentCreateObjectV1ResponseMPayload".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsigndocumentCreateObjectV1ResponseMPayload>>(){}.getType();
    }
    
    if ("EzsigndocumentDeleteObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsigndocumentDeleteObjectV1Response>>(){}.getType();
    }
    
    if ("EzsigndocumentGetDownloadUrlV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsigndocumentGetDownloadUrlV1Response>>(){}.getType();
    }
    
    if ("EzsigndocumentGetDownloadUrlV1ResponseMPayload".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsigndocumentGetDownloadUrlV1ResponseMPayload>>(){}.getType();
    }
    
    if ("EzsigndocumentGetObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsigndocumentGetObjectV1Response>>(){}.getType();
    }
    
    if ("EzsigndocumentGetObjectV1ResponseMPayload".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsigndocumentGetObjectV1ResponseMPayload>>(){}.getType();
    }
    
    if ("EzsigndocumentRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsigndocumentRequest>>(){}.getType();
    }
    
    if ("EzsigndocumentRequestCompound".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsigndocumentRequestCompound>>(){}.getType();
    }
    
    if ("EzsigndocumentResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsigndocumentResponse>>(){}.getType();
    }
    
    if ("EzsigndocumentResponseAllOf".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsigndocumentResponseAllOf>>(){}.getType();
    }
    
    if ("EzsigndocumentResponseCompound".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsigndocumentResponseCompound>>(){}.getType();
    }
    
    if ("EzsignfolderCreateObjectV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsignfolderCreateObjectV1Request>>(){}.getType();
    }
    
    if ("EzsignfolderCreateObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsignfolderCreateObjectV1Response>>(){}.getType();
    }
    
    if ("EzsignfolderCreateObjectV1ResponseMPayload".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsignfolderCreateObjectV1ResponseMPayload>>(){}.getType();
    }
    
    if ("EzsignfolderDeleteObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsignfolderDeleteObjectV1Response>>(){}.getType();
    }
    
    if ("EzsignfolderGetObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsignfolderGetObjectV1Response>>(){}.getType();
    }
    
    if ("EzsignfolderGetObjectV1ResponseMPayload".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsignfolderGetObjectV1ResponseMPayload>>(){}.getType();
    }
    
    if ("EzsignfolderRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsignfolderRequest>>(){}.getType();
    }
    
    if ("EzsignfolderRequestCompound".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsignfolderRequestCompound>>(){}.getType();
    }
    
    if ("EzsignfolderResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsignfolderResponse>>(){}.getType();
    }
    
    if ("EzsignfolderResponseAllOf".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsignfolderResponseAllOf>>(){}.getType();
    }
    
    if ("EzsignfolderResponseCompound".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsignfolderResponseCompound>>(){}.getType();
    }
    
    if ("EzsignfolderSendV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsignfolderSendV1Request>>(){}.getType();
    }
    
    if ("EzsignfolderSendV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsignfolderSendV1Response>>(){}.getType();
    }
    
    if ("EzsignfoldersignerassociationCreateObjectV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsignfoldersignerassociationCreateObjectV1Request>>(){}.getType();
    }
    
    if ("EzsignfoldersignerassociationCreateObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsignfoldersignerassociationCreateObjectV1Response>>(){}.getType();
    }
    
    if ("EzsignfoldersignerassociationCreateObjectV1ResponseMPayload".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsignfoldersignerassociationCreateObjectV1ResponseMPayload>>(){}.getType();
    }
    
    if ("EzsignfoldersignerassociationDeleteObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsignfoldersignerassociationDeleteObjectV1Response>>(){}.getType();
    }
    
    if ("EzsignfoldersignerassociationGetInPersonLoginUrlV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsignfoldersignerassociationGetInPersonLoginUrlV1Response>>(){}.getType();
    }
    
    if ("EzsignfoldersignerassociationGetInPersonLoginUrlV1ResponseMPayload".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsignfoldersignerassociationGetInPersonLoginUrlV1ResponseMPayload>>(){}.getType();
    }
    
    if ("EzsignfoldersignerassociationGetObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsignfoldersignerassociationGetObjectV1Response>>(){}.getType();
    }
    
    if ("EzsignfoldersignerassociationRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsignfoldersignerassociationRequest>>(){}.getType();
    }
    
    if ("EzsignfoldersignerassociationRequestCompound".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsignfoldersignerassociationRequestCompound>>(){}.getType();
    }
    
    if ("EzsignsignatureCreateObjectV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsignsignatureCreateObjectV1Request>>(){}.getType();
    }
    
    if ("EzsignsignatureCreateObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsignsignatureCreateObjectV1Response>>(){}.getType();
    }
    
    if ("EzsignsignatureCreateObjectV1ResponseMPayload".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsignsignatureCreateObjectV1ResponseMPayload>>(){}.getType();
    }
    
    if ("EzsignsignatureDeleteObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsignsignatureDeleteObjectV1Response>>(){}.getType();
    }
    
    if ("EzsignsignatureGetObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsignsignatureGetObjectV1Response>>(){}.getType();
    }
    
    if ("EzsignsignatureRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsignsignatureRequest>>(){}.getType();
    }
    
    if ("EzsignsignatureRequestCompound".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsignsignatureRequestCompound>>(){}.getType();
    }
    
    if ("EzsignsignerRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsignsignerRequest>>(){}.getType();
    }
    
    if ("EzsignsignerRequestCompound".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsignsignerRequestCompound>>(){}.getType();
    }
    
    if ("EzsignsignerRequestCompoundContact".equalsIgnoreCase(className)) {
      return new TypeToken<List<EzsignsignerRequestCompoundContact>>(){}.getType();
    }
    
    if ("FieldEEzsigndocumentStep".equalsIgnoreCase(className)) {
      return new TypeToken<List<FieldEEzsigndocumentStep>>(){}.getType();
    }
    
    if ("FieldEEzsignfolderSendreminderfrequency".equalsIgnoreCase(className)) {
      return new TypeToken<List<FieldEEzsignfolderSendreminderfrequency>>(){}.getType();
    }
    
    if ("FieldEEzsignfolderStep".equalsIgnoreCase(className)) {
      return new TypeToken<List<FieldEEzsignfolderStep>>(){}.getType();
    }
    
    if ("FieldEPhoneType".equalsIgnoreCase(className)) {
      return new TypeToken<List<FieldEPhoneType>>(){}.getType();
    }
    
    if ("FieldEUserType".equalsIgnoreCase(className)) {
      return new TypeToken<List<FieldEUserType>>(){}.getType();
    }
    
    if ("FieldEUserTypeSSPR".equalsIgnoreCase(className)) {
      return new TypeToken<List<FieldEUserTypeSSPR>>(){}.getType();
    }
    
    if ("FranchisereferalincomeCreateObjectV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<List<FranchisereferalincomeCreateObjectV1Request>>(){}.getType();
    }
    
    if ("FranchisereferalincomeCreateObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<List<FranchisereferalincomeCreateObjectV1Response>>(){}.getType();
    }
    
    if ("FranchisereferalincomeCreateObjectV1ResponseMPayload".equalsIgnoreCase(className)) {
      return new TypeToken<List<FranchisereferalincomeCreateObjectV1ResponseMPayload>>(){}.getType();
    }
    
    if ("FranchisereferalincomeRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<FranchisereferalincomeRequest>>(){}.getType();
    }
    
    if ("FranchisereferalincomeRequestCompound".equalsIgnoreCase(className)) {
      return new TypeToken<List<FranchisereferalincomeRequestCompound>>(){}.getType();
    }
    
    if ("GlobalCustomerGetEndpointV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<List<GlobalCustomerGetEndpointV1Response>>(){}.getType();
    }
    
    if ("MultilingualApikeyDescription".equalsIgnoreCase(className)) {
      return new TypeToken<List<MultilingualApikeyDescription>>(){}.getType();
    }
    
    if ("PhoneRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<PhoneRequest>>(){}.getType();
    }
    
    if ("SsprResetPasswordRequestV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<List<SsprResetPasswordRequestV1Request>>(){}.getType();
    }
    
    if ("SsprResetPasswordV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<List<SsprResetPasswordV1Request>>(){}.getType();
    }
    
    if ("SsprSendUsernamesV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<List<SsprSendUsernamesV1Request>>(){}.getType();
    }
    
    if ("SsprUnlockAccountRequestV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<List<SsprUnlockAccountRequestV1Request>>(){}.getType();
    }
    
    if ("SsprUnlockAccountV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<List<SsprUnlockAccountV1Request>>(){}.getType();
    }
    
    if ("SsprValidateTokenV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<List<SsprValidateTokenV1Request>>(){}.getType();
    }
    
    if ("UNUSEDEzsigndocumentEditObjectV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<List<UNUSEDEzsigndocumentEditObjectV1Request>>(){}.getType();
    }
    
    if ("UNUSEDEzsigndocumentEditObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<List<UNUSEDEzsigndocumentEditObjectV1Response>>(){}.getType();
    }
    
    if ("UNUSEDEzsignfolderEditObjectV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<List<UNUSEDEzsignfolderEditObjectV1Request>>(){}.getType();
    }
    
    if ("UNUSEDEzsignfolderEditObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<List<UNUSEDEzsignfolderEditObjectV1Response>>(){}.getType();
    }
    
    if ("UNUSEDEzsignfoldersignerassociationEditObjectV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<List<UNUSEDEzsignfoldersignerassociationEditObjectV1Request>>(){}.getType();
    }
    
    if ("UNUSEDEzsignfoldersignerassociationEditObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<List<UNUSEDEzsignfoldersignerassociationEditObjectV1Response>>(){}.getType();
    }
    
    if ("UNUSEDEzsignsignatureEditObjectV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<List<UNUSEDEzsignsignatureEditObjectV1Request>>(){}.getType();
    }
    
    if ("UNUSEDEzsignsignatureEditObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<List<UNUSEDEzsignsignatureEditObjectV1Response>>(){}.getType();
    }
    
    if ("UserCreateEzsignuserV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserCreateEzsignuserV1Request>>(){}.getType();
    }
    
    if ("UserCreateEzsignuserV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserCreateEzsignuserV1Response>>(){}.getType();
    }
    
    if ("UserCreateEzsignuserV1ResponseMPayload".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserCreateEzsignuserV1ResponseMPayload>>(){}.getType();
    }
    
    if ("UserResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserResponse>>(){}.getType();
    }
    
    if ("UserResponseAllOf".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserResponseAllOf>>(){}.getType();
    }
    
    if ("WebhookEzsignDocumentCompleted".equalsIgnoreCase(className)) {
      return new TypeToken<List<WebhookEzsignDocumentCompleted>>(){}.getType();
    }
    
    if ("WebhookEzsignDocumentCompletedAllOf".equalsIgnoreCase(className)) {
      return new TypeToken<List<WebhookEzsignDocumentCompletedAllOf>>(){}.getType();
    }
    
    if ("WebhookEzsignFolderCompleted".equalsIgnoreCase(className)) {
      return new TypeToken<List<WebhookEzsignFolderCompleted>>(){}.getType();
    }
    
    if ("WebhookEzsignFolderCompletedAllOf".equalsIgnoreCase(className)) {
      return new TypeToken<List<WebhookEzsignFolderCompletedAllOf>>(){}.getType();
    }
    
    if ("WebhookResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<WebhookResponse>>(){}.getType();
    }
    
    if ("WebhookUserUserCreated".equalsIgnoreCase(className)) {
      return new TypeToken<List<WebhookUserUserCreated>>(){}.getType();
    }
    
    if ("WebhookUserUserCreatedAllOf".equalsIgnoreCase(className)) {
      return new TypeToken<List<WebhookUserUserCreatedAllOf>>(){}.getType();
    }
    
    if ("WebsiteRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<WebsiteRequest>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("ActivesessionGetCurrentV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<ActivesessionGetCurrentV1Response>(){}.getType();
    }
    
    if ("ActivesessionGetCurrentV1ResponseMPayload".equalsIgnoreCase(className)) {
      return new TypeToken<ActivesessionGetCurrentV1ResponseMPayload>(){}.getType();
    }
    
    if ("AddressRequest".equalsIgnoreCase(className)) {
      return new TypeToken<AddressRequest>(){}.getType();
    }
    
    if ("ApikeyCreateObjectV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<ApikeyCreateObjectV1Request>(){}.getType();
    }
    
    if ("ApikeyCreateObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<ApikeyCreateObjectV1Response>(){}.getType();
    }
    
    if ("ApikeyCreateObjectV1ResponseMPayload".equalsIgnoreCase(className)) {
      return new TypeToken<ApikeyCreateObjectV1ResponseMPayload>(){}.getType();
    }
    
    if ("ApikeyRequest".equalsIgnoreCase(className)) {
      return new TypeToken<ApikeyRequest>(){}.getType();
    }
    
    if ("ApikeyRequestCompound".equalsIgnoreCase(className)) {
      return new TypeToken<ApikeyRequestCompound>(){}.getType();
    }
    
    if ("ApikeyResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ApikeyResponse>(){}.getType();
    }
    
    if ("AttemptResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AttemptResponse>(){}.getType();
    }
    
    if ("AuthenticateAuthenticateV2Request".equalsIgnoreCase(className)) {
      return new TypeToken<AuthenticateAuthenticateV2Request>(){}.getType();
    }
    
    if ("AuthenticateAuthenticateV2Response".equalsIgnoreCase(className)) {
      return new TypeToken<AuthenticateAuthenticateV2Response>(){}.getType();
    }
    
    if ("AuthenticateAuthenticateV2ResponseMPayload".equalsIgnoreCase(className)) {
      return new TypeToken<AuthenticateAuthenticateV2ResponseMPayload>(){}.getType();
    }
    
    if ("CommonAudit".equalsIgnoreCase(className)) {
      return new TypeToken<CommonAudit>(){}.getType();
    }
    
    if ("CommonGetAutocompleteV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<CommonGetAutocompleteV1Response>(){}.getType();
    }
    
    if ("CommonGetAutocompleteV1ResponseMPayload".equalsIgnoreCase(className)) {
      return new TypeToken<CommonGetAutocompleteV1ResponseMPayload>(){}.getType();
    }
    
    if ("CommonResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CommonResponse>(){}.getType();
    }
    
    if ("CommonResponseError".equalsIgnoreCase(className)) {
      return new TypeToken<CommonResponseError>(){}.getType();
    }
    
    if ("CommonResponseObjDebug".equalsIgnoreCase(className)) {
      return new TypeToken<CommonResponseObjDebug>(){}.getType();
    }
    
    if ("CommonResponseObjDebugPayload".equalsIgnoreCase(className)) {
      return new TypeToken<CommonResponseObjDebugPayload>(){}.getType();
    }
    
    if ("CommonResponseObjSQLQuery".equalsIgnoreCase(className)) {
      return new TypeToken<CommonResponseObjSQLQuery>(){}.getType();
    }
    
    if ("CommonWebhook".equalsIgnoreCase(className)) {
      return new TypeToken<CommonWebhook>(){}.getType();
    }
    
    if ("ContactRequest".equalsIgnoreCase(className)) {
      return new TypeToken<ContactRequest>(){}.getType();
    }
    
    if ("ContactRequestCompound".equalsIgnoreCase(className)) {
      return new TypeToken<ContactRequestCompound>(){}.getType();
    }
    
    if ("ContactRequestCompoundAllOf".equalsIgnoreCase(className)) {
      return new TypeToken<ContactRequestCompoundAllOf>(){}.getType();
    }
    
    if ("ContactinformationsRequest".equalsIgnoreCase(className)) {
      return new TypeToken<ContactinformationsRequest>(){}.getType();
    }
    
    if ("ContactinformationsRequestCompound".equalsIgnoreCase(className)) {
      return new TypeToken<ContactinformationsRequestCompound>(){}.getType();
    }
    
    if ("EmailRequest".equalsIgnoreCase(className)) {
      return new TypeToken<EmailRequest>(){}.getType();
    }
    
    if ("EzsigndocumentApplyEzsigntemplateV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<EzsigndocumentApplyEzsigntemplateV1Request>(){}.getType();
    }
    
    if ("EzsigndocumentApplyEzsigntemplateV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<EzsigndocumentApplyEzsigntemplateV1Response>(){}.getType();
    }
    
    if ("EzsigndocumentCreateObjectV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<EzsigndocumentCreateObjectV1Request>(){}.getType();
    }
    
    if ("EzsigndocumentCreateObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<EzsigndocumentCreateObjectV1Response>(){}.getType();
    }
    
    if ("EzsigndocumentCreateObjectV1ResponseMPayload".equalsIgnoreCase(className)) {
      return new TypeToken<EzsigndocumentCreateObjectV1ResponseMPayload>(){}.getType();
    }
    
    if ("EzsigndocumentDeleteObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<EzsigndocumentDeleteObjectV1Response>(){}.getType();
    }
    
    if ("EzsigndocumentGetDownloadUrlV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<EzsigndocumentGetDownloadUrlV1Response>(){}.getType();
    }
    
    if ("EzsigndocumentGetDownloadUrlV1ResponseMPayload".equalsIgnoreCase(className)) {
      return new TypeToken<EzsigndocumentGetDownloadUrlV1ResponseMPayload>(){}.getType();
    }
    
    if ("EzsigndocumentGetObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<EzsigndocumentGetObjectV1Response>(){}.getType();
    }
    
    if ("EzsigndocumentGetObjectV1ResponseMPayload".equalsIgnoreCase(className)) {
      return new TypeToken<EzsigndocumentGetObjectV1ResponseMPayload>(){}.getType();
    }
    
    if ("EzsigndocumentRequest".equalsIgnoreCase(className)) {
      return new TypeToken<EzsigndocumentRequest>(){}.getType();
    }
    
    if ("EzsigndocumentRequestCompound".equalsIgnoreCase(className)) {
      return new TypeToken<EzsigndocumentRequestCompound>(){}.getType();
    }
    
    if ("EzsigndocumentResponse".equalsIgnoreCase(className)) {
      return new TypeToken<EzsigndocumentResponse>(){}.getType();
    }
    
    if ("EzsigndocumentResponseAllOf".equalsIgnoreCase(className)) {
      return new TypeToken<EzsigndocumentResponseAllOf>(){}.getType();
    }
    
    if ("EzsigndocumentResponseCompound".equalsIgnoreCase(className)) {
      return new TypeToken<EzsigndocumentResponseCompound>(){}.getType();
    }
    
    if ("EzsignfolderCreateObjectV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<EzsignfolderCreateObjectV1Request>(){}.getType();
    }
    
    if ("EzsignfolderCreateObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<EzsignfolderCreateObjectV1Response>(){}.getType();
    }
    
    if ("EzsignfolderCreateObjectV1ResponseMPayload".equalsIgnoreCase(className)) {
      return new TypeToken<EzsignfolderCreateObjectV1ResponseMPayload>(){}.getType();
    }
    
    if ("EzsignfolderDeleteObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<EzsignfolderDeleteObjectV1Response>(){}.getType();
    }
    
    if ("EzsignfolderGetObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<EzsignfolderGetObjectV1Response>(){}.getType();
    }
    
    if ("EzsignfolderGetObjectV1ResponseMPayload".equalsIgnoreCase(className)) {
      return new TypeToken<EzsignfolderGetObjectV1ResponseMPayload>(){}.getType();
    }
    
    if ("EzsignfolderRequest".equalsIgnoreCase(className)) {
      return new TypeToken<EzsignfolderRequest>(){}.getType();
    }
    
    if ("EzsignfolderRequestCompound".equalsIgnoreCase(className)) {
      return new TypeToken<EzsignfolderRequestCompound>(){}.getType();
    }
    
    if ("EzsignfolderResponse".equalsIgnoreCase(className)) {
      return new TypeToken<EzsignfolderResponse>(){}.getType();
    }
    
    if ("EzsignfolderResponseAllOf".equalsIgnoreCase(className)) {
      return new TypeToken<EzsignfolderResponseAllOf>(){}.getType();
    }
    
    if ("EzsignfolderResponseCompound".equalsIgnoreCase(className)) {
      return new TypeToken<EzsignfolderResponseCompound>(){}.getType();
    }
    
    if ("EzsignfolderSendV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<EzsignfolderSendV1Request>(){}.getType();
    }
    
    if ("EzsignfolderSendV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<EzsignfolderSendV1Response>(){}.getType();
    }
    
    if ("EzsignfoldersignerassociationCreateObjectV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<EzsignfoldersignerassociationCreateObjectV1Request>(){}.getType();
    }
    
    if ("EzsignfoldersignerassociationCreateObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<EzsignfoldersignerassociationCreateObjectV1Response>(){}.getType();
    }
    
    if ("EzsignfoldersignerassociationCreateObjectV1ResponseMPayload".equalsIgnoreCase(className)) {
      return new TypeToken<EzsignfoldersignerassociationCreateObjectV1ResponseMPayload>(){}.getType();
    }
    
    if ("EzsignfoldersignerassociationDeleteObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<EzsignfoldersignerassociationDeleteObjectV1Response>(){}.getType();
    }
    
    if ("EzsignfoldersignerassociationGetInPersonLoginUrlV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<EzsignfoldersignerassociationGetInPersonLoginUrlV1Response>(){}.getType();
    }
    
    if ("EzsignfoldersignerassociationGetInPersonLoginUrlV1ResponseMPayload".equalsIgnoreCase(className)) {
      return new TypeToken<EzsignfoldersignerassociationGetInPersonLoginUrlV1ResponseMPayload>(){}.getType();
    }
    
    if ("EzsignfoldersignerassociationGetObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<EzsignfoldersignerassociationGetObjectV1Response>(){}.getType();
    }
    
    if ("EzsignfoldersignerassociationRequest".equalsIgnoreCase(className)) {
      return new TypeToken<EzsignfoldersignerassociationRequest>(){}.getType();
    }
    
    if ("EzsignfoldersignerassociationRequestCompound".equalsIgnoreCase(className)) {
      return new TypeToken<EzsignfoldersignerassociationRequestCompound>(){}.getType();
    }
    
    if ("EzsignsignatureCreateObjectV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<EzsignsignatureCreateObjectV1Request>(){}.getType();
    }
    
    if ("EzsignsignatureCreateObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<EzsignsignatureCreateObjectV1Response>(){}.getType();
    }
    
    if ("EzsignsignatureCreateObjectV1ResponseMPayload".equalsIgnoreCase(className)) {
      return new TypeToken<EzsignsignatureCreateObjectV1ResponseMPayload>(){}.getType();
    }
    
    if ("EzsignsignatureDeleteObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<EzsignsignatureDeleteObjectV1Response>(){}.getType();
    }
    
    if ("EzsignsignatureGetObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<EzsignsignatureGetObjectV1Response>(){}.getType();
    }
    
    if ("EzsignsignatureRequest".equalsIgnoreCase(className)) {
      return new TypeToken<EzsignsignatureRequest>(){}.getType();
    }
    
    if ("EzsignsignatureRequestCompound".equalsIgnoreCase(className)) {
      return new TypeToken<EzsignsignatureRequestCompound>(){}.getType();
    }
    
    if ("EzsignsignerRequest".equalsIgnoreCase(className)) {
      return new TypeToken<EzsignsignerRequest>(){}.getType();
    }
    
    if ("EzsignsignerRequestCompound".equalsIgnoreCase(className)) {
      return new TypeToken<EzsignsignerRequestCompound>(){}.getType();
    }
    
    if ("EzsignsignerRequestCompoundContact".equalsIgnoreCase(className)) {
      return new TypeToken<EzsignsignerRequestCompoundContact>(){}.getType();
    }
    
    if ("FieldEEzsigndocumentStep".equalsIgnoreCase(className)) {
      return new TypeToken<FieldEEzsigndocumentStep>(){}.getType();
    }
    
    if ("FieldEEzsignfolderSendreminderfrequency".equalsIgnoreCase(className)) {
      return new TypeToken<FieldEEzsignfolderSendreminderfrequency>(){}.getType();
    }
    
    if ("FieldEEzsignfolderStep".equalsIgnoreCase(className)) {
      return new TypeToken<FieldEEzsignfolderStep>(){}.getType();
    }
    
    if ("FieldEPhoneType".equalsIgnoreCase(className)) {
      return new TypeToken<FieldEPhoneType>(){}.getType();
    }
    
    if ("FieldEUserType".equalsIgnoreCase(className)) {
      return new TypeToken<FieldEUserType>(){}.getType();
    }
    
    if ("FieldEUserTypeSSPR".equalsIgnoreCase(className)) {
      return new TypeToken<FieldEUserTypeSSPR>(){}.getType();
    }
    
    if ("FranchisereferalincomeCreateObjectV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<FranchisereferalincomeCreateObjectV1Request>(){}.getType();
    }
    
    if ("FranchisereferalincomeCreateObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<FranchisereferalincomeCreateObjectV1Response>(){}.getType();
    }
    
    if ("FranchisereferalincomeCreateObjectV1ResponseMPayload".equalsIgnoreCase(className)) {
      return new TypeToken<FranchisereferalincomeCreateObjectV1ResponseMPayload>(){}.getType();
    }
    
    if ("FranchisereferalincomeRequest".equalsIgnoreCase(className)) {
      return new TypeToken<FranchisereferalincomeRequest>(){}.getType();
    }
    
    if ("FranchisereferalincomeRequestCompound".equalsIgnoreCase(className)) {
      return new TypeToken<FranchisereferalincomeRequestCompound>(){}.getType();
    }
    
    if ("GlobalCustomerGetEndpointV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<GlobalCustomerGetEndpointV1Response>(){}.getType();
    }
    
    if ("MultilingualApikeyDescription".equalsIgnoreCase(className)) {
      return new TypeToken<MultilingualApikeyDescription>(){}.getType();
    }
    
    if ("PhoneRequest".equalsIgnoreCase(className)) {
      return new TypeToken<PhoneRequest>(){}.getType();
    }
    
    if ("SsprResetPasswordRequestV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<SsprResetPasswordRequestV1Request>(){}.getType();
    }
    
    if ("SsprResetPasswordV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<SsprResetPasswordV1Request>(){}.getType();
    }
    
    if ("SsprSendUsernamesV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<SsprSendUsernamesV1Request>(){}.getType();
    }
    
    if ("SsprUnlockAccountRequestV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<SsprUnlockAccountRequestV1Request>(){}.getType();
    }
    
    if ("SsprUnlockAccountV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<SsprUnlockAccountV1Request>(){}.getType();
    }
    
    if ("SsprValidateTokenV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<SsprValidateTokenV1Request>(){}.getType();
    }
    
    if ("UNUSEDEzsigndocumentEditObjectV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<UNUSEDEzsigndocumentEditObjectV1Request>(){}.getType();
    }
    
    if ("UNUSEDEzsigndocumentEditObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<UNUSEDEzsigndocumentEditObjectV1Response>(){}.getType();
    }
    
    if ("UNUSEDEzsignfolderEditObjectV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<UNUSEDEzsignfolderEditObjectV1Request>(){}.getType();
    }
    
    if ("UNUSEDEzsignfolderEditObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<UNUSEDEzsignfolderEditObjectV1Response>(){}.getType();
    }
    
    if ("UNUSEDEzsignfoldersignerassociationEditObjectV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<UNUSEDEzsignfoldersignerassociationEditObjectV1Request>(){}.getType();
    }
    
    if ("UNUSEDEzsignfoldersignerassociationEditObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<UNUSEDEzsignfoldersignerassociationEditObjectV1Response>(){}.getType();
    }
    
    if ("UNUSEDEzsignsignatureEditObjectV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<UNUSEDEzsignsignatureEditObjectV1Request>(){}.getType();
    }
    
    if ("UNUSEDEzsignsignatureEditObjectV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<UNUSEDEzsignsignatureEditObjectV1Response>(){}.getType();
    }
    
    if ("UserCreateEzsignuserV1Request".equalsIgnoreCase(className)) {
      return new TypeToken<UserCreateEzsignuserV1Request>(){}.getType();
    }
    
    if ("UserCreateEzsignuserV1Response".equalsIgnoreCase(className)) {
      return new TypeToken<UserCreateEzsignuserV1Response>(){}.getType();
    }
    
    if ("UserCreateEzsignuserV1ResponseMPayload".equalsIgnoreCase(className)) {
      return new TypeToken<UserCreateEzsignuserV1ResponseMPayload>(){}.getType();
    }
    
    if ("UserResponse".equalsIgnoreCase(className)) {
      return new TypeToken<UserResponse>(){}.getType();
    }
    
    if ("UserResponseAllOf".equalsIgnoreCase(className)) {
      return new TypeToken<UserResponseAllOf>(){}.getType();
    }
    
    if ("WebhookEzsignDocumentCompleted".equalsIgnoreCase(className)) {
      return new TypeToken<WebhookEzsignDocumentCompleted>(){}.getType();
    }
    
    if ("WebhookEzsignDocumentCompletedAllOf".equalsIgnoreCase(className)) {
      return new TypeToken<WebhookEzsignDocumentCompletedAllOf>(){}.getType();
    }
    
    if ("WebhookEzsignFolderCompleted".equalsIgnoreCase(className)) {
      return new TypeToken<WebhookEzsignFolderCompleted>(){}.getType();
    }
    
    if ("WebhookEzsignFolderCompletedAllOf".equalsIgnoreCase(className)) {
      return new TypeToken<WebhookEzsignFolderCompletedAllOf>(){}.getType();
    }
    
    if ("WebhookResponse".equalsIgnoreCase(className)) {
      return new TypeToken<WebhookResponse>(){}.getType();
    }
    
    if ("WebhookUserUserCreated".equalsIgnoreCase(className)) {
      return new TypeToken<WebhookUserUserCreated>(){}.getType();
    }
    
    if ("WebhookUserUserCreatedAllOf".equalsIgnoreCase(className)) {
      return new TypeToken<WebhookUserUserCreatedAllOf>(){}.getType();
    }
    
    if ("WebsiteRequest".equalsIgnoreCase(className)) {
      return new TypeToken<WebsiteRequest>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
