package com.philipowino.medicalhealthtracker.models.firebase;

import java.util.List;

public class Drug {
    private String name;
    private List<String> uses;
    private List<String> warning;
    private String pushId;

    public Drug(String name, List<String> uses, List<String> warning) {
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

    public List<String> getUses() {
        return uses;
    }

    public void setUses(List<String> uses) {
        this.uses = uses;
    }

    public List<String> getWarning() {
        return warning;
    }

    public void setWarning(List<String> warning) {
        this.warning = warning;
    }

    public String getPushId() {
        return pushId;
    }

    public void setPushId(String pushId) {
        this.pushId = pushId;
    }
}
