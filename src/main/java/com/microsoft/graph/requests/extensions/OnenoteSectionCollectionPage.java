// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OnenoteSection;
import com.microsoft.graph.requests.extensions.OnenoteSectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteSectionCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Section Collection Page.
 */
public class OnenoteSectionCollectionPage extends BaseCollectionPage<OnenoteSection> {

    /**
     * A collection page for OnenoteSection
     *
     * @param response the serialized OnenoteSectionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public OnenoteSectionCollectionPage(final OnenoteSectionCollectionResponse response, final OnenoteSectionCollectionRequestBuilder builder) {
        super(response, builder);
    }
}