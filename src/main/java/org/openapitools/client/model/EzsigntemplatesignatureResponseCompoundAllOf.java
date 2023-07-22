/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.18
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.EzsigntemplatesignaturecustomdateResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class EzsigntemplatesignatureResponseCompoundAllOf {
  
  @SerializedName("bEzsigntemplatesignatureCustomdate")
  private Boolean bEzsigntemplatesignatureCustomdate = null;
  @SerializedName("a_objEzsigntemplatesignaturecustomdate")
  private List<EzsigntemplatesignaturecustomdateResponseCompound> aObjEzsigntemplatesignaturecustomdate = null;

  /**
   * Whether the Ezsigntemplatesignature has a custom date format or not. (Only possible when eEzsigntemplatesignatureType is **Name** or **Handwritten**)
   **/
  @ApiModelProperty(value = "Whether the Ezsigntemplatesignature has a custom date format or not. (Only possible when eEzsigntemplatesignatureType is **Name** or **Handwritten**)")
  public Boolean getBEzsigntemplatesignatureCustomdate() {
    return bEzsigntemplatesignatureCustomdate;
  }
  public void setBEzsigntemplatesignatureCustomdate(Boolean bEzsigntemplatesignatureCustomdate) {
    this.bEzsigntemplatesignatureCustomdate = bEzsigntemplatesignatureCustomdate;
  }

  /**
   * An array of custom date blocks that will be filled at the time of signature.  Can only be used if bEzsigntemplatesignatureCustomdate is true.  Use an empty array if you don't want to have a date at all.
   **/
  @ApiModelProperty(value = "An array of custom date blocks that will be filled at the time of signature.  Can only be used if bEzsigntemplatesignatureCustomdate is true.  Use an empty array if you don't want to have a date at all.")
  public List<EzsigntemplatesignaturecustomdateResponseCompound> getAObjEzsigntemplatesignaturecustomdate() {
    return aObjEzsigntemplatesignaturecustomdate;
  }
  public void setAObjEzsigntemplatesignaturecustomdate(List<EzsigntemplatesignaturecustomdateResponseCompound> aObjEzsigntemplatesignaturecustomdate) {
    this.aObjEzsigntemplatesignaturecustomdate = aObjEzsigntemplatesignaturecustomdate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatesignatureResponseCompoundAllOf ezsigntemplatesignatureResponseCompoundAllOf = (EzsigntemplatesignatureResponseCompoundAllOf) o;
    return (this.bEzsigntemplatesignatureCustomdate == null ? ezsigntemplatesignatureResponseCompoundAllOf.bEzsigntemplatesignatureCustomdate == null : this.bEzsigntemplatesignatureCustomdate.equals(ezsigntemplatesignatureResponseCompoundAllOf.bEzsigntemplatesignatureCustomdate)) &&
        (this.aObjEzsigntemplatesignaturecustomdate == null ? ezsigntemplatesignatureResponseCompoundAllOf.aObjEzsigntemplatesignaturecustomdate == null : this.aObjEzsigntemplatesignaturecustomdate.equals(ezsigntemplatesignatureResponseCompoundAllOf.aObjEzsigntemplatesignaturecustomdate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.bEzsigntemplatesignatureCustomdate == null ? 0: this.bEzsigntemplatesignatureCustomdate.hashCode());
    result = 31 * result + (this.aObjEzsigntemplatesignaturecustomdate == null ? 0: this.aObjEzsigntemplatesignaturecustomdate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatesignatureResponseCompoundAllOf {\n");
    
    sb.append("  bEzsigntemplatesignatureCustomdate: ").append(bEzsigntemplatesignatureCustomdate).append("\n");
    sb.append("  aObjEzsigntemplatesignaturecustomdate: ").append(aObjEzsigntemplatesignaturecustomdate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
