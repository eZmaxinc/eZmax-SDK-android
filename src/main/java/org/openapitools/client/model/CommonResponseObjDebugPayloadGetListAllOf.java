/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.7
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
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CommonResponseObjDebugPayloadGetListAllOf {
  
  @SerializedName("a_Filter")
  private CommonResponseFilter aFilter = null;
  @SerializedName("a_OrderBy")
  private Map<String, String> aOrderBy = null;

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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonResponseObjDebugPayloadGetListAllOf commonResponseObjDebugPayloadGetListAllOf = (CommonResponseObjDebugPayloadGetListAllOf) o;
    return (this.aFilter == null ? commonResponseObjDebugPayloadGetListAllOf.aFilter == null : this.aFilter.equals(commonResponseObjDebugPayloadGetListAllOf.aFilter)) &&
        (this.aOrderBy == null ? commonResponseObjDebugPayloadGetListAllOf.aOrderBy == null : this.aOrderBy.equals(commonResponseObjDebugPayloadGetListAllOf.aOrderBy));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aFilter == null ? 0: this.aFilter.hashCode());
    result = 31 * result + (this.aOrderBy == null ? 0: this.aOrderBy.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonResponseObjDebugPayloadGetListAllOf {\n");
    
    sb.append("  aFilter: ").append(aFilter).append("\n");
    sb.append("  aOrderBy: ").append(aOrderBy).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
