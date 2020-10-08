// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ExtensionProperty;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Extension Property Request.
 */
public class ExtensionPropertyRequest extends BaseRequest {
	
    /**
     * The request for the ExtensionProperty
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ExtensionPropertyRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ExtensionProperty.class);
    }

    /**
     * Gets the ExtensionProperty from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super ExtensionProperty> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ExtensionProperty from the service
     *
     * @return the ExtensionProperty from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ExtensionProperty get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super ExtensionProperty> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ExtensionProperty with a source
     *
     * @param sourceExtensionProperty the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ExtensionProperty sourceExtensionProperty, final ICallback<? super ExtensionProperty> callback) {
        send(HttpMethod.PATCH, callback, sourceExtensionProperty);
    }

    /**
     * Patches this ExtensionProperty with a source
     *
     * @param sourceExtensionProperty the source object with updates
     * @return the updated ExtensionProperty
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ExtensionProperty patch(final ExtensionProperty sourceExtensionProperty) throws ClientException {
        return send(HttpMethod.PATCH, sourceExtensionProperty);
    }

    /**
     * Creates a ExtensionProperty with a new object
     *
     * @param newExtensionProperty the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ExtensionProperty newExtensionProperty, final ICallback<? super ExtensionProperty> callback) {
        send(HttpMethod.POST, callback, newExtensionProperty);
    }

    /**
     * Creates a ExtensionProperty with a new object
     *
     * @param newExtensionProperty the new object to create
     * @return the created ExtensionProperty
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ExtensionProperty post(final ExtensionProperty newExtensionProperty) throws ClientException {
        return send(HttpMethod.POST, newExtensionProperty);
    }

    /**
     * Creates a ExtensionProperty with a new object
     *
     * @param newExtensionProperty the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ExtensionProperty newExtensionProperty, final ICallback<? super ExtensionProperty> callback) {
        send(HttpMethod.PUT, callback, newExtensionProperty);
    }

    /**
     * Creates a ExtensionProperty with a new object
     *
     * @param newExtensionProperty the object to create/update
     * @return the created ExtensionProperty
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ExtensionProperty put(final ExtensionProperty newExtensionProperty) throws ClientException {
        return send(HttpMethod.PUT, newExtensionProperty);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ExtensionPropertyRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ExtensionPropertyRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ExtensionPropertyRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ExtensionPropertyRequest)this;
     }

}
