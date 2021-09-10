
package com.philipowino.medicalhealthtracker.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sender {

    @SerializedName("sendertype")
    @Expose
    private String sendertype;
    @SerializedName("senderorganization")
    @Expose
    private String senderorganization;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sender() {
    }

    /**
     * 
     * @param senderorganization
     * @param sendertype
     */
    public Sender(String sendertype, String senderorganization) {
        super();
        this.sendertype = sendertype;
        this.senderorganization = senderorganization;
    }

    public String getSendertype() {
        return sendertype;
    }

    public void setSendertype(String sendertype) {
        this.sendertype = sendertype;
    }

    public String getSenderorganization() {
        return senderorganization;
    }

    public void setSenderorganization(String senderorganization) {
        this.senderorganization = senderorganization;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.senderorganization == null)? 0 :this.senderorganization.hashCode()));
        result = ((result* 31)+((this.sendertype == null)? 0 :this.sendertype.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sender) == false) {
            return false;
        }
        Sender rhs = ((Sender) other);
        return (((this.senderorganization == rhs.senderorganization)||((this.senderorganization!= null)&&this.senderorganization.equals(rhs.senderorganization)))&&((this.sendertype == rhs.sendertype)||((this.sendertype!= null)&&this.sendertype.equals(rhs.sendertype))));
    }

}
