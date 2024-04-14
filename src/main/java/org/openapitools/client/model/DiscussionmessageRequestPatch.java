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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Discussionmessage Object
 **/
@ApiModel(description = "A Discussionmessage Object")
public class DiscussionmessageRequestPatch {
  
  @SerializedName("fkiDiscussionmembershipIDActionrequired")
  private Integer fkiDiscussionmembershipIDActionrequired = null;
  @SerializedName("tDiscussionmessageContent")
  private String tDiscussionmessageContent = null;

  /**
   * The unique ID of the Discussionmembership
   * minimum: 0
   * maximum: 16777215
   **/
  @ApiModelProperty(value = "The unique ID of the Discussionmembership")
  public Integer getFkiDiscussionmembershipIDActionrequired() {
    return fkiDiscussionmembershipIDActionrequired;
  }
  public void setFkiDiscussionmembershipIDActionrequired(Integer fkiDiscussionmembershipIDActionrequired) {
    this.fkiDiscussionmembershipIDActionrequired = fkiDiscussionmembershipIDActionrequired;
  }

  /**
   * The content of the Discussionmessage
   **/
  @ApiModelProperty(value = "The content of the Discussionmessage")
  public String getTDiscussionmessageContent() {
    return tDiscussionmessageContent;
  }
  public void setTDiscussionmessageContent(String tDiscussionmessageContent) {
    this.tDiscussionmessageContent = tDiscussionmessageContent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscussionmessageRequestPatch discussionmessageRequestPatch = (DiscussionmessageRequestPatch) o;
    return (this.fkiDiscussionmembershipIDActionrequired == null ? discussionmessageRequestPatch.fkiDiscussionmembershipIDActionrequired == null : this.fkiDiscussionmembershipIDActionrequired.equals(discussionmessageRequestPatch.fkiDiscussionmembershipIDActionrequired)) &&
        (this.tDiscussionmessageContent == null ? discussionmessageRequestPatch.tDiscussionmessageContent == null : this.tDiscussionmessageContent.equals(discussionmessageRequestPatch.tDiscussionmessageContent));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fkiDiscussionmembershipIDActionrequired == null ? 0: this.fkiDiscussionmembershipIDActionrequired.hashCode());
    result = 31 * result + (this.tDiscussionmessageContent == null ? 0: this.tDiscussionmessageContent.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscussionmessageRequestPatch {\n");
    
    sb.append("  fkiDiscussionmembershipIDActionrequired: ").append(fkiDiscussionmembershipIDActionrequired).append("\n");
    sb.append("  tDiscussionmessageContent: ").append(tDiscussionmessageContent).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
