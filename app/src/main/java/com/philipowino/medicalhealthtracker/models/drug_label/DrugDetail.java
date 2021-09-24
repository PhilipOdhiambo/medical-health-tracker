
package com.philipowino.medicalhealthtracker.models.drug_label;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class DrugDetail {

    @SerializedName("meta")
    @Expose
    private Meta meta;
    @SerializedName("results")
    @Expose
    private List<LabelResult> labelResults = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DrugDetail() {
    }

    /**
     * 
     * @param meta
     * @param labelResults
     */
    public DrugDetail(Meta meta, List<LabelResult> labelResults) {
        super();
        this.meta = meta;
        this.labelResults = labelResults;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<LabelResult> getResults() {
        return labelResults;
    }

    public void setResults(List<LabelResult> labelResults) {
        this.labelResults = labelResults;
    }

}
