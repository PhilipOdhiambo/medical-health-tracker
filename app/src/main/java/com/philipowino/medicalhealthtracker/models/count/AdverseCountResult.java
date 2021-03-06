
package com.philipowino.medicalhealthtracker.models.count;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;
@Parcel
public class AdverseCountResult {

    @SerializedName("meta")
    @Expose
    private Meta meta;
    @SerializedName("results")
    @Expose
    private List<Result> results = null;

    /**
     * No args constructor for use in serialization
     * 
     */

    public AdverseCountResult() {
    }

    /**
     * 
     * @param meta
     * @param results
     */
    public AdverseCountResult(Meta meta, List<Result> results) {
        super();
        this.meta = meta;
        this.results = results;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

}
