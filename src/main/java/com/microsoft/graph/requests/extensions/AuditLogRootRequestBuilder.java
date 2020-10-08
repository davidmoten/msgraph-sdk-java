// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AuditLogRoot;
import com.microsoft.graph.requests.extensions.DirectoryAuditCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryAuditRequestBuilder;
import com.microsoft.graph.requests.extensions.RestrictedSignInCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RestrictedSignInRequestBuilder;
import com.microsoft.graph.requests.extensions.SignInCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SignInRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Audit Log Root Request Builder.
 */
public class AuditLogRootRequestBuilder extends BaseRequestBuilder {

    /**
     * The request builder for the AuditLogRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AuditLogRootRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the AuditLogRootRequest instance
     */
    public AuditLogRootRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the AuditLogRootRequest instance
     */
    public AuditLogRootRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.AuditLogRootRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public DirectoryAuditCollectionRequestBuilder directoryAudits() {
        return new DirectoryAuditCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("directoryAudits"), getClient(), null);
    }

    public DirectoryAuditRequestBuilder directoryAudits(final String id) {
        return new DirectoryAuditRequestBuilder(getRequestUrlWithAdditionalSegment("directoryAudits") + "/" + id, getClient(), null);
    }
    public RestrictedSignInCollectionRequestBuilder restrictedSignIns() {
        return new RestrictedSignInCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("restrictedSignIns"), getClient(), null);
    }

    public RestrictedSignInRequestBuilder restrictedSignIns(final String id) {
        return new RestrictedSignInRequestBuilder(getRequestUrlWithAdditionalSegment("restrictedSignIns") + "/" + id, getClient(), null);
    }
    public SignInCollectionRequestBuilder signIns() {
        return new SignInCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("signIns"), getClient(), null);
    }

    public SignInRequestBuilder signIns(final String id) {
        return new SignInRequestBuilder(getRequestUrlWithAdditionalSegment("signIns") + "/" + id, getClient(), null);
    }
}