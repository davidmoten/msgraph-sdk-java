// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsDaysRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsDaysRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Days Request Builder.
 */
public class WorkbookFunctionsDaysRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsDaysRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsDays
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param endDate the endDate
     * @param startDate the startDate
     */
    public WorkbookFunctionsDaysRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement endDate, final com.google.gson.JsonElement startDate) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("endDate", endDate);
        bodyParams.put("startDate", startDate);
    }

    /**
     * Creates the IWorkbookFunctionsDaysRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsDaysRequest instance
     */
    public IWorkbookFunctionsDaysRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookFunctionsDaysRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsDaysRequest instance
     */
    public IWorkbookFunctionsDaysRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsDaysRequest request = new WorkbookFunctionsDaysRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("endDate")) {
            request.body.endDate = getParameter("endDate");
        }

        if (hasParameter("startDate")) {
            request.body.startDate = getParameter("startDate");
        }

        return request;
    }
}
