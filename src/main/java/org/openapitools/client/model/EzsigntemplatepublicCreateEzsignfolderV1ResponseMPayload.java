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
 * Payload for POST /1/object/ezsigntemplatepublic/createEzsignfolder
 **/
@ApiModel(description = "Payload for POST /1/object/ezsigntemplatepublic/createEzsignfolder")
public class EzsigntemplatepublicCreateEzsignfolderV1ResponseMPayload {
  
  @SerializedName("sEzsigntemplatepublicSigningurl")
  private String sEzsigntemplatepublicSigningurl = null;

  /**
   * The url to sign the Ezsignfolder created by the Ezsigntemplatepublic. Only used when fkiUserLogintypeID is **No validation** or **Sms only**
   **/
  @ApiModelProperty(value = "The url to sign the Ezsignfolder created by the Ezsigntemplatepublic. Only used when fkiUserLogintypeID is **No validation** or **Sms only**")
  public String getSEzsigntemplatepublicSigningurl() {
    return sEzsigntemplatepublicSigningurl;
  }
  public void setSEzsigntemplatepublicSigningurl(String sEzsigntemplatepublicSigningurl) {
    this.sEzsigntemplatepublicSigningurl = sEzsigntemplatepublicSigningurl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatepublicCreateEzsignfolderV1ResponseMPayload ezsigntemplatepublicCreateEzsignfolderV1ResponseMPayload = (EzsigntemplatepublicCreateEzsignfolderV1ResponseMPayload) o;
    return (this.sEzsigntemplatepublicSigningurl == null ? ezsigntemplatepublicCreateEzsignfolderV1ResponseMPayload.sEzsigntemplatepublicSigningurl == null : this.sEzsigntemplatepublicSigningurl.equals(ezsigntemplatepublicCreateEzsignfolderV1ResponseMPayload.sEzsigntemplatepublicSigningurl));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sEzsigntemplatepublicSigningurl == null ? 0: this.sEzsigntemplatepublicSigningurl.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatepublicCreateEzsignfolderV1ResponseMPayload {\n");
    
    sb.append("  sEzsigntemplatepublicSigningurl: ").append(sEzsigntemplatepublicSigningurl).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
