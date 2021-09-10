
package com.philipowino.medicalhealthtracker.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DrugAdverseEvent {

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
    public DrugAdverseEvent() {
    }

    /**
     * 
     * @param meta
     * @param results
     */
    public DrugAdverseEvent(Meta meta, List<Result> results) {
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

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.results == null)? 0 :this.results.hashCode()));
        result = ((result* 31)+((this.meta == null)? 0 :this.meta.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DrugAdverseEvent) == false) {
            return false;
        }
        DrugAdverseEvent rhs = ((DrugAdverseEvent) other);
        return (((this.results == rhs.results)||((this.results!= null)&&this.results.equals(rhs.results)))&&((this.meta == rhs.meta)||((this.meta!= null)&&this.meta.equals(rhs.meta))));
    }

}
