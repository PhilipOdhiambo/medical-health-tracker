
package com.philipowino.medicalhealthtracker.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Summary {

    @SerializedName("narrativeincludeclinical")
    @Expose
    private String narrativeincludeclinical;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Summary() {
    }

    /**
     * 
     * @param narrativeincludeclinical
     */
    public Summary(String narrativeincludeclinical) {
        super();
        this.narrativeincludeclinical = narrativeincludeclinical;
    }

    public String getNarrativeincludeclinical() {
        return narrativeincludeclinical;
    }

    public void setNarrativeincludeclinical(String narrativeincludeclinical) {
        this.narrativeincludeclinical = narrativeincludeclinical;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.narrativeincludeclinical == null)? 0 :this.narrativeincludeclinical.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Summary) == false) {
            return false;
        }
        Summary rhs = ((Summary) other);
        return ((this.narrativeincludeclinical == rhs.narrativeincludeclinical)||((this.narrativeincludeclinical!= null)&&this.narrativeincludeclinical.equals(rhs.narrativeincludeclinical)));
    }

}
