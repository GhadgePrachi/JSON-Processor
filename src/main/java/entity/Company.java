package entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Entity Company
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Company {

    @JsonProperty("company_name_id")
    String companyNameId;

    @JsonProperty("company_name")
    String companyName;

    @JsonProperty("url")
    String url;

    @JsonProperty("year_founded")
    Integer yearFounded;

    @JsonProperty("city")
    String city;

    @JsonProperty("state")
    String state;

    @JsonProperty("country")
    String country;

    @JsonProperty("zip_code")
    Integer zipCode;

    @JsonProperty("full_time_employees")
    String fullTimeEmployees;

    @JsonProperty("company_type")
    String companyType;

    @JsonProperty("company_category")
    String companyCategory;

    @JsonProperty("revenue_source")
    String revenueSource;

    @JsonProperty("business_model")
    String businessModel;

    @JsonProperty("social_impact")
    String socialImpact;

    @JsonProperty("description")
    String description;

    @JsonProperty("description_short")
    String descriptionShort;

    @JsonProperty("source_count")
    String sourceCount;

    @JsonProperty("data_types")
    String dataTypes;

    @JsonProperty("example_uses")
    String exampleUses;

    @JsonProperty("data_impacts")
    String dataImpacts;

    @JsonProperty("financial_info")
    String financialInfo;

    @JsonProperty("last_updated")
    String lastUpdated;

    /**Getter and Setter Methods**/
    public String getCompanyNameId() {
        return companyNameId;
    }

    public void setCompanyNameId(String companyNameId) {
        this.companyNameId = companyNameId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getYearFounded() { return yearFounded; }

    public void setYearFounded(Integer yearFounded) {
        this.yearFounded = yearFounded;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public String getFullTimeEmployees() {
        return fullTimeEmployees;
    }

    public void setFullTimeEmployees(String fullTimeEmployees) {
        this.fullTimeEmployees = fullTimeEmployees;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getCompanyCategory() {
        return companyCategory;
    }

    public void setCompanyCategory(String companyCategory) {
        this.companyCategory = companyCategory;
    }

    public String getRevenueSource() {
        return revenueSource;
    }

    public void setRevenueSource(String revenueSource) {
        this.revenueSource = revenueSource;
    }

    public String getBusinessModel() {
        return businessModel;
    }

    public void setBusinessModel(String businessModel) {
        this.businessModel = businessModel;
    }

    public String getSocialImpact() {
        return socialImpact;
    }

    public void setSocialImpact(String socialImpact) {
        this.socialImpact = socialImpact;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionShort() {
        return descriptionShort;
    }

    public void setDescriptionShort(String descriptionShort) {
        this.descriptionShort = descriptionShort;
    }

    public String getSourceCount() {
        return sourceCount;
    }

    public void setSourceCount(String sourceCount) {
        this.sourceCount = sourceCount;
    }

    public String getDataTypes() {
        return dataTypes;
    }

    public void setDataTypes(String dataTypes) {
        this.dataTypes = dataTypes;
    }

    public String getExampleUses() {
        return exampleUses;
    }

    public void setExampleUses(String exampleUses) {
        this.exampleUses = exampleUses;
    }

    public String getDataImpacts() {
        return dataImpacts;
    }

    public void setDataImpacts(String dataImpacts) {
        this.dataImpacts = dataImpacts;
    }

    public String getFinancialInfo() {
        return financialInfo;
    }

    public void setFinancialInfo(String financialInfo) {
        this.financialInfo = financialInfo;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
