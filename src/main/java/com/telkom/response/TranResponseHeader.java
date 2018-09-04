package com.telkom.response;

public class TranResponseHeader {

	private String TranSystem;
	private String SProcID;
	private DecisionDetails decisionDetails;

	public String getTranSystem() {
		return TranSystem;
	}

	public void setTranSystem(String tranSystem) {
		TranSystem = tranSystem;
	}

	public String getSProcID() {
		return SProcID;
	}

	public void setSProcID(String sProcID) {
		SProcID = sProcID;
	}

	public DecisionDetails getDecisionDetails() {
		return decisionDetails;
	}

	public void setDecisionDetails(DecisionDetails decisionDetails) {
		this.decisionDetails = decisionDetails;
	}

}
