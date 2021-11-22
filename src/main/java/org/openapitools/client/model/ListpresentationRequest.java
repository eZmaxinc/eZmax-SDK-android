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
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Listpresentation element
 **/
@ApiModel(description = "A Listpresentation element")
public class ListpresentationRequest {
  
  @SerializedName("sListpresentationDescription")
  private String sListpresentationDescription = null;
  @SerializedName("sListpresentationFilter")
  private String sListpresentationFilter = null;
  @SerializedName("sListpresentationOrderby")
  private String sListpresentationOrderby = null;
  @SerializedName("a_sColumnName")
  private List<String> aSColumnName = null;
  @SerializedName("iListpresentationRowMax")
  private Integer iListpresentationRowMax = null;
  @SerializedName("iListpresentationRowOffset")
  private Integer iListpresentationRowOffset = null;
  @SerializedName("bListpresentationDefault")
  private Boolean bListpresentationDefault = null;

  /**
   * A descriptive for the list presentation
   **/
  @ApiModelProperty(required = true, value = "A descriptive for the list presentation")
  public String getSListpresentationDescription() {
    return sListpresentationDescription;
  }
  public void setSListpresentationDescription(String sListpresentationDescription) {
    this.sListpresentationDescription = sListpresentationDescription;
  }

  /**
   * The filter to apply to the request to limit results.
   **/
  @ApiModelProperty(required = true, value = "The filter to apply to the request to limit results.")
  public String getSListpresentationFilter() {
    return sListpresentationFilter;
  }
  public void setSListpresentationFilter(String sListpresentationFilter) {
    this.sListpresentationFilter = sListpresentationFilter;
  }

  /**
   * The order by the user chose
   **/
  @ApiModelProperty(required = true, value = "The order by the user chose")
  public String getSListpresentationOrderby() {
    return sListpresentationOrderby;
  }
  public void setSListpresentationOrderby(String sListpresentationOrderby) {
    this.sListpresentationOrderby = sListpresentationOrderby;
  }

  /**
   * An array of column names that the user chose to bee visible
   **/
  @ApiModelProperty(required = true, value = "An array of column names that the user chose to bee visible")
  public List<String> getASColumnName() {
    return aSColumnName;
  }
  public void setASColumnName(List<String> aSColumnName) {
    this.aSColumnName = aSColumnName;
  }

  /**
   * The maximum numbers of results to be returned
   **/
  @ApiModelProperty(required = true, value = "The maximum numbers of results to be returned")
  public Integer getIListpresentationRowMax() {
    return iListpresentationRowMax;
  }
  public void setIListpresentationRowMax(Integer iListpresentationRowMax) {
    this.iListpresentationRowMax = iListpresentationRowMax;
  }

  /**
   * The starting element from where to start retrieving the results. For example if you started at iRowOffset=0 and asked for iRowMax=100, to get the next 100 results, you could specify iRowOffset=100&iRowMax=100,
   **/
  @ApiModelProperty(required = true, value = "The starting element from where to start retrieving the results. For example if you started at iRowOffset=0 and asked for iRowMax=100, to get the next 100 results, you could specify iRowOffset=100&iRowMax=100,")
  public Integer getIListpresentationRowOffset() {
    return iListpresentationRowOffset;
  }
  public void setIListpresentationRowOffset(Integer iListpresentationRowOffset) {
    this.iListpresentationRowOffset = iListpresentationRowOffset;
  }

  /**
   * Set to true if the user chose this Listpresentation as the default one. A single element should be set to true
   **/
  @ApiModelProperty(required = true, value = "Set to true if the user chose this Listpresentation as the default one. A single element should be set to true")
  public Boolean getBListpresentationDefault() {
    return bListpresentationDefault;
  }
  public void setBListpresentationDefault(Boolean bListpresentationDefault) {
    this.bListpresentationDefault = bListpresentationDefault;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListpresentationRequest listpresentationRequest = (ListpresentationRequest) o;
    return (this.sListpresentationDescription == null ? listpresentationRequest.sListpresentationDescription == null : this.sListpresentationDescription.equals(listpresentationRequest.sListpresentationDescription)) &&
        (this.sListpresentationFilter == null ? listpresentationRequest.sListpresentationFilter == null : this.sListpresentationFilter.equals(listpresentationRequest.sListpresentationFilter)) &&
        (this.sListpresentationOrderby == null ? listpresentationRequest.sListpresentationOrderby == null : this.sListpresentationOrderby.equals(listpresentationRequest.sListpresentationOrderby)) &&
        (this.aSColumnName == null ? listpresentationRequest.aSColumnName == null : this.aSColumnName.equals(listpresentationRequest.aSColumnName)) &&
        (this.iListpresentationRowMax == null ? listpresentationRequest.iListpresentationRowMax == null : this.iListpresentationRowMax.equals(listpresentationRequest.iListpresentationRowMax)) &&
        (this.iListpresentationRowOffset == null ? listpresentationRequest.iListpresentationRowOffset == null : this.iListpresentationRowOffset.equals(listpresentationRequest.iListpresentationRowOffset)) &&
        (this.bListpresentationDefault == null ? listpresentationRequest.bListpresentationDefault == null : this.bListpresentationDefault.equals(listpresentationRequest.bListpresentationDefault));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sListpresentationDescription == null ? 0: this.sListpresentationDescription.hashCode());
    result = 31 * result + (this.sListpresentationFilter == null ? 0: this.sListpresentationFilter.hashCode());
    result = 31 * result + (this.sListpresentationOrderby == null ? 0: this.sListpresentationOrderby.hashCode());
    result = 31 * result + (this.aSColumnName == null ? 0: this.aSColumnName.hashCode());
    result = 31 * result + (this.iListpresentationRowMax == null ? 0: this.iListpresentationRowMax.hashCode());
    result = 31 * result + (this.iListpresentationRowOffset == null ? 0: this.iListpresentationRowOffset.hashCode());
    result = 31 * result + (this.bListpresentationDefault == null ? 0: this.bListpresentationDefault.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListpresentationRequest {\n");
    
    sb.append("  sListpresentationDescription: ").append(sListpresentationDescription).append("\n");
    sb.append("  sListpresentationFilter: ").append(sListpresentationFilter).append("\n");
    sb.append("  sListpresentationOrderby: ").append(sListpresentationOrderby).append("\n");
    sb.append("  aSColumnName: ").append(aSColumnName).append("\n");
    sb.append("  iListpresentationRowMax: ").append(iListpresentationRowMax).append("\n");
    sb.append("  iListpresentationRowOffset: ").append(iListpresentationRowOffset).append("\n");
    sb.append("  bListpresentationDefault: ").append(bListpresentationDefault).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}