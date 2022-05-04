/*
 * FINBOURNE Notifications API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1.322
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


import com.finbourne.notifications.model.LusidProblemDetails;
import com.finbourne.notifications.model.LusidValidationProblemDetails;
import com.finbourne.notifications.model.ResourceListOfDelivery;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeliveriesApi {
    private ApiClient localVarApiClient;
    public DeliveriesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DeliveriesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for listDeliveries
     * @param page The pagination token to use to continue listing delivery attempts. This value is returned from the previous call. When this field is supplied the filter field should not be supplied. (optional)
     * @param limit The maximum number of delivery attempts to retrieve. Defaults to 5000 if not specified. (optional)
     * @param filter Expression to filter the result set. For more information about filtering results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No deliveries exists with the provided filter(s) </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listDeliveriesCall(String page, Integer limit, String filter, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/deliveries";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.1.322");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listDeliveriesValidateBeforeCall(String page, Integer limit, String filter, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listDeliveriesCall(page, limit, filter, _callback);
        return localVarCall;

    }

    /**
     * [EXPERIMENTAL] ListDeliveries: List Deliveries
     * Currently only returns deliveries with failed attempts.
     * @param page The pagination token to use to continue listing delivery attempts. This value is returned from the previous call. When this field is supplied the filter field should not be supplied. (optional)
     * @param limit The maximum number of delivery attempts to retrieve. Defaults to 5000 if not specified. (optional)
     * @param filter Expression to filter the result set. For more information about filtering results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @return ResourceListOfDelivery
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No deliveries exists with the provided filter(s) </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ResourceListOfDelivery listDeliveries(String page, Integer limit, String filter) throws ApiException {
        ApiResponse<ResourceListOfDelivery> localVarResp = listDeliveriesWithHttpInfo(page, limit, filter);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] ListDeliveries: List Deliveries
     * Currently only returns deliveries with failed attempts.
     * @param page The pagination token to use to continue listing delivery attempts. This value is returned from the previous call. When this field is supplied the filter field should not be supplied. (optional)
     * @param limit The maximum number of delivery attempts to retrieve. Defaults to 5000 if not specified. (optional)
     * @param filter Expression to filter the result set. For more information about filtering results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @return ApiResponse&lt;ResourceListOfDelivery&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No deliveries exists with the provided filter(s) </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResourceListOfDelivery> listDeliveriesWithHttpInfo(String page, Integer limit, String filter) throws ApiException {
        okhttp3.Call localVarCall = listDeliveriesValidateBeforeCall(page, limit, filter, null);
        Type localVarReturnType = new TypeToken<ResourceListOfDelivery>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] ListDeliveries: List Deliveries (asynchronously)
     * Currently only returns deliveries with failed attempts.
     * @param page The pagination token to use to continue listing delivery attempts. This value is returned from the previous call. When this field is supplied the filter field should not be supplied. (optional)
     * @param limit The maximum number of delivery attempts to retrieve. Defaults to 5000 if not specified. (optional)
     * @param filter Expression to filter the result set. For more information about filtering results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No deliveries exists with the provided filter(s) </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listDeliveriesAsync(String page, Integer limit, String filter, final ApiCallback<ResourceListOfDelivery> _callback) throws ApiException {
        okhttp3.Call localVarCall = listDeliveriesValidateBeforeCall(page, limit, filter, _callback);
        Type localVarReturnType = new TypeToken<ResourceListOfDelivery>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
