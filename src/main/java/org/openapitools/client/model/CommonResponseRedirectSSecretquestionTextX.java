/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.17
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
 * 352 Redirect Message containing secret question
 **/
@ApiModel(description = "352 Redirect Message containing secret question")
public class CommonResponseRedirectSSecretquestionTextX {
  
  @SerializedName("sSecretquestionTextX")
  private String sSecretquestionTextX = null;

  /**
   * The text of the Secretquestion in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The text of the Secretquestion in the language of the requester")
  public String getSSecretquestionTextX() {
    return sSecretquestionTextX;
  }
  public void setSSecretquestionTextX(String sSecretquestionTextX) {
    this.sSecretquestionTextX = sSecretquestionTextX;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonResponseRedirectSSecretquestionTextX commonResponseRedirectSSecretquestionTextX = (CommonResponseRedirectSSecretquestionTextX) o;
    return (this.sSecretquestionTextX == null ? commonResponseRedirectSSecretquestionTextX.sSecretquestionTextX == null : this.sSecretquestionTextX.equals(commonResponseRedirectSSecretquestionTextX.sSecretquestionTextX));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sSecretquestionTextX == null ? 0: this.sSecretquestionTextX.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonResponseRedirectSSecretquestionTextX {\n");
    
    sb.append("  sSecretquestionTextX: ").append(sSecretquestionTextX).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
