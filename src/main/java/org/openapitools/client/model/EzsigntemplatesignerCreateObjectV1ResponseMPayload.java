/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.13
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /1/object/ezsigntemplatesigner
 **/
@ApiModel(description = "Payload for POST /1/object/ezsigntemplatesigner")
public class EzsigntemplatesignerCreateObjectV1ResponseMPayload {
  
  @SerializedName("a_pkiEzsigntemplatesignerID")
  private List<Integer> aPkiEzsigntemplatesignerID = null;
  @SerializedName("bEzsigntemplatepackageNeedvalidation")
  private Boolean bEzsigntemplatepackageNeedvalidation = null;
  @SerializedName("bEzsignbulksendNeedvalidation")
  private Boolean bEzsignbulksendNeedvalidation = null;

  /**
   * An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
   **/
  @ApiModelProperty(required = true, value = "An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.")
  public List<Integer> getAPkiEzsigntemplatesignerID() {
    return aPkiEzsigntemplatesignerID;
  }
  public void setAPkiEzsigntemplatesignerID(List<Integer> aPkiEzsigntemplatesignerID) {
    this.aPkiEzsigntemplatesignerID = aPkiEzsigntemplatesignerID;
  }

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
    EzsigntemplatesignerCreateObjectV1ResponseMPayload ezsigntemplatesignerCreateObjectV1ResponseMPayload = (EzsigntemplatesignerCreateObjectV1ResponseMPayload) o;
    return (this.aPkiEzsigntemplatesignerID == null ? ezsigntemplatesignerCreateObjectV1ResponseMPayload.aPkiEzsigntemplatesignerID == null : this.aPkiEzsigntemplatesignerID.equals(ezsigntemplatesignerCreateObjectV1ResponseMPayload.aPkiEzsigntemplatesignerID)) &&
        (this.bEzsigntemplatepackageNeedvalidation == null ? ezsigntemplatesignerCreateObjectV1ResponseMPayload.bEzsigntemplatepackageNeedvalidation == null : this.bEzsigntemplatepackageNeedvalidation.equals(ezsigntemplatesignerCreateObjectV1ResponseMPayload.bEzsigntemplatepackageNeedvalidation)) &&
        (this.bEzsignbulksendNeedvalidation == null ? ezsigntemplatesignerCreateObjectV1ResponseMPayload.bEzsignbulksendNeedvalidation == null : this.bEzsignbulksendNeedvalidation.equals(ezsigntemplatesignerCreateObjectV1ResponseMPayload.bEzsignbulksendNeedvalidation));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aPkiEzsigntemplatesignerID == null ? 0: this.aPkiEzsigntemplatesignerID.hashCode());
    result = 31 * result + (this.bEzsigntemplatepackageNeedvalidation == null ? 0: this.bEzsigntemplatepackageNeedvalidation.hashCode());
    result = 31 * result + (this.bEzsignbulksendNeedvalidation == null ? 0: this.bEzsignbulksendNeedvalidation.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatesignerCreateObjectV1ResponseMPayload {\n");
    
    sb.append("  aPkiEzsigntemplatesignerID: ").append(aPkiEzsigntemplatesignerID).append("\n");
    sb.append("  bEzsigntemplatepackageNeedvalidation: ").append(bEzsigntemplatepackageNeedvalidation).append("\n");
    sb.append("  bEzsignbulksendNeedvalidation: ").append(bEzsignbulksendNeedvalidation).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
