// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.UserExportPersonalDataRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Export Personal Data Request Builder.
 */
public class UserExportPersonalDataRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this UserExportPersonalData
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param storageLocation the storageLocation
     */
    public UserExportPersonalDataRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String storageLocation) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("storageLocation", storageLocation);
    }

    /**
     * Creates the UserExportPersonalDataRequest
     *
     * @param requestOptions the options for the request
     * @return the UserExportPersonalDataRequest instance
     */
    public UserExportPersonalDataRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the UserExportPersonalDataRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the UserExportPersonalDataRequest instance
     */
    public UserExportPersonalDataRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        UserExportPersonalDataRequest request = new UserExportPersonalDataRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("storageLocation")) {
            request.body.storageLocation = getParameter("storageLocation");
        }

        return request;
    }
}