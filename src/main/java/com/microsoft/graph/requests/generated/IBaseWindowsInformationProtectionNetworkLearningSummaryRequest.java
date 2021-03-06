// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Windows Information Protection Network Learning Summary Request.
 */
public interface IBaseWindowsInformationProtectionNetworkLearningSummaryRequest extends IHttpRequest {

    /**
     * Gets the WindowsInformationProtectionNetworkLearningSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<WindowsInformationProtectionNetworkLearningSummary> callback);

    /**
     * Gets the WindowsInformationProtectionNetworkLearningSummary from the service
     *
     * @return the WindowsInformationProtectionNetworkLearningSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsInformationProtectionNetworkLearningSummary get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WindowsInformationProtectionNetworkLearningSummary with a source
     *
     * @param sourceWindowsInformationProtectionNetworkLearningSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WindowsInformationProtectionNetworkLearningSummary sourceWindowsInformationProtectionNetworkLearningSummary, final ICallback<WindowsInformationProtectionNetworkLearningSummary> callback);

    /**
     * Patches this WindowsInformationProtectionNetworkLearningSummary with a source
     *
     * @param sourceWindowsInformationProtectionNetworkLearningSummary the source object with updates
     * @return the updated WindowsInformationProtectionNetworkLearningSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsInformationProtectionNetworkLearningSummary patch(final WindowsInformationProtectionNetworkLearningSummary sourceWindowsInformationProtectionNetworkLearningSummary) throws ClientException;

    /**
     * Posts a WindowsInformationProtectionNetworkLearningSummary with a new object
     *
     * @param newWindowsInformationProtectionNetworkLearningSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WindowsInformationProtectionNetworkLearningSummary newWindowsInformationProtectionNetworkLearningSummary, final ICallback<WindowsInformationProtectionNetworkLearningSummary> callback);

    /**
     * Posts a WindowsInformationProtectionNetworkLearningSummary with a new object
     *
     * @param newWindowsInformationProtectionNetworkLearningSummary the new object to create
     * @return the created WindowsInformationProtectionNetworkLearningSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsInformationProtectionNetworkLearningSummary post(final WindowsInformationProtectionNetworkLearningSummary newWindowsInformationProtectionNetworkLearningSummary) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseWindowsInformationProtectionNetworkLearningSummaryRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseWindowsInformationProtectionNetworkLearningSummaryRequest expand(final String value);

}

