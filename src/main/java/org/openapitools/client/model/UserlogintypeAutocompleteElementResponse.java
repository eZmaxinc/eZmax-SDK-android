/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.0
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
 * A Userlogintype AutocompleteElement Response
 **/
@ApiModel(description = "A Userlogintype AutocompleteElement Response")
public class UserlogintypeAutocompleteElementResponse {
  
  @SerializedName("pkiUserlogintypeID")
  private Integer pkiUserlogintypeID = null;
  @SerializedName("sUserlogintypeDescriptionX")
  private String sUserlogintypeDescriptionX = null;
  @SerializedName("bUserlogintypeIsactive")
  private Boolean bUserlogintypeIsactive = null;

  /**
   * The unique ID of the Userlogintype  Valid values:  |Value|Description|Detail| |-|-|-| |1|**Email Only**|The Ezsignsigner will receive a secure link by email| |2|**Email and phone or SMS**|The Ezsignsigner will receive a secure link by email and will need to authenticate using SMS or Phone call. **Additional fee applies**| |3|**Email and secret question**|The Ezsignsigner will receive a secure link by email and will need to authenticate using a predefined question and answer| |4|**In person only**|The Ezsignsigner will only be able to sign \"In-Person\" and there won't be any authentication. No email will be sent for invitation to sign. Make sure you evaluate the risk of signature denial and at minimum, we recommend you use a handwritten signature type| |5|**In person with phone or SMS**|The Ezsignsigner will only be able to sign \"In-Person\" and will need to authenticate using SMS or Phone call. No email will be sent for invitation to sign. **Additional fee applies**|
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Userlogintype  Valid values:  |Value|Description|Detail| |-|-|-| |1|**Email Only**|The Ezsignsigner will receive a secure link by email| |2|**Email and phone or SMS**|The Ezsignsigner will receive a secure link by email and will need to authenticate using SMS or Phone call. **Additional fee applies**| |3|**Email and secret question**|The Ezsignsigner will receive a secure link by email and will need to authenticate using a predefined question and answer| |4|**In person only**|The Ezsignsigner will only be able to sign \"In-Person\" and there won't be any authentication. No email will be sent for invitation to sign. Make sure you evaluate the risk of signature denial and at minimum, we recommend you use a handwritten signature type| |5|**In person with phone or SMS**|The Ezsignsigner will only be able to sign \"In-Person\" and will need to authenticate using SMS or Phone call. No email will be sent for invitation to sign. **Additional fee applies**|")
  public Integer getPkiUserlogintypeID() {
    return pkiUserlogintypeID;
  }
  public void setPkiUserlogintypeID(Integer pkiUserlogintypeID) {
    this.pkiUserlogintypeID = pkiUserlogintypeID;
  }

  /**
   * The description of the Userlogintype in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The description of the Userlogintype in the language of the requester")
  public String getSUserlogintypeDescriptionX() {
    return sUserlogintypeDescriptionX;
  }
  public void setSUserlogintypeDescriptionX(String sUserlogintypeDescriptionX) {
    this.sUserlogintypeDescriptionX = sUserlogintypeDescriptionX;
  }

  /**
   * Whether the Userlogintype is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Userlogintype is active or not")
  public Boolean getBUserlogintypeIsactive() {
    return bUserlogintypeIsactive;
  }
  public void setBUserlogintypeIsactive(Boolean bUserlogintypeIsactive) {
    this.bUserlogintypeIsactive = bUserlogintypeIsactive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserlogintypeAutocompleteElementResponse userlogintypeAutocompleteElementResponse = (UserlogintypeAutocompleteElementResponse) o;
    return (this.pkiUserlogintypeID == null ? userlogintypeAutocompleteElementResponse.pkiUserlogintypeID == null : this.pkiUserlogintypeID.equals(userlogintypeAutocompleteElementResponse.pkiUserlogintypeID)) &&
        (this.sUserlogintypeDescriptionX == null ? userlogintypeAutocompleteElementResponse.sUserlogintypeDescriptionX == null : this.sUserlogintypeDescriptionX.equals(userlogintypeAutocompleteElementResponse.sUserlogintypeDescriptionX)) &&
        (this.bUserlogintypeIsactive == null ? userlogintypeAutocompleteElementResponse.bUserlogintypeIsactive == null : this.bUserlogintypeIsactive.equals(userlogintypeAutocompleteElementResponse.bUserlogintypeIsactive));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiUserlogintypeID == null ? 0: this.pkiUserlogintypeID.hashCode());
    result = 31 * result + (this.sUserlogintypeDescriptionX == null ? 0: this.sUserlogintypeDescriptionX.hashCode());
    result = 31 * result + (this.bUserlogintypeIsactive == null ? 0: this.bUserlogintypeIsactive.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserlogintypeAutocompleteElementResponse {\n");
    
    sb.append("  pkiUserlogintypeID: ").append(pkiUserlogintypeID).append("\n");
    sb.append("  sUserlogintypeDescriptionX: ").append(sUserlogintypeDescriptionX).append("\n");
    sb.append("  bUserlogintypeIsactive: ").append(bUserlogintypeIsactive).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}