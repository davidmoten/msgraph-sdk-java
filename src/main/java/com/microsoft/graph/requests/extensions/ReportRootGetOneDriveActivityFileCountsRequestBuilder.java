// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveActivityFileCountsRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetOneDriveActivityFileCountsRequest;
import com.microsoft.graph.models.extensions.Report;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get One Drive Activity File Counts Request Builder.
 */
public class ReportRootGetOneDriveActivityFileCountsRequestBuilder extends BaseFunctionRequestBuilder implements IReportRootGetOneDriveActivityFileCountsRequestBuilder {

    /**
     * The request builder for this ReportRootGetOneDriveActivityFileCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public ReportRootGetOneDriveActivityFileCountsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootGetOneDriveActivityFileCountsRequest
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetOneDriveActivityFileCountsRequest instance
     */
    public IReportRootGetOneDriveActivityFileCountsRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IReportRootGetOneDriveActivityFileCountsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetOneDriveActivityFileCountsRequest instance
     */
    public IReportRootGetOneDriveActivityFileCountsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ReportRootGetOneDriveActivityFileCountsRequest request = new ReportRootGetOneDriveActivityFileCountsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
