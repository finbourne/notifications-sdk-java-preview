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
 * The information required to create a notification which, when processed, will send an email
 */
@ApiModel(description = "The information required to create a notification which, when processed, will send an email")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateEmailNotification {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_PLAIN_TEXT_BODY = "plainTextBody";
  @SerializedName(SERIALIZED_NAME_PLAIN_TEXT_BODY)
  private String plainTextBody;

  public static final String SERIALIZED_NAME_HTML_BODY = "htmlBody";
  @SerializedName(SERIALIZED_NAME_HTML_BODY)
  private String htmlBody;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS_TO = "emailAddressTo";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_TO)
  private List<String> emailAddressTo = new ArrayList<>();

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS_CC = "emailAddressCc";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_CC)
  private List<String> emailAddressCc = null;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS_BCC = "emailAddressBcc";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_BCC)
  private List<String> emailAddressBcc = null;


  public CreateEmailNotification description(String description) {
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


  public CreateEmailNotification subject(String subject) {
    this.subject = subject; 
    return this;
  }

   /**
   * The subject of the email
   * @return subject
  **/
  @ApiModelProperty(required = true, value = "The subject of the email")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }


  public CreateEmailNotification plainTextBody(String plainTextBody) {
    this.plainTextBody = plainTextBody; 
    return this;
  }

   /**
   * The plain text body of the email
   * @return plainTextBody
  **/
  @ApiModelProperty(required = true, value = "The plain text body of the email")
  public String getPlainTextBody() {
    return plainTextBody;
  }

  public void setPlainTextBody(String plainTextBody) {
    this.plainTextBody = plainTextBody;
  }


  public CreateEmailNotification htmlBody(String htmlBody) {
    this.htmlBody = htmlBody; 
    return this;
  }

   /**
   * The HTML body of the email (if any)
   * @return htmlBody
  **/
  @ApiModelProperty(value = "The HTML body of the email (if any)")
  public String getHtmlBody() {
    return htmlBody;
  }

  public void setHtmlBody(String htmlBody) {
    this.htmlBody = htmlBody;
  }


  public CreateEmailNotification emailAddressTo(List<String> emailAddressTo) {
    this.emailAddressTo = emailAddressTo; 
    return this;
  }

  public CreateEmailNotification addEmailAddressToItem(String emailAddressToItem) {
   
    this.emailAddressTo.add(emailAddressToItem);
    return this;
  }

   /**
   * &#39;To&#39; recipients of the email
   * @return emailAddressTo
  **/
  @ApiModelProperty(required = true, value = "'To' recipients of the email")
  public List<String> getEmailAddressTo() {
    return emailAddressTo;
  }

  public void setEmailAddressTo(List<String> emailAddressTo) {
    this.emailAddressTo = emailAddressTo;
  }


  public CreateEmailNotification emailAddressCc(List<String> emailAddressCc) {
    this.emailAddressCc = emailAddressCc; 
    return this;
  }

  public CreateEmailNotification addEmailAddressCcItem(String emailAddressCcItem) {
   
    if (this.emailAddressCc == null) {
      this.emailAddressCc = new ArrayList<>();
    }
    this.emailAddressCc.add(emailAddressCcItem);
    return this;
  }

   /**
   * &#39;Cc&#39; recipients of the email
   * @return emailAddressCc
  **/
  @ApiModelProperty(value = "'Cc' recipients of the email")
  public List<String> getEmailAddressCc() {
    return emailAddressCc;
  }

  public void setEmailAddressCc(List<String> emailAddressCc) {
    this.emailAddressCc = emailAddressCc;
  }


  public CreateEmailNotification emailAddressBcc(List<String> emailAddressBcc) {
    this.emailAddressBcc = emailAddressBcc; 
    return this;
  }

  public CreateEmailNotification addEmailAddressBccItem(String emailAddressBccItem) {
   
    if (this.emailAddressBcc == null) {
      this.emailAddressBcc = new ArrayList<>();
    }
    this.emailAddressBcc.add(emailAddressBccItem);
    return this;
  }

   /**
   * &#39;Bcc&#39; recipients of the email
   * @return emailAddressBcc
  **/
  @ApiModelProperty(value = "'Bcc' recipients of the email")
  public List<String> getEmailAddressBcc() {
    return emailAddressBcc;
  }

  public void setEmailAddressBcc(List<String> emailAddressBcc) {
    this.emailAddressBcc = emailAddressBcc;
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
    sb.append("class CreateEmailNotification {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    plainTextBody: ").append(toIndentedString(plainTextBody)).append("\n");
    sb.append("    htmlBody: ").append(toIndentedString(htmlBody)).append("\n");
    sb.append("    emailAddressTo: ").append(toIndentedString(emailAddressTo)).append("\n");
    sb.append("    emailAddressCc: ").append(toIndentedString(emailAddressCc)).append("\n");
    sb.append("    emailAddressBcc: ").append(toIndentedString(emailAddressBcc)).append("\n");
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
