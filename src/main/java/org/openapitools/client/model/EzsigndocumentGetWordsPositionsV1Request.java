/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.0
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
 * Request for the /1/object/ezsigndocument/{pkiEzsigndocumentID}/getWordsPositions API Request
 **/
@ApiModel(description = "Request for the /1/object/ezsigndocument/{pkiEzsigndocumentID}/getWordsPositions API Request")
public class EzsigndocumentGetWordsPositionsV1Request {
  
  public enum EGetEnum {
     All,  Words, 
  };
  @SerializedName("eGet")
  private EGetEnum eGet = null;
  @SerializedName("a_sWord")
  private List<String> aSWord = null;

  /**
   * Specify if you want to retrieve *All* words or specific *Words* from the document. If you specify *Words*, you must send the list of words to search in *a_sWord*.
   **/
  @ApiModelProperty(value = "Specify if you want to retrieve *All* words or specific *Words* from the document. If you specify *Words*, you must send the list of words to search in *a_sWord*.")
  public EGetEnum getEGet() {
    return eGet;
  }
  public void setEGet(EGetEnum eGet) {
    this.eGet = eGet;
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
    EzsigndocumentGetWordsPositionsV1Request ezsigndocumentGetWordsPositionsV1Request = (EzsigndocumentGetWordsPositionsV1Request) o;
    return (this.eGet == null ? ezsigndocumentGetWordsPositionsV1Request.eGet == null : this.eGet.equals(ezsigndocumentGetWordsPositionsV1Request.eGet)) &&
        (this.aSWord == null ? ezsigndocumentGetWordsPositionsV1Request.aSWord == null : this.aSWord.equals(ezsigndocumentGetWordsPositionsV1Request.aSWord));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.eGet == null ? 0: this.eGet.hashCode());
    result = 31 * result + (this.aSWord == null ? 0: this.aSWord.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentGetWordsPositionsV1Request {\n");
    
    sb.append("  eGet: ").append(eGet).append("\n");
    sb.append("  aSWord: ").append(aSWord).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
