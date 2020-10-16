// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookRangeView;
import com.microsoft.graph.requests.extensions.WorkbookRangeViewCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeViewCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range View Collection Page.
 */
public class WorkbookRangeViewCollectionPage extends BaseCollectionPage<WorkbookRangeView> {

    /**
     * A collection page for WorkbookRangeView
     *
     * @param response the serialized WorkbookRangeViewCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WorkbookRangeViewCollectionPage(final WorkbookRangeViewCollectionResponse response, final WorkbookRangeViewCollectionRequestBuilder builder) {
        super(response, builder);
    }
}