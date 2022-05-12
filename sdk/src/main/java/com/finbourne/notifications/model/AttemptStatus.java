/*
 * FINBOURNE Notifications API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1.343
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.notifications.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Status of the delivery attempt.
 */
@ApiModel(description = "Status of the delivery attempt.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AttemptStatus {
  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private String result;

  public static final String SERIALIZED_NAME_DETAILED_MESSAGE = "detailedMessage";
  @SerializedName(SERIALIZED_NAME_DETAILED_MESSAGE)
  private String detailedMessage;


  public AttemptStatus result(String result) {
    this.result = result; 
    return this;
  }

   /**
   * Result of the delivery.
   * @return result
  **/
  @ApiModelProperty(required = true, value = "Result of the delivery.")
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }


  public AttemptStatus detailedMessage(String detailedMessage) {
    this.detailedMessage = detailedMessage; 
    return this;
  }

   /**
   * The detailed message from attempting to deliver the message.
   * @return detailedMessage
  **/
  @ApiModelProperty(value = "The detailed message from attempting to deliver the message.")
  public String getDetailedMessage() {
    return detailedMessage;
  }

  public void setDetailedMessage(String detailedMessage) {
    this.detailedMessage = detailedMessage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return super.hashCode();  
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttemptStatus {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    detailedMessage: ").append(toIndentedString(detailedMessage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
