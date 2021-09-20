
package com.philipowino.medicalhealthtracker.models.count;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class Meta {

    @SerializedName("disclaimer")
    @Expose
    private String disclaimer;
    @SerializedName("terms")
    @Expose
    private String terms;
    @SerializedName("license")
    @Expose
    private String license;
    @SerializedName("last_updated")
    @Expose
    private String lastUpdated;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Meta() {
    }

    /**
     * 
     * @param license
     * @param lastUpdated
     * @param terms
     * @param disclaimer
     */
    public Meta(String disclaimer, String terms, String license, String lastUpdated) {
        super();
        this.disclaimer = disclaimer;
        this.terms = terms;
        this.license = license;
        this.lastUpdated = lastUpdated;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

}
