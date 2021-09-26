package com.philipowino.medicalhealthtracker.models.firebase;

import org.parceler.Parcel;

import java.util.List;
@Parcel
public class FirebaseDrug {
    String name;
    String uses;
    String warning;
    String pushId;

    // Empty constructor
    FirebaseDrug() {};

    public FirebaseDrug(String name, String uses, String warning) {
        this.name = name;
        this.uses = uses;
        this.warning = warning;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUses() {
        return uses;
    }
    public String getWarning() {
        return warning;
    }
    public String getPushId() {
        return pushId;
    }



    public void setUses(String uses) {
        this.uses = uses;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    public void setPushId(String pushId) {
        this.pushId = pushId;
    }
}
