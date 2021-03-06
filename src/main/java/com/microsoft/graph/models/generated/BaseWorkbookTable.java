// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;

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

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Table.
 */
public class BaseWorkbookTable extends Entity implements IJsonBackedObject {


    /**
     * The Highlight First Column.
     * 
     */
    @SerializedName("highlightFirstColumn")
    @Expose
    public Boolean highlightFirstColumn;

    /**
     * The Highlight Last Column.
     * 
     */
    @SerializedName("highlightLastColumn")
    @Expose
    public Boolean highlightLastColumn;

    /**
     * The Name.
     * 
     */
    @SerializedName("name")
    @Expose
    public String name;

    /**
     * The Show Banded Columns.
     * 
     */
    @SerializedName("showBandedColumns")
    @Expose
    public Boolean showBandedColumns;

    /**
     * The Show Banded Rows.
     * 
     */
    @SerializedName("showBandedRows")
    @Expose
    public Boolean showBandedRows;

    /**
     * The Show Filter Button.
     * 
     */
    @SerializedName("showFilterButton")
    @Expose
    public Boolean showFilterButton;

    /**
     * The Show Headers.
     * 
     */
    @SerializedName("showHeaders")
    @Expose
    public Boolean showHeaders;

    /**
     * The Show Totals.
     * 
     */
    @SerializedName("showTotals")
    @Expose
    public Boolean showTotals;

    /**
     * The Style.
     * 
     */
    @SerializedName("style")
    @Expose
    public String style;

    /**
     * The Columns.
     * 
     */
    public WorkbookTableColumnCollectionPage columns;

    /**
     * The Rows.
     * 
     */
    public WorkbookTableRowCollectionPage rows;

    /**
     * The Sort.
     * 
     */
    @SerializedName("sort")
    @Expose
    public WorkbookTableSort sort;

    /**
     * The Worksheet.
     * 
     */
    @SerializedName("worksheet")
    @Expose
    public WorkbookWorksheet worksheet;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("columns")) {
            final BaseWorkbookTableColumnCollectionResponse response = new BaseWorkbookTableColumnCollectionResponse();
            if (json.has("columns@odata.nextLink")) {
                response.nextLink = json.get("columns@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("columns").toString(), JsonObject[].class);
            final WorkbookTableColumn[] array = new WorkbookTableColumn[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), WorkbookTableColumn.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            columns = new WorkbookTableColumnCollectionPage(response, null);
        }

        if (json.has("rows")) {
            final BaseWorkbookTableRowCollectionResponse response = new BaseWorkbookTableRowCollectionResponse();
            if (json.has("rows@odata.nextLink")) {
                response.nextLink = json.get("rows@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("rows").toString(), JsonObject[].class);
            final WorkbookTableRow[] array = new WorkbookTableRow[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), WorkbookTableRow.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            rows = new WorkbookTableRowCollectionPage(response, null);
        }
    }
}
