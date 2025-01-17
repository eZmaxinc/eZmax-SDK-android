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
import java.util.Map;
import org.openapitools.client.model.CommonResponseFilter;
import org.openapitools.client.model.CommonResponseObjDebugPayload;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * This is a debug object containing debugging information on the actual function
 **/
@ApiModel(description = "This is a debug object containing debugging information on the actual function")
public class CommonResponseObjDebugPayloadGetList extends CommonResponseObjDebugPayload {
  
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
  @SerializedName("a_Filter")
  private CommonResponseFilter aFilter = null;
  @SerializedName("a_OrderBy")
  private Map<String, String> aOrderBy = null;
  @SerializedName("iRowMax")
  private Integer iRowMax = null;
  @SerializedName("iRowOffset")
  private Integer iRowOffset = 0;

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

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CommonResponseFilter getAFilter() {
    return aFilter;
  }
  public void setAFilter(CommonResponseFilter aFilter) {
    this.aFilter = aFilter;
  }

  /**
   * List of available values for *eOrderBy*
   **/
  @ApiModelProperty(required = true, value = "List of available values for *eOrderBy*")
  public Map<String, String> getAOrderBy() {
    return aOrderBy;
  }
  public void setAOrderBy(Map<String, String> aOrderBy) {
    this.aOrderBy = aOrderBy;
  }

  /**
   * The maximum numbers of results to be returned.  When the content-type is **application/json** there is an implicit default of 10 000.  When it's **application/vnd.openxmlformats-officedocument.spreadsheetml.sheet** the is no implicit default so if you do not specify iRowMax, all records will be returned.
   * minimum: 1
   * maximum: 10000
   **/
  @ApiModelProperty(required = true, value = "The maximum numbers of results to be returned.  When the content-type is **application/json** there is an implicit default of 10 000.  When it's **application/vnd.openxmlformats-officedocument.spreadsheetml.sheet** the is no implicit default so if you do not specify iRowMax, all records will be returned.")
  public Integer getIRowMax() {
    return iRowMax;
  }
  public void setIRowMax(Integer iRowMax) {
    this.iRowMax = iRowMax;
  }

  /**
   * The starting element from where to start retrieving the results. For example if you started at iRowOffset=0 and asked for iRowMax=100, to get the next 100 results, you could specify iRowOffset=100&iRowMax=100,
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The starting element from where to start retrieving the results. For example if you started at iRowOffset=0 and asked for iRowMax=100, to get the next 100 results, you could specify iRowOffset=100&iRowMax=100,")
  public Integer getIRowOffset() {
    return iRowOffset;
  }
  public void setIRowOffset(Integer iRowOffset) {
    this.iRowOffset = iRowOffset;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonResponseObjDebugPayloadGetList commonResponseObjDebugPayloadGetList = (CommonResponseObjDebugPayloadGetList) o;
    return (this.iVersionMin == null ? commonResponseObjDebugPayloadGetList.iVersionMin == null : this.iVersionMin.equals(commonResponseObjDebugPayloadGetList.iVersionMin)) &&
        (this.iVersionMax == null ? commonResponseObjDebugPayloadGetList.iVersionMax == null : this.iVersionMax.equals(commonResponseObjDebugPayloadGetList.iVersionMax)) &&
        (this.aRequiredPermission == null ? commonResponseObjDebugPayloadGetList.aRequiredPermission == null : this.aRequiredPermission.equals(commonResponseObjDebugPayloadGetList.aRequiredPermission)) &&
        (this.bVersionDeprecated == null ? commonResponseObjDebugPayloadGetList.bVersionDeprecated == null : this.bVersionDeprecated.equals(commonResponseObjDebugPayloadGetList.bVersionDeprecated)) &&
        (this.dtResponseDate == null ? commonResponseObjDebugPayloadGetList.dtResponseDate == null : this.dtResponseDate.equals(commonResponseObjDebugPayloadGetList.dtResponseDate)) &&
        (this.aFilter == null ? commonResponseObjDebugPayloadGetList.aFilter == null : this.aFilter.equals(commonResponseObjDebugPayloadGetList.aFilter)) &&
        (this.aOrderBy == null ? commonResponseObjDebugPayloadGetList.aOrderBy == null : this.aOrderBy.equals(commonResponseObjDebugPayloadGetList.aOrderBy)) &&
        (this.iRowMax == null ? commonResponseObjDebugPayloadGetList.iRowMax == null : this.iRowMax.equals(commonResponseObjDebugPayloadGetList.iRowMax)) &&
        (this.iRowOffset == null ? commonResponseObjDebugPayloadGetList.iRowOffset == null : this.iRowOffset.equals(commonResponseObjDebugPayloadGetList.iRowOffset));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.iVersionMin == null ? 0: this.iVersionMin.hashCode());
    result = 31 * result + (this.iVersionMax == null ? 0: this.iVersionMax.hashCode());
    result = 31 * result + (this.aRequiredPermission == null ? 0: this.aRequiredPermission.hashCode());
    result = 31 * result + (this.bVersionDeprecated == null ? 0: this.bVersionDeprecated.hashCode());
    result = 31 * result + (this.dtResponseDate == null ? 0: this.dtResponseDate.hashCode());
    result = 31 * result + (this.aFilter == null ? 0: this.aFilter.hashCode());
    result = 31 * result + (this.aOrderBy == null ? 0: this.aOrderBy.hashCode());
    result = 31 * result + (this.iRowMax == null ? 0: this.iRowMax.hashCode());
    result = 31 * result + (this.iRowOffset == null ? 0: this.iRowOffset.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonResponseObjDebugPayloadGetList {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  iVersionMin: ").append(iVersionMin).append("\n");
    sb.append("  iVersionMax: ").append(iVersionMax).append("\n");
    sb.append("  aRequiredPermission: ").append(aRequiredPermission).append("\n");
    sb.append("  bVersionDeprecated: ").append(bVersionDeprecated).append("\n");
    sb.append("  dtResponseDate: ").append(dtResponseDate).append("\n");
    sb.append("  aFilter: ").append(aFilter).append("\n");
    sb.append("  aOrderBy: ").append(aOrderBy).append("\n");
    sb.append("  iRowMax: ").append(iRowMax).append("\n");
    sb.append("  iRowOffset: ").append(iRowOffset).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
