# MessagesApi

All URIs are relative to *https://www.lusid.com/notifications*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listUndeliveredMessages**](MessagesApi.md#listUndeliveredMessages) | **GET** /api/subscriptions/deliveries | [EXPERIMENTAL] ListUndeliveredMessages: List undelivered messages


<a name="listUndeliveredMessages"></a>
# **listUndeliveredMessages**
> ResourceListOfUndeliveredMessage listUndeliveredMessages(page, limit, filter)

[EXPERIMENTAL] ListUndeliveredMessages: List undelivered messages

### Example
```java
// Import classes:
import com.finbourne.notifications.ApiClient;
import com.finbourne.notifications.ApiException;
import com.finbourne.notifications.Configuration;
import com.finbourne.notifications.auth.*;
import com.finbourne.notifications.models.*;
import com.finbourne.notifications.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/notifications");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String page = "page_example"; // String | 
    Integer limit = 56; // Integer | 
    String filter = "filter_example"; // String | 
    try {
      ResourceListOfUndeliveredMessage result = apiInstance.listUndeliveredMessages(page, limit, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#listUndeliveredMessages");
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
 **page** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **filter** | **String**|  | [optional]

### Return type

[**ResourceListOfUndeliveredMessage**](ResourceListOfUndeliveredMessage.md)

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
**404** | No undelivered messages exists with the provided filter(s) |  -  |
**0** | Error response |  -  |

