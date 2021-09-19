
package com.philipowino.medicalhealthtracker.models.drug_label;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Openfda {

    @SerializedName("application_number")
    @Expose
    private List<String> applicationNumber = null;
    @SerializedName("brand_name")
    @Expose
    private List<String> brandName = null;
    @SerializedName("generic_name")
    @Expose
    private List<String> genericName = null;
    @SerializedName("manufacturer_name")
    @Expose
    private List<String> manufacturerName = null;
    @SerializedName("product_ndc")
    @Expose
    private List<String> productNdc = null;
    @SerializedName("product_type")
    @Expose
    private List<String> productType = null;
    @SerializedName("route")
    @Expose
    private List<String> route = null;
    @SerializedName("substance_name")
    @Expose
    private List<String> substanceName = null;
    @SerializedName("rxcui")
    @Expose
    private List<String> rxcui = null;
    @SerializedName("spl_id")
    @Expose
    private List<String> splId = null;
    @SerializedName("spl_set_id")
    @Expose
    private List<String> splSetId = null;
    @SerializedName("package_ndc")
    @Expose
    private List<String> packageNdc = null;
    @SerializedName("is_original_packager")
    @Expose
    private List<Boolean> isOriginalPackager = null;
    @SerializedName("unii")
    @Expose
    private List<String> unii = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Openfda() {
    }

    /**
     * 
     * @param brandName
     * @param productNdc
     * @param splId
     * @param splSetId
     * @param applicationNumber
     * @param genericName
     * @param manufacturerName
     * @param substanceName
     * @param rxcui
     * @param unii
     * @param route
     * @param packageNdc
     * @param isOriginalPackager
     * @param productType
     */
    public Openfda(List<String> applicationNumber, List<String> brandName, List<String> genericName, List<String> manufacturerName, List<String> productNdc, List<String> productType, List<String> route, List<String> substanceName, List<String> rxcui, List<String> splId, List<String> splSetId, List<String> packageNdc, List<Boolean> isOriginalPackager, List<String> unii) {
        super();
        this.applicationNumber = applicationNumber;
        this.brandName = brandName;
        this.genericName = genericName;
        this.manufacturerName = manufacturerName;
        this.productNdc = productNdc;
        this.productType = productType;
        this.route = route;
        this.substanceName = substanceName;
        this.rxcui = rxcui;
        this.splId = splId;
        this.splSetId = splSetId;
        this.packageNdc = packageNdc;
        this.isOriginalPackager = isOriginalPackager;
        this.unii = unii;
    }

    public List<String> getApplicationNumber() {
        return applicationNumber;
    }

    public void setApplicationNumber(List<String> applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    public List<String> getBrandName() {
        return brandName;
    }

    public void setBrandName(List<String> brandName) {
        this.brandName = brandName;
    }

    public List<String> getGenericName() {
        return genericName;
    }

    public void setGenericName(List<String> genericName) {
        this.genericName = genericName;
    }

    public List<String> getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(List<String> manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public List<String> getProductNdc() {
        return productNdc;
    }

    public void setProductNdc(List<String> productNdc) {
        this.productNdc = productNdc;
    }

    public List<String> getProductType() {
        return productType;
    }

    public void setProductType(List<String> productType) {
        this.productType = productType;
    }

    public List<String> getRoute() {
        return route;
    }

    public void setRoute(List<String> route) {
        this.route = route;
    }

    public List<String> getSubstanceName() {
        return substanceName;
    }

    public void setSubstanceName(List<String> substanceName) {
        this.substanceName = substanceName;
    }

    public List<String> getRxcui() {
        return rxcui;
    }

    public void setRxcui(List<String> rxcui) {
        this.rxcui = rxcui;
    }

    public List<String> getSplId() {
        return splId;
    }

    public void setSplId(List<String> splId) {
        this.splId = splId;
    }

    public List<String> getSplSetId() {
        return splSetId;
    }

    public void setSplSetId(List<String> splSetId) {
        this.splSetId = splSetId;
    }

    public List<String> getPackageNdc() {
        return packageNdc;
    }

    public void setPackageNdc(List<String> packageNdc) {
        this.packageNdc = packageNdc;
    }

    public List<Boolean> getIsOriginalPackager() {
        return isOriginalPackager;
    }

    public void setIsOriginalPackager(List<Boolean> isOriginalPackager) {
        this.isOriginalPackager = isOriginalPackager;
    }

    public List<String> getUnii() {
        return unii;
    }

    public void setUnii(List<String> unii) {
        this.unii = unii;
    }

}
