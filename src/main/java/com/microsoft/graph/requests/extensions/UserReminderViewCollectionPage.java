// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Reminder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.UserReminderViewCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserReminderViewCollectionPage;
import com.microsoft.graph.requests.extensions.UserReminderViewCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Reminder View Collection Page.
 */
public class UserReminderViewCollectionPage extends BaseCollectionPage<Reminder> {

    /**
     * A collection page for Reminder.
     *
     * @param response The serialized UserReminderViewCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public UserReminderViewCollectionPage(final UserReminderViewCollectionResponse response, final UserReminderViewCollectionRequestBuilder builder) {
       super(response, builder);
    }
}