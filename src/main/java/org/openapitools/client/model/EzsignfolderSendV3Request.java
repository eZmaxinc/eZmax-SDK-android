/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.2
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.FieldEEzsignfolderMessageorder;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /3/object/ezsignfolder/{pkiEzsignfolderID}/send
 **/
@ApiModel(description = "Request for POST /3/object/ezsignfolder/{pkiEzsignfolderID}/send")
public class EzsignfolderSendV3Request {
  
  @SerializedName("tEzsignfolderMessage")
  private String tEzsignfolderMessage = null;
  @SerializedName("eEzsignfolderMessageorder")
  private FieldEEzsignfolderMessageorder eEzsignfolderMessageorder = null;
  @SerializedName("dtEzsignfolderDelayedsenddate")
  private String dtEzsignfolderDelayedsenddate = null;
  @SerializedName("a_fkiEzsignfoldersignerassociationID")
  private List<Integer> aFkiEzsignfoldersignerassociationID = null;

  /**
   * A custom text message that will be added to the email sent.
   **/
  @ApiModelProperty(value = "A custom text message that will be added to the email sent.")
  public String getTEzsignfolderMessage() {
    return tEzsignfolderMessage;
  }
  public void setTEzsignfolderMessage(String tEzsignfolderMessage) {
    this.tEzsignfolderMessage = tEzsignfolderMessage;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEEzsignfolderMessageorder getEEzsignfolderMessageorder() {
    return eEzsignfolderMessageorder;
  }
  public void setEEzsignfolderMessageorder(FieldEEzsignfolderMessageorder eEzsignfolderMessageorder) {
    this.eEzsignfolderMessageorder = eEzsignfolderMessageorder;
  }

  /**
   * The date and time at which the Ezsignfolder will be sent in the future.
   **/
  @ApiModelProperty(value = "The date and time at which the Ezsignfolder will be sent in the future.")
  public String getDtEzsignfolderDelayedsenddate() {
    return dtEzsignfolderDelayedsenddate;
  }
  public void setDtEzsignfolderDelayedsenddate(String dtEzsignfolderDelayedsenddate) {
    this.dtEzsignfolderDelayedsenddate = dtEzsignfolderDelayedsenddate;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfolderSendV3Request ezsignfolderSendV3Request = (EzsignfolderSendV3Request) o;
    return (this.tEzsignfolderMessage == null ? ezsignfolderSendV3Request.tEzsignfolderMessage == null : this.tEzsignfolderMessage.equals(ezsignfolderSendV3Request.tEzsignfolderMessage)) &&
        (this.eEzsignfolderMessageorder == null ? ezsignfolderSendV3Request.eEzsignfolderMessageorder == null : this.eEzsignfolderMessageorder.equals(ezsignfolderSendV3Request.eEzsignfolderMessageorder)) &&
        (this.dtEzsignfolderDelayedsenddate == null ? ezsignfolderSendV3Request.dtEzsignfolderDelayedsenddate == null : this.dtEzsignfolderDelayedsenddate.equals(ezsignfolderSendV3Request.dtEzsignfolderDelayedsenddate)) &&
        (this.aFkiEzsignfoldersignerassociationID == null ? ezsignfolderSendV3Request.aFkiEzsignfoldersignerassociationID == null : this.aFkiEzsignfoldersignerassociationID.equals(ezsignfolderSendV3Request.aFkiEzsignfoldersignerassociationID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.tEzsignfolderMessage == null ? 0: this.tEzsignfolderMessage.hashCode());
    result = 31 * result + (this.eEzsignfolderMessageorder == null ? 0: this.eEzsignfolderMessageorder.hashCode());
    result = 31 * result + (this.dtEzsignfolderDelayedsenddate == null ? 0: this.dtEzsignfolderDelayedsenddate.hashCode());
    result = 31 * result + (this.aFkiEzsignfoldersignerassociationID == null ? 0: this.aFkiEzsignfoldersignerassociationID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfolderSendV3Request {\n");
    
    sb.append("  tEzsignfolderMessage: ").append(tEzsignfolderMessage).append("\n");
    sb.append("  eEzsignfolderMessageorder: ").append(eEzsignfolderMessageorder).append("\n");
    sb.append("  dtEzsignfolderDelayedsenddate: ").append(dtEzsignfolderDelayedsenddate).append("\n");
    sb.append("  aFkiEzsignfoldersignerassociationID: ").append(aFkiEzsignfoldersignerassociationID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
