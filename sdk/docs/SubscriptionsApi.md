# SubscriptionsApi

All URIs are relative to *https://www.lusid.com/notifications*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSubscription**](SubscriptionsApi.md#createSubscription) | **POST** /api/subscriptions | [EXPERIMENTAL] CreateSubscription: Create a new subscription.
[**deleteSubscription**](SubscriptionsApi.md#deleteSubscription) | **DELETE** /api/subscriptions/{scope}/{code} | [EXPERIMENTAL] DeleteSubscription: Delete a subscription.
[**getSubscription**](SubscriptionsApi.md#getSubscription) | **GET** /api/subscriptions/{scope}/{code} | [EXPERIMENTAL] GetSubscription: Get a subscription.
[**listSubscriptions**](SubscriptionsApi.md#listSubscriptions) | **GET** /api/subscriptions | [EXPERIMENTAL] ListSubscriptions: List subscriptions.
[**updateSubscription**](SubscriptionsApi.md#updateSubscription) | **PUT** /api/subscriptions/{scope}/{code} | [EXPERIMENTAL] UpdateSubscription: Update an existing subscription.


<a name="createSubscription"></a>
# **createSubscription**
> Subscription createSubscription(createSubscription)

[EXPERIMENTAL] CreateSubscription: Create a new subscription.

### Example
```java
// Import classes:
import com.finbourne.notifications.ApiClient;
import com.finbourne.notifications.ApiException;
import com.finbourne.notifications.Configuration;
import com.finbourne.notifications.auth.*;
import com.finbourne.notifications.models.*;
import com.finbourne.notifications.api.SubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/notifications");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
    CreateSubscription createSubscription = new CreateSubscription(); // CreateSubscription | The data to create a subscription
    try {
      Subscription result = apiInstance.createSubscription(createSubscription);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#createSubscription");
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
 **createSubscription** | [**CreateSubscription**](CreateSubscription.md)| The data to create a subscription |

### Return type

[**Subscription**](Subscription.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="deleteSubscription"></a>
# **deleteSubscription**
> deleteSubscription(scope, code)

[EXPERIMENTAL] DeleteSubscription: Delete a subscription.

### Example
```java
// Import classes:
import com.finbourne.notifications.ApiClient;
import com.finbourne.notifications.ApiException;
import com.finbourne.notifications.Configuration;
import com.finbourne.notifications.auth.*;
import com.finbourne.notifications.models.*;
import com.finbourne.notifications.api.SubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/notifications");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
    String scope = "scope_example"; // String | The scope that identifies a subscription
    String code = "code_example"; // String | The code that identifies a subscription
    try {
      apiInstance.deleteSubscription(scope, code);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#deleteSubscription");
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

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**400** | The details of the input related failure |  -  |
**404** | No subscription exists in current scope |  -  |
**0** | Error response |  -  |

<a name="getSubscription"></a>
# **getSubscription**
> Subscription getSubscription(scope, code)

[EXPERIMENTAL] GetSubscription: Get a subscription.

### Example
```java
// Import classes:
import com.finbourne.notifications.ApiClient;
import com.finbourne.notifications.ApiException;
import com.finbourne.notifications.Configuration;
import com.finbourne.notifications.auth.*;
import com.finbourne.notifications.models.*;
import com.finbourne.notifications.api.SubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/notifications");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
    String scope = "scope_example"; // String | The scope that identifies a subscription
    String code = "code_example"; // String | The code that identifies a subscription
    try {
      Subscription result = apiInstance.getSubscription(scope, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#getSubscription");
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

[**Subscription**](Subscription.md)

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
**404** | No subscription exists in current scope |  -  |
**0** | Error response |  -  |

<a name="listSubscriptions"></a>
# **listSubscriptions**
> ResourceListOfSubscription listSubscriptions(filter, sortBy, page, limit)

[EXPERIMENTAL] ListSubscriptions: List subscriptions.

### Example
```java
// Import classes:
import com.finbourne.notifications.ApiClient;
import com.finbourne.notifications.ApiException;
import com.finbourne.notifications.Configuration;
import com.finbourne.notifications.auth.*;
import com.finbourne.notifications.models.*;
import com.finbourne.notifications.api.SubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/notifications");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
    String filter = "filter_example"; // String | Expression to filter the result set. Read more about <see href=\"https://support.lusid.com/filtering-results-from-lusid\"> filtering results from LUSID</see>.
    String sortBy = "sortBy_example"; // String | Fields to order the result set. Read more about <see href=\"https://support.lusid.com/filtering-results-from-lusid\" /> filtering results from LUSID.
    String page = "page_example"; // String | Encoded page string returned from a previous search result that will retrieve the next page of data. When this field is supplied the filter  field should not be supplied.
    Integer limit = 56; // Integer | The maximum number of subscriptions to retrieve.
    try {
      ResourceListOfSubscription result = apiInstance.listSubscriptions(filter, sortBy, page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#listSubscriptions");
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
 **filter** | **String**| Expression to filter the result set. Read more about &lt;see href&#x3D;\&quot;https://support.lusid.com/filtering-results-from-lusid\&quot;&gt; filtering results from LUSID&lt;/see&gt;. | [optional]
 **sortBy** | **String**| Fields to order the result set. Read more about &lt;see href&#x3D;\&quot;https://support.lusid.com/filtering-results-from-lusid\&quot; /&gt; filtering results from LUSID. | [optional]
 **page** | **String**| Encoded page string returned from a previous search result that will retrieve the next page of data. When this field is supplied the filter  field should not be supplied. | [optional]
 **limit** | **Integer**| The maximum number of subscriptions to retrieve. | [optional]

### Return type

[**ResourceListOfSubscription**](ResourceListOfSubscription.md)

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
**0** | Error response |  -  |

<a name="updateSubscription"></a>
# **updateSubscription**
> Subscription updateSubscription(scope, code, updateSubscription)

[EXPERIMENTAL] UpdateSubscription: Update an existing subscription.

### Example
```java
// Import classes:
import com.finbourne.notifications.ApiClient;
import com.finbourne.notifications.ApiException;
import com.finbourne.notifications.Configuration;
import com.finbourne.notifications.auth.*;
import com.finbourne.notifications.models.*;
import com.finbourne.notifications.api.SubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/notifications");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
    String scope = "scope_example"; // String | The scope that identifies a subscription
    String code = "code_example"; // String | The code that identifies a subscription
    UpdateSubscription updateSubscription = new UpdateSubscription(); // UpdateSubscription | The data to update a subscription
    try {
      Subscription result = apiInstance.updateSubscription(scope, code, updateSubscription);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#updateSubscription");
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
 **updateSubscription** | [**UpdateSubscription**](UpdateSubscription.md)| The data to update a subscription |

### Return type

[**Subscription**](Subscription.md)

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
**404** | No subscription exists in current scope |  -  |
**0** | Error response |  -  |

