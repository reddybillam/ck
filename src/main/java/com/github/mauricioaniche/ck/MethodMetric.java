package com.github.mauricioaniche.ck;

import java.util.Map;

public class MethodMetric {
	private int cbo;
	private int rfc;
	private int wmc;
	private String methodName;
	private int parametersQty;
	private int returnQty;
	private int loc;
	private int variablesQty;
	private Map<String, Integer> variablesUsage;
	private int startLine;
	private int loopQty;
	private int comparisonsQty;
	private int tryCatchQty;
	private int parenthesizedExpsQty;
	private int stringsQty;

	public MethodMetric(String methodName) {
		this.methodName = methodName;
	}

	public void setCbo(int cbo) {
		this.cbo = cbo;
	}

	public void setRfc(int rfc) {
		this.rfc = rfc;
	}

	public void setWmc(int wmc) {
		this.wmc = wmc;
	}

	public void setParametersQty(int parametersQty) {
		this.parametersQty = parametersQty;
	}

	public int getCbo() {
		return cbo;
	}

	public int getRfc() {
		return rfc;
	}

	public int getWmc() {
		return wmc;
	}

	public String getMethodName() {
		return methodName;
	}

	@Override
	public String toString() {
		return "MethodMetric{" +
				"cbo=" + cbo +
				", rfc=" + rfc +
				", wmc=" + wmc +
				", methodName='" + methodName + '\'' +
				'}';
	}

	public void setReturnQty(int returnQty) {
		this.returnQty = returnQty;
	}

	public void setLoc(int loc) {
		this.loc = loc;
	}

	public void setVariablesQty(int variablesQty) {
		this.variablesQty = variablesQty;
	}

	public int getLoc() {
		return loc;
	}

	public int getParametersQty() {
		return parametersQty;
	}

	public int getVariablesQty() {
		return variablesQty;
	}

	public int getReturnQty() {
		return returnQty;
	}

	public void setVariablesUsage(Map<String, Integer> variablesUsage) {
		this.variablesUsage = variablesUsage;
	}

	public Map<String, Integer> getVariablesUsage() {
		return variablesUsage;
	}

	public void setStartLine(int startLine) {
		this.startLine = startLine;
	}

	public int getStartLine() {
		return startLine;
	}

	public void setLoopQty(int loopQty) {
		this.loopQty = loopQty;
	}

	public int getLoopQty() {
		return loopQty;
	}

	public void setComparisonsQty(int comparisonsQty) {
		this.comparisonsQty = comparisonsQty;
	}

	public int getComparisonsQty() {
		return comparisonsQty;
	}

	public void setTryCatchQty(int tryCatchQty) {
		this.tryCatchQty = tryCatchQty;
	}

	public int getTryCatchQty() {
		return tryCatchQty;
	}

	public void setParenthesizedExpsQty(int parenthesizedExpsQty) {
		this.parenthesizedExpsQty = parenthesizedExpsQty;
	}

	public int getParenthesizedExpsQty() {
		return parenthesizedExpsQty;
	}

	public void setStringsQty(int stringsQty) {
		this.stringsQty = stringsQty;
	}

	public int getStringsQty() {
		return stringsQty;
	}
}
