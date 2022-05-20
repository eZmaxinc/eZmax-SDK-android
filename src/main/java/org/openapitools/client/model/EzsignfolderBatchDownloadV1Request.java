/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.7
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/ezsignfolder/{pkiEzsignfolderID}/batchDownload
 **/
@ApiModel(description = "Request for POST /1/object/ezsignfolder/{pkiEzsignfolderID}/batchDownload")
public class EzsignfolderBatchDownloadV1Request {
  
  @SerializedName("a_pkiEzsigndocumentID")
  private List<Integer> aPkiEzsigndocumentID = null;
  public enum List&lt;AEDocumentTypeEnum&gt; {
     Signed,  Proof,  Proofdocument, 
  };
  @SerializedName("a_eDocumentType")
  private List<AEDocumentTypeEnum> aEDocumentType = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<Integer> getAPkiEzsigndocumentID() {
    return aPkiEzsigndocumentID;
  }
  public void setAPkiEzsigndocumentID(List<Integer> aPkiEzsigndocumentID) {
    this.aPkiEzsigndocumentID = aPkiEzsigndocumentID;
  }

  /**
   * The type of document to retrieve.  1. **Signed** Is the final document once all signatures were applied. 2. **Proofdocument** Is the evidence report. 3. **Proof** Is the complete evidence archive including all of the above and more.
   **/
  @ApiModelProperty(required = true, value = "The type of document to retrieve.  1. **Signed** Is the final document once all signatures were applied. 2. **Proofdocument** Is the evidence report. 3. **Proof** Is the complete evidence archive including all of the above and more.")
  public List<AEDocumentTypeEnum> getAEDocumentType() {
    return aEDocumentType;
  }
  public void setAEDocumentType(List<AEDocumentTypeEnum> aEDocumentType) {
    this.aEDocumentType = aEDocumentType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfolderBatchDownloadV1Request ezsignfolderBatchDownloadV1Request = (EzsignfolderBatchDownloadV1Request) o;
    return (this.aPkiEzsigndocumentID == null ? ezsignfolderBatchDownloadV1Request.aPkiEzsigndocumentID == null : this.aPkiEzsigndocumentID.equals(ezsignfolderBatchDownloadV1Request.aPkiEzsigndocumentID)) &&
        (this.aEDocumentType == null ? ezsignfolderBatchDownloadV1Request.aEDocumentType == null : this.aEDocumentType.equals(ezsignfolderBatchDownloadV1Request.aEDocumentType));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aPkiEzsigndocumentID == null ? 0: this.aPkiEzsigndocumentID.hashCode());
    result = 31 * result + (this.aEDocumentType == null ? 0: this.aEDocumentType.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfolderBatchDownloadV1Request {\n");
    
    sb.append("  aPkiEzsigndocumentID: ").append(aPkiEzsigndocumentID).append("\n");
    sb.append("  aEDocumentType: ").append(aEDocumentType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}