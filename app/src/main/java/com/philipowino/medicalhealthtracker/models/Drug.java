
package com.philipowino.medicalhealthtracker.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Drug {

    @SerializedName("drugcharacterization")
    @Expose
    private String drugcharacterization;
    @SerializedName("medicinalproduct")
    @Expose
    private String medicinalproduct;
    @SerializedName("drugstructuredosagenumb")
    @Expose
    private String drugstructuredosagenumb;
    @SerializedName("drugstructuredosageunit")
    @Expose
    private String drugstructuredosageunit;
    @SerializedName("drugseparatedosagenumb")
    @Expose
    private String drugseparatedosagenumb;
    @SerializedName("drugintervaldosageunitnumb")
    @Expose
    private String drugintervaldosageunitnumb;
    @SerializedName("drugintervaldosagedefinition")
    @Expose
    private String drugintervaldosagedefinition;
    @SerializedName("drugdosagetext")
    @Expose
    private String drugdosagetext;
    @SerializedName("drugadministrationroute")
    @Expose
    private String drugadministrationroute;
    @SerializedName("drugindication")
    @Expose
    private String drugindication;
    @SerializedName("actiondrug")
    @Expose
    private String actiondrug;
    @SerializedName("drugadditional")
    @Expose
    private String drugadditional;
    @SerializedName("activesubstance")
    @Expose
    private Activesubstance activesubstance;
    @SerializedName("drugauthorizationnumb")
    @Expose
    private String drugauthorizationnumb;
    @SerializedName("drugdosageform")
    @Expose
    private String drugdosageform;
    @SerializedName("drugstartdateformat")
    @Expose
    private String drugstartdateformat;
    @SerializedName("drugstartdate")
    @Expose
    private String drugstartdate;
    @SerializedName("openfda")
    @Expose
    private Openfda openfda;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Drug() {
    }

    /**
     * 
     * @param drugstartdateformat
     * @param drugindication
     * @param drugintervaldosageunitnumb
     * @param drugadministrationroute
     * @param drugdosageform
     * @param drugstartdate
     * @param openfda
     * @param drugauthorizationnumb
     * @param drugstructuredosageunit
     * @param medicinalproduct
     * @param activesubstance
     * @param drugadditional
     * @param drugcharacterization
     * @param drugstructuredosagenumb
     * @param drugintervaldosagedefinition
     * @param drugdosagetext
     * @param drugseparatedosagenumb
     * @param actiondrug
     */
    public Drug(String drugcharacterization, String medicinalproduct, String drugstructuredosagenumb, String drugstructuredosageunit, String drugseparatedosagenumb, String drugintervaldosageunitnumb, String drugintervaldosagedefinition, String drugdosagetext, String drugadministrationroute, String drugindication, String actiondrug, String drugadditional, Activesubstance activesubstance, String drugauthorizationnumb, String drugdosageform, String drugstartdateformat, String drugstartdate, Openfda openfda) {
        super();
        this.drugcharacterization = drugcharacterization;
        this.medicinalproduct = medicinalproduct;
        this.drugstructuredosagenumb = drugstructuredosagenumb;
        this.drugstructuredosageunit = drugstructuredosageunit;
        this.drugseparatedosagenumb = drugseparatedosagenumb;
        this.drugintervaldosageunitnumb = drugintervaldosageunitnumb;
        this.drugintervaldosagedefinition = drugintervaldosagedefinition;
        this.drugdosagetext = drugdosagetext;
        this.drugadministrationroute = drugadministrationroute;
        this.drugindication = drugindication;
        this.actiondrug = actiondrug;
        this.drugadditional = drugadditional;
        this.activesubstance = activesubstance;
        this.drugauthorizationnumb = drugauthorizationnumb;
        this.drugdosageform = drugdosageform;
        this.drugstartdateformat = drugstartdateformat;
        this.drugstartdate = drugstartdate;
        this.openfda = openfda;
    }

    public String getDrugcharacterization() {
        return drugcharacterization;
    }

    public void setDrugcharacterization(String drugcharacterization) {
        this.drugcharacterization = drugcharacterization;
    }

    public String getMedicinalproduct() {
        return medicinalproduct;
    }

    public void setMedicinalproduct(String medicinalproduct) {
        this.medicinalproduct = medicinalproduct;
    }

    public String getDrugstructuredosagenumb() {
        return drugstructuredosagenumb;
    }

    public void setDrugstructuredosagenumb(String drugstructuredosagenumb) {
        this.drugstructuredosagenumb = drugstructuredosagenumb;
    }

    public String getDrugstructuredosageunit() {
        return drugstructuredosageunit;
    }

    public void setDrugstructuredosageunit(String drugstructuredosageunit) {
        this.drugstructuredosageunit = drugstructuredosageunit;
    }

    public String getDrugseparatedosagenumb() {
        return drugseparatedosagenumb;
    }

    public void setDrugseparatedosagenumb(String drugseparatedosagenumb) {
        this.drugseparatedosagenumb = drugseparatedosagenumb;
    }

    public String getDrugintervaldosageunitnumb() {
        return drugintervaldosageunitnumb;
    }

    public void setDrugintervaldosageunitnumb(String drugintervaldosageunitnumb) {
        this.drugintervaldosageunitnumb = drugintervaldosageunitnumb;
    }

    public String getDrugintervaldosagedefinition() {
        return drugintervaldosagedefinition;
    }

    public void setDrugintervaldosagedefinition(String drugintervaldosagedefinition) {
        this.drugintervaldosagedefinition = drugintervaldosagedefinition;
    }

    public String getDrugdosagetext() {
        return drugdosagetext;
    }

    public void setDrugdosagetext(String drugdosagetext) {
        this.drugdosagetext = drugdosagetext;
    }

    public String getDrugadministrationroute() {
        return drugadministrationroute;
    }

    public void setDrugadministrationroute(String drugadministrationroute) {
        this.drugadministrationroute = drugadministrationroute;
    }

    public String getDrugindication() {
        return drugindication;
    }

    public void setDrugindication(String drugindication) {
        this.drugindication = drugindication;
    }

    public String getActiondrug() {
        return actiondrug;
    }

    public void setActiondrug(String actiondrug) {
        this.actiondrug = actiondrug;
    }

    public String getDrugadditional() {
        return drugadditional;
    }

    public void setDrugadditional(String drugadditional) {
        this.drugadditional = drugadditional;
    }

    public Activesubstance getActivesubstance() {
        return activesubstance;
    }

    public void setActivesubstance(Activesubstance activesubstance) {
        this.activesubstance = activesubstance;
    }

    public String getDrugauthorizationnumb() {
        return drugauthorizationnumb;
    }

    public void setDrugauthorizationnumb(String drugauthorizationnumb) {
        this.drugauthorizationnumb = drugauthorizationnumb;
    }

    public String getDrugdosageform() {
        return drugdosageform;
    }

    public void setDrugdosageform(String drugdosageform) {
        this.drugdosageform = drugdosageform;
    }

    public String getDrugstartdateformat() {
        return drugstartdateformat;
    }

    public void setDrugstartdateformat(String drugstartdateformat) {
        this.drugstartdateformat = drugstartdateformat;
    }

    public String getDrugstartdate() {
        return drugstartdate;
    }

    public void setDrugstartdate(String drugstartdate) {
        this.drugstartdate = drugstartdate;
    }

    public Openfda getOpenfda() {
        return openfda;
    }

    public void setOpenfda(Openfda openfda) {
        this.openfda = openfda;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.drugstartdateformat == null)? 0 :this.drugstartdateformat.hashCode()));
        result = ((result* 31)+((this.drugindication == null)? 0 :this.drugindication.hashCode()));
        result = ((result* 31)+((this.drugintervaldosageunitnumb == null)? 0 :this.drugintervaldosageunitnumb.hashCode()));
        result = ((result* 31)+((this.drugadministrationroute == null)? 0 :this.drugadministrationroute.hashCode()));
        result = ((result* 31)+((this.drugdosageform == null)? 0 :this.drugdosageform.hashCode()));
        result = ((result* 31)+((this.drugstartdate == null)? 0 :this.drugstartdate.hashCode()));
        result = ((result* 31)+((this.openfda == null)? 0 :this.openfda.hashCode()));
        result = ((result* 31)+((this.drugauthorizationnumb == null)? 0 :this.drugauthorizationnumb.hashCode()));
        result = ((result* 31)+((this.drugstructuredosageunit == null)? 0 :this.drugstructuredosageunit.hashCode()));
        result = ((result* 31)+((this.medicinalproduct == null)? 0 :this.medicinalproduct.hashCode()));
        result = ((result* 31)+((this.activesubstance == null)? 0 :this.activesubstance.hashCode()));
        result = ((result* 31)+((this.drugadditional == null)? 0 :this.drugadditional.hashCode()));
        result = ((result* 31)+((this.drugcharacterization == null)? 0 :this.drugcharacterization.hashCode()));
        result = ((result* 31)+((this.drugstructuredosagenumb == null)? 0 :this.drugstructuredosagenumb.hashCode()));
        result = ((result* 31)+((this.drugintervaldosagedefinition == null)? 0 :this.drugintervaldosagedefinition.hashCode()));
        result = ((result* 31)+((this.drugdosagetext == null)? 0 :this.drugdosagetext.hashCode()));
        result = ((result* 31)+((this.drugseparatedosagenumb == null)? 0 :this.drugseparatedosagenumb.hashCode()));
        result = ((result* 31)+((this.actiondrug == null)? 0 :this.actiondrug.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Drug) == false) {
            return false;
        }
        Drug rhs = ((Drug) other);
        return (((((((((((((((((((this.drugstartdateformat == rhs.drugstartdateformat)||((this.drugstartdateformat!= null)&&this.drugstartdateformat.equals(rhs.drugstartdateformat)))&&((this.drugindication == rhs.drugindication)||((this.drugindication!= null)&&this.drugindication.equals(rhs.drugindication))))&&((this.drugintervaldosageunitnumb == rhs.drugintervaldosageunitnumb)||((this.drugintervaldosageunitnumb!= null)&&this.drugintervaldosageunitnumb.equals(rhs.drugintervaldosageunitnumb))))&&((this.drugadministrationroute == rhs.drugadministrationroute)||((this.drugadministrationroute!= null)&&this.drugadministrationroute.equals(rhs.drugadministrationroute))))&&((this.drugdosageform == rhs.drugdosageform)||((this.drugdosageform!= null)&&this.drugdosageform.equals(rhs.drugdosageform))))&&((this.drugstartdate == rhs.drugstartdate)||((this.drugstartdate!= null)&&this.drugstartdate.equals(rhs.drugstartdate))))&&((this.openfda == rhs.openfda)||((this.openfda!= null)&&this.openfda.equals(rhs.openfda))))&&((this.drugauthorizationnumb == rhs.drugauthorizationnumb)||((this.drugauthorizationnumb!= null)&&this.drugauthorizationnumb.equals(rhs.drugauthorizationnumb))))&&((this.drugstructuredosageunit == rhs.drugstructuredosageunit)||((this.drugstructuredosageunit!= null)&&this.drugstructuredosageunit.equals(rhs.drugstructuredosageunit))))&&((this.medicinalproduct == rhs.medicinalproduct)||((this.medicinalproduct!= null)&&this.medicinalproduct.equals(rhs.medicinalproduct))))&&((this.activesubstance == rhs.activesubstance)||((this.activesubstance!= null)&&this.activesubstance.equals(rhs.activesubstance))))&&((this.drugadditional == rhs.drugadditional)||((this.drugadditional!= null)&&this.drugadditional.equals(rhs.drugadditional))))&&((this.drugcharacterization == rhs.drugcharacterization)||((this.drugcharacterization!= null)&&this.drugcharacterization.equals(rhs.drugcharacterization))))&&((this.drugstructuredosagenumb == rhs.drugstructuredosagenumb)||((this.drugstructuredosagenumb!= null)&&this.drugstructuredosagenumb.equals(rhs.drugstructuredosagenumb))))&&((this.drugintervaldosagedefinition == rhs.drugintervaldosagedefinition)||((this.drugintervaldosagedefinition!= null)&&this.drugintervaldosagedefinition.equals(rhs.drugintervaldosagedefinition))))&&((this.drugdosagetext == rhs.drugdosagetext)||((this.drugdosagetext!= null)&&this.drugdosagetext.equals(rhs.drugdosagetext))))&&((this.drugseparatedosagenumb == rhs.drugseparatedosagenumb)||((this.drugseparatedosagenumb!= null)&&this.drugseparatedosagenumb.equals(rhs.drugseparatedosagenumb))))&&((this.actiondrug == rhs.actiondrug)||((this.actiondrug!= null)&&this.actiondrug.equals(rhs.actiondrug))));
    }

}
