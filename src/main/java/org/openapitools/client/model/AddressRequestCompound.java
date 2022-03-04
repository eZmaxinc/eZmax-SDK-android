/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.5
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.AddressRequest;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Address Object and children to create a complete structure
 **/
@ApiModel(description = "An Address Object and children to create a complete structure")
public class AddressRequestCompound {
  
  @SerializedName("fkiAddresstypeID")
  private Integer fkiAddresstypeID = null;
  @SerializedName("sAddressCivic")
  private String sAddressCivic = null;
  @SerializedName("sAddressStreet")
  private String sAddressStreet = null;
  @SerializedName("sAddressSuite")
  private String sAddressSuite = null;
  @SerializedName("sAddressCity")
  private String sAddressCity = null;
  @SerializedName("fkiProvinceID")
  private Integer fkiProvinceID = null;
  @SerializedName("fkiCountryID")
  private Integer fkiCountryID = null;
  @SerializedName("sAddressZip")
  private String sAddressZip = null;

  /**
   * The unique ID of the Addresstype.  Valid values:  |Value|Description| |-|-| |1|Office| |2|Home| |3|Real Estate Invoice| |4|Invoicing| |5|Shipping|
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Addresstype.  Valid values:  |Value|Description| |-|-| |1|Office| |2|Home| |3|Real Estate Invoice| |4|Invoicing| |5|Shipping|")
  public Integer getFkiAddresstypeID() {
    return fkiAddresstypeID;
  }
  public void setFkiAddresstypeID(Integer fkiAddresstypeID) {
    this.fkiAddresstypeID = fkiAddresstypeID;
  }

  /**
   * The Civic number.
   **/
  @ApiModelProperty(required = true, value = "The Civic number.")
  public String getSAddressCivic() {
    return sAddressCivic;
  }
  public void setSAddressCivic(String sAddressCivic) {
    this.sAddressCivic = sAddressCivic;
  }

  /**
   * The Street Name
   **/
  @ApiModelProperty(required = true, value = "The Street Name")
  public String getSAddressStreet() {
    return sAddressStreet;
  }
  public void setSAddressStreet(String sAddressStreet) {
    this.sAddressStreet = sAddressStreet;
  }

  /**
   * The Suite or appartment number
   **/
  @ApiModelProperty(required = true, value = "The Suite or appartment number")
  public String getSAddressSuite() {
    return sAddressSuite;
  }
  public void setSAddressSuite(String sAddressSuite) {
    this.sAddressSuite = sAddressSuite;
  }

  /**
   * The City name
   **/
  @ApiModelProperty(required = true, value = "The City name")
  public String getSAddressCity() {
    return sAddressCity;
  }
  public void setSAddressCity(String sAddressCity) {
    this.sAddressCity = sAddressCity;
  }

  /**
   * The unique ID of the Province.  Here are some common values (Complete list must be retrieved from API):  |Value|Description| |-|-| |1|(Canada) Alberta |2|(Canada) British Columbia| |3|(Canada) Manitoba| |3|(Canada) Manitoba| |4|(Canada) New Brunswick| |5|(Canada) Newfoundland| |6|(Canada) Northwest Territories| |7|(Canada) Nova Scotia| |8|(Canada) Nunavut| |9|(Canada) Ontario| |10|(Canada) Prince Edward Island| |11|(Canada) Quebec| |12|(Canada) Saskatchewan| |13|(Canada) Yukon| |14|(United-States) Alabama| |15|(United-States) Alaska| |16|(United-States) Arizona| |17|(United-States) Arkansas| |18|(United-States) California| |19|(United-States) Colorado| |20|(United-States) Connecticut| |21|(United-States) Delaware| |22|(United-States) District of Columbia| |23|(United-States) Florida| |24|(United-States) Georgia| |25|(United-States) Hawaii| |26|(United-States) Idaho| |27|(United-States) Illinois| |28|(United-States) Indiana| |29|(United-States) Iowa| |30|(United-States) Kansas| |31|(United-States) Kentucky| |32|(United-States) Louisiane| |33|(United-States) Maine| |34|(United-States) Maryland| |35|(United-States) Massachusetts| |36|(United-States) Michigan| |37|(United-States) Minnesota| |38|(United-States) Mississippi| |39|(United-States) Missouri| |40|(United-States) Montana| |41|(United-States) Nebraska| |42|(United-States) Nevada| |43|(United-States) New Hampshire| |44|(United-States) New Jersey| |45|(United-States) New Mexico| |46|(United-States) New York| |47|(United-States) North Carolina| |48|(United-States) North Dakota| |49|(United-States) Ohio| |50|(United-States) Oklahoma| |51|(United-States) Oregon| |52|(United-States) Pennsylvania| |53|(United-States) Rhode Island| |54|(United-States) South Carolina| |55|(United-States) South Dakota| |56|(United-States) Tennessee| |57|(United-States) Texas| |58|(United-States) Utah| |60|(United-States) Vermont| |59|(United-States) Virginia| |61|(United-States) Washington| |62|(United-States) West Virginia| |63|(United-States) Wisconsin| |64|(United-States) Wyoming|
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Province.  Here are some common values (Complete list must be retrieved from API):  |Value|Description| |-|-| |1|(Canada) Alberta |2|(Canada) British Columbia| |3|(Canada) Manitoba| |3|(Canada) Manitoba| |4|(Canada) New Brunswick| |5|(Canada) Newfoundland| |6|(Canada) Northwest Territories| |7|(Canada) Nova Scotia| |8|(Canada) Nunavut| |9|(Canada) Ontario| |10|(Canada) Prince Edward Island| |11|(Canada) Quebec| |12|(Canada) Saskatchewan| |13|(Canada) Yukon| |14|(United-States) Alabama| |15|(United-States) Alaska| |16|(United-States) Arizona| |17|(United-States) Arkansas| |18|(United-States) California| |19|(United-States) Colorado| |20|(United-States) Connecticut| |21|(United-States) Delaware| |22|(United-States) District of Columbia| |23|(United-States) Florida| |24|(United-States) Georgia| |25|(United-States) Hawaii| |26|(United-States) Idaho| |27|(United-States) Illinois| |28|(United-States) Indiana| |29|(United-States) Iowa| |30|(United-States) Kansas| |31|(United-States) Kentucky| |32|(United-States) Louisiane| |33|(United-States) Maine| |34|(United-States) Maryland| |35|(United-States) Massachusetts| |36|(United-States) Michigan| |37|(United-States) Minnesota| |38|(United-States) Mississippi| |39|(United-States) Missouri| |40|(United-States) Montana| |41|(United-States) Nebraska| |42|(United-States) Nevada| |43|(United-States) New Hampshire| |44|(United-States) New Jersey| |45|(United-States) New Mexico| |46|(United-States) New York| |47|(United-States) North Carolina| |48|(United-States) North Dakota| |49|(United-States) Ohio| |50|(United-States) Oklahoma| |51|(United-States) Oregon| |52|(United-States) Pennsylvania| |53|(United-States) Rhode Island| |54|(United-States) South Carolina| |55|(United-States) South Dakota| |56|(United-States) Tennessee| |57|(United-States) Texas| |58|(United-States) Utah| |60|(United-States) Vermont| |59|(United-States) Virginia| |61|(United-States) Washington| |62|(United-States) West Virginia| |63|(United-States) Wisconsin| |64|(United-States) Wyoming|")
  public Integer getFkiProvinceID() {
    return fkiProvinceID;
  }
  public void setFkiProvinceID(Integer fkiProvinceID) {
    this.fkiProvinceID = fkiProvinceID;
  }

  /**
   * The unique ID of the Country.  Here are some common values (Complete list must be retrieved from API):  |Value|Description| |-|-| |1|Canada| |2|United-States|
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Country.  Here are some common values (Complete list must be retrieved from API):  |Value|Description| |-|-| |1|Canada| |2|United-States|")
  public Integer getFkiCountryID() {
    return fkiCountryID;
  }
  public void setFkiCountryID(Integer fkiCountryID) {
    this.fkiCountryID = fkiCountryID;
  }

  /**
   * The Postal/Zip Code  The value must be entered without spaces
   **/
  @ApiModelProperty(required = true, value = "The Postal/Zip Code  The value must be entered without spaces")
  public String getSAddressZip() {
    return sAddressZip;
  }
  public void setSAddressZip(String sAddressZip) {
    this.sAddressZip = sAddressZip;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressRequestCompound addressRequestCompound = (AddressRequestCompound) o;
    return (this.fkiAddresstypeID == null ? addressRequestCompound.fkiAddresstypeID == null : this.fkiAddresstypeID.equals(addressRequestCompound.fkiAddresstypeID)) &&
        (this.sAddressCivic == null ? addressRequestCompound.sAddressCivic == null : this.sAddressCivic.equals(addressRequestCompound.sAddressCivic)) &&
        (this.sAddressStreet == null ? addressRequestCompound.sAddressStreet == null : this.sAddressStreet.equals(addressRequestCompound.sAddressStreet)) &&
        (this.sAddressSuite == null ? addressRequestCompound.sAddressSuite == null : this.sAddressSuite.equals(addressRequestCompound.sAddressSuite)) &&
        (this.sAddressCity == null ? addressRequestCompound.sAddressCity == null : this.sAddressCity.equals(addressRequestCompound.sAddressCity)) &&
        (this.fkiProvinceID == null ? addressRequestCompound.fkiProvinceID == null : this.fkiProvinceID.equals(addressRequestCompound.fkiProvinceID)) &&
        (this.fkiCountryID == null ? addressRequestCompound.fkiCountryID == null : this.fkiCountryID.equals(addressRequestCompound.fkiCountryID)) &&
        (this.sAddressZip == null ? addressRequestCompound.sAddressZip == null : this.sAddressZip.equals(addressRequestCompound.sAddressZip));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fkiAddresstypeID == null ? 0: this.fkiAddresstypeID.hashCode());
    result = 31 * result + (this.sAddressCivic == null ? 0: this.sAddressCivic.hashCode());
    result = 31 * result + (this.sAddressStreet == null ? 0: this.sAddressStreet.hashCode());
    result = 31 * result + (this.sAddressSuite == null ? 0: this.sAddressSuite.hashCode());
    result = 31 * result + (this.sAddressCity == null ? 0: this.sAddressCity.hashCode());
    result = 31 * result + (this.fkiProvinceID == null ? 0: this.fkiProvinceID.hashCode());
    result = 31 * result + (this.fkiCountryID == null ? 0: this.fkiCountryID.hashCode());
    result = 31 * result + (this.sAddressZip == null ? 0: this.sAddressZip.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressRequestCompound {\n");
    
    sb.append("  fkiAddresstypeID: ").append(fkiAddresstypeID).append("\n");
    sb.append("  sAddressCivic: ").append(sAddressCivic).append("\n");
    sb.append("  sAddressStreet: ").append(sAddressStreet).append("\n");
    sb.append("  sAddressSuite: ").append(sAddressSuite).append("\n");
    sb.append("  sAddressCity: ").append(sAddressCity).append("\n");
    sb.append("  fkiProvinceID: ").append(fkiProvinceID).append("\n");
    sb.append("  fkiCountryID: ").append(fkiCountryID).append("\n");
    sb.append("  sAddressZip: ").append(sAddressZip).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
