
package com.philipowino.medicalhealthtracker.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Primarysource {

    @SerializedName("reportercountry")
    @Expose
    private String reportercountry;
    @SerializedName("qualification")
    @Expose
    private String qualification;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Primarysource() {
    }

    /**
     * 
     * @param qualification
     * @param reportercountry
     */
    public Primarysource(String reportercountry, String qualification) {
        super();
        this.reportercountry = reportercountry;
        this.qualification = qualification;
    }

    public String getReportercountry() {
        return reportercountry;
    }

    public void setReportercountry(String reportercountry) {
        this.reportercountry = reportercountry;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.qualification == null)? 0 :this.qualification.hashCode()));
        result = ((result* 31)+((this.reportercountry == null)? 0 :this.reportercountry.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Primarysource) == false) {
            return false;
        }
        Primarysource rhs = ((Primarysource) other);
        return (((this.qualification == rhs.qualification)||((this.qualification!= null)&&this.qualification.equals(rhs.qualification)))&&((this.reportercountry == rhs.reportercountry)||((this.reportercountry!= null)&&this.reportercountry.equals(rhs.reportercountry))));
    }

}
