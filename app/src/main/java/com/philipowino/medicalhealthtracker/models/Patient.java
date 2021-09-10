
package com.philipowino.medicalhealthtracker.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Patient {

    @SerializedName("patientonsetage")
    @Expose
    private String patientonsetage;
    @SerializedName("patientonsetageunit")
    @Expose
    private String patientonsetageunit;
    @SerializedName("patientsex")
    @Expose
    private String patientsex;
    @SerializedName("reaction")
    @Expose
    private List<Reaction> reaction = null;
    @SerializedName("drug")
    @Expose
    private List<Drug> drug = null;
    @SerializedName("summary")
    @Expose
    private Summary summary;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Patient() {
    }

    /**
     * 
     * @param patientonsetage
     * @param summary
     * @param reaction
     * @param patientonsetageunit
     * @param patientsex
     * @param drug
     */
    public Patient(String patientonsetage, String patientonsetageunit, String patientsex, List<Reaction> reaction, List<Drug> drug, Summary summary) {
        super();
        this.patientonsetage = patientonsetage;
        this.patientonsetageunit = patientonsetageunit;
        this.patientsex = patientsex;
        this.reaction = reaction;
        this.drug = drug;
        this.summary = summary;
    }

    public String getPatientonsetage() {
        return patientonsetage;
    }

    public void setPatientonsetage(String patientonsetage) {
        this.patientonsetage = patientonsetage;
    }

    public String getPatientonsetageunit() {
        return patientonsetageunit;
    }

    public void setPatientonsetageunit(String patientonsetageunit) {
        this.patientonsetageunit = patientonsetageunit;
    }

    public String getPatientsex() {
        return patientsex;
    }

    public void setPatientsex(String patientsex) {
        this.patientsex = patientsex;
    }

    public List<Reaction> getReaction() {
        return reaction;
    }

    public void setReaction(List<Reaction> reaction) {
        this.reaction = reaction;
    }

    public List<Drug> getDrug() {
        return drug;
    }

    public void setDrug(List<Drug> drug) {
        this.drug = drug;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.patientonsetage == null)? 0 :this.patientonsetage.hashCode()));
        result = ((result* 31)+((this.summary == null)? 0 :this.summary.hashCode()));
        result = ((result* 31)+((this.reaction == null)? 0 :this.reaction.hashCode()));
        result = ((result* 31)+((this.patientonsetageunit == null)? 0 :this.patientonsetageunit.hashCode()));
        result = ((result* 31)+((this.patientsex == null)? 0 :this.patientsex.hashCode()));
        result = ((result* 31)+((this.drug == null)? 0 :this.drug.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Patient) == false) {
            return false;
        }
        Patient rhs = ((Patient) other);
        return (((((((this.patientonsetage == rhs.patientonsetage)||((this.patientonsetage!= null)&&this.patientonsetage.equals(rhs.patientonsetage)))&&((this.summary == rhs.summary)||((this.summary!= null)&&this.summary.equals(rhs.summary))))&&((this.reaction == rhs.reaction)||((this.reaction!= null)&&this.reaction.equals(rhs.reaction))))&&((this.patientonsetageunit == rhs.patientonsetageunit)||((this.patientonsetageunit!= null)&&this.patientonsetageunit.equals(rhs.patientonsetageunit))))&&((this.patientsex == rhs.patientsex)||((this.patientsex!= null)&&this.patientsex.equals(rhs.patientsex))))&&((this.drug == rhs.drug)||((this.drug!= null)&&this.drug.equals(rhs.drug))));
    }

}
