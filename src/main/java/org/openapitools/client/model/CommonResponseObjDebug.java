/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.33
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.CommonResponseObjSQLQuery;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * This is a generic debug object that is returned by all API requests
 **/
@ApiModel(description = "This is a generic debug object that is returned by all API requests")
public class CommonResponseObjDebug {
  
  @SerializedName("sMemoryUsage")
  private String sMemoryUsage = null;
  @SerializedName("sRunTime")
  private String sRunTime = null;
  @SerializedName("iSQLSelects")
  private Integer iSQLSelects = null;
  @SerializedName("iSQLQueries")
  private Integer iSQLQueries = null;
  @SerializedName("a_objSQLQuery")
  private List<CommonResponseObjSQLQuery> aObjSQLQuery = null;

  /**
   * The peak memory allocated during the API request execution. Formatted as a human readable string
   **/
  @ApiModelProperty(required = true, value = "The peak memory allocated during the API request execution. Formatted as a human readable string")
  public String getSMemoryUsage() {
    return sMemoryUsage;
  }
  public void setSMemoryUsage(String sMemoryUsage) {
    this.sMemoryUsage = sMemoryUsage;
  }

  /**
   * The total server execution time of the API request execution. Formatted as a human readable string
   **/
  @ApiModelProperty(required = true, value = "The total server execution time of the API request execution. Formatted as a human readable string")
  public String getSRunTime() {
    return sRunTime;
  }
  public void setSRunTime(String sRunTime) {
    this.sRunTime = sRunTime;
  }

  /**
   * The number of SQL SELECT queries that were sent to the database server during the API request execution
   **/
  @ApiModelProperty(required = true, value = "The number of SQL SELECT queries that were sent to the database server during the API request execution")
  public Integer getISQLSelects() {
    return iSQLSelects;
  }
  public void setISQLSelects(Integer iSQLSelects) {
    this.iSQLSelects = iSQLSelects;
  }

  /**
   * The number of SQL INSERT/UPDATE/DELETE queries that were sent to the database server during the API request execution
   **/
  @ApiModelProperty(required = true, value = "The number of SQL INSERT/UPDATE/DELETE queries that were sent to the database server during the API request execution")
  public Integer getISQLQueries() {
    return iSQLQueries;
  }
  public void setISQLQueries(Integer iSQLQueries) {
    this.iSQLQueries = iSQLQueries;
  }

  /**
   * An array of the SQL Queries that were executed during the API request execution
   **/
  @ApiModelProperty(required = true, value = "An array of the SQL Queries that were executed during the API request execution")
  public List<CommonResponseObjSQLQuery> getAObjSQLQuery() {
    return aObjSQLQuery;
  }
  public void setAObjSQLQuery(List<CommonResponseObjSQLQuery> aObjSQLQuery) {
    this.aObjSQLQuery = aObjSQLQuery;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonResponseObjDebug commonResponseObjDebug = (CommonResponseObjDebug) o;
    return (this.sMemoryUsage == null ? commonResponseObjDebug.sMemoryUsage == null : this.sMemoryUsage.equals(commonResponseObjDebug.sMemoryUsage)) &&
        (this.sRunTime == null ? commonResponseObjDebug.sRunTime == null : this.sRunTime.equals(commonResponseObjDebug.sRunTime)) &&
        (this.iSQLSelects == null ? commonResponseObjDebug.iSQLSelects == null : this.iSQLSelects.equals(commonResponseObjDebug.iSQLSelects)) &&
        (this.iSQLQueries == null ? commonResponseObjDebug.iSQLQueries == null : this.iSQLQueries.equals(commonResponseObjDebug.iSQLQueries)) &&
        (this.aObjSQLQuery == null ? commonResponseObjDebug.aObjSQLQuery == null : this.aObjSQLQuery.equals(commonResponseObjDebug.aObjSQLQuery));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sMemoryUsage == null ? 0: this.sMemoryUsage.hashCode());
    result = 31 * result + (this.sRunTime == null ? 0: this.sRunTime.hashCode());
    result = 31 * result + (this.iSQLSelects == null ? 0: this.iSQLSelects.hashCode());
    result = 31 * result + (this.iSQLQueries == null ? 0: this.iSQLQueries.hashCode());
    result = 31 * result + (this.aObjSQLQuery == null ? 0: this.aObjSQLQuery.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonResponseObjDebug {\n");
    
    sb.append("  sMemoryUsage: ").append(sMemoryUsage).append("\n");
    sb.append("  sRunTime: ").append(sRunTime).append("\n");
    sb.append("  iSQLSelects: ").append(iSQLSelects).append("\n");
    sb.append("  iSQLQueries: ").append(iSQLQueries).append("\n");
    sb.append("  aObjSQLQuery: ").append(aObjSQLQuery).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
