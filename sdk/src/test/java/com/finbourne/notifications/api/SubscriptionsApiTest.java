/*
 * FINBOURNE Notifications API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1.296
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.notifications.api;

import com.finbourne.notifications.ApiException;
import com.finbourne.notifications.model.CreateSubscription;
import com.finbourne.notifications.model.LusidProblemDetails;
import com.finbourne.notifications.model.LusidValidationProblemDetails;
import com.finbourne.notifications.model.ResourceListOfSubscription;
import com.finbourne.notifications.model.Subscription;
import com.finbourne.notifications.model.SubscriptionDetail;
import com.finbourne.notifications.model.UpdateSubscription;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubscriptionsApi
 */
@Ignore
public class SubscriptionsApiTest {

    private final SubscriptionsApi api = new SubscriptionsApi();

    
    /**
     * [EXPERIMENTAL] CreateSubscription: Create a new subscription.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSubscriptionTest() throws ApiException {
        CreateSubscription createSubscription = null;
        Subscription response = api.createSubscription(createSubscription);

        // TODO: test validations
    }
    
    /**
     * [EXPERIMENTAL] DeleteSubscription: Delete a subscription.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSubscriptionTest() throws ApiException {
        String scope = null;
        String code = null;
        api.deleteSubscription(scope, code);

        // TODO: test validations
    }
    
    /**
     * [EXPERIMENTAL] GetSubscription: Get a subscription.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSubscriptionTest() throws ApiException {
        String scope = null;
        String code = null;
        SubscriptionDetail response = api.getSubscription(scope, code);

        // TODO: test validations
    }
    
    /**
     * [EXPERIMENTAL] ListSubscriptions: List subscriptions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listSubscriptionsTest() throws ApiException {
        String filter = null;
        String sortBy = null;
        String page = null;
        Integer limit = null;
        ResourceListOfSubscription response = api.listSubscriptions(filter, sortBy, page, limit);

        // TODO: test validations
    }
    
    /**
     * [EXPERIMENTAL] UpdateSubscription: Update an existing subscription.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSubscriptionTest() throws ApiException {
        String scope = null;
        String code = null;
        UpdateSubscription updateSubscription = null;
        Subscription response = api.updateSubscription(scope, code, updateSubscription);

        // TODO: test validations
    }
    
}
