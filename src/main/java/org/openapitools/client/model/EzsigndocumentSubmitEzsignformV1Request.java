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

import java.util.*;
import org.openapitools.client.model.CustomEzsignformfieldgroupRequest;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/ezsigndocument/{pkiEzsigndocumentID}/submitEzsignform
 **/
@ApiModel(description = "Request for POST /1/object/ezsigndocument/{pkiEzsigndocumentID}/submitEzsignform")
public class EzsigndocumentSubmitEzsignformV1Request {
  
  @SerializedName("bEzsignformIsdraft")
  private Boolean bEzsignformIsdraft = null;
  @SerializedName("a_objEzsignformfieldgroup")
  private List<CustomEzsignformfieldgroupRequest> aObjEzsignformfieldgroup = null;

  /**
   * Whether the Ezsignform submitted is a draft or not.
   **/
  @ApiModelProperty(required = true, value = "Whether the Ezsignform submitted is a draft or not.")
  public Boolean getBEzsignformIsdraft() {
    return bEzsignformIsdraft;
  }
  public void setBEzsignformIsdraft(Boolean bEzsignformIsdraft) {
    this.bEzsignformIsdraft = bEzsignformIsdraft;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CustomEzsignformfieldgroupRequest> getAObjEzsignformfieldgroup() {
    return aObjEzsignformfieldgroup;
  }
  public void setAObjEzsignformfieldgroup(List<CustomEzsignformfieldgroupRequest> aObjEzsignformfieldgroup) {
    this.aObjEzsignformfieldgroup = aObjEzsignformfieldgroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndocumentSubmitEzsignformV1Request ezsigndocumentSubmitEzsignformV1Request = (EzsigndocumentSubmitEzsignformV1Request) o;
    return (this.bEzsignformIsdraft == null ? ezsigndocumentSubmitEzsignformV1Request.bEzsignformIsdraft == null : this.bEzsignformIsdraft.equals(ezsigndocumentSubmitEzsignformV1Request.bEzsignformIsdraft)) &&
        (this.aObjEzsignformfieldgroup == null ? ezsigndocumentSubmitEzsignformV1Request.aObjEzsignformfieldgroup == null : this.aObjEzsignformfieldgroup.equals(ezsigndocumentSubmitEzsignformV1Request.aObjEzsignformfieldgroup));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.bEzsignformIsdraft == null ? 0: this.bEzsignformIsdraft.hashCode());
    result = 31 * result + (this.aObjEzsignformfieldgroup == null ? 0: this.aObjEzsignformfieldgroup.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentSubmitEzsignformV1Request {\n");
    
    sb.append("  bEzsignformIsdraft: ").append(bEzsignformIsdraft).append("\n");
    sb.append("  aObjEzsignformfieldgroup: ").append(aObjEzsignformfieldgroup).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
