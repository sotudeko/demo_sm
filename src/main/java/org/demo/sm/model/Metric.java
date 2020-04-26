package org.demo.sm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.opencsv.bean.CsvBindByName;

@Entity
public class Metric {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@CsvBindByName
	public String applicationId;
	@CsvBindByName
	public String applicationPublicId;
	@CsvBindByName
	private String applicationName;
	@CsvBindByName
	private String organizationId;
	@CsvBindByName
	private String organizationName;

	@CsvBindByName
	private String timePeriodStart;
	
	@CsvBindByName
	private int evaluationCount;

	@CsvBindByName
	private Long mttrLowThreat;
	@CsvBindByName
	private Long mttrModerateThreat;
	@CsvBindByName
	private Long mttrSevereThreat;
	@CsvBindByName
	private Long mttrCriticalThreat;

	@CsvBindByName
	private int discoveredCountSecurityLow;
	@CsvBindByName
	private int discoveredCountSecurityModerate;
	@CsvBindByName
	private int discoveredCountSecuritySevere;
	@CsvBindByName
	private int discoveredCountSecurityCritical;
	@CsvBindByName
	private int discoveredCountLicenseLow;
	@CsvBindByName
	private int discoveredCountLicenseModerate;
	@CsvBindByName
	private int discoveredCountLicenseSevere;
	@CsvBindByName
	private int discoveredCountLicenseCritical;
	@CsvBindByName
	private int discoveredCountQualityLow;
	@CsvBindByName
	private int discoveredCountQualityModerate;
	@CsvBindByName
	private int discoveredCountQualitySevere;
	@CsvBindByName
	private int discoveredCountQualityCritical;
	@CsvBindByName
	private int discoveredCountOtherLow;
	@CsvBindByName
	private int discoveredCountOtherModerate;
	@CsvBindByName
	private int discoveredCountOtherSevere;
	@CsvBindByName
	private int discoveredCountOtherCritical;

	@CsvBindByName
	private int fixedCountSecurityLow;
	@CsvBindByName
	private int fixedCountSecurityModerate;
	@CsvBindByName
	private int fixedCountSecuritySevere;
	@CsvBindByName
	private int fixedCountSecurityCritical;
	@CsvBindByName
	private int fixedCountLicenseLow;
	@CsvBindByName
	private int fixedCountLicenseModerate;
	@CsvBindByName
	private int fixedCountLicenseSevere;
	@CsvBindByName
	private int fixedCountLicenseCritical;
	@CsvBindByName
	private int fixedCountQualityLow;
	@CsvBindByName
	private int fixedCountQualityModerate;
	@CsvBindByName
	private int fixedCountQualitySevere;
	@CsvBindByName
	private int fixedCountQualityCritical;
	@CsvBindByName
	private int fixedCountOtherLow;
	@CsvBindByName
	private int fixedCountOtherModerate;
	@CsvBindByName
	private int fixedCountOtherSevere;
	@CsvBindByName
	private int fixedCountOtherCritical;

	@CsvBindByName
	private int waivedCountSecurityLow;
	@CsvBindByName
	private int waivedCountSecurityModerate;
	@CsvBindByName
	private int waivedCountSecuritySevere;
	@CsvBindByName
	private int waivedCountSecurityCritical;
	@CsvBindByName
	private int waivedCountLicenseLow;
	@CsvBindByName
	private int waivedCountLicenseModerate;	
	@CsvBindByName
	private int waivedCountLicenseSevere;
	@CsvBindByName
	private int waivedCountLicenseCritical;
	@CsvBindByName
	private int waivedCountQualityLow;
	@CsvBindByName
	private int waivedCountQualityModerate;
	@CsvBindByName
	private int waivedCountQualitySevere;
	@CsvBindByName
	private int waivedCountQualityCritical;
	@CsvBindByName
	private int waivedCountOtherLow;
	@CsvBindByName
	private int waivedCountOtherModerate;
	@CsvBindByName
	private int waivedCountOtherSevere;
	@CsvBindByName
	private int waivedCountOtherCritical;
	
	@CsvBindByName
	private int openCountAtTimePeriodEndSecurityLow;
	@CsvBindByName
	private int openCountAtTimePeriodEndSecurityModerate;
	@CsvBindByName
	private int openCountAtTimePeriodEndSecuritySevere;
	@CsvBindByName
	private int openCountAtTimePeriodEndSecurityCritical;
	@CsvBindByName
	private int openCountAtTimePeriodEndLicenseLow;
	@CsvBindByName
	private int openCountAtTimePeriodEndLicenseModerate;
	@CsvBindByName
	private int openCountAtTimePeriodEndLicenseSevere;
	@CsvBindByName
	private int openCountAtTimePeriodEndLicenseCritical;
	@CsvBindByName
	private int openCountAtTimePeriodEndQualityLow;
	@CsvBindByName
	private int openCountAtTimePeriodEndQualityModerate;
	@CsvBindByName
	private int openCountAtTimePeriodEndQualitySevere;
	@CsvBindByName
	private int openCountAtTimePeriodEndQualityCritical;
	@CsvBindByName
	private int openCountAtTimePeriodEndOtherLow;
	@CsvBindByName
	private int openCountAtTimePeriodEndOtherModerate;
	@CsvBindByName
	private int openCountAtTimePeriodEndOtherSevere;
	@CsvBindByName
	private int openCountAtTimePeriodEndOtherCritical;
	
	
	public Metric() {}
	
	public Metric (
			String applicationId, String applicationPublicId, String applicationName, String organizationId, String organizationName, String timePeriodStart, 
			int evaluationCount, 
			Long mttrLowThreat, Long mttrModerateThreat, Long mttrSevereThreat, Long mttrCriticalThreat, 
			
			int discoveredCountSecurityLow, int discoveredCountSecurityModerate, int discoveredCountSecuritySevere, int discoveredCountSecurityCritical, 
			int discoveredCountLicenseLow, int discoveredCountLicenseModerate, int discoveredCountLicenseSevere, int discoveredCountLicenseCritical, 
			int discoveredCountQualityLow, int discoveredCountQualityModerate, int discoveredCountQualitySevere, int discoveredCountQualityCritical, 
			int discoveredCountOtherLow, int discoveredCountOtherModerate, int discoveredCountOtherSevere, int discoveredCountOtherCritical, 
			
			int fixedCountSecurityLow, int fixedCountSecurityModerate, int fixedCountSecuritySevere, int fixedCountSecurityCritical, 
			int fixedCountLicenseLow, int fixedCountLicenseModerate, int fixedCountLicenseSevere, int fixedCountLicenseCritical, 
			int fixedCountQualityLow, int fixedCountQualityModerate, int fixedCountQualitySevere, int fixedCountQualityCritical, 
			int fixedCountOtherLow, int fixedCountOtherModerate, int fixedCountOtherSevere, int fixedCountOtherCritical, 
			
			int waivedCountSecurityLow, int waivedCountSecurityModerate, int waivedCountSecuritySevere, int waivedCountSecurityCritical, 
			int waivedCountLicenseLow, int waivedCountLicenseModerate, int waivedCountLicenseSevere, int waivedCountLicenseCritical, 
			int waivedCountQualityLow, int waivedCountQualityModerate, int waivedCountQualitySevere, int waivedCountQualityCritical, 
			int waivedCountOtherLow, int waivedCountOtherModerate, int waivedCountOtherSevere, int waivedCountOtherCritical, 
			
			int openCountAtTimePeriodEndSecurityLow, int openCountAtTimePeriodEndSecurityModerate, int openCountAtTimePeriodEndSecuritySevere, int openCountAtTimePeriodEndSecurityCritical, 
			int openCountAtTimePeriodEndLicenseLow, int openCountAtTimePeriodEndLicenseModerate, int openCountAtTimePeriodEndLicenseSevere, int openCountAtTimePeriodEndLicenseCritical, 
			int openCountAtTimePeriodEndQualityLow, int openCountAtTimePeriodEndQualityModerate, int openCountAtTimePeriodEndQualitySevere, int openCountAtTimePeriodEndQualityCritical, 
			int openCountAtTimePeriodEndOtherLow, int openCountAtTimePeriodEndOtherModerate, int openCountAtTimePeriodEndOtherSevere, int openCountAtTimePeriodEndOtherCritical
		) {
		
		this.applicationId = applicationId;
		this.applicationPublicId = applicationPublicId;
		this.applicationName = applicationName;
		this.organizationId = organizationId;
		this.organizationName = organizationName;
		
		this.timePeriodStart = timePeriodStart;
		
		this.evaluationCount = evaluationCount;
		
		this.mttrLowThreat = mttrLowThreat;
		this.mttrModerateThreat = mttrModerateThreat;
		this.mttrSevereThreat = mttrSevereThreat;
		this.mttrCriticalThreat = mttrCriticalThreat;
		
		this.discoveredCountSecurityLow = discoveredCountSecurityLow;
		this.discoveredCountSecurityModerate = discoveredCountSecurityModerate;
		this.discoveredCountSecuritySevere = discoveredCountSecuritySevere;
		this.discoveredCountSecurityCritical = discoveredCountSecurityCritical;
		this.discoveredCountLicenseLow = discoveredCountLicenseLow;
		this.discoveredCountLicenseModerate = discoveredCountLicenseModerate;
		this.discoveredCountLicenseSevere = discoveredCountLicenseSevere;
		this.discoveredCountLicenseCritical = discoveredCountLicenseCritical;
		this.discoveredCountQualityLow = discoveredCountQualityLow;
		this.discoveredCountQualityModerate = discoveredCountQualityModerate;
		this.discoveredCountQualitySevere = discoveredCountQualitySevere;
		this.discoveredCountQualityCritical = discoveredCountQualityCritical;
		this.discoveredCountOtherLow = discoveredCountOtherLow;
		this.discoveredCountOtherModerate = discoveredCountOtherModerate;
		this.discoveredCountOtherSevere = discoveredCountOtherSevere;
		this.discoveredCountOtherCritical = discoveredCountOtherCritical;
		
		this.fixedCountSecurityLow = fixedCountSecurityLow;
		this.fixedCountSecurityModerate = fixedCountSecurityModerate;
		this.fixedCountSecuritySevere = fixedCountSecuritySevere;
		this.fixedCountSecurityCritical = fixedCountSecurityCritical;
		this.fixedCountLicenseLow = fixedCountLicenseLow;
		this.fixedCountLicenseModerate = fixedCountLicenseModerate;
		this.fixedCountLicenseSevere = fixedCountLicenseSevere;
		this.fixedCountLicenseCritical = fixedCountLicenseCritical;
		this.fixedCountQualityLow = fixedCountQualityLow;
		this.fixedCountQualityModerate = fixedCountQualityModerate;
		this.fixedCountQualitySevere = fixedCountQualitySevere;
		this.fixedCountQualityCritical = fixedCountQualityCritical;
		this.fixedCountOtherLow = fixedCountOtherLow;
		this.fixedCountOtherModerate = fixedCountOtherModerate;
		this.fixedCountOtherSevere = fixedCountOtherSevere;
		this.fixedCountOtherCritical = fixedCountOtherCritical;
		
		this.waivedCountSecurityLow = waivedCountSecurityLow;
		this.waivedCountSecurityModerate = waivedCountSecurityModerate;
		this.waivedCountSecuritySevere = waivedCountSecuritySevere;
		this.waivedCountSecurityCritical = waivedCountSecurityCritical;
		this.waivedCountLicenseLow = waivedCountLicenseLow;
		this.waivedCountLicenseModerate = waivedCountLicenseModerate;
		this.waivedCountLicenseSevere = waivedCountLicenseSevere;
		this.waivedCountLicenseCritical = waivedCountLicenseCritical;
		this.waivedCountQualityLow = waivedCountQualityLow;
		this.waivedCountQualityModerate = waivedCountQualityModerate;
		this.waivedCountQualitySevere = waivedCountQualitySevere;
		this.waivedCountQualityCritical = waivedCountQualityCritical;
		this.waivedCountOtherLow = waivedCountOtherLow;
		this.waivedCountOtherModerate = waivedCountOtherModerate;
		this.waivedCountOtherSevere = waivedCountOtherSevere;
		this.waivedCountOtherCritical = waivedCountOtherCritical;
		
		this.openCountAtTimePeriodEndSecurityLow = openCountAtTimePeriodEndSecurityLow;
		this.openCountAtTimePeriodEndSecurityModerate = openCountAtTimePeriodEndSecurityModerate;
		this.openCountAtTimePeriodEndSecuritySevere = openCountAtTimePeriodEndSecuritySevere;
		this.openCountAtTimePeriodEndSecurityCritical = openCountAtTimePeriodEndSecurityCritical;
		this.openCountAtTimePeriodEndLicenseLow = openCountAtTimePeriodEndLicenseLow;
		this.openCountAtTimePeriodEndLicenseModerate = openCountAtTimePeriodEndLicenseModerate;
		this.openCountAtTimePeriodEndLicenseSevere = openCountAtTimePeriodEndLicenseSevere;
		this.openCountAtTimePeriodEndLicenseCritical = openCountAtTimePeriodEndLicenseCritical;
		this.openCountAtTimePeriodEndQualityLow = openCountAtTimePeriodEndQualityLow;
		this.openCountAtTimePeriodEndQualityModerate = openCountAtTimePeriodEndQualityModerate;
		this.openCountAtTimePeriodEndQualitySevere = openCountAtTimePeriodEndQualitySevere;
		this.openCountAtTimePeriodEndQualityCritical = openCountAtTimePeriodEndQualityCritical;
		this.openCountAtTimePeriodEndOtherLow = openCountAtTimePeriodEndOtherLow;
		this.openCountAtTimePeriodEndOtherModerate = openCountAtTimePeriodEndOtherModerate;
		this.openCountAtTimePeriodEndOtherSevere = openCountAtTimePeriodEndOtherSevere;
		this.openCountAtTimePeriodEndOtherCritical = openCountAtTimePeriodEndOtherCritical;
	}

	@Override
	public String toString() {
		return "Metric [applicationId=" + applicationId + ", applicationPublicId=" + applicationPublicId
				+ ", applicationName=" + applicationName + ", organizationId=" + organizationId + ", organizationName="
				+ organizationName + ", timePeriodStart=" + timePeriodStart + ", evaluationCount=" + evaluationCount
				+ "]";
	}

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getApplicationPublicId() {
		return applicationPublicId;
	}

	public void setApplicationPublicId(String applicationPublicId) {
		this.applicationPublicId = applicationPublicId;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getTimePeriodStart() {
		return timePeriodStart;
	}

	public void setTimePeriodStart(String timePeriodStart) {
		this.timePeriodStart = timePeriodStart;
	}

	public int getEvaluationCount() {
		return evaluationCount;
	}

	public void setEvaluationCount(int evaluationCount) {
		this.evaluationCount = evaluationCount;
	}

	public Long getMttrLowThreat() {
		return mttrLowThreat;
	}

	public void setMttrLowThreat(Long mttrLowThreat) {
		this.mttrLowThreat = mttrLowThreat;
	}

	public Long getMttrModerateThreat() {
		return mttrModerateThreat;
	}

	public void setMttrModerateThreat(Long mttrModerateThreat) {
		this.mttrModerateThreat = mttrModerateThreat;
	}

	public Long getMttrSevereThreat() {
		return mttrSevereThreat;
	}

	public void setMttrSevereThreat(Long mttrSevereThreat) {
		this.mttrSevereThreat = mttrSevereThreat;
	}

	public Long getMttrCriticalThreat() {
		return mttrCriticalThreat;
	}

	public void setMttrCriticalThreat(Long mttrCriticalThreat) {
		this.mttrCriticalThreat = mttrCriticalThreat;
	}

	public int getDiscoveredCountSecurityLow() {
		return discoveredCountSecurityLow;
	}

	public void setDiscoveredCountSecurityLow(int discoveredCountSecurityLow) {
		this.discoveredCountSecurityLow = discoveredCountSecurityLow;
	}

	public int getDiscoveredCountSecurityModerate() {
		return discoveredCountSecurityModerate;
	}

	public void setDiscoveredCountSecurityModerate(int discoveredCountSecurityModerate) {
		this.discoveredCountSecurityModerate = discoveredCountSecurityModerate;
	}

	public int getDiscoveredCountSecuritySevere() {
		return discoveredCountSecuritySevere;
	}

	public void setDiscoveredCountSecuritySevere(int discoveredCountSecuritySevere) {
		this.discoveredCountSecuritySevere = discoveredCountSecuritySevere;
	}

	public int getDiscoveredCountSecurityCritical() {
		return discoveredCountSecurityCritical;
	}

	public void setDiscoveredCountSecurityCritical(int discoveredCountSecurityCritical) {
		this.discoveredCountSecurityCritical = discoveredCountSecurityCritical;
	}

	public int getDiscoveredCountLicenseLow() {
		return discoveredCountLicenseLow;
	}

	public void setDiscoveredCountLicenseLow(int discoveredCountLicenseLow) {
		this.discoveredCountLicenseLow = discoveredCountLicenseLow;
	}

	public int getDiscoveredCountLicenseModerate() {
		return discoveredCountLicenseModerate;
	}

	public void setDiscoveredCountLicenseModerate(int discoveredCountLicenseModerate) {
		this.discoveredCountLicenseModerate = discoveredCountLicenseModerate;
	}

	public int getDiscoveredCountLicenseSevere() {
		return discoveredCountLicenseSevere;
	}

	public void setDiscoveredCountLicenseSevere(int discoveredCountLicenseSevere) {
		this.discoveredCountLicenseSevere = discoveredCountLicenseSevere;
	}

	public int getDiscoveredCountLicenseCritical() {
		return discoveredCountLicenseCritical;
	}

	public void setDiscoveredCountLicenseCritical(int discoveredCountLicenseCritical) {
		this.discoveredCountLicenseCritical = discoveredCountLicenseCritical;
	}

	public int getDiscoveredCountQualityLow() {
		return discoveredCountQualityLow;
	}

	public void setDiscoveredCountQualityLow(int discoveredCountQualityLow) {
		this.discoveredCountQualityLow = discoveredCountQualityLow;
	}

	public int getDiscoveredCountQualityModerate() {
		return discoveredCountQualityModerate;
	}

	public void setDiscoveredCountQualityModerate(int discoveredCountQualityModerate) {
		this.discoveredCountQualityModerate = discoveredCountQualityModerate;
	}

	public int getDiscoveredCountQualitySevere() {
		return discoveredCountQualitySevere;
	}

	public void setDiscoveredCountQualitySevere(int discoveredCountQualitySevere) {
		this.discoveredCountQualitySevere = discoveredCountQualitySevere;
	}

	public int getDiscoveredCountQualityCritical() {
		return discoveredCountQualityCritical;
	}

	public void setDiscoveredCountQualityCritical(int discoveredCountQualityCritical) {
		this.discoveredCountQualityCritical = discoveredCountQualityCritical;
	}

	public int getDiscoveredCountOtherLow() {
		return discoveredCountOtherLow;
	}

	public void setDiscoveredCountOtherLow(int discoveredCountOtherLow) {
		this.discoveredCountOtherLow = discoveredCountOtherLow;
	}

	public int getDiscoveredCountOtherModerate() {
		return discoveredCountOtherModerate;
	}

	public void setDiscoveredCountOtherModerate(int discoveredCountOtherModerate) {
		this.discoveredCountOtherModerate = discoveredCountOtherModerate;
	}

	public int getDiscoveredCountOtherSevere() {
		return discoveredCountOtherSevere;
	}

	public void setDiscoveredCountOtherSevere(int discoveredCountOtherSevere) {
		this.discoveredCountOtherSevere = discoveredCountOtherSevere;
	}

	public int getDiscoveredCountOtherCritical() {
		return discoveredCountOtherCritical;
	}

	public void setDiscoveredCountOtherCritical(int discoveredCountOtherCritical) {
		this.discoveredCountOtherCritical = discoveredCountOtherCritical;
	}

	public int getFixedCountSecurityLow() {
		return fixedCountSecurityLow;
	}

	public void setFixedCountSecurityLow(int fixedCountSecurityLow) {
		this.fixedCountSecurityLow = fixedCountSecurityLow;
	}

	public int getFixedCountSecurityModerate() {
		return fixedCountSecurityModerate;
	}

	public void setFixedCountSecurityModerate(int fixedCountSecurityModerate) {
		this.fixedCountSecurityModerate = fixedCountSecurityModerate;
	}

	public int getFixedCountSecuritySevere() {
		return fixedCountSecuritySevere;
	}

	public void setFixedCountSecuritySevere(int fixedCountSecuritySevere) {
		this.fixedCountSecuritySevere = fixedCountSecuritySevere;
	}

	public int getFixedCountSecurityCritical() {
		return fixedCountSecurityCritical;
	}

	public void setFixedCountSecurityCritical(int fixedCountSecurityCritical) {
		this.fixedCountSecurityCritical = fixedCountSecurityCritical;
	}

	public int getFixedCountLicenseLow() {
		return fixedCountLicenseLow;
	}

	public void setFixedCountLicenseLow(int fixedCountLicenseLow) {
		this.fixedCountLicenseLow = fixedCountLicenseLow;
	}

	public int getFixedCountLicenseModerate() {
		return fixedCountLicenseModerate;
	}

	public void setFixedCountLicenseModerate(int fixedCountLicenseModerate) {
		this.fixedCountLicenseModerate = fixedCountLicenseModerate;
	}

	public int getFixedCountLicenseSevere() {
		return fixedCountLicenseSevere;
	}

	public void setFixedCountLicenseSevere(int fixedCountLicenseSevere) {
		this.fixedCountLicenseSevere = fixedCountLicenseSevere;
	}

	public int getFixedCountLicenseCritical() {
		return fixedCountLicenseCritical;
	}

	public void setFixedCountLicenseCritical(int fixedCountLicenseCritical) {
		this.fixedCountLicenseCritical = fixedCountLicenseCritical;
	}

	public int getFixedCountQualityLow() {
		return fixedCountQualityLow;
	}

	public void setFixedCountQualityLow(int fixedCountQualityLow) {
		this.fixedCountQualityLow = fixedCountQualityLow;
	}

	public int getFixedCountQualityModerate() {
		return fixedCountQualityModerate;
	}

	public void setFixedCountQualityModerate(int fixedCountQualityModerate) {
		this.fixedCountQualityModerate = fixedCountQualityModerate;
	}

	public int getFixedCountQualitySevere() {
		return fixedCountQualitySevere;
	}

	public void setFixedCountQualitySevere(int fixedCountQualitySevere) {
		this.fixedCountQualitySevere = fixedCountQualitySevere;
	}

	public int getFixedCountQualityCritical() {
		return fixedCountQualityCritical;
	}

	public void setFixedCountQualityCritical(int fixedCountQualityCritical) {
		this.fixedCountQualityCritical = fixedCountQualityCritical;
	}

	public int getFixedCountOtherLow() {
		return fixedCountOtherLow;
	}

	public void setFixedCountOtherLow(int fixedCountOtherLow) {
		this.fixedCountOtherLow = fixedCountOtherLow;
	}

	public int getFixedCountOtherModerate() {
		return fixedCountOtherModerate;
	}

	public void setFixedCountOtherModerate(int fixedCountOtherModerate) {
		this.fixedCountOtherModerate = fixedCountOtherModerate;
	}

	public int getFixedCountOtherSevere() {
		return fixedCountOtherSevere;
	}

	public void setFixedCountOtherSevere(int fixedCountOtherSevere) {
		this.fixedCountOtherSevere = fixedCountOtherSevere;
	}

	public int getFixedCountOtherCritical() {
		return fixedCountOtherCritical;
	}

	public void setFixedCountOtherCritical(int fixedCountOtherCritical) {
		this.fixedCountOtherCritical = fixedCountOtherCritical;
	}

	public int getWaivedCountSecurityLow() {
		return waivedCountSecurityLow;
	}

	public void setWaivedCountSecurityLow(int waivedCountSecurityLow) {
		this.waivedCountSecurityLow = waivedCountSecurityLow;
	}

	public int getWaivedCountSecurityModerate() {
		return waivedCountSecurityModerate;
	}

	public void setWaivedCountSecurityModerate(int waivedCountSecurityModerate) {
		this.waivedCountSecurityModerate = waivedCountSecurityModerate;
	}

	public int getWaivedCountSecuritySevere() {
		return waivedCountSecuritySevere;
	}

	public void setWaivedCountSecuritySevere(int waivedCountSecuritySevere) {
		this.waivedCountSecuritySevere = waivedCountSecuritySevere;
	}

	public int getWaivedCountSecurityCritical() {
		return waivedCountSecurityCritical;
	}

	public void setWaivedCountSecurityCritical(int waivedCountSecurityCritical) {
		this.waivedCountSecurityCritical = waivedCountSecurityCritical;
	}

	public int getWaivedCountLicenseLow() {
		return waivedCountLicenseLow;
	}

	public void setWaivedCountLicenseLow(int waivedCountLicenseLow) {
		this.waivedCountLicenseLow = waivedCountLicenseLow;
	}

	public int getWaivedCountLicenseModerate() {
		return waivedCountLicenseModerate;
	}

	public void setWaivedCountLicenseModerate(int waivedCountLicenseModerate) {
		this.waivedCountLicenseModerate = waivedCountLicenseModerate;
	}

	public int getWaivedCountLicenseSevere() {
		return waivedCountLicenseSevere;
	}

	public void setWaivedCountLicenseSevere(int waivedCountLicenseSevere) {
		this.waivedCountLicenseSevere = waivedCountLicenseSevere;
	}

	public int getWaivedCountLicenseCritical() {
		return waivedCountLicenseCritical;
	}

	public void setWaivedCountLicenseCritical(int waivedCountLicenseCritical) {
		this.waivedCountLicenseCritical = waivedCountLicenseCritical;
	}

	public int getWaivedCountQualityLow() {
		return waivedCountQualityLow;
	}

	public void setWaivedCountQualityLow(int waivedCountQualityLow) {
		this.waivedCountQualityLow = waivedCountQualityLow;
	}

	public int getWaivedCountQualityModerate() {
		return waivedCountQualityModerate;
	}

	public void setWaivedCountQualityModerate(int waivedCountQualityModerate) {
		this.waivedCountQualityModerate = waivedCountQualityModerate;
	}

	public int getWaivedCountQualitySevere() {
		return waivedCountQualitySevere;
	}

	public void setWaivedCountQualitySevere(int waivedCountQualitySevere) {
		this.waivedCountQualitySevere = waivedCountQualitySevere;
	}

	public int getWaivedCountQualityCritical() {
		return waivedCountQualityCritical;
	}

	public void setWaivedCountQualityCritical(int waivedCountQualityCritical) {
		this.waivedCountQualityCritical = waivedCountQualityCritical;
	}

	public int getWaivedCountOtherLow() {
		return waivedCountOtherLow;
	}

	public void setWaivedCountOtherLow(int waivedCountOtherLow) {
		this.waivedCountOtherLow = waivedCountOtherLow;
	}

	public int getWaivedCountOtherModerate() {
		return waivedCountOtherModerate;
	}

	public void setWaivedCountOtherModerate(int waivedCountOtherModerate) {
		this.waivedCountOtherModerate = waivedCountOtherModerate;
	}

	public int getWaivedCountOtherSevere() {
		return waivedCountOtherSevere;
	}

	public void setWaivedCountOtherSevere(int waivedCountOtherSevere) {
		this.waivedCountOtherSevere = waivedCountOtherSevere;
	}

	public int getWaivedCountOtherCritical() {
		return waivedCountOtherCritical;
	}

	public void setWaivedCountOtherCritical(int waivedCountOtherCritical) {
		this.waivedCountOtherCritical = waivedCountOtherCritical;
	}

	public int getOpenCountAtTimePeriodEndSecurityLow() {
		return openCountAtTimePeriodEndSecurityLow;
	}

	public void setOpenCountAtTimePeriodEndSecurityLow(int openCountAtTimePeriodEndSecurityLow) {
		this.openCountAtTimePeriodEndSecurityLow = openCountAtTimePeriodEndSecurityLow;
	}

	public int getOpenCountAtTimePeriodEndSecurityModerate() {
		return openCountAtTimePeriodEndSecurityModerate;
	}

	public void setOpenCountAtTimePeriodEndSecurityModerate(int openCountAtTimePeriodEndSecurityModerate) {
		this.openCountAtTimePeriodEndSecurityModerate = openCountAtTimePeriodEndSecurityModerate;
	}

	public int getOpenCountAtTimePeriodEndSecuritySevere() {
		return openCountAtTimePeriodEndSecuritySevere;
	}

	public void setOpenCountAtTimePeriodEndSecuritySevere(int openCountAtTimePeriodEndSecuritySevere) {
		this.openCountAtTimePeriodEndSecuritySevere = openCountAtTimePeriodEndSecuritySevere;
	}

	public int getOpenCountAtTimePeriodEndSecurityCritical() {
		return openCountAtTimePeriodEndSecurityCritical;
	}

	public void setOpenCountAtTimePeriodEndSecurityCritical(int openCountAtTimePeriodEndSecurityCritical) {
		this.openCountAtTimePeriodEndSecurityCritical = openCountAtTimePeriodEndSecurityCritical;
	}

	public int getOpenCountAtTimePeriodEndLicenseLow() {
		return openCountAtTimePeriodEndLicenseLow;
	}

	public void setOpenCountAtTimePeriodEndLicenseLow(int openCountAtTimePeriodEndLicenseLow) {
		this.openCountAtTimePeriodEndLicenseLow = openCountAtTimePeriodEndLicenseLow;
	}

	public int getOpenCountAtTimePeriodEndLicenseModerate() {
		return openCountAtTimePeriodEndLicenseModerate;
	}

	public void setOpenCountAtTimePeriodEndLicenseModerate(int openCountAtTimePeriodEndLicenseModerate) {
		this.openCountAtTimePeriodEndLicenseModerate = openCountAtTimePeriodEndLicenseModerate;
	}

	public int getOpenCountAtTimePeriodEndLicenseSevere() {
		return openCountAtTimePeriodEndLicenseSevere;
	}

	public void setOpenCountAtTimePeriodEndLicenseSevere(int openCountAtTimePeriodEndLicenseSevere) {
		this.openCountAtTimePeriodEndLicenseSevere = openCountAtTimePeriodEndLicenseSevere;
	}

	public int getOpenCountAtTimePeriodEndLicenseCritical() {
		return openCountAtTimePeriodEndLicenseCritical;
	}

	public void setOpenCountAtTimePeriodEndLicenseCritical(int openCountAtTimePeriodEndLicenseCritical) {
		this.openCountAtTimePeriodEndLicenseCritical = openCountAtTimePeriodEndLicenseCritical;
	}

	public int getOpenCountAtTimePeriodEndQualityLow() {
		return openCountAtTimePeriodEndQualityLow;
	}

	public void setOpenCountAtTimePeriodEndQualityLow(int openCountAtTimePeriodEndQualityLow) {
		this.openCountAtTimePeriodEndQualityLow = openCountAtTimePeriodEndQualityLow;
	}

	public int getOpenCountAtTimePeriodEndQualityModerate() {
		return openCountAtTimePeriodEndQualityModerate;
	}

	public void setOpenCountAtTimePeriodEndQualityModerate(int openCountAtTimePeriodEndQualityModerate) {
		this.openCountAtTimePeriodEndQualityModerate = openCountAtTimePeriodEndQualityModerate;
	}

	public int getOpenCountAtTimePeriodEndQualitySevere() {
		return openCountAtTimePeriodEndQualitySevere;
	}

	public void setOpenCountAtTimePeriodEndQualitySevere(int openCountAtTimePeriodEndQualitySevere) {
		this.openCountAtTimePeriodEndQualitySevere = openCountAtTimePeriodEndQualitySevere;
	}

	public int getOpenCountAtTimePeriodEndQualityCritical() {
		return openCountAtTimePeriodEndQualityCritical;
	}

	public void setOpenCountAtTimePeriodEndQualityCritical(int openCountAtTimePeriodEndQualityCritical) {
		this.openCountAtTimePeriodEndQualityCritical = openCountAtTimePeriodEndQualityCritical;
	}

	public int getOpenCountAtTimePeriodEndOtherLow() {
		return openCountAtTimePeriodEndOtherLow;
	}

	public void setOpenCountAtTimePeriodEndOtherLow(int openCountAtTimePeriodEndOtherLow) {
		this.openCountAtTimePeriodEndOtherLow = openCountAtTimePeriodEndOtherLow;
	}

	public int getOpenCountAtTimePeriodEndOtherModerate() {
		return openCountAtTimePeriodEndOtherModerate;
	}

	public void setOpenCountAtTimePeriodEndOtherModerate(int openCountAtTimePeriodEndOtherModerate) {
		this.openCountAtTimePeriodEndOtherModerate = openCountAtTimePeriodEndOtherModerate;
	}

	public int getOpenCountAtTimePeriodEndOtherSevere() {
		return openCountAtTimePeriodEndOtherSevere;
	}

	public void setOpenCountAtTimePeriodEndOtherSevere(int openCountAtTimePeriodEndOtherSevere) {
		this.openCountAtTimePeriodEndOtherSevere = openCountAtTimePeriodEndOtherSevere;
	}

	public int getOpenCountAtTimePeriodEndOtherCritical() {
		return openCountAtTimePeriodEndOtherCritical;
	}

	public void setOpenCountAtTimePeriodEndOtherCritical(int openCountAtTimePeriodEndOtherCritical) {
		this.openCountAtTimePeriodEndOtherCritical = openCountAtTimePeriodEndOtherCritical;
	}
	
	
}
