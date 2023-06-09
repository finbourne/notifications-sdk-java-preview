/*
 * FINBOURNE Notifications API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1.731
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The information required to create a notification which, when processed, will trigger a webhook
 */
@ApiModel(description = "The information required to create a notification which, when processed, will trigger a webhook")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateWebhookNotification {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_HTTP_METHOD = "httpMethod";
  @SerializedName(SERIALIZED_NAME_HTTP_METHOD)
  private String httpMethod;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_AUTHENTICATION_TYPE = "authenticationType";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_TYPE)
  private String authenticationType;

  public static final String SERIALIZED_NAME_AUTHENTICATION_CONFIGURATION_ITEM_PATHS = "authenticationConfigurationItemPaths";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_CONFIGURATION_ITEM_PATHS)
  private Map<String, String> authenticationConfigurationItemPaths = null;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "contentType";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private Object content = null;


  public CreateWebhookNotification description(String description) {
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


  public CreateWebhookNotification httpMethod(String httpMethod) {
    this.httpMethod = httpMethod; 
    return this;
  }

   /**
   * The HTTP method such as GET, POST, etc. to use on the request
   * @return httpMethod
  **/
  @ApiModelProperty(required = true, value = "The HTTP method such as GET, POST, etc. to use on the request")
  public String getHttpMethod() {
    return httpMethod;
  }

  public void setHttpMethod(String httpMethod) {
    this.httpMethod = httpMethod;
  }


  public CreateWebhookNotification url(String url) {
    this.url = url; 
    return this;
  }

   /**
   * The URL to send the request to
   * @return url
  **/
  @ApiModelProperty(required = true, value = "The URL to send the request to")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public CreateWebhookNotification authenticationType(String authenticationType) {
    this.authenticationType = authenticationType; 
    return this;
  }

   /**
   * The type of authentication to use on the request
   * @return authenticationType
  **/
  @ApiModelProperty(required = true, value = "The type of authentication to use on the request")
  public String getAuthenticationType() {
    return authenticationType;
  }

  public void setAuthenticationType(String authenticationType) {
    this.authenticationType = authenticationType;
  }


  public CreateWebhookNotification authenticationConfigurationItemPaths(Map<String, String> authenticationConfigurationItemPaths) {
    this.authenticationConfigurationItemPaths = authenticationConfigurationItemPaths; 
    return this;
  }

  public CreateWebhookNotification putAuthenticationConfigurationItemPathsItem(String key, String authenticationConfigurationItemPathsItem) {
    if (this.authenticationConfigurationItemPaths == null) {
      this.authenticationConfigurationItemPaths = new HashMap<>();
    }
    this.authenticationConfigurationItemPaths.put(key, authenticationConfigurationItemPathsItem);
    return this;
  }

   /**
   * The paths of the Configuration Store configuration items that contain the authentication configuration. Each  authentication type requires different keys:  - Lusid - None required  - BasicAuth - Requires &#39;Username&#39; and &#39;Password&#39;  - BearerToken - Requires &#39;BearerToken&#39; and optionally &#39;BearerScheme&#39;                e.g. the following would be valid assuming that the config is present in the configuration store at the  specified paths:                    \&quot;authenticationType\&quot;: \&quot;BasicAuth\&quot;,      \&quot;authenticationConfigurationItemPaths\&quot;: {          \&quot;Username\&quot;: \&quot;config://personal/myUserId/WebhookConfigurations/ExampleService/AdminUser\&quot;,          \&quot;Password\&quot;: \&quot;config://personal/myUserId/WebhookConfigurations/ExampleService/AdminPassword\&quot;      }
   * @return authenticationConfigurationItemPaths
  **/
  @ApiModelProperty(value = "The paths of the Configuration Store configuration items that contain the authentication configuration. Each  authentication type requires different keys:  - Lusid - None required  - BasicAuth - Requires 'Username' and 'Password'  - BearerToken - Requires 'BearerToken' and optionally 'BearerScheme'                e.g. the following would be valid assuming that the config is present in the configuration store at the  specified paths:                    \"authenticationType\": \"BasicAuth\",      \"authenticationConfigurationItemPaths\": {          \"Username\": \"config://personal/myUserId/WebhookConfigurations/ExampleService/AdminUser\",          \"Password\": \"config://personal/myUserId/WebhookConfigurations/ExampleService/AdminPassword\"      }")
  public Map<String, String> getAuthenticationConfigurationItemPaths() {
    return authenticationConfigurationItemPaths;
  }

  public void setAuthenticationConfigurationItemPaths(Map<String, String> authenticationConfigurationItemPaths) {
    this.authenticationConfigurationItemPaths = authenticationConfigurationItemPaths;
  }


  public CreateWebhookNotification contentType(String contentType) {
    this.contentType = contentType; 
    return this;
  }

   /**
   * The type of the content e.g. Json
   * @return contentType
  **/
  @ApiModelProperty(value = "The type of the content e.g. Json")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public CreateWebhookNotification content(Object content) {
    this.content = content; 
    return this;
  }

   /**
   * The content of the request
   * @return content
  **/
  @ApiModelProperty(value = "The content of the request")
  public Object getContent() {
    return content;
  }

  public void setContent(Object content) {
    this.content = content;
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
    sb.append("class CreateWebhookNotification {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    httpMethod: ").append(toIndentedString(httpMethod)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    authenticationType: ").append(toIndentedString(authenticationType)).append("\n");
    sb.append("    authenticationConfigurationItemPaths: ").append(toIndentedString(authenticationConfigurationItemPaths)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
