package com.sammlerweb.sammler.item;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BANKNOTES")
public class Banknote {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	
	@Column(name="COUNTRY", length=40, nullable=false)
	private String country;
	
	@Column(name="CURRENCY")
	private String currency;
	
	@Column(name="VALUEB", nullable=false)
	private Integer valueB;
	
	@Column(name="ISSUE_YEAR")
	private Integer issueYear;
	
	@Column(name="ISSUE_INSTITUTION")
	private String issueInstitution;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="SERIAL_NUMBER", length=30, nullable=false)
	private String serialNumber;
	
	@Column(name="CONDITIONB")
	private String conditionB;
	
	@Column(name="ERROR")
	private Boolean error;
	
	@Column(name="DETAILS")
	private String details;
	
	@Column(name="OTHER")
	private String other;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Integer getValueB() {
		return valueB;
	}

	public void setValueB(Integer valueB) {
		this.valueB = valueB;
	}

	public Integer getIssueYear() {
		return issueYear;
	}

	public void setIssueYear(Integer issueYear) {
		this.issueYear = issueYear;
	}

	public String getIssueInstitution() {
		return issueInstitution;
	}

	public void setIssueInstitution(String issueInstitution) {
		this.issueInstitution = issueInstitution;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getConditionB() {
		return conditionB;
	}

	public void setConditionB(String conditionB) {
		this.conditionB = conditionB;
	}

	public Boolean getError() {
		return error;
	}

	public void setError(Boolean error) {
		this.error = error;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}
	
	    
			
	
}
