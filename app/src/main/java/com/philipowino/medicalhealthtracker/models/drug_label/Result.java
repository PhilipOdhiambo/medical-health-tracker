
package com.philipowino.medicalhealthtracker.models.drug_label;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class Result {

    @SerializedName("effective_time")
    @Expose
    private String effectiveTime;
    @SerializedName("inactive_ingredient")
    @Expose
    private List<String> inactiveIngredient = null;
    @SerializedName("purpose")
    @Expose
    private List<String> purpose = null;
    @SerializedName("keep_out_of_reach_of_children")
    @Expose
    private List<String> keepOutOfReachOfChildren = null;
    @SerializedName("warnings")
    @Expose
    private List<String> warnings = null;
    @SerializedName("questions")
    @Expose
    private List<String> questions = null;
    @SerializedName("spl_product_data_elements")
    @Expose
    private List<String> splProductDataElements = null;
    @SerializedName("openfda")
    @Expose
    private Openfda openfda;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("dosage_and_administration")
    @Expose
    private List<String> dosageAndAdministration = null;
    @SerializedName("spl_unclassified_section")
    @Expose
    private List<String> splUnclassifiedSection = null;
    @SerializedName("storage_and_handling")
    @Expose
    private List<String> storageAndHandling = null;
    @SerializedName("package_label_principal_display_panel")
    @Expose
    private List<String> packageLabelPrincipalDisplayPanel = null;
    @SerializedName("indications_and_usage")
    @Expose
    private List<String> indicationsAndUsage = null;
    @SerializedName("set_id")
    @Expose
    private String setId;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("active_ingredient")
    @Expose
    private List<String> activeIngredient = null;
    @SerializedName("dosage_and_administration_table")
    @Expose
    private List<String> dosageAndAdministrationTable = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Result() {
    }

    /**
     * 
     * @param dosageAndAdministrationTable
     * @param storageAndHandling
     * @param purpose
     * @param effectiveTime
     * @param warnings
     * @param questions
     * @param activeIngredient
     * @param inactiveIngredient
     * @param openfda
     * @param version
     * @param splProductDataElements
     * @param splUnclassifiedSection
     * @param packageLabelPrincipalDisplayPanel
     * @param indicationsAndUsage
     * @param setId
     * @param id
     * @param dosageAndAdministration
     * @param keepOutOfReachOfChildren
     */
    public Result(String effectiveTime, List<String> inactiveIngredient, List<String> purpose, List<String> keepOutOfReachOfChildren, List<String> warnings, List<String> questions, List<String> splProductDataElements, Openfda openfda, String version, List<String> dosageAndAdministration, List<String> splUnclassifiedSection, List<String> storageAndHandling, List<String> packageLabelPrincipalDisplayPanel, List<String> indicationsAndUsage, String setId, String id, List<String> activeIngredient, List<String> dosageAndAdministrationTable) {
        super();
        this.effectiveTime = effectiveTime;
        this.inactiveIngredient = inactiveIngredient;
        this.purpose = purpose;
        this.keepOutOfReachOfChildren = keepOutOfReachOfChildren;
        this.warnings = warnings;
        this.questions = questions;
        this.splProductDataElements = splProductDataElements;
        this.openfda = openfda;
        this.version = version;
        this.dosageAndAdministration = dosageAndAdministration;
        this.splUnclassifiedSection = splUnclassifiedSection;
        this.storageAndHandling = storageAndHandling;
        this.packageLabelPrincipalDisplayPanel = packageLabelPrincipalDisplayPanel;
        this.indicationsAndUsage = indicationsAndUsage;
        this.setId = setId;
        this.id = id;
        this.activeIngredient = activeIngredient;
        this.dosageAndAdministrationTable = dosageAndAdministrationTable;
    }

    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public List<String> getInactiveIngredient() {
        return inactiveIngredient;
    }

    public void setInactiveIngredient(List<String> inactiveIngredient) {
        this.inactiveIngredient = inactiveIngredient;
    }

    public List<String> getPurpose() {
        return purpose;
    }

    public void setPurpose(List<String> purpose) {
        this.purpose = purpose;
    }

    public List<String> getKeepOutOfReachOfChildren() {
        return keepOutOfReachOfChildren;
    }

    public void setKeepOutOfReachOfChildren(List<String> keepOutOfReachOfChildren) {
        this.keepOutOfReachOfChildren = keepOutOfReachOfChildren;
    }

    public List<String> getWarnings() {
        return warnings;
    }

    public void setWarnings(List<String> warnings) {
        this.warnings = warnings;
    }

    public List<String> getQuestions() {
        return questions;
    }

    public void setQuestions(List<String> questions) {
        this.questions = questions;
    }

    public List<String> getSplProductDataElements() {
        return splProductDataElements;
    }

    public void setSplProductDataElements(List<String> splProductDataElements) {
        this.splProductDataElements = splProductDataElements;
    }

    public Openfda getOpenfda() {
        return openfda;
    }

    public void setOpenfda(Openfda openfda) {
        this.openfda = openfda;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<String> getDosageAndAdministration() {
        return dosageAndAdministration;
    }

    public void setDosageAndAdministration(List<String> dosageAndAdministration) {
        this.dosageAndAdministration = dosageAndAdministration;
    }

    public List<String> getSplUnclassifiedSection() {
        return splUnclassifiedSection;
    }

    public void setSplUnclassifiedSection(List<String> splUnclassifiedSection) {
        this.splUnclassifiedSection = splUnclassifiedSection;
    }

    public List<String> getStorageAndHandling() {
        return storageAndHandling;
    }

    public void setStorageAndHandling(List<String> storageAndHandling) {
        this.storageAndHandling = storageAndHandling;
    }

    public List<String> getPackageLabelPrincipalDisplayPanel() {
        return packageLabelPrincipalDisplayPanel;
    }

    public void setPackageLabelPrincipalDisplayPanel(List<String> packageLabelPrincipalDisplayPanel) {
        this.packageLabelPrincipalDisplayPanel = packageLabelPrincipalDisplayPanel;
    }

    public List<String> getIndicationsAndUsage() {
        return indicationsAndUsage;
    }

    public void setIndicationsAndUsage(List<String> indicationsAndUsage) {
        this.indicationsAndUsage = indicationsAndUsage;
    }

    public String getSetId() {
        return setId;
    }

    public void setSetId(String setId) {
        this.setId = setId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getActiveIngredient() {
        return activeIngredient;
    }

    public void setActiveIngredient(List<String> activeIngredient) {
        this.activeIngredient = activeIngredient;
    }

    public List<String> getDosageAndAdministrationTable() {
        return dosageAndAdministrationTable;
    }

    public void setDosageAndAdministrationTable(List<String> dosageAndAdministrationTable) {
        this.dosageAndAdministrationTable = dosageAndAdministrationTable;
    }

}
