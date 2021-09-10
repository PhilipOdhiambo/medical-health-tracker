
package com.philipowino.medicalhealthtracker.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Reportduplicate {

    @SerializedName("duplicatesource")
    @Expose
    private String duplicatesource;
    @SerializedName("duplicatenumb")
    @Expose
    private String duplicatenumb;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Reportduplicate() {
    }

    /**
     * 
     * @param duplicatesource
     * @param duplicatenumb
     */
    public Reportduplicate(String duplicatesource, String duplicatenumb) {
        super();
        this.duplicatesource = duplicatesource;
        this.duplicatenumb = duplicatenumb;
    }

    public String getDuplicatesource() {
        return duplicatesource;
    }

    public void setDuplicatesource(String duplicatesource) {
        this.duplicatesource = duplicatesource;
    }

    public String getDuplicatenumb() {
        return duplicatenumb;
    }

    public void setDuplicatenumb(String duplicatenumb) {
        this.duplicatenumb = duplicatenumb;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.duplicatesource == null)? 0 :this.duplicatesource.hashCode()));
        result = ((result* 31)+((this.duplicatenumb == null)? 0 :this.duplicatenumb.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Reportduplicate) == false) {
            return false;
        }
        Reportduplicate rhs = ((Reportduplicate) other);
        return (((this.duplicatesource == rhs.duplicatesource)||((this.duplicatesource!= null)&&this.duplicatesource.equals(rhs.duplicatesource)))&&((this.duplicatenumb == rhs.duplicatenumb)||((this.duplicatenumb!= null)&&this.duplicatenumb.equals(rhs.duplicatenumb))));
    }

}
