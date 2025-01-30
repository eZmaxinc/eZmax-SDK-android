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
 * A Province AutocompleteElement Response
 **/
@ApiModel(description = "A Province AutocompleteElement Response")
public class ProvinceAutocompleteElementResponse {
  
  @SerializedName("pkiProvinceID")
  private Integer pkiProvinceID = null;
  @SerializedName("fkiCountryID")
  private Integer fkiCountryID = null;
  @SerializedName("sProvinceNameX")
  private String sProvinceNameX = null;
  @SerializedName("sProvinceShortname")
  private String sProvinceShortname = null;
  @SerializedName("bProvinceIsactive")
  private Boolean bProvinceIsactive = null;

  /**
   * The unique ID of the Province.  Here are some common values (Complete list must be retrieved from API):  |Value|Description| |-|-| |1|(Canada) Alberta |2|(Canada) British Columbia| |3|(Canada) Manitoba| |3|(Canada) Manitoba| |4|(Canada) New Brunswick| |5|(Canada) Newfoundland| |6|(Canada) Northwest Territories| |7|(Canada) Nova Scotia| |8|(Canada) Nunavut| |9|(Canada) Ontario| |10|(Canada) Prince Edward Island| |11|(Canada) Quebec| |12|(Canada) Saskatchewan| |13|(Canada) Yukon| |14|(United-States) Alabama| |15|(United-States) Alaska| |16|(United-States) Arizona| |17|(United-States) Arkansas| |18|(United-States) California| |19|(United-States) Colorado| |20|(United-States) Connecticut| |21|(United-States) Delaware| |22|(United-States) District of Columbia| |23|(United-States) Florida| |24|(United-States) Georgia| |25|(United-States) Hawaii| |26|(United-States) Idaho| |27|(United-States) Illinois| |28|(United-States) Indiana| |29|(United-States) Iowa| |30|(United-States) Kansas| |31|(United-States) Kentucky| |32|(United-States) Louisiane| |33|(United-States) Maine| |34|(United-States) Maryland| |35|(United-States) Massachusetts| |36|(United-States) Michigan| |37|(United-States) Minnesota| |38|(United-States) Mississippi| |39|(United-States) Missouri| |40|(United-States) Montana| |41|(United-States) Nebraska| |42|(United-States) Nevada| |43|(United-States) New Hampshire| |44|(United-States) New Jersey| |45|(United-States) New Mexico| |46|(United-States) New York| |47|(United-States) North Carolina| |48|(United-States) North Dakota| |49|(United-States) Ohio| |50|(United-States) Oklahoma| |51|(United-States) Oregon| |52|(United-States) Pennsylvania| |53|(United-States) Rhode Island| |54|(United-States) South Carolina| |55|(United-States) South Dakota| |56|(United-States) Tennessee| |57|(United-States) Texas| |58|(United-States) Utah| |60|(United-States) Vermont| |59|(United-States) Virginia| |61|(United-States) Washington| |62|(United-States) West Virginia| |63|(United-States) Wisconsin| |64|(United-States) Wyoming|
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Province.  Here are some common values (Complete list must be retrieved from API):  |Value|Description| |-|-| |1|(Canada) Alberta |2|(Canada) British Columbia| |3|(Canada) Manitoba| |3|(Canada) Manitoba| |4|(Canada) New Brunswick| |5|(Canada) Newfoundland| |6|(Canada) Northwest Territories| |7|(Canada) Nova Scotia| |8|(Canada) Nunavut| |9|(Canada) Ontario| |10|(Canada) Prince Edward Island| |11|(Canada) Quebec| |12|(Canada) Saskatchewan| |13|(Canada) Yukon| |14|(United-States) Alabama| |15|(United-States) Alaska| |16|(United-States) Arizona| |17|(United-States) Arkansas| |18|(United-States) California| |19|(United-States) Colorado| |20|(United-States) Connecticut| |21|(United-States) Delaware| |22|(United-States) District of Columbia| |23|(United-States) Florida| |24|(United-States) Georgia| |25|(United-States) Hawaii| |26|(United-States) Idaho| |27|(United-States) Illinois| |28|(United-States) Indiana| |29|(United-States) Iowa| |30|(United-States) Kansas| |31|(United-States) Kentucky| |32|(United-States) Louisiane| |33|(United-States) Maine| |34|(United-States) Maryland| |35|(United-States) Massachusetts| |36|(United-States) Michigan| |37|(United-States) Minnesota| |38|(United-States) Mississippi| |39|(United-States) Missouri| |40|(United-States) Montana| |41|(United-States) Nebraska| |42|(United-States) Nevada| |43|(United-States) New Hampshire| |44|(United-States) New Jersey| |45|(United-States) New Mexico| |46|(United-States) New York| |47|(United-States) North Carolina| |48|(United-States) North Dakota| |49|(United-States) Ohio| |50|(United-States) Oklahoma| |51|(United-States) Oregon| |52|(United-States) Pennsylvania| |53|(United-States) Rhode Island| |54|(United-States) South Carolina| |55|(United-States) South Dakota| |56|(United-States) Tennessee| |57|(United-States) Texas| |58|(United-States) Utah| |60|(United-States) Vermont| |59|(United-States) Virginia| |61|(United-States) Washington| |62|(United-States) West Virginia| |63|(United-States) Wisconsin| |64|(United-States) Wyoming|")
  public Integer getPkiProvinceID() {
    return pkiProvinceID;
  }
  public void setPkiProvinceID(Integer pkiProvinceID) {
    this.pkiProvinceID = pkiProvinceID;
  }

  /**
   * The unique ID of the Country.  Here are some common values (Complete list must be retrieved from API):  |Value|Description| |-|-| |1|Canada| |2|United-States|
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Country.  Here are some common values (Complete list must be retrieved from API):  |Value|Description| |-|-| |1|Canada| |2|United-States|")
  public Integer getFkiCountryID() {
    return fkiCountryID;
  }
  public void setFkiCountryID(Integer fkiCountryID) {
    this.fkiCountryID = fkiCountryID;
  }

  /**
   * The name of the Province in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The name of the Province in the language of the requester")
  public String getSProvinceNameX() {
    return sProvinceNameX;
  }
  public void setSProvinceNameX(String sProvinceNameX) {
    this.sProvinceNameX = sProvinceNameX;
  }

  /**
   * The shortname of the Province
   **/
  @ApiModelProperty(required = true, value = "The shortname of the Province")
  public String getSProvinceShortname() {
    return sProvinceShortname;
  }
  public void setSProvinceShortname(String sProvinceShortname) {
    this.sProvinceShortname = sProvinceShortname;
  }

  /**
   * Whether the Province is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Province is active or not")
  public Boolean getBProvinceIsactive() {
    return bProvinceIsactive;
  }
  public void setBProvinceIsactive(Boolean bProvinceIsactive) {
    this.bProvinceIsactive = bProvinceIsactive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvinceAutocompleteElementResponse provinceAutocompleteElementResponse = (ProvinceAutocompleteElementResponse) o;
    return (this.pkiProvinceID == null ? provinceAutocompleteElementResponse.pkiProvinceID == null : this.pkiProvinceID.equals(provinceAutocompleteElementResponse.pkiProvinceID)) &&
        (this.fkiCountryID == null ? provinceAutocompleteElementResponse.fkiCountryID == null : this.fkiCountryID.equals(provinceAutocompleteElementResponse.fkiCountryID)) &&
        (this.sProvinceNameX == null ? provinceAutocompleteElementResponse.sProvinceNameX == null : this.sProvinceNameX.equals(provinceAutocompleteElementResponse.sProvinceNameX)) &&
        (this.sProvinceShortname == null ? provinceAutocompleteElementResponse.sProvinceShortname == null : this.sProvinceShortname.equals(provinceAutocompleteElementResponse.sProvinceShortname)) &&
        (this.bProvinceIsactive == null ? provinceAutocompleteElementResponse.bProvinceIsactive == null : this.bProvinceIsactive.equals(provinceAutocompleteElementResponse.bProvinceIsactive));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiProvinceID == null ? 0: this.pkiProvinceID.hashCode());
    result = 31 * result + (this.fkiCountryID == null ? 0: this.fkiCountryID.hashCode());
    result = 31 * result + (this.sProvinceNameX == null ? 0: this.sProvinceNameX.hashCode());
    result = 31 * result + (this.sProvinceShortname == null ? 0: this.sProvinceShortname.hashCode());
    result = 31 * result + (this.bProvinceIsactive == null ? 0: this.bProvinceIsactive.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvinceAutocompleteElementResponse {\n");
    
    sb.append("  pkiProvinceID: ").append(pkiProvinceID).append("\n");
    sb.append("  fkiCountryID: ").append(fkiCountryID).append("\n");
    sb.append("  sProvinceNameX: ").append(sProvinceNameX).append("\n");
    sb.append("  sProvinceShortname: ").append(sProvinceShortname).append("\n");
    sb.append("  bProvinceIsactive: ").append(bProvinceIsactive).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
