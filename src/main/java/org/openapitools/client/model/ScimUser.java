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
import org.openapitools.client.model.ScimEmail;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ScimUser {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("userName")
  private String userName = null;
  @SerializedName("displayName")
  private String displayName = null;
  @SerializedName("emails")
  private List<ScimEmail> emails = null;

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
   * A service provider's unique identifier for the user, typically used by the user to directly authenticate to the service provider.  Often displayed to the user as their unique identifier within the system (as opposed to \"id\" or \"externalId\", which are generally opaque and not user-friendly identifiers).  Each User MUST include a non-empty userName value.  This identifier MUST be unique across the service provider's entire set of Users.  This attribute is REQUIRED and is case insensitive.
   **/
  @ApiModelProperty(required = true, value = "A service provider's unique identifier for the user, typically used by the user to directly authenticate to the service provider.  Often displayed to the user as their unique identifier within the system (as opposed to \"id\" or \"externalId\", which are generally opaque and not user-friendly identifiers).  Each User MUST include a non-empty userName value.  This identifier MUST be unique across the service provider's entire set of Users.  This attribute is REQUIRED and is case insensitive.")
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ScimEmail> getEmails() {
    return emails;
  }
  public void setEmails(List<ScimEmail> emails) {
    this.emails = emails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimUser scimUser = (ScimUser) o;
    return (this.id == null ? scimUser.id == null : this.id.equals(scimUser.id)) &&
        (this.userName == null ? scimUser.userName == null : this.userName.equals(scimUser.userName)) &&
        (this.displayName == null ? scimUser.displayName == null : this.displayName.equals(scimUser.displayName)) &&
        (this.emails == null ? scimUser.emails == null : this.emails.equals(scimUser.emails));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.userName == null ? 0: this.userName.hashCode());
    result = 31 * result + (this.displayName == null ? 0: this.displayName.hashCode());
    result = 31 * result + (this.emails == null ? 0: this.emails.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimUser {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  userName: ").append(userName).append("\n");
    sb.append("  displayName: ").append(displayName).append("\n");
    sb.append("  emails: ").append(emails).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
