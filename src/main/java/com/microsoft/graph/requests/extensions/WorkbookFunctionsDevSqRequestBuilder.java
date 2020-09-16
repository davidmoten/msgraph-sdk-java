// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsDevSqRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsDevSqRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Dev Sq Request Builder.
 */
public class WorkbookFunctionsDevSqRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsDevSqRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsDevSq
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param values the values
     */
    public WorkbookFunctionsDevSqRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement values) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("values", values);
    }

    /**
     * Creates the IWorkbookFunctionsDevSqRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsDevSqRequest instance
     */
    public IWorkbookFunctionsDevSqRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookFunctionsDevSqRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsDevSqRequest instance
     */
    public IWorkbookFunctionsDevSqRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsDevSqRequest request = new WorkbookFunctionsDevSqRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("values")) {
            request.body.values = getParameter("values");
        }

        return request;
    }
}
