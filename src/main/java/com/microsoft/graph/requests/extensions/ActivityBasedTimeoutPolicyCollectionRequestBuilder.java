// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PolicyRoot;
import com.microsoft.graph.models.extensions.ActivityBasedTimeoutPolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ActivityBasedTimeoutPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ActivityBasedTimeoutPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ActivityBasedTimeoutPolicyCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Activity Based Timeout Policy Collection Request Builder.
 */
public class ActivityBasedTimeoutPolicyCollectionRequestBuilder extends BaseRequestBuilder {

    /**
     * The request builder for this collection of PolicyRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ActivityBasedTimeoutPolicyCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ActivityBasedTimeoutPolicyCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ActivityBasedTimeoutPolicyCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ActivityBasedTimeoutPolicyCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ActivityBasedTimeoutPolicyRequestBuilder byId(final String id) {
        return new ActivityBasedTimeoutPolicyRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}