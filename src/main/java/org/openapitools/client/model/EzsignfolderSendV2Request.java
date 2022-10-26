/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.12
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.CustomEzsignfoldersignerassociationmessageRequest;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /2/object/ezsignfolder/{pkiEzsignfolderID}/send
 **/
@ApiModel(description = "Request for POST /2/object/ezsignfolder/{pkiEzsignfolderID}/send")
public class EzsignfolderSendV2Request {
  
  @SerializedName("tEzsignfolderMessage")
  private String tEzsignfolderMessage = null;
  @SerializedName("a_fkiEzsignfoldersignerassociationID")
  private List<Integer> aFkiEzsignfoldersignerassociationID = null;
  @SerializedName("a_objEzsignfoldersignerassociationmessage")
  private List<CustomEzsignfoldersignerassociationmessageRequest> aObjEzsignfoldersignerassociationmessage = null;

  /**
   * A custom text message that will be added to the email sent.
   **/
  @ApiModelProperty(required = true, value = "A custom text message that will be added to the email sent.")
  public String getTEzsignfolderMessage() {
    return tEzsignfolderMessage;
  }
  public void setTEzsignfolderMessage(String tEzsignfolderMessage) {
    this.tEzsignfolderMessage = tEzsignfolderMessage;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<Integer> getAFkiEzsignfoldersignerassociationID() {
    return aFkiEzsignfoldersignerassociationID;
  }
  public void setAFkiEzsignfoldersignerassociationID(List<Integer> aFkiEzsignfoldersignerassociationID) {
    this.aFkiEzsignfoldersignerassociationID = aFkiEzsignfoldersignerassociationID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CustomEzsignfoldersignerassociationmessageRequest> getAObjEzsignfoldersignerassociationmessage() {
    return aObjEzsignfoldersignerassociationmessage;
  }
  public void setAObjEzsignfoldersignerassociationmessage(List<CustomEzsignfoldersignerassociationmessageRequest> aObjEzsignfoldersignerassociationmessage) {
    this.aObjEzsignfoldersignerassociationmessage = aObjEzsignfoldersignerassociationmessage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfolderSendV2Request ezsignfolderSendV2Request = (EzsignfolderSendV2Request) o;
    return (this.tEzsignfolderMessage == null ? ezsignfolderSendV2Request.tEzsignfolderMessage == null : this.tEzsignfolderMessage.equals(ezsignfolderSendV2Request.tEzsignfolderMessage)) &&
        (this.aFkiEzsignfoldersignerassociationID == null ? ezsignfolderSendV2Request.aFkiEzsignfoldersignerassociationID == null : this.aFkiEzsignfoldersignerassociationID.equals(ezsignfolderSendV2Request.aFkiEzsignfoldersignerassociationID)) &&
        (this.aObjEzsignfoldersignerassociationmessage == null ? ezsignfolderSendV2Request.aObjEzsignfoldersignerassociationmessage == null : this.aObjEzsignfoldersignerassociationmessage.equals(ezsignfolderSendV2Request.aObjEzsignfoldersignerassociationmessage));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.tEzsignfolderMessage == null ? 0: this.tEzsignfolderMessage.hashCode());
    result = 31 * result + (this.aFkiEzsignfoldersignerassociationID == null ? 0: this.aFkiEzsignfoldersignerassociationID.hashCode());
    result = 31 * result + (this.aObjEzsignfoldersignerassociationmessage == null ? 0: this.aObjEzsignfoldersignerassociationmessage.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfolderSendV2Request {\n");
    
    sb.append("  tEzsignfolderMessage: ").append(tEzsignfolderMessage).append("\n");
    sb.append("  aFkiEzsignfoldersignerassociationID: ").append(aFkiEzsignfoldersignerassociationID).append("\n");
    sb.append("  aObjEzsignfoldersignerassociationmessage: ").append(aObjEzsignfoldersignerassociationmessage).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
