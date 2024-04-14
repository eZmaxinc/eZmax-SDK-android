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
 * A Ezsigntsarequirement AutocompleteElement Response
 **/
@ApiModel(description = "A Ezsigntsarequirement AutocompleteElement Response")
public class EzsigntsarequirementAutocompleteElementResponse {
  
  @SerializedName("sEzsigntsarequirementDescriptionX")
  private String sEzsigntsarequirementDescriptionX = null;
  @SerializedName("pkiEzsigntsarequirementID")
  private Integer pkiEzsigntsarequirementID = null;
  @SerializedName("bEzsigntsarequirementIsactive")
  private Boolean bEzsigntsarequirementIsactive = null;
  @SerializedName("bDisabled")
  private Boolean bDisabled = null;

  /**
   * The description of the Ezsigntsarequirement in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The description of the Ezsigntsarequirement in the language of the requester")
  public String getSEzsigntsarequirementDescriptionX() {
    return sEzsigntsarequirementDescriptionX;
  }
  public void setSEzsigntsarequirementDescriptionX(String sEzsigntsarequirementDescriptionX) {
    this.sEzsigntsarequirementDescriptionX = sEzsigntsarequirementDescriptionX;
  }

  /**
   * The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server's time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server's time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**|
   * minimum: 1
   * maximum: 3
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server's time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server's time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**|")
  public Integer getPkiEzsigntsarequirementID() {
    return pkiEzsigntsarequirementID;
  }
  public void setPkiEzsigntsarequirementID(Integer pkiEzsigntsarequirementID) {
    this.pkiEzsigntsarequirementID = pkiEzsigntsarequirementID;
  }

  /**
   * Whether the Ezsigntsarequirement is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Ezsigntsarequirement is active or not")
  public Boolean getBEzsigntsarequirementIsactive() {
    return bEzsigntsarequirementIsactive;
  }
  public void setBEzsigntsarequirementIsactive(Boolean bEzsigntsarequirementIsactive) {
    this.bEzsigntsarequirementIsactive = bEzsigntsarequirementIsactive;
  }

  /**
   * Indicates if the element is disabled in the context
   **/
  @ApiModelProperty(required = true, value = "Indicates if the element is disabled in the context")
  public Boolean getBDisabled() {
    return bDisabled;
  }
  public void setBDisabled(Boolean bDisabled) {
    this.bDisabled = bDisabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntsarequirementAutocompleteElementResponse ezsigntsarequirementAutocompleteElementResponse = (EzsigntsarequirementAutocompleteElementResponse) o;
    return (this.sEzsigntsarequirementDescriptionX == null ? ezsigntsarequirementAutocompleteElementResponse.sEzsigntsarequirementDescriptionX == null : this.sEzsigntsarequirementDescriptionX.equals(ezsigntsarequirementAutocompleteElementResponse.sEzsigntsarequirementDescriptionX)) &&
        (this.pkiEzsigntsarequirementID == null ? ezsigntsarequirementAutocompleteElementResponse.pkiEzsigntsarequirementID == null : this.pkiEzsigntsarequirementID.equals(ezsigntsarequirementAutocompleteElementResponse.pkiEzsigntsarequirementID)) &&
        (this.bEzsigntsarequirementIsactive == null ? ezsigntsarequirementAutocompleteElementResponse.bEzsigntsarequirementIsactive == null : this.bEzsigntsarequirementIsactive.equals(ezsigntsarequirementAutocompleteElementResponse.bEzsigntsarequirementIsactive)) &&
        (this.bDisabled == null ? ezsigntsarequirementAutocompleteElementResponse.bDisabled == null : this.bDisabled.equals(ezsigntsarequirementAutocompleteElementResponse.bDisabled));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sEzsigntsarequirementDescriptionX == null ? 0: this.sEzsigntsarequirementDescriptionX.hashCode());
    result = 31 * result + (this.pkiEzsigntsarequirementID == null ? 0: this.pkiEzsigntsarequirementID.hashCode());
    result = 31 * result + (this.bEzsigntsarequirementIsactive == null ? 0: this.bEzsigntsarequirementIsactive.hashCode());
    result = 31 * result + (this.bDisabled == null ? 0: this.bDisabled.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntsarequirementAutocompleteElementResponse {\n");
    
    sb.append("  sEzsigntsarequirementDescriptionX: ").append(sEzsigntsarequirementDescriptionX).append("\n");
    sb.append("  pkiEzsigntsarequirementID: ").append(pkiEzsigntsarequirementID).append("\n");
    sb.append("  bEzsigntsarequirementIsactive: ").append(bEzsigntsarequirementIsactive).append("\n");
    sb.append("  bDisabled: ").append(bDisabled).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
