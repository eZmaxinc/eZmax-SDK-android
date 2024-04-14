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

import org.openapitools.client.model.CommonFile;
import org.openapitools.client.model.CommunicationattachmentRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Custom Communicationattachment Object
 **/
@ApiModel(description = "A Custom Communicationattachment Object")
public class CustomCommunicationattachmentRequest {
  
  @SerializedName("objCommunicationattachment")
  private CommunicationattachmentRequestCompound objCommunicationattachment = null;
  @SerializedName("objCommunicationexternalattachment")
  private CommonFile objCommunicationexternalattachment = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public CommunicationattachmentRequestCompound getObjCommunicationattachment() {
    return objCommunicationattachment;
  }
  public void setObjCommunicationattachment(CommunicationattachmentRequestCompound objCommunicationattachment) {
    this.objCommunicationattachment = objCommunicationattachment;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CommonFile getObjCommunicationexternalattachment() {
    return objCommunicationexternalattachment;
  }
  public void setObjCommunicationexternalattachment(CommonFile objCommunicationexternalattachment) {
    this.objCommunicationexternalattachment = objCommunicationexternalattachment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomCommunicationattachmentRequest customCommunicationattachmentRequest = (CustomCommunicationattachmentRequest) o;
    return (this.objCommunicationattachment == null ? customCommunicationattachmentRequest.objCommunicationattachment == null : this.objCommunicationattachment.equals(customCommunicationattachmentRequest.objCommunicationattachment)) &&
        (this.objCommunicationexternalattachment == null ? customCommunicationattachmentRequest.objCommunicationexternalattachment == null : this.objCommunicationexternalattachment.equals(customCommunicationattachmentRequest.objCommunicationexternalattachment));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objCommunicationattachment == null ? 0: this.objCommunicationattachment.hashCode());
    result = 31 * result + (this.objCommunicationexternalattachment == null ? 0: this.objCommunicationexternalattachment.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomCommunicationattachmentRequest {\n");
    
    sb.append("  objCommunicationattachment: ").append(objCommunicationattachment).append("\n");
    sb.append("  objCommunicationexternalattachment: ").append(objCommunicationexternalattachment).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
