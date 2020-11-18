// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.DelegatedPermissionClassification;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.DelegatedPermissionClassificationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DelegatedPermissionClassificationRequestBuilder;
import com.microsoft.graph.requests.extensions.DelegatedPermissionClassificationCollectionRequest;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Delegated Permission Classification Collection Request Builder.
 */
public class DelegatedPermissionClassificationCollectionRequestBuilder extends BaseCollectionRequestBuilder<DelegatedPermissionClassification, DelegatedPermissionClassificationRequestBuilder, DelegatedPermissionClassificationCollectionResponse, DelegatedPermissionClassificationCollectionPage, DelegatedPermissionClassificationCollectionRequest> {

    /**
     * The request builder for this collection of ServicePrincipal
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DelegatedPermissionClassificationCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DelegatedPermissionClassificationRequestBuilder.class, DelegatedPermissionClassificationCollectionRequest.class);
    }


}