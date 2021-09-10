
package com.philipowino.medicalhealthtracker.models;

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
    @SerializedName("spl_id")
    @Expose
    private List<String> splId = null;
    @SerializedName("spl_set_id")
    @Expose
    private List<String> splSetId = null;
    @SerializedName("package_ndc")
    @Expose
    private List<String> packageNdc = null;
    @SerializedName("nui")
    @Expose
    private List<String> nui = null;
    @SerializedName("pharm_class_moa")
    @Expose
    private List<String> pharmClassMoa = null;
    @SerializedName("pharm_class_epc")
    @Expose
    private List<String> pharmClassEpc = null;
    @SerializedName("unii")
    @Expose
    private List<String> unii = null;
    @SerializedName("rxcui")
    @Expose
    private List<String> rxcui = null;
    @SerializedName("pharm_class_pe")
    @Expose
    private List<String> pharmClassPe = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Openfda() {
    }

    /**
     * 
     * @param pharmClassPe
     * @param brandName
     * @param productNdc
     * @param splId
     * @param splSetId
     * @param nui
     * @param applicationNumber
     * @param genericName
     * @param manufacturerName
     * @param substanceName
     * @param unii
     * @param rxcui
     * @param route
     * @param pharmClassMoa
     * @param packageNdc
     * @param pharmClassEpc
     * @param productType
     */
    public Openfda(List<String> applicationNumber, List<String> brandName, List<String> genericName, List<String> manufacturerName, List<String> productNdc, List<String> productType, List<String> route, List<String> substanceName, List<String> splId, List<String> splSetId, List<String> packageNdc, List<String> nui, List<String> pharmClassMoa, List<String> pharmClassEpc, List<String> unii, List<String> rxcui, List<String> pharmClassPe) {
        super();
        this.applicationNumber = applicationNumber;
        this.brandName = brandName;
        this.genericName = genericName;
        this.manufacturerName = manufacturerName;
        this.productNdc = productNdc;
        this.productType = productType;
        this.route = route;
        this.substanceName = substanceName;
        this.splId = splId;
        this.splSetId = splSetId;
        this.packageNdc = packageNdc;
        this.nui = nui;
        this.pharmClassMoa = pharmClassMoa;
        this.pharmClassEpc = pharmClassEpc;
        this.unii = unii;
        this.rxcui = rxcui;
        this.pharmClassPe = pharmClassPe;
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

    public List<String> getNui() {
        return nui;
    }

    public void setNui(List<String> nui) {
        this.nui = nui;
    }

    public List<String> getPharmClassMoa() {
        return pharmClassMoa;
    }

    public void setPharmClassMoa(List<String> pharmClassMoa) {
        this.pharmClassMoa = pharmClassMoa;
    }

    public List<String> getPharmClassEpc() {
        return pharmClassEpc;
    }

    public void setPharmClassEpc(List<String> pharmClassEpc) {
        this.pharmClassEpc = pharmClassEpc;
    }

    public List<String> getUnii() {
        return unii;
    }

    public void setUnii(List<String> unii) {
        this.unii = unii;
    }

    public List<String> getRxcui() {
        return rxcui;
    }

    public void setRxcui(List<String> rxcui) {
        this.rxcui = rxcui;
    }

    public List<String> getPharmClassPe() {
        return pharmClassPe;
    }

    public void setPharmClassPe(List<String> pharmClassPe) {
        this.pharmClassPe = pharmClassPe;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.pharmClassPe == null)? 0 :this.pharmClassPe.hashCode()));
        result = ((result* 31)+((this.brandName == null)? 0 :this.brandName.hashCode()));
        result = ((result* 31)+((this.productNdc == null)? 0 :this.productNdc.hashCode()));
        result = ((result* 31)+((this.splId == null)? 0 :this.splId.hashCode()));
        result = ((result* 31)+((this.splSetId == null)? 0 :this.splSetId.hashCode()));
        result = ((result* 31)+((this.nui == null)? 0 :this.nui.hashCode()));
        result = ((result* 31)+((this.applicationNumber == null)? 0 :this.applicationNumber.hashCode()));
        result = ((result* 31)+((this.genericName == null)? 0 :this.genericName.hashCode()));
        result = ((result* 31)+((this.manufacturerName == null)? 0 :this.manufacturerName.hashCode()));
        result = ((result* 31)+((this.substanceName == null)? 0 :this.substanceName.hashCode()));
        result = ((result* 31)+((this.unii == null)? 0 :this.unii.hashCode()));
        result = ((result* 31)+((this.rxcui == null)? 0 :this.rxcui.hashCode()));
        result = ((result* 31)+((this.route == null)? 0 :this.route.hashCode()));
        result = ((result* 31)+((this.pharmClassMoa == null)? 0 :this.pharmClassMoa.hashCode()));
        result = ((result* 31)+((this.packageNdc == null)? 0 :this.packageNdc.hashCode()));
        result = ((result* 31)+((this.pharmClassEpc == null)? 0 :this.pharmClassEpc.hashCode()));
        result = ((result* 31)+((this.productType == null)? 0 :this.productType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Openfda) == false) {
            return false;
        }
        Openfda rhs = ((Openfda) other);
        return ((((((((((((((((((this.pharmClassPe == rhs.pharmClassPe)||((this.pharmClassPe!= null)&&this.pharmClassPe.equals(rhs.pharmClassPe)))&&((this.brandName == rhs.brandName)||((this.brandName!= null)&&this.brandName.equals(rhs.brandName))))&&((this.productNdc == rhs.productNdc)||((this.productNdc!= null)&&this.productNdc.equals(rhs.productNdc))))&&((this.splId == rhs.splId)||((this.splId!= null)&&this.splId.equals(rhs.splId))))&&((this.splSetId == rhs.splSetId)||((this.splSetId!= null)&&this.splSetId.equals(rhs.splSetId))))&&((this.nui == rhs.nui)||((this.nui!= null)&&this.nui.equals(rhs.nui))))&&((this.applicationNumber == rhs.applicationNumber)||((this.applicationNumber!= null)&&this.applicationNumber.equals(rhs.applicationNumber))))&&((this.genericName == rhs.genericName)||((this.genericName!= null)&&this.genericName.equals(rhs.genericName))))&&((this.manufacturerName == rhs.manufacturerName)||((this.manufacturerName!= null)&&this.manufacturerName.equals(rhs.manufacturerName))))&&((this.substanceName == rhs.substanceName)||((this.substanceName!= null)&&this.substanceName.equals(rhs.substanceName))))&&((this.unii == rhs.unii)||((this.unii!= null)&&this.unii.equals(rhs.unii))))&&((this.rxcui == rhs.rxcui)||((this.rxcui!= null)&&this.rxcui.equals(rhs.rxcui))))&&((this.route == rhs.route)||((this.route!= null)&&this.route.equals(rhs.route))))&&((this.pharmClassMoa == rhs.pharmClassMoa)||((this.pharmClassMoa!= null)&&this.pharmClassMoa.equals(rhs.pharmClassMoa))))&&((this.packageNdc == rhs.packageNdc)||((this.packageNdc!= null)&&this.packageNdc.equals(rhs.packageNdc))))&&((this.pharmClassEpc == rhs.pharmClassEpc)||((this.pharmClassEpc!= null)&&this.pharmClassEpc.equals(rhs.pharmClassEpc))))&&((this.productType == rhs.productType)||((this.productType!= null)&&this.productType.equals(rhs.productType))));
    }

}
