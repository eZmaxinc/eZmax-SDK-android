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
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * This is a debug object containing debugging information on the actual function
 **/
@ApiModel(description = "This is a debug object containing debugging information on the actual function")
public class CommonResponseObjDebugPayload {
  
  @SerializedName("iVersionMin")
  private Integer iVersionMin = null;
  @SerializedName("iVersionMax")
  private Integer iVersionMax = null;
  @SerializedName("a_RequiredPermission")
  private List<Integer> aRequiredPermission = null;
  @SerializedName("bVersionDeprecated")
  private Boolean bVersionDeprecated = null;
  @SerializedName("dtResponseDate")
  private String dtResponseDate = null;

  /**
   * The minimum version of the function that can be called
   **/
  @ApiModelProperty(required = true, value = "The minimum version of the function that can be called")
  public Integer getIVersionMin() {
    return iVersionMin;
  }
  public void setIVersionMin(Integer iVersionMin) {
    this.iVersionMin = iVersionMin;
  }

  /**
   * The maximum version of the function that can be called
   **/
  @ApiModelProperty(required = true, value = "The maximum version of the function that can be called")
  public Integer getIVersionMax() {
    return iVersionMax;
  }
  public void setIVersionMax(Integer iVersionMax) {
    this.iVersionMax = iVersionMax;
  }

  /**
   * An array of permissions required to access this function.  If the value \"0\" is present in the array, anyone can call this function.  You must have one of the permission to access the function. You don't need to have all of them.
   **/
  @ApiModelProperty(required = true, value = "An array of permissions required to access this function.  If the value \"0\" is present in the array, anyone can call this function.  You must have one of the permission to access the function. You don't need to have all of them.")
  public List<Integer> getARequiredPermission() {
    return aRequiredPermission;
  }
  public void setARequiredPermission(List<Integer> aRequiredPermission) {
    this.aRequiredPermission = aRequiredPermission;
  }

  /**
   * Wheter the current route is deprecated or not
   **/
  @ApiModelProperty(required = true, value = "Wheter the current route is deprecated or not")
  public Boolean getBVersionDeprecated() {
    return bVersionDeprecated;
  }
  public void setBVersionDeprecated(Boolean bVersionDeprecated) {
    this.bVersionDeprecated = bVersionDeprecated;
  }

  /**
   * Represent a Date Time. The timezone is the one configured in the User's profile.
   **/
  @ApiModelProperty(required = true, value = "Represent a Date Time. The timezone is the one configured in the User's profile.")
  public String getDtResponseDate() {
    return dtResponseDate;
  }
  public void setDtResponseDate(String dtResponseDate) {
    this.dtResponseDate = dtResponseDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonResponseObjDebugPayload commonResponseObjDebugPayload = (CommonResponseObjDebugPayload) o;
    return (this.iVersionMin == null ? commonResponseObjDebugPayload.iVersionMin == null : this.iVersionMin.equals(commonResponseObjDebugPayload.iVersionMin)) &&
        (this.iVersionMax == null ? commonResponseObjDebugPayload.iVersionMax == null : this.iVersionMax.equals(commonResponseObjDebugPayload.iVersionMax)) &&
        (this.aRequiredPermission == null ? commonResponseObjDebugPayload.aRequiredPermission == null : this.aRequiredPermission.equals(commonResponseObjDebugPayload.aRequiredPermission)) &&
        (this.bVersionDeprecated == null ? commonResponseObjDebugPayload.bVersionDeprecated == null : this.bVersionDeprecated.equals(commonResponseObjDebugPayload.bVersionDeprecated)) &&
        (this.dtResponseDate == null ? commonResponseObjDebugPayload.dtResponseDate == null : this.dtResponseDate.equals(commonResponseObjDebugPayload.dtResponseDate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.iVersionMin == null ? 0: this.iVersionMin.hashCode());
    result = 31 * result + (this.iVersionMax == null ? 0: this.iVersionMax.hashCode());
    result = 31 * result + (this.aRequiredPermission == null ? 0: this.aRequiredPermission.hashCode());
    result = 31 * result + (this.bVersionDeprecated == null ? 0: this.bVersionDeprecated.hashCode());
    result = 31 * result + (this.dtResponseDate == null ? 0: this.dtResponseDate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonResponseObjDebugPayload {\n");
    
    sb.append("  iVersionMin: ").append(iVersionMin).append("\n");
    sb.append("  iVersionMax: ").append(iVersionMax).append("\n");
    sb.append("  aRequiredPermission: ").append(aRequiredPermission).append("\n");
    sb.append("  bVersionDeprecated: ").append(bVersionDeprecated).append("\n");
    sb.append("  dtResponseDate: ").append(dtResponseDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
