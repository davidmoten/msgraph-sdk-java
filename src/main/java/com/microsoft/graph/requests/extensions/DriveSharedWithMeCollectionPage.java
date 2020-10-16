// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DriveItem;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DriveSharedWithMeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveSharedWithMeCollectionPage;
import com.microsoft.graph.requests.extensions.DriveSharedWithMeCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Shared With Me Collection Page.
 */
public class DriveSharedWithMeCollectionPage extends BaseCollectionPage<DriveItem> {

    /**
     * A collection page for DriveItem.
     *
     * @param response The serialized DriveSharedWithMeCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public DriveSharedWithMeCollectionPage(final DriveSharedWithMeCollectionResponse response, final DriveSharedWithMeCollectionRequestBuilder builder) {
       super(response, builder);
    }
}