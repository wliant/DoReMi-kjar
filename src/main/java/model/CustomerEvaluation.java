package model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CustomerEvaluation implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Long customerID;
	private java.lang.Boolean defaulter;
	private boolean newCustomer;
	private java.lang.Integer yearsActive;
	private java.lang.Double ltv;

	private java.lang.String purchaseFreq;

	private java.lang.String profitability;

	private java.lang.String debtPayingAbility;

	private java.lang.String operationAbility;

	private java.lang.String liquidity;

	private java.lang.Boolean latePaymentInd;

	public CustomerEvaluation() {
	}

	public java.lang.Long getCustomerID() {
		return this.customerID;
	}

	public void setCustomerID(java.lang.Long customerID) {
		this.customerID = customerID;
	}

	public java.lang.Boolean getDefaulter() {
		return this.defaulter;
	}

	public void setDefaulter(java.lang.Boolean defaulter) {
		this.defaulter = defaulter;
	}

	public boolean isNewCustomer() {
		return this.newCustomer;
	}

	public void setNewCustomer(boolean newCustomer) {
		this.newCustomer = newCustomer;
	}

	public java.lang.Integer getYearsActive() {
		return this.yearsActive;
	}

	public void setYearsActive(java.lang.Integer yearsActive) {
		this.yearsActive = yearsActive;
	}

	public java.lang.Double getLtv() {
		return this.ltv;
	}

	public void setLtv(java.lang.Double ltv) {
		this.ltv = ltv;
	}

	public java.lang.String getPurchaseFreq() {
		return this.purchaseFreq;
	}

	public void setPurchaseFreq(java.lang.String purchaseFreq) {
		this.purchaseFreq = purchaseFreq;
	}

	public java.lang.String getProfitability() {
		return this.profitability;
	}

	public void setProfitability(java.lang.String profitability) {
		this.profitability = profitability;
	}

	public java.lang.String getDebtPayingAbility() {
		return this.debtPayingAbility;
	}

	public void setDebtPayingAbility(java.lang.String debtPayingAbility) {
		this.debtPayingAbility = debtPayingAbility;
	}

	public java.lang.String getOperationAbility() {
		return this.operationAbility;
	}

	public void setOperationAbility(java.lang.String operationAbility) {
		this.operationAbility = operationAbility;
	}

	public java.lang.String getLiquidity() {
		return this.liquidity;
	}

	public void setLiquidity(java.lang.String liquidity) {
		this.liquidity = liquidity;
	}

	public java.lang.Boolean getLatePaymentInd() {
		return this.latePaymentInd;
	}

	public void setLatePaymentInd(java.lang.Boolean latePaymentInd) {
		this.latePaymentInd = latePaymentInd;
	}

	public CustomerEvaluation(java.lang.Long customerID,
			java.lang.Boolean defaulter, boolean newCustomer,
			java.lang.Integer yearsActive, java.lang.Double ltv,
			java.lang.String purchaseFreq, java.lang.String profitability,
			java.lang.String debtPayingAbility,
			java.lang.String operationAbility, java.lang.String liquidity,
			java.lang.Boolean latePaymentInd) {
		this.customerID = customerID;
		this.defaulter = defaulter;
		this.newCustomer = newCustomer;
		this.yearsActive = yearsActive;
		this.ltv = ltv;
		this.purchaseFreq = purchaseFreq;
		this.profitability = profitability;
		this.debtPayingAbility = debtPayingAbility;
		this.operationAbility = operationAbility;
		this.liquidity = liquidity;
		this.latePaymentInd = latePaymentInd;
	}

	@Override
	public String toString() {
		return "customerID [" + this.customerID + "]";
	}

}
