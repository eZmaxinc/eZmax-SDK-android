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

import java.util.*;
import org.openapitools.client.model.EzsignsignaturecustomdateResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class EzsignsignatureResponseCompoundAllOf {
  
  @SerializedName("bEzsignsignatureCustomdate")
  private Boolean bEzsignsignatureCustomdate = null;
  @SerializedName("a_objEzsignsignaturecustomdate")
  private List<EzsignsignaturecustomdateResponseCompound> aObjEzsignsignaturecustomdate = null;

  /**
   * Whether the Ezsignsignature has a custom date format or not. (Only possible when eEzsignsignatureType is **Name** or **Handwritten**)
   **/
  @ApiModelProperty(value = "Whether the Ezsignsignature has a custom date format or not. (Only possible when eEzsignsignatureType is **Name** or **Handwritten**)")
  public Boolean getBEzsignsignatureCustomdate() {
    return bEzsignsignatureCustomdate;
  }
  public void setBEzsignsignatureCustomdate(Boolean bEzsignsignatureCustomdate) {
    this.bEzsignsignatureCustomdate = bEzsignsignatureCustomdate;
  }

  /**
   * An array of custom date blocks that will be filled at the time of signature.  Can only be used if bEzsignsignatureCustomdate is true.  Use an empty array if you don't want to have a date at all.
   **/
  @ApiModelProperty(value = "An array of custom date blocks that will be filled at the time of signature.  Can only be used if bEzsignsignatureCustomdate is true.  Use an empty array if you don't want to have a date at all.")
  public List<EzsignsignaturecustomdateResponseCompound> getAObjEzsignsignaturecustomdate() {
    return aObjEzsignsignaturecustomdate;
  }
  public void setAObjEzsignsignaturecustomdate(List<EzsignsignaturecustomdateResponseCompound> aObjEzsignsignaturecustomdate) {
    this.aObjEzsignsignaturecustomdate = aObjEzsignsignaturecustomdate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignsignatureResponseCompoundAllOf ezsignsignatureResponseCompoundAllOf = (EzsignsignatureResponseCompoundAllOf) o;
    return (this.bEzsignsignatureCustomdate == null ? ezsignsignatureResponseCompoundAllOf.bEzsignsignatureCustomdate == null : this.bEzsignsignatureCustomdate.equals(ezsignsignatureResponseCompoundAllOf.bEzsignsignatureCustomdate)) &&
        (this.aObjEzsignsignaturecustomdate == null ? ezsignsignatureResponseCompoundAllOf.aObjEzsignsignaturecustomdate == null : this.aObjEzsignsignaturecustomdate.equals(ezsignsignatureResponseCompoundAllOf.aObjEzsignsignaturecustomdate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.bEzsignsignatureCustomdate == null ? 0: this.bEzsignsignatureCustomdate.hashCode());
    result = 31 * result + (this.aObjEzsignsignaturecustomdate == null ? 0: this.aObjEzsignsignaturecustomdate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignsignatureResponseCompoundAllOf {\n");
    
    sb.append("  bEzsignsignatureCustomdate: ").append(bEzsignsignatureCustomdate).append("\n");
    sb.append("  aObjEzsignsignaturecustomdate: ").append(aObjEzsignsignaturecustomdate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
