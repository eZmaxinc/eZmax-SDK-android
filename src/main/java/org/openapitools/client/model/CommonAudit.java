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

import org.openapitools.client.model.CommonAuditdetail;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Gives informations about the user that created the object and the last user to have modified it.  If the object was never modified after creation, objAuditdetailModified won&#39;t be returned. 
 **/
@ApiModel(description = "Gives informations about the user that created the object and the last user to have modified it.  If the object was never modified after creation, objAuditdetailModified won't be returned. ")
public class CommonAudit {
  
  @SerializedName("objAuditdetailCreated")
  private CommonAuditdetail objAuditdetailCreated = null;
  @SerializedName("objAuditdetailModified")
  private CommonAuditdetail objAuditdetailModified = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CommonAuditdetail getObjAuditdetailCreated() {
    return objAuditdetailCreated;
  }
  public void setObjAuditdetailCreated(CommonAuditdetail objAuditdetailCreated) {
    this.objAuditdetailCreated = objAuditdetailCreated;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CommonAuditdetail getObjAuditdetailModified() {
    return objAuditdetailModified;
  }
  public void setObjAuditdetailModified(CommonAuditdetail objAuditdetailModified) {
    this.objAuditdetailModified = objAuditdetailModified;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonAudit commonAudit = (CommonAudit) o;
    return (this.objAuditdetailCreated == null ? commonAudit.objAuditdetailCreated == null : this.objAuditdetailCreated.equals(commonAudit.objAuditdetailCreated)) &&
        (this.objAuditdetailModified == null ? commonAudit.objAuditdetailModified == null : this.objAuditdetailModified.equals(commonAudit.objAuditdetailModified));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objAuditdetailCreated == null ? 0: this.objAuditdetailCreated.hashCode());
    result = 31 * result + (this.objAuditdetailModified == null ? 0: this.objAuditdetailModified.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonAudit {\n");
    
    sb.append("  objAuditdetailCreated: ").append(objAuditdetailCreated).append("\n");
    sb.append("  objAuditdetailModified: ").append(objAuditdetailModified).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
