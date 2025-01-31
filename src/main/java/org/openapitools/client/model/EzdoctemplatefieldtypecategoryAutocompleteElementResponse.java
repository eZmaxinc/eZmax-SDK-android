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
 * A Ezdoctemplatefieldtypecategory AutocompleteElement Response
 **/
@ApiModel(description = "A Ezdoctemplatefieldtypecategory AutocompleteElement Response")
public class EzdoctemplatefieldtypecategoryAutocompleteElementResponse {
  
  @SerializedName("pkiEzdoctemplatefieldtypecategoryID")
  private Integer pkiEzdoctemplatefieldtypecategoryID = null;
  @SerializedName("fkiEzdoctemplatetypeID")
  private Integer fkiEzdoctemplatetypeID = null;
  @SerializedName("sEzdoctemplatefieldtypecategoryDescriptionX")
  private String sEzdoctemplatefieldtypecategoryDescriptionX = null;
  @SerializedName("bEzdoctemplatefieldtypecategoryIsactive")
  private Boolean bEzdoctemplatefieldtypecategoryIsactive = null;

  /**
   * The unique ID of the Ezdoctemplatefieldtypecategory
   * minimum: 0
   * maximum: 255
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezdoctemplatefieldtypecategory")
  public Integer getPkiEzdoctemplatefieldtypecategoryID() {
    return pkiEzdoctemplatefieldtypecategoryID;
  }
  public void setPkiEzdoctemplatefieldtypecategoryID(Integer pkiEzdoctemplatefieldtypecategoryID) {
    this.pkiEzdoctemplatefieldtypecategoryID = pkiEzdoctemplatefieldtypecategoryID;
  }

  /**
   * The unique ID of the Ezdoctemplatetype
   * minimum: 0
   * maximum: 255
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezdoctemplatetype")
  public Integer getFkiEzdoctemplatetypeID() {
    return fkiEzdoctemplatetypeID;
  }
  public void setFkiEzdoctemplatetypeID(Integer fkiEzdoctemplatetypeID) {
    this.fkiEzdoctemplatetypeID = fkiEzdoctemplatetypeID;
  }

  /**
   * The description of the Ezdoctemplatefieldtypecategory in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The description of the Ezdoctemplatefieldtypecategory in the language of the requester")
  public String getSEzdoctemplatefieldtypecategoryDescriptionX() {
    return sEzdoctemplatefieldtypecategoryDescriptionX;
  }
  public void setSEzdoctemplatefieldtypecategoryDescriptionX(String sEzdoctemplatefieldtypecategoryDescriptionX) {
    this.sEzdoctemplatefieldtypecategoryDescriptionX = sEzdoctemplatefieldtypecategoryDescriptionX;
  }

  /**
   * Whether the Ezdoctemplatefieldtypecategory is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Ezdoctemplatefieldtypecategory is active or not")
  public Boolean getBEzdoctemplatefieldtypecategoryIsactive() {
    return bEzdoctemplatefieldtypecategoryIsactive;
  }
  public void setBEzdoctemplatefieldtypecategoryIsactive(Boolean bEzdoctemplatefieldtypecategoryIsactive) {
    this.bEzdoctemplatefieldtypecategoryIsactive = bEzdoctemplatefieldtypecategoryIsactive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzdoctemplatefieldtypecategoryAutocompleteElementResponse ezdoctemplatefieldtypecategoryAutocompleteElementResponse = (EzdoctemplatefieldtypecategoryAutocompleteElementResponse) o;
    return (this.pkiEzdoctemplatefieldtypecategoryID == null ? ezdoctemplatefieldtypecategoryAutocompleteElementResponse.pkiEzdoctemplatefieldtypecategoryID == null : this.pkiEzdoctemplatefieldtypecategoryID.equals(ezdoctemplatefieldtypecategoryAutocompleteElementResponse.pkiEzdoctemplatefieldtypecategoryID)) &&
        (this.fkiEzdoctemplatetypeID == null ? ezdoctemplatefieldtypecategoryAutocompleteElementResponse.fkiEzdoctemplatetypeID == null : this.fkiEzdoctemplatetypeID.equals(ezdoctemplatefieldtypecategoryAutocompleteElementResponse.fkiEzdoctemplatetypeID)) &&
        (this.sEzdoctemplatefieldtypecategoryDescriptionX == null ? ezdoctemplatefieldtypecategoryAutocompleteElementResponse.sEzdoctemplatefieldtypecategoryDescriptionX == null : this.sEzdoctemplatefieldtypecategoryDescriptionX.equals(ezdoctemplatefieldtypecategoryAutocompleteElementResponse.sEzdoctemplatefieldtypecategoryDescriptionX)) &&
        (this.bEzdoctemplatefieldtypecategoryIsactive == null ? ezdoctemplatefieldtypecategoryAutocompleteElementResponse.bEzdoctemplatefieldtypecategoryIsactive == null : this.bEzdoctemplatefieldtypecategoryIsactive.equals(ezdoctemplatefieldtypecategoryAutocompleteElementResponse.bEzdoctemplatefieldtypecategoryIsactive));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzdoctemplatefieldtypecategoryID == null ? 0: this.pkiEzdoctemplatefieldtypecategoryID.hashCode());
    result = 31 * result + (this.fkiEzdoctemplatetypeID == null ? 0: this.fkiEzdoctemplatetypeID.hashCode());
    result = 31 * result + (this.sEzdoctemplatefieldtypecategoryDescriptionX == null ? 0: this.sEzdoctemplatefieldtypecategoryDescriptionX.hashCode());
    result = 31 * result + (this.bEzdoctemplatefieldtypecategoryIsactive == null ? 0: this.bEzdoctemplatefieldtypecategoryIsactive.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzdoctemplatefieldtypecategoryAutocompleteElementResponse {\n");
    
    sb.append("  pkiEzdoctemplatefieldtypecategoryID: ").append(pkiEzdoctemplatefieldtypecategoryID).append("\n");
    sb.append("  fkiEzdoctemplatetypeID: ").append(fkiEzdoctemplatetypeID).append("\n");
    sb.append("  sEzdoctemplatefieldtypecategoryDescriptionX: ").append(sEzdoctemplatefieldtypecategoryDescriptionX).append("\n");
    sb.append("  bEzdoctemplatefieldtypecategoryIsactive: ").append(bEzdoctemplatefieldtypecategoryIsactive).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
