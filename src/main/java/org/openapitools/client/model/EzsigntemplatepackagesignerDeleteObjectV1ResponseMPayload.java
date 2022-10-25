/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.11
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
 * Payload for DELETE /1/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID}
 **/
@ApiModel(description = "Payload for DELETE /1/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID}")
public class EzsigntemplatepackagesignerDeleteObjectV1ResponseMPayload {
  
  @SerializedName("bEzsigntemplatepackageNeedvalidation")
  private Boolean bEzsigntemplatepackageNeedvalidation = null;
  @SerializedName("bEzsignbulksendNeedvalidation")
  private Boolean bEzsignbulksendNeedvalidation = null;

  /**
   * Whether the Ezsignbulksend was automatically modified and needs a manual validation
   **/
  @ApiModelProperty(required = true, value = "Whether the Ezsignbulksend was automatically modified and needs a manual validation")
  public Boolean getBEzsigntemplatepackageNeedvalidation() {
    return bEzsigntemplatepackageNeedvalidation;
  }
  public void setBEzsigntemplatepackageNeedvalidation(Boolean bEzsigntemplatepackageNeedvalidation) {
    this.bEzsigntemplatepackageNeedvalidation = bEzsigntemplatepackageNeedvalidation;
  }

  /**
   * Whether the Ezsigntemplatepackage was automatically modified and needs a manual validation
   **/
  @ApiModelProperty(required = true, value = "Whether the Ezsigntemplatepackage was automatically modified and needs a manual validation")
  public Boolean getBEzsignbulksendNeedvalidation() {
    return bEzsignbulksendNeedvalidation;
  }
  public void setBEzsignbulksendNeedvalidation(Boolean bEzsignbulksendNeedvalidation) {
    this.bEzsignbulksendNeedvalidation = bEzsignbulksendNeedvalidation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatepackagesignerDeleteObjectV1ResponseMPayload ezsigntemplatepackagesignerDeleteObjectV1ResponseMPayload = (EzsigntemplatepackagesignerDeleteObjectV1ResponseMPayload) o;
    return (this.bEzsigntemplatepackageNeedvalidation == null ? ezsigntemplatepackagesignerDeleteObjectV1ResponseMPayload.bEzsigntemplatepackageNeedvalidation == null : this.bEzsigntemplatepackageNeedvalidation.equals(ezsigntemplatepackagesignerDeleteObjectV1ResponseMPayload.bEzsigntemplatepackageNeedvalidation)) &&
        (this.bEzsignbulksendNeedvalidation == null ? ezsigntemplatepackagesignerDeleteObjectV1ResponseMPayload.bEzsignbulksendNeedvalidation == null : this.bEzsignbulksendNeedvalidation.equals(ezsigntemplatepackagesignerDeleteObjectV1ResponseMPayload.bEzsignbulksendNeedvalidation));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.bEzsigntemplatepackageNeedvalidation == null ? 0: this.bEzsigntemplatepackageNeedvalidation.hashCode());
    result = 31 * result + (this.bEzsignbulksendNeedvalidation == null ? 0: this.bEzsignbulksendNeedvalidation.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatepackagesignerDeleteObjectV1ResponseMPayload {\n");
    
    sb.append("  bEzsigntemplatepackageNeedvalidation: ").append(bEzsigntemplatepackageNeedvalidation).append("\n");
    sb.append("  bEzsignbulksendNeedvalidation: ").append(bEzsignbulksendNeedvalidation).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
