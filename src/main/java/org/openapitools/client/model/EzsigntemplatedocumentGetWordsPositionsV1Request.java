/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.16
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
 * Request for POST /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/getWordsPositions
 **/
@ApiModel(description = "Request for POST /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/getWordsPositions")
public class EzsigntemplatedocumentGetWordsPositionsV1Request {
  
  public enum EGetEnum {
     All,  Words, 
  };
  @SerializedName("eGet")
  private EGetEnum eGet = null;
  @SerializedName("bWordCaseSensitive")
  private Boolean bWordCaseSensitive = null;
  @SerializedName("a_sWord")
  private List<String> aSWord = null;

  /**
   * Specify if you want to retrieve *All* words or specific *Words* from the document. If you specify *Words*, you must send the list of words to search for in *a_sWord*.
   **/
  @ApiModelProperty(required = true, value = "Specify if you want to retrieve *All* words or specific *Words* from the document. If you specify *Words*, you must send the list of words to search for in *a_sWord*.")
  public EGetEnum getEGet() {
    return eGet;
  }
  public void setEGet(EGetEnum eGet) {
    this.eGet = eGet;
  }

  /**
   * IF *true*, words will be searched case-sensitive and results will be returned case-sensitive. IF *false*, words will be searched case-insensitive and results will be returned case-insensitive.
   **/
  @ApiModelProperty(required = true, value = "IF *true*, words will be searched case-sensitive and results will be returned case-sensitive. IF *false*, words will be searched case-insensitive and results will be returned case-insensitive.")
  public Boolean getBWordCaseSensitive() {
    return bWordCaseSensitive;
  }
  public void setBWordCaseSensitive(Boolean bWordCaseSensitive) {
    this.bWordCaseSensitive = bWordCaseSensitive;
  }

  /**
   * Array of words to find in the document
   **/
  @ApiModelProperty(value = "Array of words to find in the document")
  public List<String> getASWord() {
    return aSWord;
  }
  public void setASWord(List<String> aSWord) {
    this.aSWord = aSWord;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatedocumentGetWordsPositionsV1Request ezsigntemplatedocumentGetWordsPositionsV1Request = (EzsigntemplatedocumentGetWordsPositionsV1Request) o;
    return (this.eGet == null ? ezsigntemplatedocumentGetWordsPositionsV1Request.eGet == null : this.eGet.equals(ezsigntemplatedocumentGetWordsPositionsV1Request.eGet)) &&
        (this.bWordCaseSensitive == null ? ezsigntemplatedocumentGetWordsPositionsV1Request.bWordCaseSensitive == null : this.bWordCaseSensitive.equals(ezsigntemplatedocumentGetWordsPositionsV1Request.bWordCaseSensitive)) &&
        (this.aSWord == null ? ezsigntemplatedocumentGetWordsPositionsV1Request.aSWord == null : this.aSWord.equals(ezsigntemplatedocumentGetWordsPositionsV1Request.aSWord));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.eGet == null ? 0: this.eGet.hashCode());
    result = 31 * result + (this.bWordCaseSensitive == null ? 0: this.bWordCaseSensitive.hashCode());
    result = 31 * result + (this.aSWord == null ? 0: this.aSWord.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatedocumentGetWordsPositionsV1Request {\n");
    
    sb.append("  eGet: ").append(eGet).append("\n");
    sb.append("  bWordCaseSensitive: ").append(bWordCaseSensitive).append("\n");
    sb.append("  aSWord: ").append(aSWord).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
