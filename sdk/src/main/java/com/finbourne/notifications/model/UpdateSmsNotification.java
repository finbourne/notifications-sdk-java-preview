/*
 * FINBOURNE Notifications API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1.354
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
import java.util.ArrayList;
import java.util.List;

/**
 * The information required to update an SMS notification
 */
@ApiModel(description = "The information required to update an SMS notification")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateSmsNotification {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_RECIPIENTS = "recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  private List<String> recipients = new ArrayList<>();


  public UpdateSmsNotification description(String description) {
    this.description = description; 
    return this;
  }

   /**
   * The summary of the services provided by the notification
   * @return description
  **/
  @ApiModelProperty(required = true, value = "The summary of the services provided by the notification")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public UpdateSmsNotification body(String body) {
    this.body = body; 
    return this;
  }

   /**
   * The body of the SMS
   * @return body
  **/
  @ApiModelProperty(required = true, value = "The body of the SMS")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }


  public UpdateSmsNotification recipients(List<String> recipients) {
    this.recipients = recipients; 
    return this;
  }

  public UpdateSmsNotification addRecipientsItem(String recipientsItem) {
   
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * The phone numbers to which the SMS will be sent to (E.164 format)
   * @return recipients
  **/
  @ApiModelProperty(required = true, value = "The phone numbers to which the SMS will be sent to (E.164 format)")
  public List<String> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<String> recipients) {
    this.recipients = recipients;
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
    sb.append("class UpdateSmsNotification {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
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
