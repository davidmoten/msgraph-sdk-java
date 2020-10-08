// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ThreatCategory;
import com.microsoft.graph.models.generated.ThreatAssessmentContentType;
import com.microsoft.graph.models.extensions.IdentitySet;
import com.microsoft.graph.models.generated.ThreatExpectedAssessment;
import com.microsoft.graph.models.generated.ThreatAssessmentRequestSource;
import com.microsoft.graph.models.generated.ThreatAssessmentStatus;
import com.microsoft.graph.models.extensions.ThreatAssessmentResult;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ThreatAssessmentResultCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Threat Assessment Request.
 */
public class ThreatAssessmentRequest extends Entity implements IJsonBackedObject {


    /**
     * The Category.
     * The threat category. Possible values are: spam, phishing, malware.
     */
    @SerializedName(value = "category", alternate = {"Category"})
    @Expose
    public ThreatCategory category;

    /**
     * The Content Type.
     * The content type of threat assessment. Possible values are: mail, url, file.
     */
    @SerializedName(value = "contentType", alternate = {"ContentType"})
    @Expose
    public ThreatAssessmentContentType contentType;

    /**
     * The Created By.
     * The threat assessment request creator.
     */
    @SerializedName(value = "createdBy", alternate = {"CreatedBy"})
    @Expose
    public IdentitySet createdBy;

    /**
     * The Created Date Time.
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Expected Assessment.
     * The expected assessment from submitter. Possible values are: block, unblock.
     */
    @SerializedName(value = "expectedAssessment", alternate = {"ExpectedAssessment"})
    @Expose
    public ThreatExpectedAssessment expectedAssessment;

    /**
     * The Request Source.
     * The source of the threat assessment request. Possible values are: user, administrator.
     */
    @SerializedName(value = "requestSource", alternate = {"RequestSource"})
    @Expose
    public ThreatAssessmentRequestSource requestSource;

    /**
     * The Status.
     * The assessment process status. Possible values are: pending, completed.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
    public ThreatAssessmentStatus status;

    /**
     * The Results.
     * A collection of threat assessment results. Read-only. By default, a GET /threatAssessmentRequests/{id} does not return this property unless you apply $expand on it.
     */
    @SerializedName(value = "results", alternate = {"Results"})
    @Expose
    public ThreatAssessmentResultCollectionPage results;


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


        if (json.has("results")) {
            results = serializer.deserializeObject(json.get("results").toString(), ThreatAssessmentResultCollectionPage.class);
        }
    }
}