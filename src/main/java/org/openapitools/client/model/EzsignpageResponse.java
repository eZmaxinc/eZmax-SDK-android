/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.4
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
 * An Ezsignpage Object
 **/
@ApiModel(description = "An Ezsignpage Object")
public class EzsignpageResponse {
  
  @SerializedName("pkiEzsignpageID")
  private Integer pkiEzsignpageID = null;
  @SerializedName("iEzsignpageWidthimage")
  private Integer iEzsignpageWidthimage = null;
  @SerializedName("iEzsignpageHeightimage")
  private Integer iEzsignpageHeightimage = null;
  @SerializedName("iEzsignpageWidthpdf")
  private Integer iEzsignpageWidthpdf = null;
  @SerializedName("iEzsignpageHeightpdf")
  private Integer iEzsignpageHeightpdf = null;
  @SerializedName("iEzsignpagePagenumber")
  private Integer iEzsignpagePagenumber = null;
  @SerializedName("sImageUrl")
  private String sImageUrl = null;

  /**
   * The unique ID of the Ezsignpage
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignpage")
  public Integer getPkiEzsignpageID() {
    return pkiEzsignpageID;
  }
  public void setPkiEzsignpageID(Integer pkiEzsignpageID) {
    this.pkiEzsignpageID = pkiEzsignpageID;
  }

  /**
   * The Width of the page's image in pixels calculated at 100 DPI
   **/
  @ApiModelProperty(required = true, value = "The Width of the page's image in pixels calculated at 100 DPI")
  public Integer getIEzsignpageWidthimage() {
    return iEzsignpageWidthimage;
  }
  public void setIEzsignpageWidthimage(Integer iEzsignpageWidthimage) {
    this.iEzsignpageWidthimage = iEzsignpageWidthimage;
  }

  /**
   * The Height of the page's image in pixels calculated at 100 DPI
   **/
  @ApiModelProperty(required = true, value = "The Height of the page's image in pixels calculated at 100 DPI")
  public Integer getIEzsignpageHeightimage() {
    return iEzsignpageHeightimage;
  }
  public void setIEzsignpageHeightimage(Integer iEzsignpageHeightimage) {
    this.iEzsignpageHeightimage = iEzsignpageHeightimage;
  }

  /**
   * The Width of the page in points calculated at 72 DPI
   **/
  @ApiModelProperty(required = true, value = "The Width of the page in points calculated at 72 DPI")
  public Integer getIEzsignpageWidthpdf() {
    return iEzsignpageWidthpdf;
  }
  public void setIEzsignpageWidthpdf(Integer iEzsignpageWidthpdf) {
    this.iEzsignpageWidthpdf = iEzsignpageWidthpdf;
  }

  /**
   * The Height of the page in points calculated at 72 DPI
   **/
  @ApiModelProperty(required = true, value = "The Height of the page in points calculated at 72 DPI")
  public Integer getIEzsignpageHeightpdf() {
    return iEzsignpageHeightpdf;
  }
  public void setIEzsignpageHeightpdf(Integer iEzsignpageHeightpdf) {
    this.iEzsignpageHeightpdf = iEzsignpageHeightpdf;
  }

  /**
   * The page number in the Ezsigndocument
   **/
  @ApiModelProperty(required = true, value = "The page number in the Ezsigndocument")
  public Integer getIEzsignpagePagenumber() {
    return iEzsignpagePagenumber;
  }
  public void setIEzsignpagePagenumber(Integer iEzsignpagePagenumber) {
    this.iEzsignpagePagenumber = iEzsignpagePagenumber;
  }

  /**
   * The Url to the Ezsignpage's rasterized image.  Url will expire after 5 minutes.
   **/
  @ApiModelProperty(required = true, value = "The Url to the Ezsignpage's rasterized image.  Url will expire after 5 minutes.")
  public String getSImageUrl() {
    return sImageUrl;
  }
  public void setSImageUrl(String sImageUrl) {
    this.sImageUrl = sImageUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignpageResponse ezsignpageResponse = (EzsignpageResponse) o;
    return (this.pkiEzsignpageID == null ? ezsignpageResponse.pkiEzsignpageID == null : this.pkiEzsignpageID.equals(ezsignpageResponse.pkiEzsignpageID)) &&
        (this.iEzsignpageWidthimage == null ? ezsignpageResponse.iEzsignpageWidthimage == null : this.iEzsignpageWidthimage.equals(ezsignpageResponse.iEzsignpageWidthimage)) &&
        (this.iEzsignpageHeightimage == null ? ezsignpageResponse.iEzsignpageHeightimage == null : this.iEzsignpageHeightimage.equals(ezsignpageResponse.iEzsignpageHeightimage)) &&
        (this.iEzsignpageWidthpdf == null ? ezsignpageResponse.iEzsignpageWidthpdf == null : this.iEzsignpageWidthpdf.equals(ezsignpageResponse.iEzsignpageWidthpdf)) &&
        (this.iEzsignpageHeightpdf == null ? ezsignpageResponse.iEzsignpageHeightpdf == null : this.iEzsignpageHeightpdf.equals(ezsignpageResponse.iEzsignpageHeightpdf)) &&
        (this.iEzsignpagePagenumber == null ? ezsignpageResponse.iEzsignpagePagenumber == null : this.iEzsignpagePagenumber.equals(ezsignpageResponse.iEzsignpagePagenumber)) &&
        (this.sImageUrl == null ? ezsignpageResponse.sImageUrl == null : this.sImageUrl.equals(ezsignpageResponse.sImageUrl));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignpageID == null ? 0: this.pkiEzsignpageID.hashCode());
    result = 31 * result + (this.iEzsignpageWidthimage == null ? 0: this.iEzsignpageWidthimage.hashCode());
    result = 31 * result + (this.iEzsignpageHeightimage == null ? 0: this.iEzsignpageHeightimage.hashCode());
    result = 31 * result + (this.iEzsignpageWidthpdf == null ? 0: this.iEzsignpageWidthpdf.hashCode());
    result = 31 * result + (this.iEzsignpageHeightpdf == null ? 0: this.iEzsignpageHeightpdf.hashCode());
    result = 31 * result + (this.iEzsignpagePagenumber == null ? 0: this.iEzsignpagePagenumber.hashCode());
    result = 31 * result + (this.sImageUrl == null ? 0: this.sImageUrl.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignpageResponse {\n");
    
    sb.append("  pkiEzsignpageID: ").append(pkiEzsignpageID).append("\n");
    sb.append("  iEzsignpageWidthimage: ").append(iEzsignpageWidthimage).append("\n");
    sb.append("  iEzsignpageHeightimage: ").append(iEzsignpageHeightimage).append("\n");
    sb.append("  iEzsignpageWidthpdf: ").append(iEzsignpageWidthpdf).append("\n");
    sb.append("  iEzsignpageHeightpdf: ").append(iEzsignpageHeightpdf).append("\n");
    sb.append("  iEzsignpagePagenumber: ").append(iEzsignpagePagenumber).append("\n");
    sb.append("  sImageUrl: ").append(sImageUrl).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
