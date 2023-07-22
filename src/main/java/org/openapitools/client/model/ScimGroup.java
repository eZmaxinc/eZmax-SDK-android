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
import org.openapitools.client.model.ScimGroupMember;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ScimGroup {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("displayName")
  private String displayName = null;
  @SerializedName("members")
  private List<ScimGroupMember> members = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The Name of the Usergroup in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The Name of the Usergroup in the language of the requester")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ScimGroupMember> getMembers() {
    return members;
  }
  public void setMembers(List<ScimGroupMember> members) {
    this.members = members;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimGroup scimGroup = (ScimGroup) o;
    return (this.id == null ? scimGroup.id == null : this.id.equals(scimGroup.id)) &&
        (this.displayName == null ? scimGroup.displayName == null : this.displayName.equals(scimGroup.displayName)) &&
        (this.members == null ? scimGroup.members == null : this.members.equals(scimGroup.members));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.displayName == null ? 0: this.displayName.hashCode());
    result = 31 * result + (this.members == null ? 0: this.members.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimGroup {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  displayName: ").append(displayName).append("\n");
    sb.append("  members: ").append(members).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}