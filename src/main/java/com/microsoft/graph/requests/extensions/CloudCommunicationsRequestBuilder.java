// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.CloudCommunications;
import com.microsoft.graph.requests.extensions.CallCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CallRequestBuilder;
import com.microsoft.graph.callrecords.requests.extensions.CallRecordCollectionRequestBuilder;
import com.microsoft.graph.callrecords.requests.extensions.CallRecordRequestBuilder;
import com.microsoft.graph.requests.extensions.OnlineMeetingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnlineMeetingRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud Communications Request Builder.
 */
public class CloudCommunicationsRequestBuilder extends BaseRequestBuilder {

    /**
     * The request builder for the CloudCommunications
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CloudCommunicationsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the CloudCommunicationsRequest instance
     */
    public CloudCommunicationsRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the CloudCommunicationsRequest instance
     */
    public CloudCommunicationsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.CloudCommunicationsRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public CallCollectionRequestBuilder calls() {
        return new CallCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("calls"), getClient(), null);
    }

    public CallRequestBuilder calls(final String id) {
        return new CallRequestBuilder(getRequestUrlWithAdditionalSegment("calls") + "/" + id, getClient(), null);
    }
    public CallRecordCollectionRequestBuilder callRecords() {
        return new CallRecordCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("callRecords"), getClient(), null);
    }

    public CallRecordRequestBuilder callRecords(final String id) {
        return new CallRecordRequestBuilder(getRequestUrlWithAdditionalSegment("callRecords") + "/" + id, getClient(), null);
    }
    public OnlineMeetingCollectionRequestBuilder onlineMeetings() {
        return new OnlineMeetingCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("onlineMeetings"), getClient(), null);
    }

    public OnlineMeetingRequestBuilder onlineMeetings(final String id) {
        return new OnlineMeetingRequestBuilder(getRequestUrlWithAdditionalSegment("onlineMeetings") + "/" + id, getClient(), null);
    }
}