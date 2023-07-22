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
import org.openapitools.client.model.ScimUser;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ScimUserList {
  
  @SerializedName("totalResults")
  private Integer totalResults = null;
  @SerializedName("itemsPerPage")
  private Integer itemsPerPage = null;
  @SerializedName("startIndex")
  private Integer startIndex = null;
  @SerializedName("schemas")
  private List<String> schemas = null;
  @SerializedName("Resources")
  private List<ScimUser> resources = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTotalResults() {
    return totalResults;
  }
  public void setTotalResults(Integer totalResults) {
    this.totalResults = totalResults;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getItemsPerPage() {
    return itemsPerPage;
  }
  public void setItemsPerPage(Integer itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getStartIndex() {
    return startIndex;
  }
  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getSchemas() {
    return schemas;
  }
  public void setSchemas(List<String> schemas) {
    this.schemas = schemas;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ScimUser> getResources() {
    return resources;
  }
  public void setResources(List<ScimUser> resources) {
    this.resources = resources;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimUserList scimUserList = (ScimUserList) o;
    return (this.totalResults == null ? scimUserList.totalResults == null : this.totalResults.equals(scimUserList.totalResults)) &&
        (this.itemsPerPage == null ? scimUserList.itemsPerPage == null : this.itemsPerPage.equals(scimUserList.itemsPerPage)) &&
        (this.startIndex == null ? scimUserList.startIndex == null : this.startIndex.equals(scimUserList.startIndex)) &&
        (this.schemas == null ? scimUserList.schemas == null : this.schemas.equals(scimUserList.schemas)) &&
        (this.resources == null ? scimUserList.resources == null : this.resources.equals(scimUserList.resources));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.totalResults == null ? 0: this.totalResults.hashCode());
    result = 31 * result + (this.itemsPerPage == null ? 0: this.itemsPerPage.hashCode());
    result = 31 * result + (this.startIndex == null ? 0: this.startIndex.hashCode());
    result = 31 * result + (this.schemas == null ? 0: this.schemas.hashCode());
    result = 31 * result + (this.resources == null ? 0: this.resources.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimUserList {\n");
    
    sb.append("  totalResults: ").append(totalResults).append("\n");
    sb.append("  itemsPerPage: ").append(itemsPerPage).append("\n");
    sb.append("  startIndex: ").append(startIndex).append("\n");
    sb.append("  schemas: ").append(schemas).append("\n");
    sb.append("  resources: ").append(resources).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
