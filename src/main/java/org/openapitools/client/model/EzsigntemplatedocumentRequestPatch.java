/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.12
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
 * An Ezsigntemplatedocument Object
 **/
@ApiModel(description = "An Ezsigntemplatedocument Object")
public class EzsigntemplatedocumentRequestPatch {
  
  @SerializedName("sEzsigntemplatedocumentName")
  private String sEzsigntemplatedocumentName = null;

  /**
   * The name of the Ezsigntemplatedocument.
   **/
  @ApiModelProperty(value = "The name of the Ezsigntemplatedocument.")
  public String getSEzsigntemplatedocumentName() {
    return sEzsigntemplatedocumentName;
  }
  public void setSEzsigntemplatedocumentName(String sEzsigntemplatedocumentName) {
    this.sEzsigntemplatedocumentName = sEzsigntemplatedocumentName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatedocumentRequestPatch ezsigntemplatedocumentRequestPatch = (EzsigntemplatedocumentRequestPatch) o;
    return (this.sEzsigntemplatedocumentName == null ? ezsigntemplatedocumentRequestPatch.sEzsigntemplatedocumentName == null : this.sEzsigntemplatedocumentName.equals(ezsigntemplatedocumentRequestPatch.sEzsigntemplatedocumentName));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sEzsigntemplatedocumentName == null ? 0: this.sEzsigntemplatedocumentName.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatedocumentRequestPatch {\n");
    
    sb.append("  sEzsigntemplatedocumentName: ").append(sEzsigntemplatedocumentName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
