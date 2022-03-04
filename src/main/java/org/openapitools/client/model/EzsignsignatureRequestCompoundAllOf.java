/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.5
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.EzsignsignaturecustomdateRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class EzsignsignatureRequestCompoundAllOf {
  
  @SerializedName("bEzsignsignatureCustomdate")
  private Boolean bEzsignsignatureCustomdate = null;
  @SerializedName("a_objEzsignsignaturecustomdate")
  private List<EzsignsignaturecustomdateRequestCompound> aObjEzsignsignaturecustomdate = null;

  /**
   * Whether the Ezsignsignature has a custom date format or not. (Only possible when eEzsignsignatureType is \"Name\" or \"Handwritten\")
   **/
  @ApiModelProperty(value = "Whether the Ezsignsignature has a custom date format or not. (Only possible when eEzsignsignatureType is \"Name\" or \"Handwritten\")")
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
  public List<EzsignsignaturecustomdateRequestCompound> getAObjEzsignsignaturecustomdate() {
    return aObjEzsignsignaturecustomdate;
  }
  public void setAObjEzsignsignaturecustomdate(List<EzsignsignaturecustomdateRequestCompound> aObjEzsignsignaturecustomdate) {
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
    EzsignsignatureRequestCompoundAllOf ezsignsignatureRequestCompoundAllOf = (EzsignsignatureRequestCompoundAllOf) o;
    return (this.bEzsignsignatureCustomdate == null ? ezsignsignatureRequestCompoundAllOf.bEzsignsignatureCustomdate == null : this.bEzsignsignatureCustomdate.equals(ezsignsignatureRequestCompoundAllOf.bEzsignsignatureCustomdate)) &&
        (this.aObjEzsignsignaturecustomdate == null ? ezsignsignatureRequestCompoundAllOf.aObjEzsignsignaturecustomdate == null : this.aObjEzsignsignaturecustomdate.equals(ezsignsignatureRequestCompoundAllOf.aObjEzsignsignaturecustomdate));
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
    sb.append("class EzsignsignatureRequestCompoundAllOf {\n");
    
    sb.append("  bEzsignsignatureCustomdate: ").append(bEzsignsignatureCustomdate).append("\n");
    sb.append("  aObjEzsignsignaturecustomdate: ").append(aObjEzsignsignaturecustomdate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
