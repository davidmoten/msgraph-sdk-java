// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsYieldMatRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsYieldMatRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Yield Mat Request Builder.
 */
public class WorkbookFunctionsYieldMatRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsYieldMatRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsYieldMat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param settlement the settlement
     * @param maturity the maturity
     * @param issue the issue
     * @param rate the rate
     * @param pr the pr
     * @param basis the basis
     */
    public WorkbookFunctionsYieldMatRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement settlement, final com.google.gson.JsonElement maturity, final com.google.gson.JsonElement issue, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement pr, final com.google.gson.JsonElement basis) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("settlement", settlement);
        bodyParams.put("maturity", maturity);
        bodyParams.put("issue", issue);
        bodyParams.put("rate", rate);
        bodyParams.put("pr", pr);
        bodyParams.put("basis", basis);
    }

    /**
     * Creates the IWorkbookFunctionsYieldMatRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsYieldMatRequest instance
     */
    public IWorkbookFunctionsYieldMatRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookFunctionsYieldMatRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsYieldMatRequest instance
     */
    public IWorkbookFunctionsYieldMatRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsYieldMatRequest request = new WorkbookFunctionsYieldMatRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("settlement")) {
            request.body.settlement = getParameter("settlement");
        }

        if (hasParameter("maturity")) {
            request.body.maturity = getParameter("maturity");
        }

        if (hasParameter("issue")) {
            request.body.issue = getParameter("issue");
        }

        if (hasParameter("rate")) {
            request.body.rate = getParameter("rate");
        }

        if (hasParameter("pr")) {
            request.body.pr = getParameter("pr");
        }

        if (hasParameter("basis")) {
            request.body.basis = getParameter("basis");
        }

        return request;
    }
}
