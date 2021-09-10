
package com.philipowino.medicalhealthtracker.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("reporttype")
    @Expose
    private String reporttype;
    @SerializedName("safetyreportversion")
    @Expose
    private String safetyreportversion;
    @SerializedName("receivedateformat")
    @Expose
    private String receivedateformat;
    @SerializedName("primarysource")
    @Expose
    private Primarysource primarysource;
    @SerializedName("transmissiondateformat")
    @Expose
    private String transmissiondateformat;
    @SerializedName("fulfillexpeditecriteria")
    @Expose
    private String fulfillexpeditecriteria;
    @SerializedName("safetyreportid")
    @Expose
    private String safetyreportid;
    @SerializedName("patient")
    @Expose
    private Patient patient;
    @SerializedName("serious")
    @Expose
    private String serious;
    @SerializedName("reportduplicate")
    @Expose
    private Reportduplicate reportduplicate;
    @SerializedName("receiptdate")
    @Expose
    private String receiptdate;
    @SerializedName("seriousnesslifethreatening")
    @Expose
    private String seriousnesslifethreatening;
    @SerializedName("receiptdateformat")
    @Expose
    private String receiptdateformat;
    @SerializedName("receiver")
    @Expose
    private Receiver receiver;
    @SerializedName("companynumb")
    @Expose
    private String companynumb;
    @SerializedName("occurcountry")
    @Expose
    private String occurcountry;
    @SerializedName("seriousnessother")
    @Expose
    private String seriousnessother;
    @SerializedName("duplicate")
    @Expose
    private String duplicate;
    @SerializedName("sender")
    @Expose
    private Sender sender;
    @SerializedName("receivedate")
    @Expose
    private String receivedate;
    @SerializedName("seriousnesshospitalization")
    @Expose
    private String seriousnesshospitalization;
    @SerializedName("transmissiondate")
    @Expose
    private String transmissiondate;
    @SerializedName("primarysourcecountry")
    @Expose
    private String primarysourcecountry;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Result() {
    }

    /**
     * 
     * @param reporttype
     * @param receiptdateformat
     * @param receiver
     * @param companynumb
     * @param occurcountry
     * @param safetyreportversion
     * @param receivedateformat
     * @param primarysource
     * @param seriousnessother
     * @param duplicate
     * @param transmissiondateformat
     * @param fulfillexpeditecriteria
     * @param safetyreportid
     * @param sender
     * @param patient
     * @param receivedate
     * @param seriousnesshospitalization
     * @param serious
     * @param reportduplicate
     * @param transmissiondate
     * @param receiptdate
     * @param seriousnesslifethreatening
     * @param primarysourcecountry
     */
    public Result(String reporttype, String safetyreportversion, String receivedateformat, Primarysource primarysource, String transmissiondateformat, String fulfillexpeditecriteria, String safetyreportid, Patient patient, String serious, Reportduplicate reportduplicate, String receiptdate, String seriousnesslifethreatening, String receiptdateformat, Receiver receiver, String companynumb, String occurcountry, String seriousnessother, String duplicate, Sender sender, String receivedate, String seriousnesshospitalization, String transmissiondate, String primarysourcecountry) {
        super();
        this.reporttype = reporttype;
        this.safetyreportversion = safetyreportversion;
        this.receivedateformat = receivedateformat;
        this.primarysource = primarysource;
        this.transmissiondateformat = transmissiondateformat;
        this.fulfillexpeditecriteria = fulfillexpeditecriteria;
        this.safetyreportid = safetyreportid;
        this.patient = patient;
        this.serious = serious;
        this.reportduplicate = reportduplicate;
        this.receiptdate = receiptdate;
        this.seriousnesslifethreatening = seriousnesslifethreatening;
        this.receiptdateformat = receiptdateformat;
        this.receiver = receiver;
        this.companynumb = companynumb;
        this.occurcountry = occurcountry;
        this.seriousnessother = seriousnessother;
        this.duplicate = duplicate;
        this.sender = sender;
        this.receivedate = receivedate;
        this.seriousnesshospitalization = seriousnesshospitalization;
        this.transmissiondate = transmissiondate;
        this.primarysourcecountry = primarysourcecountry;
    }

    public String getReporttype() {
        return reporttype;
    }

    public void setReporttype(String reporttype) {
        this.reporttype = reporttype;
    }

    public String getSafetyreportversion() {
        return safetyreportversion;
    }

    public void setSafetyreportversion(String safetyreportversion) {
        this.safetyreportversion = safetyreportversion;
    }

    public String getReceivedateformat() {
        return receivedateformat;
    }

    public void setReceivedateformat(String receivedateformat) {
        this.receivedateformat = receivedateformat;
    }

    public Primarysource getPrimarysource() {
        return primarysource;
    }

    public void setPrimarysource(Primarysource primarysource) {
        this.primarysource = primarysource;
    }

    public String getTransmissiondateformat() {
        return transmissiondateformat;
    }

    public void setTransmissiondateformat(String transmissiondateformat) {
        this.transmissiondateformat = transmissiondateformat;
    }

    public String getFulfillexpeditecriteria() {
        return fulfillexpeditecriteria;
    }

    public void setFulfillexpeditecriteria(String fulfillexpeditecriteria) {
        this.fulfillexpeditecriteria = fulfillexpeditecriteria;
    }

    public String getSafetyreportid() {
        return safetyreportid;
    }

    public void setSafetyreportid(String safetyreportid) {
        this.safetyreportid = safetyreportid;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getSerious() {
        return serious;
    }

    public void setSerious(String serious) {
        this.serious = serious;
    }

    public Reportduplicate getReportduplicate() {
        return reportduplicate;
    }

    public void setReportduplicate(Reportduplicate reportduplicate) {
        this.reportduplicate = reportduplicate;
    }

    public String getReceiptdate() {
        return receiptdate;
    }

    public void setReceiptdate(String receiptdate) {
        this.receiptdate = receiptdate;
    }

    public String getSeriousnesslifethreatening() {
        return seriousnesslifethreatening;
    }

    public void setSeriousnesslifethreatening(String seriousnesslifethreatening) {
        this.seriousnesslifethreatening = seriousnesslifethreatening;
    }

    public String getReceiptdateformat() {
        return receiptdateformat;
    }

    public void setReceiptdateformat(String receiptdateformat) {
        this.receiptdateformat = receiptdateformat;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public String getCompanynumb() {
        return companynumb;
    }

    public void setCompanynumb(String companynumb) {
        this.companynumb = companynumb;
    }

    public String getOccurcountry() {
        return occurcountry;
    }

    public void setOccurcountry(String occurcountry) {
        this.occurcountry = occurcountry;
    }

    public String getSeriousnessother() {
        return seriousnessother;
    }

    public void setSeriousnessother(String seriousnessother) {
        this.seriousnessother = seriousnessother;
    }

    public String getDuplicate() {
        return duplicate;
    }

    public void setDuplicate(String duplicate) {
        this.duplicate = duplicate;
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public String getReceivedate() {
        return receivedate;
    }

    public void setReceivedate(String receivedate) {
        this.receivedate = receivedate;
    }

    public String getSeriousnesshospitalization() {
        return seriousnesshospitalization;
    }

    public void setSeriousnesshospitalization(String seriousnesshospitalization) {
        this.seriousnesshospitalization = seriousnesshospitalization;
    }

    public String getTransmissiondate() {
        return transmissiondate;
    }

    public void setTransmissiondate(String transmissiondate) {
        this.transmissiondate = transmissiondate;
    }

    public String getPrimarysourcecountry() {
        return primarysourcecountry;
    }

    public void setPrimarysourcecountry(String primarysourcecountry) {
        this.primarysourcecountry = primarysourcecountry;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.reporttype == null)? 0 :this.reporttype.hashCode()));
        result = ((result* 31)+((this.receiptdateformat == null)? 0 :this.receiptdateformat.hashCode()));
        result = ((result* 31)+((this.receiver == null)? 0 :this.receiver.hashCode()));
        result = ((result* 31)+((this.companynumb == null)? 0 :this.companynumb.hashCode()));
        result = ((result* 31)+((this.occurcountry == null)? 0 :this.occurcountry.hashCode()));
        result = ((result* 31)+((this.safetyreportversion == null)? 0 :this.safetyreportversion.hashCode()));
        result = ((result* 31)+((this.receivedateformat == null)? 0 :this.receivedateformat.hashCode()));
        result = ((result* 31)+((this.primarysource == null)? 0 :this.primarysource.hashCode()));
        result = ((result* 31)+((this.seriousnessother == null)? 0 :this.seriousnessother.hashCode()));
        result = ((result* 31)+((this.duplicate == null)? 0 :this.duplicate.hashCode()));
        result = ((result* 31)+((this.transmissiondateformat == null)? 0 :this.transmissiondateformat.hashCode()));
        result = ((result* 31)+((this.fulfillexpeditecriteria == null)? 0 :this.fulfillexpeditecriteria.hashCode()));
        result = ((result* 31)+((this.safetyreportid == null)? 0 :this.safetyreportid.hashCode()));
        result = ((result* 31)+((this.sender == null)? 0 :this.sender.hashCode()));
        result = ((result* 31)+((this.patient == null)? 0 :this.patient.hashCode()));
        result = ((result* 31)+((this.receivedate == null)? 0 :this.receivedate.hashCode()));
        result = ((result* 31)+((this.seriousnesshospitalization == null)? 0 :this.seriousnesshospitalization.hashCode()));
        result = ((result* 31)+((this.serious == null)? 0 :this.serious.hashCode()));
        result = ((result* 31)+((this.reportduplicate == null)? 0 :this.reportduplicate.hashCode()));
        result = ((result* 31)+((this.transmissiondate == null)? 0 :this.transmissiondate.hashCode()));
        result = ((result* 31)+((this.receiptdate == null)? 0 :this.receiptdate.hashCode()));
        result = ((result* 31)+((this.seriousnesslifethreatening == null)? 0 :this.seriousnesslifethreatening.hashCode()));
        result = ((result* 31)+((this.primarysourcecountry == null)? 0 :this.primarysourcecountry.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Result) == false) {
            return false;
        }
        Result rhs = ((Result) other);
        return ((((((((((((((((((((((((this.reporttype == rhs.reporttype)||((this.reporttype!= null)&&this.reporttype.equals(rhs.reporttype)))&&((this.receiptdateformat == rhs.receiptdateformat)||((this.receiptdateformat!= null)&&this.receiptdateformat.equals(rhs.receiptdateformat))))&&((this.receiver == rhs.receiver)||((this.receiver!= null)&&this.receiver.equals(rhs.receiver))))&&((this.companynumb == rhs.companynumb)||((this.companynumb!= null)&&this.companynumb.equals(rhs.companynumb))))&&((this.occurcountry == rhs.occurcountry)||((this.occurcountry!= null)&&this.occurcountry.equals(rhs.occurcountry))))&&((this.safetyreportversion == rhs.safetyreportversion)||((this.safetyreportversion!= null)&&this.safetyreportversion.equals(rhs.safetyreportversion))))&&((this.receivedateformat == rhs.receivedateformat)||((this.receivedateformat!= null)&&this.receivedateformat.equals(rhs.receivedateformat))))&&((this.primarysource == rhs.primarysource)||((this.primarysource!= null)&&this.primarysource.equals(rhs.primarysource))))&&((this.seriousnessother == rhs.seriousnessother)||((this.seriousnessother!= null)&&this.seriousnessother.equals(rhs.seriousnessother))))&&((this.duplicate == rhs.duplicate)||((this.duplicate!= null)&&this.duplicate.equals(rhs.duplicate))))&&((this.transmissiondateformat == rhs.transmissiondateformat)||((this.transmissiondateformat!= null)&&this.transmissiondateformat.equals(rhs.transmissiondateformat))))&&((this.fulfillexpeditecriteria == rhs.fulfillexpeditecriteria)||((this.fulfillexpeditecriteria!= null)&&this.fulfillexpeditecriteria.equals(rhs.fulfillexpeditecriteria))))&&((this.safetyreportid == rhs.safetyreportid)||((this.safetyreportid!= null)&&this.safetyreportid.equals(rhs.safetyreportid))))&&((this.sender == rhs.sender)||((this.sender!= null)&&this.sender.equals(rhs.sender))))&&((this.patient == rhs.patient)||((this.patient!= null)&&this.patient.equals(rhs.patient))))&&((this.receivedate == rhs.receivedate)||((this.receivedate!= null)&&this.receivedate.equals(rhs.receivedate))))&&((this.seriousnesshospitalization == rhs.seriousnesshospitalization)||((this.seriousnesshospitalization!= null)&&this.seriousnesshospitalization.equals(rhs.seriousnesshospitalization))))&&((this.serious == rhs.serious)||((this.serious!= null)&&this.serious.equals(rhs.serious))))&&((this.reportduplicate == rhs.reportduplicate)||((this.reportduplicate!= null)&&this.reportduplicate.equals(rhs.reportduplicate))))&&((this.transmissiondate == rhs.transmissiondate)||((this.transmissiondate!= null)&&this.transmissiondate.equals(rhs.transmissiondate))))&&((this.receiptdate == rhs.receiptdate)||((this.receiptdate!= null)&&this.receiptdate.equals(rhs.receiptdate))))&&((this.seriousnesslifethreatening == rhs.seriousnesslifethreatening)||((this.seriousnesslifethreatening!= null)&&this.seriousnesslifethreatening.equals(rhs.seriousnesslifethreatening))))&&((this.primarysourcecountry == rhs.primarysourcecountry)||((this.primarysourcecountry!= null)&&this.primarysourcecountry.equals(rhs.primarysourcecountry))));
    }

}
