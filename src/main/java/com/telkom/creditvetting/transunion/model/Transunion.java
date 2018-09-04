package com.telkom.creditvetting.transunion.model;




import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ApplicationNumber",
    "Recommended_Decision",
    "Recommended_CreditLimit",
    "Recommended_Product",
    "Min_Range",
    "Max_Range",
    "Date_Approved",
    "Application_Status",
    "Fraud_Suspected",
    "Full_Process_complete",
    "Product",
    "Reason_Code_0",
    "Reason_Code_1",
    "Reason_Code_2",
    "Reason_Code_3",
    "Reason_Code_4",
    "Reason_Code_5",
    "Reason_Code_6",
    "Reason_Code_7",
    "Reason_Code_8",
    "Error_Code",
    "Error_Description",
    "Fraud_Code"
})
public class Transunion {

    @JsonProperty("ApplicationNumber")
    private String applicationNumber;
    @JsonProperty("Recommended_Decision")
    private String recommendedDecision;
    @JsonProperty("Recommended_CreditLimit")
    private String recommendedCreditLimit;
    @JsonProperty("Recommended_Product")
    private String recommendedProduct;
    @JsonProperty("Min_Range")
    private int minRange;
    @JsonProperty("Max_Range")
    private int maxRange;
    @JsonProperty("Date_Approved")
    private String dateApproved;
    @JsonProperty("Application_Status")
    private String applicationStatus;
    @JsonProperty("Fraud_Suspected")
    private String fraudSuspected;
    @JsonProperty("Full_Process_complete")
    private String fullProcessComplete;
    @JsonProperty("Product")
    private String product;
    @JsonProperty("Reason_Code_0")
    private int reasonCode0;
    @JsonProperty("Reason_Code_1")
    private String reasonCode1;
    @JsonProperty("Reason_Code_2")
    private String reasonCode2;
    @JsonProperty("Reason_Code_3")
    private String reasonCode3;
    @JsonProperty("Reason_Code_4")
    private String reasonCode4;
    @JsonProperty("Reason_Code_5")
    private String reasonCode5;
    @JsonProperty("Reason_Code_6")
    private String reasonCode6;
    @JsonProperty("Reason_Code_7")
    private String reasonCode7;
    @JsonProperty("Reason_Code_8")
    private String reasonCode8;
    @JsonProperty("Reason_Code_9")
    private String reasonCode9;
    @JsonProperty("Error_Code")
    private String errorCode;
    @JsonProperty("Error_Description")
    private String errorDescription;
    @JsonProperty("Fraud_Code")
    private String fraudCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ApplicationNumber")
    public String getApplicationNumber() {
        return applicationNumber;
    }

    @JsonProperty("ApplicationNumber")
    public void setApplicationNumber(String applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    @JsonProperty("Recommended_Decision")
    public String getRecommendedDecision() {
        return recommendedDecision;
    }

    @JsonProperty("Recommended_Decision")
    public void setRecommendedDecision(String recommendedDecision) {
        this.recommendedDecision = recommendedDecision;
    }

    @JsonProperty("Recommended_CreditLimit")
    public String getRecommendedCreditLimit() {
        return recommendedCreditLimit;
    }

    @JsonProperty("Recommended_CreditLimit")
    public void setRecommendedCreditLimit(String recommendedCreditLimit) {
        this.recommendedCreditLimit = recommendedCreditLimit;
    }

    @JsonProperty("Recommended_Product")
    public String getRecommendedProduct() {
        return recommendedProduct;
    }

    @JsonProperty("Recommended_Product")
    public void setRecommendedProduct(String recommendedProduct) {
        this.recommendedProduct = recommendedProduct;
    }

    @JsonProperty("Min_Range")
    public int getMinRange() {
        return minRange;
    }

    @JsonProperty("Min_Range")
    public void setMinRange(int minRange) {
        this.minRange = minRange;
    }

    @JsonProperty("Max_Range")
    public int getMaxRange() {
        return maxRange;
    }

    @JsonProperty("Max_Range")
    public void setMaxRange(int maxRange) {
        this.maxRange = maxRange;
    }

    @JsonProperty("Date_Approved")
    public String getDateApproved() {
        return dateApproved;
    }

    @JsonProperty("Date_Approved")
    public void setDateApproved(String dateApproved) {
        this.dateApproved = dateApproved;
    }

    @JsonProperty("Application_Status")
    public String getApplicationStatus() {
        return applicationStatus;
    }

    @JsonProperty("Application_Status")
    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    @JsonProperty("Fraud_Suspected")
    public String getFraudSuspected() {
        return fraudSuspected;
    }

    @JsonProperty("Fraud_Suspected")
    public void setFraudSuspected(String fraudSuspected) {
        this.fraudSuspected = fraudSuspected;
    }

    @JsonProperty("Full_Process_complete")
    public String getFullProcessComplete() {
        return fullProcessComplete;
    }

    @JsonProperty("Full_Process_complete")
    public void setFullProcessComplete(String fullProcessComplete) {
        this.fullProcessComplete = fullProcessComplete;
    }

    @JsonProperty("Product")
    public String getProduct() {
        return product;
    }

    @JsonProperty("Product")
    public void setProduct(String product) {
        this.product = product;
    }

    @JsonProperty("Reason_Code_0")
    public int getReasonCode0() {
        return reasonCode0;
    }

    @JsonProperty("Reason_Code_0")
    public void setReasonCode0(int reasonCode0) {
        this.reasonCode0 = reasonCode0;
    }

    @JsonProperty("Reason_Code_1")
    public String getReasonCode1() {
        return reasonCode1;
    }

    @JsonProperty("Reason_Code_1")
    public void setReasonCode1(String reasonCode1) {
        this.reasonCode1 = reasonCode1;
    }

    @JsonProperty("Reason_Code_2")
    public String getReasonCode2() {
        return reasonCode2;
    }

    @JsonProperty("Reason_Code_2")
    public void setReasonCode2(String reasonCode2) {
        this.reasonCode2 = reasonCode2;
    }

    @JsonProperty("Reason_Code_3")
    public String getReasonCode3() {
        return reasonCode3;
    }

    @JsonProperty("Reason_Code_3")
    public void setReasonCode3(String reasonCode3) {
        this.reasonCode3 = reasonCode3;
    }

    @JsonProperty("Reason_Code_4")
    public String getReasonCode4() {
        return reasonCode4;
    }

    @JsonProperty("Reason_Code_4")
    public void setReasonCode4(String reasonCode4) {
        this.reasonCode4 = reasonCode4;
    }

    @JsonProperty("Reason_Code_5")
    public String getReasonCode5() {
        return reasonCode5;
    }

    @JsonProperty("Reason_Code_5")
    public void setReasonCode5(String reasonCode5) {
        this.reasonCode5 = reasonCode5;
    }

    @JsonProperty("Reason_Code_6")
    public String getReasonCode6() {
        return reasonCode6;
    }

    @JsonProperty("Reason_Code_6")
    public void setReasonCode6(String reasonCode6) {
        this.reasonCode6 = reasonCode6;
    }

    @JsonProperty("Reason_Code_7")
    public String getReasonCode7() {
        return reasonCode7;
    }

    @JsonProperty("Reason_Code_7")
    public void setReasonCode7(String reasonCode7) {
        this.reasonCode7 = reasonCode7;
    }

    @JsonProperty("Reason_Code_8")
    public String getReasonCode8() {
        return reasonCode8;
    }

    @JsonProperty("Reason_Code_8")
    public void setReasonCode8(String reasonCode8) {
        this.reasonCode8 = reasonCode8;
    }
    
    @JsonProperty("Reason_Code_9")
    public String getReasonCode9() {
        return reasonCode9;
    }

    @JsonProperty("Reason_Code_9")
    public void setReasonCode9(String reasonCode9) {
        this.reasonCode9 = reasonCode9;
    }


    @JsonProperty("Error_Code")
    public String getErrorCode() {
        return errorCode;
    }

    @JsonProperty("Error_Code")
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @JsonProperty("Error_Description")
    public String getErrorDescription() {
        return errorDescription;
    }

    @JsonProperty("Error_Description")
    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    @JsonProperty("Fraud_Code")
    public String getFraudCode() {
        return fraudCode;
    }

    @JsonProperty("Fraud_Code")
    public void setFraudCode(String fraudCode) {
        this.fraudCode = fraudCode;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
