// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ComplianceInformation;
import com.microsoft.graph.models.extensions.SecureScoreControlStateUpdate;
import com.microsoft.graph.models.extensions.SecurityVendorInformation;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Secure Score Control Profile.
 */
public class SecureScoreControlProfile extends Entity implements IJsonBackedObject {


    /**
     * The Action Type.
     * Control action type (Config, Review, Behavior).
     */
    @SerializedName(value = "actionType", alternate = {"ActionType"})
    @Expose
    public String actionType;

    /**
     * The Action Url.
     * URL to where the control can be actioned.
     */
    @SerializedName(value = "actionUrl", alternate = {"ActionUrl"})
    @Expose
    public String actionUrl;

    /**
     * The Azure Tenant Id.
     * GUID string for tenant ID.
     */
    @SerializedName(value = "azureTenantId", alternate = {"AzureTenantId"})
    @Expose
    public String azureTenantId;

    /**
     * The Compliance Information.
     * 
     */
    @SerializedName(value = "complianceInformation", alternate = {"ComplianceInformation"})
    @Expose
    public java.util.List<ComplianceInformation> complianceInformation;

    /**
     * The Control Category.
     * Control action category (Identity, Data, Device, Apps, Infrastructure).
     */
    @SerializedName(value = "controlCategory", alternate = {"ControlCategory"})
    @Expose
    public String controlCategory;

    /**
     * The Control State Updates.
     * 
     */
    @SerializedName(value = "controlStateUpdates", alternate = {"ControlStateUpdates"})
    @Expose
    public java.util.List<SecureScoreControlStateUpdate> controlStateUpdates;

    /**
     * The Deprecated.
     * Flag to indicate if a control is depreciated.
     */
    @SerializedName(value = "deprecated", alternate = {"Deprecated"})
    @Expose
    public Boolean deprecated;

    /**
     * The Implementation Cost.
     * Resource cost of implemmentating control (low, moderate, high).
     */
    @SerializedName(value = "implementationCost", alternate = {"ImplementationCost"})
    @Expose
    public String implementationCost;

    /**
     * The Last Modified Date Time.
     * Time at which the control profile entity was last modified. The Timestamp type represents date and time
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Max Score.
     * max attainable score for the control.
     */
    @SerializedName(value = "maxScore", alternate = {"MaxScore"})
    @Expose
    public Double maxScore;

    /**
     * The Rank.
     * Microsoft's stack ranking of control.
     */
    @SerializedName(value = "rank", alternate = {"Rank"})
    @Expose
    public Integer rank;

    /**
     * The Remediation.
     * Description of what the control will help remediate.
     */
    @SerializedName(value = "remediation", alternate = {"Remediation"})
    @Expose
    public String remediation;

    /**
     * The Remediation Impact.
     * Description of the impact on users of the remediation.
     */
    @SerializedName(value = "remediationImpact", alternate = {"RemediationImpact"})
    @Expose
    public String remediationImpact;

    /**
     * The Service.
     * Service that owns the control (Exchange, Sharepoint, Azure AD).
     */
    @SerializedName(value = "service", alternate = {"Service"})
    @Expose
    public String service;

    /**
     * The Threats.
     * List of threats the control mitigates (accountBreach,dataDeletion,dataExfiltration,dataSpillage,
     */
    @SerializedName(value = "threats", alternate = {"Threats"})
    @Expose
    public java.util.List<String> threats;

    /**
     * The Tier.
     * 
     */
    @SerializedName(value = "tier", alternate = {"Tier"})
    @Expose
    public String tier;

    /**
     * The Title.
     * Title of the control.
     */
    @SerializedName(value = "title", alternate = {"Title"})
    @Expose
    public String title;

    /**
     * The User Impact.
     * 
     */
    @SerializedName(value = "userImpact", alternate = {"UserImpact"})
    @Expose
    public String userImpact;

    /**
     * The Vendor Information.
     * 
     */
    @SerializedName(value = "vendorInformation", alternate = {"VendorInformation"})
    @Expose
    public SecurityVendorInformation vendorInformation;


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

    }
}