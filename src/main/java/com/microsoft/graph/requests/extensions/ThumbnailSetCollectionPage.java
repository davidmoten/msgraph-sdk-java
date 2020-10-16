// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ThumbnailSet;
import com.microsoft.graph.requests.extensions.ThumbnailSetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ThumbnailSetCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Thumbnail Set Collection Page.
 */
public class ThumbnailSetCollectionPage extends BaseCollectionPage<ThumbnailSet> {

    /**
     * A collection page for ThumbnailSet
     *
     * @param response the serialized ThumbnailSetCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ThumbnailSetCollectionPage(final ThumbnailSetCollectionResponse response, final ThumbnailSetCollectionRequestBuilder builder) {
        super(response, builder);
    }
}