/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.16
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A custom message Object in the context of an Ezsignfolder&#39;s send function
 **/
@ApiModel(description = "A custom message Object in the context of an Ezsignfolder's send function")
public class CustomEzsignfoldersignerassociationmessageRequest {
  
  @SerializedName("fkiEzsignfoldersignerassociationID")
  private Integer fkiEzsignfoldersignerassociationID = null;
  @SerializedName("tEzsignfoldersignerassociationMessage")
  private String tEzsignfoldersignerassociationMessage = null;

  /**
   * The unique ID of the Ezsignfoldersignerassociation
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignfoldersignerassociation")
  public Integer getFkiEzsignfoldersignerassociationID() {
    return fkiEzsignfoldersignerassociationID;
  }
  public void setFkiEzsignfoldersignerassociationID(Integer fkiEzsignfoldersignerassociationID) {
    this.fkiEzsignfoldersignerassociationID = fkiEzsignfoldersignerassociationID;
  }

  /**
   * A custom text message that will be added to the email sent.
   **/
  @ApiModelProperty(value = "A custom text message that will be added to the email sent.")
  public String getTEzsignfoldersignerassociationMessage() {
    return tEzsignfoldersignerassociationMessage;
  }
  public void setTEzsignfoldersignerassociationMessage(String tEzsignfoldersignerassociationMessage) {
    this.tEzsignfoldersignerassociationMessage = tEzsignfoldersignerassociationMessage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomEzsignfoldersignerassociationmessageRequest customEzsignfoldersignerassociationmessageRequest = (CustomEzsignfoldersignerassociationmessageRequest) o;
    return (this.fkiEzsignfoldersignerassociationID == null ? customEzsignfoldersignerassociationmessageRequest.fkiEzsignfoldersignerassociationID == null : this.fkiEzsignfoldersignerassociationID.equals(customEzsignfoldersignerassociationmessageRequest.fkiEzsignfoldersignerassociationID)) &&
        (this.tEzsignfoldersignerassociationMessage == null ? customEzsignfoldersignerassociationmessageRequest.tEzsignfoldersignerassociationMessage == null : this.tEzsignfoldersignerassociationMessage.equals(customEzsignfoldersignerassociationmessageRequest.tEzsignfoldersignerassociationMessage));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fkiEzsignfoldersignerassociationID == null ? 0: this.fkiEzsignfoldersignerassociationID.hashCode());
    result = 31 * result + (this.tEzsignfoldersignerassociationMessage == null ? 0: this.tEzsignfoldersignerassociationMessage.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomEzsignfoldersignerassociationmessageRequest {\n");
    
    sb.append("  fkiEzsignfoldersignerassociationID: ").append(fkiEzsignfoldersignerassociationID).append("\n");
    sb.append("  tEzsignfoldersignerassociationMessage: ").append(tEzsignfoldersignerassociationMessage).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
