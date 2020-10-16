// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DirectoryRoleTemplate;
import com.microsoft.graph.requests.extensions.DirectoryRoleTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryRoleTemplateCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Role Template Collection Page.
 */
public class DirectoryRoleTemplateCollectionPage extends BaseCollectionPage<DirectoryRoleTemplate> {

    /**
     * A collection page for DirectoryRoleTemplate
     *
     * @param response the serialized DirectoryRoleTemplateCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DirectoryRoleTemplateCollectionPage(final DirectoryRoleTemplateCollectionResponse response, final DirectoryRoleTemplateCollectionRequestBuilder builder) {
        super(response, builder);
    }
}