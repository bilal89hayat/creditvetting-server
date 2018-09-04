package com.telkom.response;

public class DecisionDetails {

	private int APPLICATION_NUMBER;
	private String RECOMMENDED_DECISION;
	private int RECOMMENDED_CREDIT_LIMIT;
	private String RECOMMENDED_PRODUCT;
	private int MIN_RANGE;
	private int MAX_RANGE;
	private String DATE_APPROVED;
	private int APPLICATION_STATUS;
	private String FRAUD_SUSPECTED;
	private String FULL_PROCESS_COMPLETE;
	private String REASONCODE0;
	private int ERROR_CODE;
	private String ERROR_DESCRIPTION;
	private String FRAUD_CODE;

	public int getAPPLICATION_NUMBER() {
		return APPLICATION_NUMBER;
	}

	public void setAPPLICATION_NUMBER(int aPPLICATION_NUMBER) {
		APPLICATION_NUMBER = aPPLICATION_NUMBER;
	}

	public String getRECOMMENDED_DECISION() {
		return RECOMMENDED_DECISION;
	}

	public void setRECOMMENDED_DECISION(String rECOMMENDED_DECISION) {
		RECOMMENDED_DECISION = rECOMMENDED_DECISION;
	}

	public int getRECOMMENDED_CREDIT_LIMIT() {
		return RECOMMENDED_CREDIT_LIMIT;
	}

	public void setRECOMMENDED_CREDIT_LIMIT(int rECOMMENDED_CREDIT_LIMIT) {
		RECOMMENDED_CREDIT_LIMIT = rECOMMENDED_CREDIT_LIMIT;
	}

	public String getRECOMMENDED_PRODUCT() {
		return RECOMMENDED_PRODUCT;
	}

	public void setRECOMMENDED_PRODUCT(String rECOMMENDED_PRODUCT) {
		RECOMMENDED_PRODUCT = rECOMMENDED_PRODUCT;
	}

	public int getMIN_RANGE() {
		return MIN_RANGE;
	}

	public void setMIN_RANGE(int mIN_RANGE) {
		MIN_RANGE = mIN_RANGE;
	}

	public int getMAX_RANGE() {
		return MAX_RANGE;
	}

	public void setMAX_RANGE(int mAX_RANGE) {
		MAX_RANGE = mAX_RANGE;
	}

	public String getDATE_APPROVED() {
		return DATE_APPROVED;
	}

	public void setDATE_APPROVED(String dATE_APPROVED) {
		DATE_APPROVED = dATE_APPROVED;
	}

	public int getAPPLICATION_STATUS() {
		return APPLICATION_STATUS;
	}

	public void setAPPLICATION_STATUS(int aPPLICATION_STATUS) {
		APPLICATION_STATUS = aPPLICATION_STATUS;
	}

	public String getFRAUD_SUSPECTED() {
		return FRAUD_SUSPECTED;
	}

	public void setFRAUD_SUSPECTED(String fRAUD_SUSPECTED) {
		FRAUD_SUSPECTED = fRAUD_SUSPECTED;
	}

	public String getFULL_PROCESS_COMPLETE() {
		return FULL_PROCESS_COMPLETE;
	}

	public void setFULL_PROCESS_COMPLETE(String fULL_PROCESS_COMPLETE) {
		FULL_PROCESS_COMPLETE = fULL_PROCESS_COMPLETE;
	}

	public String getREASONCODE0() {
		return REASONCODE0;
	}

	public void setREASONCODE0(String rEASONCODE0) {
		REASONCODE0 = rEASONCODE0;
	}

	public int getERROR_CODE() {
		return ERROR_CODE;
	}

	public void setERROR_CODE(int eRROR_CODE) {
		ERROR_CODE = eRROR_CODE;
	}

	public String getERROR_DESCRIPTION() {
		return ERROR_DESCRIPTION;
	}

	public void setERROR_DESCRIPTION(String eRROR_DESCRIPTION) {
		ERROR_DESCRIPTION = eRROR_DESCRIPTION;
	}

	public String getFRAUD_CODE() {
		return FRAUD_CODE;
	}

	public void setFRAUD_CODE(String fRAUD_CODE) {
		FRAUD_CODE = fRAUD_CODE;
	}

}
