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
import org.openapitools.client.model.CustomEzsignformfieldgroupCreateEzsignelementsPositionedByWordRequest;
import org.openapitools.client.model.CustomEzsignsignatureCreateEzsignelementsPositionedByWordRequest;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/ezsigndocument/{pkiEzsigndocumentID}/createEzsignelementsPositionedByWord
 **/
@ApiModel(description = "Request for POST /1/object/ezsigndocument/{pkiEzsigndocumentID}/createEzsignelementsPositionedByWord")
public class EzsigndocumentCreateEzsignelementsPositionedByWordV1Request {
  
  @SerializedName("a_objEzsignformfieldgroup")
  private List<CustomEzsignformfieldgroupCreateEzsignelementsPositionedByWordRequest> aObjEzsignformfieldgroup = null;
  @SerializedName("a_objEzsignsignature")
  private List<CustomEzsignsignatureCreateEzsignelementsPositionedByWordRequest> aObjEzsignsignature = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CustomEzsignformfieldgroupCreateEzsignelementsPositionedByWordRequest> getAObjEzsignformfieldgroup() {
    return aObjEzsignformfieldgroup;
  }
  public void setAObjEzsignformfieldgroup(List<CustomEzsignformfieldgroupCreateEzsignelementsPositionedByWordRequest> aObjEzsignformfieldgroup) {
    this.aObjEzsignformfieldgroup = aObjEzsignformfieldgroup;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CustomEzsignsignatureCreateEzsignelementsPositionedByWordRequest> getAObjEzsignsignature() {
    return aObjEzsignsignature;
  }
  public void setAObjEzsignsignature(List<CustomEzsignsignatureCreateEzsignelementsPositionedByWordRequest> aObjEzsignsignature) {
    this.aObjEzsignsignature = aObjEzsignsignature;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndocumentCreateEzsignelementsPositionedByWordV1Request ezsigndocumentCreateEzsignelementsPositionedByWordV1Request = (EzsigndocumentCreateEzsignelementsPositionedByWordV1Request) o;
    return (this.aObjEzsignformfieldgroup == null ? ezsigndocumentCreateEzsignelementsPositionedByWordV1Request.aObjEzsignformfieldgroup == null : this.aObjEzsignformfieldgroup.equals(ezsigndocumentCreateEzsignelementsPositionedByWordV1Request.aObjEzsignformfieldgroup)) &&
        (this.aObjEzsignsignature == null ? ezsigndocumentCreateEzsignelementsPositionedByWordV1Request.aObjEzsignsignature == null : this.aObjEzsignsignature.equals(ezsigndocumentCreateEzsignelementsPositionedByWordV1Request.aObjEzsignsignature));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsignformfieldgroup == null ? 0: this.aObjEzsignformfieldgroup.hashCode());
    result = 31 * result + (this.aObjEzsignsignature == null ? 0: this.aObjEzsignsignature.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentCreateEzsignelementsPositionedByWordV1Request {\n");
    
    sb.append("  aObjEzsignformfieldgroup: ").append(aObjEzsignformfieldgroup).append("\n");
    sb.append("  aObjEzsignsignature: ").append(aObjEzsignsignature).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
