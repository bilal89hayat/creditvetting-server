package com.telkom.cmfs.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
"fraudCode",
"banNumber",
"banStatus",
"startServiceDate",
"creditClass",
"delinquent",
"delinquentStatusDate",
"arBalance",
"writeOffIndicator",
"accountType",
"colAgencyName",
"dateStatusChanged"
})
public class IndividualPreVetCodeResponseOp implements Serializable
{

@JsonProperty("fraudCode")
private String fraudCode;
@JsonProperty("banNumber")
private String banNumber;
@JsonProperty("banStatus")
private String banStatus;
@JsonProperty("startServiceDate")
private String startServiceDate;
@JsonProperty("creditClass")
private String creditClass;
@JsonProperty("delinquent")
private String delinquent;
@JsonProperty("delinquentStatusDate")
private String delinquentStatusDate;
@JsonProperty("arBalance")
private String arBalance;
@JsonProperty("writeOffIndicator")
private String writeOffIndicator;
@JsonProperty("accountType")
private String accountType;
@JsonProperty("colAgencyName")
private String colAgencyName;
@JsonProperty("dateStatusChanged")
private String dateStatusChanged;
private final static long serialVersionUID = -6663299397546445727L;

@JsonProperty("fraudCode")
public String getFraudCode() {
return fraudCode;
}

@JsonProperty("fraudCode")
public void setFraudCode(String fraudCode) {
this.fraudCode = fraudCode;
}

@JsonProperty("banNumber")
public String getBanNumber() {
return banNumber;
}

@JsonProperty("banNumber")
public void setBanNumber(String banNumber) {
this.banNumber = banNumber;
}

@JsonProperty("banStatus")
public String getBanStatus() {
return banStatus;
}

@JsonProperty("banStatus")
public void setBanStatus(String banStatus) {
this.banStatus = banStatus;
}

@JsonProperty("startServiceDate")
public String getStartServiceDate() {
return startServiceDate;
}

@JsonProperty("startServiceDate")
public void setStartServiceDate(String startServiceDate) {
this.startServiceDate = startServiceDate;
}

@JsonProperty("creditClass")
public String getCreditClass() {
return creditClass;
}

@JsonProperty("creditClass")
public void setCreditClass(String creditClass) {
this.creditClass = creditClass;
}

@JsonProperty("delinquent")
public String getDelinquent() {
return delinquent;
}

@JsonProperty("delinquent")
public void setDelinquent(String delinquent) {
this.delinquent = delinquent;
}

@JsonProperty("delinquentStatusDate")
public String getDelinquentStatusDate() {
return delinquentStatusDate;
}

@JsonProperty("delinquentStatusDate")
public void setDelinquentStatusDate(String delinquentStatusDate) {
this.delinquentStatusDate = delinquentStatusDate;
}

@JsonProperty("arBalance")
public String getArBalance() {
return arBalance;
}

@JsonProperty("arBalance")
public void setArBalance(String arBalance) {
this.arBalance = arBalance;
}

@JsonProperty("writeOffIndicator")
public String getWriteOffIndicator() {
return writeOffIndicator;
}

@JsonProperty("writeOffIndicator")
public void setWriteOffIndicator(String writeOffIndicator) {
this.writeOffIndicator = writeOffIndicator;
}

@JsonProperty("accountType")
public String getAccountType() {
return accountType;
}

@JsonProperty("accountType")
public void setAccountType(String accountType) {
this.accountType = accountType;
}

@JsonProperty("colAgencyName")
public String getColAgencyName() {
return colAgencyName;
}

@JsonProperty("colAgencyName")
public void setColAgencyName(String colAgencyName) {
this.colAgencyName = colAgencyName;
}

@JsonProperty("dateStatusChanged")
public String getDateStatusChanged() {
return dateStatusChanged;
}

@JsonProperty("dateStatusChanged")
public void setDateStatusChanged(String dateStatusChanged) {
this.dateStatusChanged = dateStatusChanged;
}

}