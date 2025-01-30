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
import org.openapitools.client.model.CustomEzsigndocumentRequest;
import org.openapitools.client.model.FieldEEzsignfolderDocumentdependency;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /2/object/ezsignfolder/{pkiEzsignfolderID}/reorder
 **/
@ApiModel(description = "Request for POST /2/object/ezsignfolder/{pkiEzsignfolderID}/reorder")
public class EzsignfolderReorderV2Request {
  
  @SerializedName("eEzsignfolderDocumentdependency")
  private FieldEEzsignfolderDocumentdependency eEzsignfolderDocumentdependency = null;
  @SerializedName("a_objEzsigndocument")
  private List<CustomEzsigndocumentRequest> aObjEzsigndocument = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEEzsignfolderDocumentdependency getEEzsignfolderDocumentdependency() {
    return eEzsignfolderDocumentdependency;
  }
  public void setEEzsignfolderDocumentdependency(FieldEEzsignfolderDocumentdependency eEzsignfolderDocumentdependency) {
    this.eEzsignfolderDocumentdependency = eEzsignfolderDocumentdependency;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CustomEzsigndocumentRequest> getAObjEzsigndocument() {
    return aObjEzsigndocument;
  }
  public void setAObjEzsigndocument(List<CustomEzsigndocumentRequest> aObjEzsigndocument) {
    this.aObjEzsigndocument = aObjEzsigndocument;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfolderReorderV2Request ezsignfolderReorderV2Request = (EzsignfolderReorderV2Request) o;
    return (this.eEzsignfolderDocumentdependency == null ? ezsignfolderReorderV2Request.eEzsignfolderDocumentdependency == null : this.eEzsignfolderDocumentdependency.equals(ezsignfolderReorderV2Request.eEzsignfolderDocumentdependency)) &&
        (this.aObjEzsigndocument == null ? ezsignfolderReorderV2Request.aObjEzsigndocument == null : this.aObjEzsigndocument.equals(ezsignfolderReorderV2Request.aObjEzsigndocument));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.eEzsignfolderDocumentdependency == null ? 0: this.eEzsignfolderDocumentdependency.hashCode());
    result = 31 * result + (this.aObjEzsigndocument == null ? 0: this.aObjEzsigndocument.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfolderReorderV2Request {\n");
    
    sb.append("  eEzsignfolderDocumentdependency: ").append(eEzsignfolderDocumentdependency).append("\n");
    sb.append("  aObjEzsigndocument: ").append(aObjEzsigndocument).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
