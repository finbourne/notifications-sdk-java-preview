/*
 * FINBOURNE Notifications API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1.336
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.notifications.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.notifications.model.AttemptStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Details of an attempt of delivery.
 */
@ApiModel(description = "Details of an attempt of delivery.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Attempt {
  public static final String SERIALIZED_NAME_ATTEMPT_NUMBER = "attemptNumber";
  @SerializedName(SERIALIZED_NAME_ATTEMPT_NUMBER)
  private Integer attemptNumber;

  public static final String SERIALIZED_NAME_ATTEMPT_TIME = "attemptTime";
  @SerializedName(SERIALIZED_NAME_ATTEMPT_TIME)
  private OffsetDateTime attemptTime;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private AttemptStatus status;


  public Attempt attemptNumber(Integer attemptNumber) {
    this.attemptNumber = attemptNumber; 
    return this;
  }

   /**
   * The attempt number of the delivery.
   * @return attemptNumber
  **/
  @ApiModelProperty(required = true, value = "The attempt number of the delivery.")
  public Integer getAttemptNumber() {
    return attemptNumber;
  }

  public void setAttemptNumber(Integer attemptNumber) {
    this.attemptNumber = attemptNumber;
  }


  public Attempt attemptTime(OffsetDateTime attemptTime) {
    this.attemptTime = attemptTime; 
    return this;
  }

   /**
   * The time that the delivery was attempted.
   * @return attemptTime
  **/
  @ApiModelProperty(required = true, value = "The time that the delivery was attempted.")
  public OffsetDateTime getAttemptTime() {
    return attemptTime;
  }

  public void setAttemptTime(OffsetDateTime attemptTime) {
    this.attemptTime = attemptTime;
  }


  public Attempt status(AttemptStatus status) {
    this.status = status; 
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  public AttemptStatus getStatus() {
    return status;
  }

  public void setStatus(AttemptStatus status) {
    this.status = status;
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
    sb.append("class Attempt {\n");
    sb.append("    attemptNumber: ").append(toIndentedString(attemptNumber)).append("\n");
    sb.append("    attemptTime: ").append(toIndentedString(attemptTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
