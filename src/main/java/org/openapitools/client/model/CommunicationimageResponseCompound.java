/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.17
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
 * A Communicationimage Object
 **/
@ApiModel(description = "A Communicationimage Object")
public class CommunicationimageResponseCompound {
  
  @SerializedName("pkiCommunicationimageID")
  private Integer pkiCommunicationimageID = null;
  @SerializedName("fkiImageID")
  private Integer fkiImageID = null;
  @SerializedName("sCommunicationimageName")
  private String sCommunicationimageName = null;

  /**
   * The unique ID of the Communicationimage
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Communicationimage")
  public Integer getPkiCommunicationimageID() {
    return pkiCommunicationimageID;
  }
  public void setPkiCommunicationimageID(Integer pkiCommunicationimageID) {
    this.pkiCommunicationimageID = pkiCommunicationimageID;
  }

  /**
   * The unique ID of the Image
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Image")
  public Integer getFkiImageID() {
    return fkiImageID;
  }
  public void setFkiImageID(Integer fkiImageID) {
    this.fkiImageID = fkiImageID;
  }

  /**
   * The Name of the Communicationimage
   **/
  @ApiModelProperty(value = "The Name of the Communicationimage")
  public String getSCommunicationimageName() {
    return sCommunicationimageName;
  }
  public void setSCommunicationimageName(String sCommunicationimageName) {
    this.sCommunicationimageName = sCommunicationimageName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommunicationimageResponseCompound communicationimageResponseCompound = (CommunicationimageResponseCompound) o;
    return (this.pkiCommunicationimageID == null ? communicationimageResponseCompound.pkiCommunicationimageID == null : this.pkiCommunicationimageID.equals(communicationimageResponseCompound.pkiCommunicationimageID)) &&
        (this.fkiImageID == null ? communicationimageResponseCompound.fkiImageID == null : this.fkiImageID.equals(communicationimageResponseCompound.fkiImageID)) &&
        (this.sCommunicationimageName == null ? communicationimageResponseCompound.sCommunicationimageName == null : this.sCommunicationimageName.equals(communicationimageResponseCompound.sCommunicationimageName));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiCommunicationimageID == null ? 0: this.pkiCommunicationimageID.hashCode());
    result = 31 * result + (this.fkiImageID == null ? 0: this.fkiImageID.hashCode());
    result = 31 * result + (this.sCommunicationimageName == null ? 0: this.sCommunicationimageName.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommunicationimageResponseCompound {\n");
    
    sb.append("  pkiCommunicationimageID: ").append(pkiCommunicationimageID).append("\n");
    sb.append("  fkiImageID: ").append(fkiImageID).append("\n");
    sb.append("  sCommunicationimageName: ").append(sCommunicationimageName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
