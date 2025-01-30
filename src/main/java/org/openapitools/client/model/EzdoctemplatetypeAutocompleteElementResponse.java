/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.2
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
 * A Ezdoctemplatetype AutocompleteElement Response
 **/
@ApiModel(description = "A Ezdoctemplatetype AutocompleteElement Response")
public class EzdoctemplatetypeAutocompleteElementResponse {
  
  @SerializedName("pkiEzdoctemplatetypeID")
  private Integer pkiEzdoctemplatetypeID = null;
  @SerializedName("sEzdoctemplatetypeDescriptionX")
  private String sEzdoctemplatetypeDescriptionX = null;
  @SerializedName("bEzdoctemplatetypeIsactive")
  private Boolean bEzdoctemplatetypeIsactive = null;

  /**
   * The unique ID of the Ezdoctemplatetype
   * minimum: 0
   * maximum: 255
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezdoctemplatetype")
  public Integer getPkiEzdoctemplatetypeID() {
    return pkiEzdoctemplatetypeID;
  }
  public void setPkiEzdoctemplatetypeID(Integer pkiEzdoctemplatetypeID) {
    this.pkiEzdoctemplatetypeID = pkiEzdoctemplatetypeID;
  }

  /**
   * The description of the Ezdoctemplatetype in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The description of the Ezdoctemplatetype in the language of the requester")
  public String getSEzdoctemplatetypeDescriptionX() {
    return sEzdoctemplatetypeDescriptionX;
  }
  public void setSEzdoctemplatetypeDescriptionX(String sEzdoctemplatetypeDescriptionX) {
    this.sEzdoctemplatetypeDescriptionX = sEzdoctemplatetypeDescriptionX;
  }

  /**
   * Whether the Ezdoctemplatetype is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Ezdoctemplatetype is active or not")
  public Boolean getBEzdoctemplatetypeIsactive() {
    return bEzdoctemplatetypeIsactive;
  }
  public void setBEzdoctemplatetypeIsactive(Boolean bEzdoctemplatetypeIsactive) {
    this.bEzdoctemplatetypeIsactive = bEzdoctemplatetypeIsactive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzdoctemplatetypeAutocompleteElementResponse ezdoctemplatetypeAutocompleteElementResponse = (EzdoctemplatetypeAutocompleteElementResponse) o;
    return (this.pkiEzdoctemplatetypeID == null ? ezdoctemplatetypeAutocompleteElementResponse.pkiEzdoctemplatetypeID == null : this.pkiEzdoctemplatetypeID.equals(ezdoctemplatetypeAutocompleteElementResponse.pkiEzdoctemplatetypeID)) &&
        (this.sEzdoctemplatetypeDescriptionX == null ? ezdoctemplatetypeAutocompleteElementResponse.sEzdoctemplatetypeDescriptionX == null : this.sEzdoctemplatetypeDescriptionX.equals(ezdoctemplatetypeAutocompleteElementResponse.sEzdoctemplatetypeDescriptionX)) &&
        (this.bEzdoctemplatetypeIsactive == null ? ezdoctemplatetypeAutocompleteElementResponse.bEzdoctemplatetypeIsactive == null : this.bEzdoctemplatetypeIsactive.equals(ezdoctemplatetypeAutocompleteElementResponse.bEzdoctemplatetypeIsactive));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzdoctemplatetypeID == null ? 0: this.pkiEzdoctemplatetypeID.hashCode());
    result = 31 * result + (this.sEzdoctemplatetypeDescriptionX == null ? 0: this.sEzdoctemplatetypeDescriptionX.hashCode());
    result = 31 * result + (this.bEzdoctemplatetypeIsactive == null ? 0: this.bEzdoctemplatetypeIsactive.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzdoctemplatetypeAutocompleteElementResponse {\n");
    
    sb.append("  pkiEzdoctemplatetypeID: ").append(pkiEzdoctemplatetypeID).append("\n");
    sb.append("  sEzdoctemplatetypeDescriptionX: ").append(sEzdoctemplatetypeDescriptionX).append("\n");
    sb.append("  bEzdoctemplatetypeIsactive: ").append(bEzdoctemplatetypeIsactive).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
