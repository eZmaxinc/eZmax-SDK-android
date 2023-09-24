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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * The Ezmaxinvoicingcontract payment type
 **/
@ApiModel(description = "The Ezmaxinvoicingcontract payment type")
public class FieldEEzmaxinvoicingcontractPaymenttype {
  


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldEEzmaxinvoicingcontractPaymenttype fieldEEzmaxinvoicingcontractPaymenttype = (FieldEEzmaxinvoicingcontractPaymenttype) o;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 17;
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldEEzmaxinvoicingcontractPaymenttype {\n");
    
    sb.append("}\n");
    return sb.toString();
  }
}
