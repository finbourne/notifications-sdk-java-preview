# NotificationsApi

All URIs are relative to *https://www.lusid.com/notifications*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEmailNotification**](NotificationsApi.md#createEmailNotification) | **POST** /api/subscriptions/{scope}/{code}/notifications/email | [EXPERIMENTAL] CreateEmailNotification: Add an email notification to a subscription.
[**createSmsNotification**](NotificationsApi.md#createSmsNotification) | **POST** /api/subscriptions/{scope}/{code}/notifications/sms | [EXPERIMENTAL] CreateSmsNotification: Add an SMS notification to a subscription.
[**createWebhookNotification**](NotificationsApi.md#createWebhookNotification) | **POST** /api/subscriptions/{scope}/{code}/notifications/webhook | [EXPERIMENTAL] CreateWebhookNotification: Add a Webhook notification to a subscription.
[**deleteNotification**](NotificationsApi.md#deleteNotification) | **DELETE** /api/subscriptions/{scope}/{code}/notifications/{id} | [EXPERIMENTAL] DeleteNotification: Delete a notification for a given subscription.
[**getNotification**](NotificationsApi.md#getNotification) | **GET** /api/subscriptions/{scope}/{code}/notifications/{id} | [EXPERIMENTAL] GetNotification: Get a notification on a subscription.
[**listNotifications**](NotificationsApi.md#listNotifications) | **GET** /api/subscriptions/{scope}/{code}/notifications | [EXPERIMENTAL] ListNotifications: List all notifications on a subscription.
[**updateEmailNotification**](NotificationsApi.md#updateEmailNotification) | **PUT** /api/subscriptions/{scope}/{code}/notifications/email/{id} | [EXPERIMENTAL] UpdateEmailNotification: Update an email notification for a given subscription.
[**updateSmsNotification**](NotificationsApi.md#updateSmsNotification) | **PUT** /api/subscriptions/{scope}/{code}/notifications/sms/{id} | [EXPERIMENTAL] UpdateSmsNotification: Update an SMS notification for a given subscription.
[**updateWebhookNotification**](NotificationsApi.md#updateWebhookNotification) | **PUT** /api/subscriptions/{scope}/{code}/notifications/webhook/{id} | [EXPERIMENTAL] UpdateWebhookNotification: Update a Webhook notification for a given subscription.


<a name="createEmailNotification"></a>
# **createEmailNotification**
> Notification createEmailNotification(scope, code, createEmailNotification)

[EXPERIMENTAL] CreateEmailNotification: Add an email notification to a subscription.

### Example
```java
// Import classes:
import com.finbourne.notifications.ApiClient;
import com.finbourne.notifications.ApiException;
import com.finbourne.notifications.Configuration;
import com.finbourne.notifications.auth.*;
import com.finbourne.notifications.models.*;
import com.finbourne.notifications.api.NotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/notifications");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    NotificationsApi apiInstance = new NotificationsApi(defaultClient);
    String scope = "scope_example"; // String | The scope that identifies a subscription
    String code = "code_example"; // String | The code that identifies a subscription
    CreateEmailNotification createEmailNotification = new CreateEmailNotification(); // CreateEmailNotification | The data to create a email notification
    try {
      Notification result = apiInstance.createEmailNotification(scope, code, createEmailNotification);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#createEmailNotification");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope that identifies a subscription |
 **code** | **String**| The code that identifies a subscription |
 **createEmailNotification** | [**CreateEmailNotification**](CreateEmailNotification.md)| The data to create a email notification |

### Return type

[**Notification**](Notification.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="createSmsNotification"></a>
# **createSmsNotification**
> Notification createSmsNotification(scope, code, createSmsNotification)

[EXPERIMENTAL] CreateSmsNotification: Add an SMS notification to a subscription.

### Example
```java
// Import classes:
import com.finbourne.notifications.ApiClient;
import com.finbourne.notifications.ApiException;
import com.finbourne.notifications.Configuration;
import com.finbourne.notifications.auth.*;
import com.finbourne.notifications.models.*;
import com.finbourne.notifications.api.NotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/notifications");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    NotificationsApi apiInstance = new NotificationsApi(defaultClient);
    String scope = "scope_example"; // String | The scope that identifies a subscription
    String code = "code_example"; // String | The code that identifies a subscription
    CreateSmsNotification createSmsNotification = new CreateSmsNotification(); // CreateSmsNotification | The data to create an SMS notification
    try {
      Notification result = apiInstance.createSmsNotification(scope, code, createSmsNotification);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#createSmsNotification");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope that identifies a subscription |
 **code** | **String**| The code that identifies a subscription |
 **createSmsNotification** | [**CreateSmsNotification**](CreateSmsNotification.md)| The data to create an SMS notification |

### Return type

[**Notification**](Notification.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="createWebhookNotification"></a>
# **createWebhookNotification**
> Notification createWebhookNotification(scope, code, createWebhookNotification)

[EXPERIMENTAL] CreateWebhookNotification: Add a Webhook notification to a subscription.

### Example
```java
// Import classes:
import com.finbourne.notifications.ApiClient;
import com.finbourne.notifications.ApiException;
import com.finbourne.notifications.Configuration;
import com.finbourne.notifications.auth.*;
import com.finbourne.notifications.models.*;
import com.finbourne.notifications.api.NotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/notifications");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    NotificationsApi apiInstance = new NotificationsApi(defaultClient);
    String scope = "scope_example"; // String | The scope that identifies a subscription
    String code = "code_example"; // String | The code that identifies a subscription
    CreateWebhookNotification createWebhookNotification = new CreateWebhookNotification(); // CreateWebhookNotification | The data to create a webhook notification
    try {
      Notification result = apiInstance.createWebhookNotification(scope, code, createWebhookNotification);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#createWebhookNotification");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope that identifies a subscription |
 **code** | **String**| The code that identifies a subscription |
 **createWebhookNotification** | [**CreateWebhookNotification**](CreateWebhookNotification.md)| The data to create a webhook notification |

### Return type

[**Notification**](Notification.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="deleteNotification"></a>
# **deleteNotification**
> deleteNotification(scope, code, id)

[EXPERIMENTAL] DeleteNotification: Delete a notification for a given subscription.

### Example
```java
// Import classes:
import com.finbourne.notifications.ApiClient;
import com.finbourne.notifications.ApiException;
import com.finbourne.notifications.Configuration;
import com.finbourne.notifications.auth.*;
import com.finbourne.notifications.models.*;
import com.finbourne.notifications.api.NotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/notifications");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    NotificationsApi apiInstance = new NotificationsApi(defaultClient);
    String scope = "scope_example"; // String | The scope that identifies a subscription
    String code = "code_example"; // String | The code that identifies a subscription
    String id = "id_example"; // String | The unique identifier of the notification
    try {
      apiInstance.deleteNotification(scope, code, id);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#deleteNotification");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope that identifies a subscription |
 **code** | **String**| The code that identifies a subscription |
 **id** | **String**| The unique identifier of the notification |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**400** | The details of the input related failure |  -  |
**404** | No notification exists in current scope |  -  |
**0** | Error response |  -  |

<a name="getNotification"></a>
# **getNotification**
> Notification getNotification(scope, code, id)

[EXPERIMENTAL] GetNotification: Get a notification on a subscription.

### Example
```java
// Import classes:
import com.finbourne.notifications.ApiClient;
import com.finbourne.notifications.ApiException;
import com.finbourne.notifications.Configuration;
import com.finbourne.notifications.auth.*;
import com.finbourne.notifications.models.*;
import com.finbourne.notifications.api.NotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/notifications");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    NotificationsApi apiInstance = new NotificationsApi(defaultClient);
    String scope = "scope_example"; // String | The scope that identifies a subscription
    String code = "code_example"; // String | The code that identifies a subscription
    String id = "id_example"; // String | The unique identifier of the notification
    try {
      Notification result = apiInstance.getNotification(scope, code, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#getNotification");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope that identifies a subscription |
 **code** | **String**| The code that identifies a subscription |
 **id** | **String**| The unique identifier of the notification |

### Return type

[**Notification**](Notification.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | The details of the input related failure |  -  |
**404** | No notification exists in current scope |  -  |
**0** | Error response |  -  |

<a name="listNotifications"></a>
# **listNotifications**
> ResourceListOfNotification listNotifications(scope, code)

[EXPERIMENTAL] ListNotifications: List all notifications on a subscription.

### Example
```java
// Import classes:
import com.finbourne.notifications.ApiClient;
import com.finbourne.notifications.ApiException;
import com.finbourne.notifications.Configuration;
import com.finbourne.notifications.auth.*;
import com.finbourne.notifications.models.*;
import com.finbourne.notifications.api.NotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/notifications");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    NotificationsApi apiInstance = new NotificationsApi(defaultClient);
    String scope = "scope_example"; // String | The scope that identifies a subscription
    String code = "code_example"; // String | The code that identifies a subscription
    try {
      ResourceListOfNotification result = apiInstance.listNotifications(scope, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#listNotifications");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope that identifies a subscription |
 **code** | **String**| The code that identifies a subscription |

### Return type

[**ResourceListOfNotification**](ResourceListOfNotification.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | The details of the input related failure |  -  |
**404** | No notifications exists with the provided filter(s) |  -  |
**0** | Error response |  -  |

<a name="updateEmailNotification"></a>
# **updateEmailNotification**
> Notification updateEmailNotification(scope, code, id, updateEmailNotification)

[EXPERIMENTAL] UpdateEmailNotification: Update an email notification for a given subscription.

### Example
```java
// Import classes:
import com.finbourne.notifications.ApiClient;
import com.finbourne.notifications.ApiException;
import com.finbourne.notifications.Configuration;
import com.finbourne.notifications.auth.*;
import com.finbourne.notifications.models.*;
import com.finbourne.notifications.api.NotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/notifications");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    NotificationsApi apiInstance = new NotificationsApi(defaultClient);
    String scope = "scope_example"; // String | The scope that identifies a subscription
    String code = "code_example"; // String | The code that identifies a subscription
    String id = "id_example"; // String | The unique identifier of the notification
    UpdateEmailNotification updateEmailNotification = new UpdateEmailNotification(); // UpdateEmailNotification | The data to update a notification
    try {
      Notification result = apiInstance.updateEmailNotification(scope, code, id, updateEmailNotification);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#updateEmailNotification");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope that identifies a subscription |
 **code** | **String**| The code that identifies a subscription |
 **id** | **String**| The unique identifier of the notification |
 **updateEmailNotification** | [**UpdateEmailNotification**](UpdateEmailNotification.md)| The data to update a notification |

### Return type

[**Notification**](Notification.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | The details of the input related failure |  -  |
**404** | No notification exists in current scope |  -  |
**0** | Error response |  -  |

<a name="updateSmsNotification"></a>
# **updateSmsNotification**
> Notification updateSmsNotification(scope, code, id, updateSmsNotification)

[EXPERIMENTAL] UpdateSmsNotification: Update an SMS notification for a given subscription.

### Example
```java
// Import classes:
import com.finbourne.notifications.ApiClient;
import com.finbourne.notifications.ApiException;
import com.finbourne.notifications.Configuration;
import com.finbourne.notifications.auth.*;
import com.finbourne.notifications.models.*;
import com.finbourne.notifications.api.NotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/notifications");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    NotificationsApi apiInstance = new NotificationsApi(defaultClient);
    String scope = "scope_example"; // String | The scope that identifies a subscription
    String code = "code_example"; // String | The code that identifies a subscription
    String id = "id_example"; // String | The unique identifier of the notification
    UpdateSmsNotification updateSmsNotification = new UpdateSmsNotification(); // UpdateSmsNotification | The data to update a notification
    try {
      Notification result = apiInstance.updateSmsNotification(scope, code, id, updateSmsNotification);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#updateSmsNotification");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope that identifies a subscription |
 **code** | **String**| The code that identifies a subscription |
 **id** | **String**| The unique identifier of the notification |
 **updateSmsNotification** | [**UpdateSmsNotification**](UpdateSmsNotification.md)| The data to update a notification |

### Return type

[**Notification**](Notification.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | The details of the input related failure |  -  |
**404** | No notification exists in current scope |  -  |
**0** | Error response |  -  |

<a name="updateWebhookNotification"></a>
# **updateWebhookNotification**
> Notification updateWebhookNotification(scope, code, id, updateWebhookNotification)

[EXPERIMENTAL] UpdateWebhookNotification: Update a Webhook notification for a given subscription.

### Example
```java
// Import classes:
import com.finbourne.notifications.ApiClient;
import com.finbourne.notifications.ApiException;
import com.finbourne.notifications.Configuration;
import com.finbourne.notifications.auth.*;
import com.finbourne.notifications.models.*;
import com.finbourne.notifications.api.NotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/notifications");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    NotificationsApi apiInstance = new NotificationsApi(defaultClient);
    String scope = "scope_example"; // String | The scope that identifies a subscription
    String code = "code_example"; // String | The code that identifies a subscription
    String id = "id_example"; // String | The unique identifier of the notification
    UpdateWebhookNotification updateWebhookNotification = new UpdateWebhookNotification(); // UpdateWebhookNotification | The data to update a notification
    try {
      Notification result = apiInstance.updateWebhookNotification(scope, code, id, updateWebhookNotification);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#updateWebhookNotification");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope that identifies a subscription |
 **code** | **String**| The code that identifies a subscription |
 **id** | **String**| The unique identifier of the notification |
 **updateWebhookNotification** | [**UpdateWebhookNotification**](UpdateWebhookNotification.md)| The data to update a notification |

### Return type

[**Notification**](Notification.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | The details of the input related failure |  -  |
**404** | No notification exists in current scope |  -  |
**0** | Error response |  -  |

