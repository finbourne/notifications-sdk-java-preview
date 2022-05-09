/*
 * FINBOURNE Notifications API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1.338
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.notifications.api;

import com.finbourne.notifications.ApiCallback;
import com.finbourne.notifications.ApiClient;
import com.finbourne.notifications.ApiException;
import com.finbourne.notifications.ApiResponse;
import com.finbourne.notifications.Configuration;
import com.finbourne.notifications.Pair;
import com.finbourne.notifications.ProgressRequestBody;
import com.finbourne.notifications.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.finbourne.notifications.model.EventDetails;
import com.finbourne.notifications.model.LusidProblemDetails;
import com.finbourne.notifications.model.LusidValidationProblemDetails;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventsApi {
    private ApiClient localVarApiClient;
    public EventsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EventsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createEvent
     * @param body The data to create an event. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createEventCall(Object body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/api/events";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.1.338");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createEventValidateBeforeCall(Object body, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createEvent(Async)");
        }
        

        okhttp3.Call localVarCall = createEventCall(body, _callback);
        return localVarCall;

    }

    /**
     * [EXPERIMENTAL] CreateEvent: Create a new event.
     * 
     * @param body The data to create an event. (required)
     * @return EventDetails
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public EventDetails createEvent(Object body) throws ApiException {
        ApiResponse<EventDetails> localVarResp = createEventWithHttpInfo(body);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] CreateEvent: Create a new event.
     * 
     * @param body The data to create an event. (required)
     * @return ApiResponse&lt;EventDetails&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EventDetails> createEventWithHttpInfo(Object body) throws ApiException {
        okhttp3.Call localVarCall = createEventValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<EventDetails>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] CreateEvent: Create a new event. (asynchronously)
     * 
     * @param body The data to create an event. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createEventAsync(Object body, final ApiCallback<EventDetails> _callback) throws ApiException {
        okhttp3.Call localVarCall = createEventValidateBeforeCall(body, _callback);
        Type localVarReturnType = new TypeToken<EventDetails>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
