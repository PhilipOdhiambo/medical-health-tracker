
package com.philipowino.medicalhealthtracker.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Reaction {

    @SerializedName("reactionmeddraversionpt")
    @Expose
    private String reactionmeddraversionpt;
    @SerializedName("reactionmeddrapt")
    @Expose
    private String reactionmeddrapt;
    @SerializedName("reactionoutcome")
    @Expose
    private String reactionoutcome;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Reaction() {
    }

    /**
     * 
     * @param reactionoutcome
     * @param reactionmeddraversionpt
     * @param reactionmeddrapt
     */
    public Reaction(String reactionmeddraversionpt, String reactionmeddrapt, String reactionoutcome) {
        super();
        this.reactionmeddraversionpt = reactionmeddraversionpt;
        this.reactionmeddrapt = reactionmeddrapt;
        this.reactionoutcome = reactionoutcome;
    }

    public String getReactionmeddraversionpt() {
        return reactionmeddraversionpt;
    }

    public void setReactionmeddraversionpt(String reactionmeddraversionpt) {
        this.reactionmeddraversionpt = reactionmeddraversionpt;
    }

    public String getReactionmeddrapt() {
        return reactionmeddrapt;
    }

    public void setReactionmeddrapt(String reactionmeddrapt) {
        this.reactionmeddrapt = reactionmeddrapt;
    }

    public String getReactionoutcome() {
        return reactionoutcome;
    }

    public void setReactionoutcome(String reactionoutcome) {
        this.reactionoutcome = reactionoutcome;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.reactionoutcome == null)? 0 :this.reactionoutcome.hashCode()));
        result = ((result* 31)+((this.reactionmeddraversionpt == null)? 0 :this.reactionmeddraversionpt.hashCode()));
        result = ((result* 31)+((this.reactionmeddrapt == null)? 0 :this.reactionmeddrapt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Reaction) == false) {
            return false;
        }
        Reaction rhs = ((Reaction) other);
        return ((((this.reactionoutcome == rhs.reactionoutcome)||((this.reactionoutcome!= null)&&this.reactionoutcome.equals(rhs.reactionoutcome)))&&((this.reactionmeddraversionpt == rhs.reactionmeddraversionpt)||((this.reactionmeddraversionpt!= null)&&this.reactionmeddraversionpt.equals(rhs.reactionmeddraversionpt))))&&((this.reactionmeddrapt == rhs.reactionmeddrapt)||((this.reactionmeddrapt!= null)&&this.reactionmeddrapt.equals(rhs.reactionmeddrapt))));
    }

}
