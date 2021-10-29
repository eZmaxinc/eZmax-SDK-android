/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.3
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import java.util.Map;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Definition of Filters for getList
 **/
@ApiModel(description = "Definition of Filters for getList")
public class CommonResponseFilter {
  
  @SerializedName("a_AutoType")
  private Map<String, String> aAutoType = null;
  @SerializedName("a_Enum")
  private Map<String, Map<String, String>> aEnum = null;

  /**
   * List of filters that can be used in *sFilter* (Automatic types)
   **/
  @ApiModelProperty(value = "List of filters that can be used in *sFilter* (Automatic types)")
  public Map<String, String> getAAutoType() {
    return aAutoType;
  }
  public void setAAutoType(Map<String, String> aAutoType) {
    this.aAutoType = aAutoType;
  }

  /**
   * List of filters that can be used in *sFilter* (Enum types)
   **/
  @ApiModelProperty(value = "List of filters that can be used in *sFilter* (Enum types)")
  public Map<String, Map<String, String>> getAEnum() {
    return aEnum;
  }
  public void setAEnum(Map<String, Map<String, String>> aEnum) {
    this.aEnum = aEnum;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonResponseFilter commonResponseFilter = (CommonResponseFilter) o;
    return (this.aAutoType == null ? commonResponseFilter.aAutoType == null : this.aAutoType.equals(commonResponseFilter.aAutoType)) &&
        (this.aEnum == null ? commonResponseFilter.aEnum == null : this.aEnum.equals(commonResponseFilter.aEnum));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aAutoType == null ? 0: this.aAutoType.hashCode());
    result = 31 * result + (this.aEnum == null ? 0: this.aEnum.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonResponseFilter {\n");
    
    sb.append("  aAutoType: ").append(aAutoType).append("\n");
    sb.append("  aEnum: ").append(aEnum).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
