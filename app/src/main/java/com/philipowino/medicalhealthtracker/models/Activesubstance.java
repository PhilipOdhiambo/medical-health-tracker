
package com.philipowino.medicalhealthtracker.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Activesubstance {

    @SerializedName("activesubstancename")
    @Expose
    private String activesubstancename;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Activesubstance() {
    }

    /**
     * 
     * @param activesubstancename
     */
    public Activesubstance(String activesubstancename) {
        super();
        this.activesubstancename = activesubstancename;
    }

    public String getActivesubstancename() {
        return activesubstancename;
    }

    public void setActivesubstancename(String activesubstancename) {
        this.activesubstancename = activesubstancename;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.activesubstancename == null)? 0 :this.activesubstancename.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Activesubstance) == false) {
            return false;
        }
        Activesubstance rhs = ((Activesubstance) other);
        return ((this.activesubstancename == rhs.activesubstancename)||((this.activesubstancename!= null)&&this.activesubstancename.equals(rhs.activesubstancename)));
    }

}
