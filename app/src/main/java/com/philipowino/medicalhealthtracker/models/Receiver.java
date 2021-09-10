
package com.philipowino.medicalhealthtracker.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Receiver {

    @SerializedName("receivertype")
    @Expose
    private String receivertype;
    @SerializedName("receiverorganization")
    @Expose
    private String receiverorganization;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Receiver() {
    }

    /**
     * 
     * @param receivertype
     * @param receiverorganization
     */
    public Receiver(String receivertype, String receiverorganization) {
        super();
        this.receivertype = receivertype;
        this.receiverorganization = receiverorganization;
    }

    public String getReceivertype() {
        return receivertype;
    }

    public void setReceivertype(String receivertype) {
        this.receivertype = receivertype;
    }

    public String getReceiverorganization() {
        return receiverorganization;
    }

    public void setReceiverorganization(String receiverorganization) {
        this.receiverorganization = receiverorganization;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.receivertype == null)? 0 :this.receivertype.hashCode()));
        result = ((result* 31)+((this.receiverorganization == null)? 0 :this.receiverorganization.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Receiver) == false) {
            return false;
        }
        Receiver rhs = ((Receiver) other);
        return (((this.receivertype == rhs.receivertype)||((this.receivertype!= null)&&this.receivertype.equals(rhs.receivertype)))&&((this.receiverorganization == rhs.receiverorganization)||((this.receiverorganization!= null)&&this.receiverorganization.equals(rhs.receiverorganization))));
    }

}
