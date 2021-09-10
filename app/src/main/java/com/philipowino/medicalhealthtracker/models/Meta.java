
package com.philipowino.medicalhealthtracker.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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
    @SerializedName("results")
    @Expose
    private Results results;

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
     * @param results
     * @param disclaimer
     */
    public Meta(String disclaimer, String terms, String license, String lastUpdated, Results results) {
        super();
        this.disclaimer = disclaimer;
        this.terms = terms;
        this.license = license;
        this.lastUpdated = lastUpdated;
        this.results = results;
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

    public Results getResults() {
        return results;
    }

    public void setResults(Results results) {
        this.results = results;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.license == null)? 0 :this.license.hashCode()));
        result = ((result* 31)+((this.lastUpdated == null)? 0 :this.lastUpdated.hashCode()));
        result = ((result* 31)+((this.terms == null)? 0 :this.terms.hashCode()));
        result = ((result* 31)+((this.results == null)? 0 :this.results.hashCode()));
        result = ((result* 31)+((this.disclaimer == null)? 0 :this.disclaimer.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Meta) == false) {
            return false;
        }
        Meta rhs = ((Meta) other);
        return ((((((this.license == rhs.license)||((this.license!= null)&&this.license.equals(rhs.license)))&&((this.lastUpdated == rhs.lastUpdated)||((this.lastUpdated!= null)&&this.lastUpdated.equals(rhs.lastUpdated))))&&((this.terms == rhs.terms)||((this.terms!= null)&&this.terms.equals(rhs.terms))))&&((this.results == rhs.results)||((this.results!= null)&&this.results.equals(rhs.results))))&&((this.disclaimer == rhs.disclaimer)||((this.disclaimer!= null)&&this.disclaimer.equals(rhs.disclaimer))));
    }

}
