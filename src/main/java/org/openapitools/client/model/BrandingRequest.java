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

import org.openapitools.client.model.FieldEBrandingLogo;
import org.openapitools.client.model.MultilingualBrandingDescription;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Branding Object
 **/
@ApiModel(description = "A Branding Object")
public class BrandingRequest {
  
  @SerializedName("pkiBrandingID")
  private Integer pkiBrandingID = null;
  @SerializedName("objBrandingDescription")
  private MultilingualBrandingDescription objBrandingDescription = null;
  @SerializedName("eBrandingLogo")
  private FieldEBrandingLogo eBrandingLogo = null;
  @SerializedName("sBrandingBase64")
  private byte[] sBrandingBase64 = null;
  @SerializedName("iBrandingColortext")
  private Integer iBrandingColortext = null;
  @SerializedName("iBrandingColortextlinkbox")
  private Integer iBrandingColortextlinkbox = null;
  @SerializedName("iBrandingColortextbutton")
  private Integer iBrandingColortextbutton = null;
  @SerializedName("iBrandingColorbackground")
  private Integer iBrandingColorbackground = null;
  @SerializedName("iBrandingColorbackgroundbutton")
  private Integer iBrandingColorbackgroundbutton = null;
  @SerializedName("iBrandingColorbackgroundsmallbox")
  private Integer iBrandingColorbackgroundsmallbox = null;
  @SerializedName("sBrandingName")
  private String sBrandingName = null;
  @SerializedName("sEmailAddress")
  private String sEmailAddress = null;
  @SerializedName("bBrandingIsactive")
  private Boolean bBrandingIsactive = null;

  /**
   * The unique ID of the Branding
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Branding")
  public Integer getPkiBrandingID() {
    return pkiBrandingID;
  }
  public void setPkiBrandingID(Integer pkiBrandingID) {
    this.pkiBrandingID = pkiBrandingID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public MultilingualBrandingDescription getObjBrandingDescription() {
    return objBrandingDescription;
  }
  public void setObjBrandingDescription(MultilingualBrandingDescription objBrandingDescription) {
    this.objBrandingDescription = objBrandingDescription;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEBrandingLogo getEBrandingLogo() {
    return eBrandingLogo;
  }
  public void setEBrandingLogo(FieldEBrandingLogo eBrandingLogo) {
    this.eBrandingLogo = eBrandingLogo;
  }

  /**
   * The Base64 encoded binary content of the branding logo. This need to match image type selected in eBrandingLogo if you supply an image. If you select 'Default', the logo will be deleted and the default one will be used.
   **/
  @ApiModelProperty(value = "The Base64 encoded binary content of the branding logo. This need to match image type selected in eBrandingLogo if you supply an image. If you select 'Default', the logo will be deleted and the default one will be used.")
  public byte[] getSBrandingBase64() {
    return sBrandingBase64;
  }
  public void setSBrandingBase64(byte[] sBrandingBase64) {
    this.sBrandingBase64 = sBrandingBase64;
  }

  /**
   * The color of the text. This is a RGB color converted into integer
   * minimum: 0
   * maximum: 16777215
   **/
  @ApiModelProperty(required = true, value = "The color of the text. This is a RGB color converted into integer")
  public Integer getIBrandingColortext() {
    return iBrandingColortext;
  }
  public void setIBrandingColortext(Integer iBrandingColortext) {
    this.iBrandingColortext = iBrandingColortext;
  }

  /**
   * The color of the text in the link box. This is a RGB color converted into integer
   * minimum: 0
   * maximum: 16777215
   **/
  @ApiModelProperty(required = true, value = "The color of the text in the link box. This is a RGB color converted into integer")
  public Integer getIBrandingColortextlinkbox() {
    return iBrandingColortextlinkbox;
  }
  public void setIBrandingColortextlinkbox(Integer iBrandingColortextlinkbox) {
    this.iBrandingColortextlinkbox = iBrandingColortextlinkbox;
  }

  /**
   * The color of the text in the button. This is a RGB color converted into integer
   * minimum: 0
   * maximum: 16777215
   **/
  @ApiModelProperty(required = true, value = "The color of the text in the button. This is a RGB color converted into integer")
  public Integer getIBrandingColortextbutton() {
    return iBrandingColortextbutton;
  }
  public void setIBrandingColortextbutton(Integer iBrandingColortextbutton) {
    this.iBrandingColortextbutton = iBrandingColortextbutton;
  }

  /**
   * The color of the background. This is a RGB color converted into integer
   * minimum: 0
   * maximum: 16777215
   **/
  @ApiModelProperty(required = true, value = "The color of the background. This is a RGB color converted into integer")
  public Integer getIBrandingColorbackground() {
    return iBrandingColorbackground;
  }
  public void setIBrandingColorbackground(Integer iBrandingColorbackground) {
    this.iBrandingColorbackground = iBrandingColorbackground;
  }

  /**
   * The color of the background of the button. This is a RGB color converted into integer
   * minimum: 0
   * maximum: 16777215
   **/
  @ApiModelProperty(required = true, value = "The color of the background of the button. This is a RGB color converted into integer")
  public Integer getIBrandingColorbackgroundbutton() {
    return iBrandingColorbackgroundbutton;
  }
  public void setIBrandingColorbackgroundbutton(Integer iBrandingColorbackgroundbutton) {
    this.iBrandingColorbackgroundbutton = iBrandingColorbackgroundbutton;
  }

  /**
   * The color of the background of the small box. This is a RGB color converted into integer
   * minimum: 0
   * maximum: 16777215
   **/
  @ApiModelProperty(required = true, value = "The color of the background of the small box. This is a RGB color converted into integer")
  public Integer getIBrandingColorbackgroundsmallbox() {
    return iBrandingColorbackgroundsmallbox;
  }
  public void setIBrandingColorbackgroundsmallbox(Integer iBrandingColorbackgroundsmallbox) {
    this.iBrandingColorbackgroundsmallbox = iBrandingColorbackgroundsmallbox;
  }

  /**
   * The name of the Branding  This value will only be set if you wish to overwrite the default name. If you want to keep the default name, leave this property empty
   **/
  @ApiModelProperty(value = "The name of the Branding  This value will only be set if you wish to overwrite the default name. If you want to keep the default name, leave this property empty")
  public String getSBrandingName() {
    return sBrandingName;
  }
  public void setSBrandingName(String sBrandingName) {
    this.sBrandingName = sBrandingName;
  }

  /**
   * The email address.
   **/
  @ApiModelProperty(value = "The email address.")
  public String getSEmailAddress() {
    return sEmailAddress;
  }
  public void setSEmailAddress(String sEmailAddress) {
    this.sEmailAddress = sEmailAddress;
  }

  /**
   * Whether the Branding is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Branding is active or not")
  public Boolean getBBrandingIsactive() {
    return bBrandingIsactive;
  }
  public void setBBrandingIsactive(Boolean bBrandingIsactive) {
    this.bBrandingIsactive = bBrandingIsactive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandingRequest brandingRequest = (BrandingRequest) o;
    return (this.pkiBrandingID == null ? brandingRequest.pkiBrandingID == null : this.pkiBrandingID.equals(brandingRequest.pkiBrandingID)) &&
        (this.objBrandingDescription == null ? brandingRequest.objBrandingDescription == null : this.objBrandingDescription.equals(brandingRequest.objBrandingDescription)) &&
        (this.eBrandingLogo == null ? brandingRequest.eBrandingLogo == null : this.eBrandingLogo.equals(brandingRequest.eBrandingLogo)) &&
        (this.sBrandingBase64 == null ? brandingRequest.sBrandingBase64 == null : this.sBrandingBase64.equals(brandingRequest.sBrandingBase64)) &&
        (this.iBrandingColortext == null ? brandingRequest.iBrandingColortext == null : this.iBrandingColortext.equals(brandingRequest.iBrandingColortext)) &&
        (this.iBrandingColortextlinkbox == null ? brandingRequest.iBrandingColortextlinkbox == null : this.iBrandingColortextlinkbox.equals(brandingRequest.iBrandingColortextlinkbox)) &&
        (this.iBrandingColortextbutton == null ? brandingRequest.iBrandingColortextbutton == null : this.iBrandingColortextbutton.equals(brandingRequest.iBrandingColortextbutton)) &&
        (this.iBrandingColorbackground == null ? brandingRequest.iBrandingColorbackground == null : this.iBrandingColorbackground.equals(brandingRequest.iBrandingColorbackground)) &&
        (this.iBrandingColorbackgroundbutton == null ? brandingRequest.iBrandingColorbackgroundbutton == null : this.iBrandingColorbackgroundbutton.equals(brandingRequest.iBrandingColorbackgroundbutton)) &&
        (this.iBrandingColorbackgroundsmallbox == null ? brandingRequest.iBrandingColorbackgroundsmallbox == null : this.iBrandingColorbackgroundsmallbox.equals(brandingRequest.iBrandingColorbackgroundsmallbox)) &&
        (this.sBrandingName == null ? brandingRequest.sBrandingName == null : this.sBrandingName.equals(brandingRequest.sBrandingName)) &&
        (this.sEmailAddress == null ? brandingRequest.sEmailAddress == null : this.sEmailAddress.equals(brandingRequest.sEmailAddress)) &&
        (this.bBrandingIsactive == null ? brandingRequest.bBrandingIsactive == null : this.bBrandingIsactive.equals(brandingRequest.bBrandingIsactive));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiBrandingID == null ? 0: this.pkiBrandingID.hashCode());
    result = 31 * result + (this.objBrandingDescription == null ? 0: this.objBrandingDescription.hashCode());
    result = 31 * result + (this.eBrandingLogo == null ? 0: this.eBrandingLogo.hashCode());
    result = 31 * result + (this.sBrandingBase64 == null ? 0: this.sBrandingBase64.hashCode());
    result = 31 * result + (this.iBrandingColortext == null ? 0: this.iBrandingColortext.hashCode());
    result = 31 * result + (this.iBrandingColortextlinkbox == null ? 0: this.iBrandingColortextlinkbox.hashCode());
    result = 31 * result + (this.iBrandingColortextbutton == null ? 0: this.iBrandingColortextbutton.hashCode());
    result = 31 * result + (this.iBrandingColorbackground == null ? 0: this.iBrandingColorbackground.hashCode());
    result = 31 * result + (this.iBrandingColorbackgroundbutton == null ? 0: this.iBrandingColorbackgroundbutton.hashCode());
    result = 31 * result + (this.iBrandingColorbackgroundsmallbox == null ? 0: this.iBrandingColorbackgroundsmallbox.hashCode());
    result = 31 * result + (this.sBrandingName == null ? 0: this.sBrandingName.hashCode());
    result = 31 * result + (this.sEmailAddress == null ? 0: this.sEmailAddress.hashCode());
    result = 31 * result + (this.bBrandingIsactive == null ? 0: this.bBrandingIsactive.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandingRequest {\n");
    
    sb.append("  pkiBrandingID: ").append(pkiBrandingID).append("\n");
    sb.append("  objBrandingDescription: ").append(objBrandingDescription).append("\n");
    sb.append("  eBrandingLogo: ").append(eBrandingLogo).append("\n");
    sb.append("  sBrandingBase64: ").append(sBrandingBase64).append("\n");
    sb.append("  iBrandingColortext: ").append(iBrandingColortext).append("\n");
    sb.append("  iBrandingColortextlinkbox: ").append(iBrandingColortextlinkbox).append("\n");
    sb.append("  iBrandingColortextbutton: ").append(iBrandingColortextbutton).append("\n");
    sb.append("  iBrandingColorbackground: ").append(iBrandingColorbackground).append("\n");
    sb.append("  iBrandingColorbackgroundbutton: ").append(iBrandingColorbackgroundbutton).append("\n");
    sb.append("  iBrandingColorbackgroundsmallbox: ").append(iBrandingColorbackgroundsmallbox).append("\n");
    sb.append("  sBrandingName: ").append(sBrandingName).append("\n");
    sb.append("  sEmailAddress: ").append(sEmailAddress).append("\n");
    sb.append("  bBrandingIsactive: ").append(bBrandingIsactive).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
