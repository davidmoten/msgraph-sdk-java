// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Todo;
import com.microsoft.graph.models.extensions.TodoTaskList;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.TodoTaskListCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TodoTaskListRequestBuilder;
import com.microsoft.graph.requests.extensions.TodoTaskListCollectionRequest;
import com.microsoft.graph.requests.extensions.TodoTaskListDeltaCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Todo Task List Collection Request Builder.
 */
public class TodoTaskListCollectionRequestBuilder extends BaseCollectionRequestBuilder<TodoTaskList, TodoTaskListRequestBuilder, TodoTaskListCollectionResponse, TodoTaskListCollectionPage, TodoTaskListCollectionRequest> {

    /**
     * The request builder for this collection of Todo
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TodoTaskListCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TodoTaskListRequestBuilder.class, TodoTaskListCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    public TodoTaskListDeltaCollectionRequestBuilder delta() {
        return new TodoTaskListDeltaCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.delta"), getClient(), null);
    }

    /**
     * Gets the list of newly created, updated or deleted TodoTaskList
     * 
     * @return a request builder to get the changes
     * @param deltaLink the link returned by the last delta request
     */
	public TodoTaskListDeltaCollectionRequestBuilder delta(final String deltaLink) {
        return new TodoTaskListDeltaCollectionRequestBuilder(deltaLink, getClient(), null);
    }
}