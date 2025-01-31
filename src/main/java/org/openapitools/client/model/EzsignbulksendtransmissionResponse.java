/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.1
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.CommonAudit;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsignbulksendtransmission Object
 **/
@ApiModel(description = "An Ezsignbulksendtransmission Object")
public class EzsignbulksendtransmissionResponse {
  
  @SerializedName("pkiEzsignbulksendtransmissionID")
  private Integer pkiEzsignbulksendtransmissionID = null;
  @SerializedName("fkiEzsignbulksendID")
  private Integer fkiEzsignbulksendID = null;
  @SerializedName("sEzsignbulksendtransmissionDescription")
  private String sEzsignbulksendtransmissionDescription = null;
  @SerializedName("iEzsignbulksendtransmissionErrors")
  private Integer iEzsignbulksendtransmissionErrors = null;
  @SerializedName("objAudit")
  private CommonAudit objAudit = null;

  /**
   * The unique ID of the Ezsignbulksendtransmission
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignbulksendtransmission")
  public Integer getPkiEzsignbulksendtransmissionID() {
    return pkiEzsignbulksendtransmissionID;
  }
  public void setPkiEzsignbulksendtransmissionID(Integer pkiEzsignbulksendtransmissionID) {
    this.pkiEzsignbulksendtransmissionID = pkiEzsignbulksendtransmissionID;
  }

  /**
   * The unique ID of the Ezsignbulksend
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignbulksend")
  public Integer getFkiEzsignbulksendID() {
    return fkiEzsignbulksendID;
  }
  public void setFkiEzsignbulksendID(Integer fkiEzsignbulksendID) {
    this.fkiEzsignbulksendID = fkiEzsignbulksendID;
  }

  /**
   * The description of the Ezsignbulksendtransmission
   **/
  @ApiModelProperty(required = true, value = "The description of the Ezsignbulksendtransmission")
  public String getSEzsignbulksendtransmissionDescription() {
    return sEzsignbulksendtransmissionDescription;
  }
  public void setSEzsignbulksendtransmissionDescription(String sEzsignbulksendtransmissionDescription) {
    this.sEzsignbulksendtransmissionDescription = sEzsignbulksendtransmissionDescription;
  }

  /**
   * The number of errors during the Ezsignbulksendtransmission
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The number of errors during the Ezsignbulksendtransmission")
  public Integer getIEzsignbulksendtransmissionErrors() {
    return iEzsignbulksendtransmissionErrors;
  }
  public void setIEzsignbulksendtransmissionErrors(Integer iEzsignbulksendtransmissionErrors) {
    this.iEzsignbulksendtransmissionErrors = iEzsignbulksendtransmissionErrors;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CommonAudit getObjAudit() {
    return objAudit;
  }
  public void setObjAudit(CommonAudit objAudit) {
    this.objAudit = objAudit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignbulksendtransmissionResponse ezsignbulksendtransmissionResponse = (EzsignbulksendtransmissionResponse) o;
    return (this.pkiEzsignbulksendtransmissionID == null ? ezsignbulksendtransmissionResponse.pkiEzsignbulksendtransmissionID == null : this.pkiEzsignbulksendtransmissionID.equals(ezsignbulksendtransmissionResponse.pkiEzsignbulksendtransmissionID)) &&
        (this.fkiEzsignbulksendID == null ? ezsignbulksendtransmissionResponse.fkiEzsignbulksendID == null : this.fkiEzsignbulksendID.equals(ezsignbulksendtransmissionResponse.fkiEzsignbulksendID)) &&
        (this.sEzsignbulksendtransmissionDescription == null ? ezsignbulksendtransmissionResponse.sEzsignbulksendtransmissionDescription == null : this.sEzsignbulksendtransmissionDescription.equals(ezsignbulksendtransmissionResponse.sEzsignbulksendtransmissionDescription)) &&
        (this.iEzsignbulksendtransmissionErrors == null ? ezsignbulksendtransmissionResponse.iEzsignbulksendtransmissionErrors == null : this.iEzsignbulksendtransmissionErrors.equals(ezsignbulksendtransmissionResponse.iEzsignbulksendtransmissionErrors)) &&
        (this.objAudit == null ? ezsignbulksendtransmissionResponse.objAudit == null : this.objAudit.equals(ezsignbulksendtransmissionResponse.objAudit));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignbulksendtransmissionID == null ? 0: this.pkiEzsignbulksendtransmissionID.hashCode());
    result = 31 * result + (this.fkiEzsignbulksendID == null ? 0: this.fkiEzsignbulksendID.hashCode());
    result = 31 * result + (this.sEzsignbulksendtransmissionDescription == null ? 0: this.sEzsignbulksendtransmissionDescription.hashCode());
    result = 31 * result + (this.iEzsignbulksendtransmissionErrors == null ? 0: this.iEzsignbulksendtransmissionErrors.hashCode());
    result = 31 * result + (this.objAudit == null ? 0: this.objAudit.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignbulksendtransmissionResponse {\n");
    
    sb.append("  pkiEzsignbulksendtransmissionID: ").append(pkiEzsignbulksendtransmissionID).append("\n");
    sb.append("  fkiEzsignbulksendID: ").append(fkiEzsignbulksendID).append("\n");
    sb.append("  sEzsignbulksendtransmissionDescription: ").append(sEzsignbulksendtransmissionDescription).append("\n");
    sb.append("  iEzsignbulksendtransmissionErrors: ").append(iEzsignbulksendtransmissionErrors).append("\n");
    sb.append("  objAudit: ").append(objAudit).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
