package org.nih.nci.cagrid.aim.service;

import gov.nih.nci.cagrid.introduce.servicetools.ServiceConfiguration;

import org.globus.wsrf.config.ContainerConfig;
import java.io.File;
import javax.naming.InitialContext;

import org.apache.axis.MessageContext;
import org.globus.wsrf.Constants;


/** 
 * DO NOT EDIT:  This class is autogenerated!
 * 
 * This class holds all service properties which were defined for the service to have
 * access to.
 * 
 * @created by Introduce Toolkit version 1.3
 * 
 */
public class AIMDataServiceConfiguration implements ServiceConfiguration {

	public static AIMDataServiceConfiguration  configuration = null;
    public String etcDirectoryPath;
    	
	public static AIMDataServiceConfiguration getConfiguration() throws Exception {
		if (AIMDataServiceConfiguration.configuration != null) {
			return AIMDataServiceConfiguration.configuration;
		}
		MessageContext ctx = MessageContext.getCurrentContext();

		String servicePath = ctx.getTargetService();

		String jndiName = Constants.JNDI_SERVICES_BASE_NAME + servicePath + "/serviceconfiguration";
		try {
			javax.naming.Context initialContext = new InitialContext();
			AIMDataServiceConfiguration.configuration = (AIMDataServiceConfiguration) initialContext.lookup(jndiName);
		} catch (Exception e) {
			throw new Exception("Unable to instantiate service configuration.", e);
		}

		return AIMDataServiceConfiguration.configuration;
	}
	

	
	private String cqlQueryProcessorConfig_xmlDomainModel;
	
	private String cqlQueryProcessorConfig_classToQname;
	
	private String cqlQueryProcessorConfig_xmlNamespaceResolverClass;
	
	private String queryProcessorClass;
	
	private String cqlQueryProcessorConfig_xmlCollectionName;
	
	private String cqlQueryProcessorConfig_xmldbURI;
	
	private String cqlQueryProcessorConfig_xmldbPath;
	
	private String cqlQueryProcessorConfig_xmldbAttachmentPath;
	
	private String cqlQueryProcessorConfig_xmldbConnectorClass;
	
	private String cqlQueryProcessorConfig_xmldbConfigFile;
	
	private String serverConfigLocation;
	
	private String dataService_cqlValidatorClass;
	
	private String dataService_domainModelValidatorClass;
	
	private String dataService_validateCqlFlag;
	
	private String dataService_validateDomainModelFlag;
	
	private String dataService_classMappingsFilename;
	
	
    public String getEtcDirectoryPath() {
		return ContainerConfig.getBaseDirectory() + File.separator + etcDirectoryPath;
	}
	
	public void setEtcDirectoryPath(String etcDirectoryPath) {
		this.etcDirectoryPath = etcDirectoryPath;
	}


	
	public String getCqlQueryProcessorConfig_xmlDomainModel() {
		return ContainerConfig.getBaseDirectory() + File.separator + cqlQueryProcessorConfig_xmlDomainModel;
	}
	
	
	public void setCqlQueryProcessorConfig_xmlDomainModel(String cqlQueryProcessorConfig_xmlDomainModel) {
		this.cqlQueryProcessorConfig_xmlDomainModel = cqlQueryProcessorConfig_xmlDomainModel;
	}

	
	public String getCqlQueryProcessorConfig_classToQname() {
		return ContainerConfig.getBaseDirectory() + File.separator + cqlQueryProcessorConfig_classToQname;
	}
	
	
	public void setCqlQueryProcessorConfig_classToQname(String cqlQueryProcessorConfig_classToQname) {
		this.cqlQueryProcessorConfig_classToQname = cqlQueryProcessorConfig_classToQname;
	}

	
	public String getCqlQueryProcessorConfig_xmlNamespaceResolverClass() {
		return cqlQueryProcessorConfig_xmlNamespaceResolverClass;
	}
	
	
	public void setCqlQueryProcessorConfig_xmlNamespaceResolverClass(String cqlQueryProcessorConfig_xmlNamespaceResolverClass) {
		this.cqlQueryProcessorConfig_xmlNamespaceResolverClass = cqlQueryProcessorConfig_xmlNamespaceResolverClass;
	}

	
	public String getQueryProcessorClass() {
		return queryProcessorClass;
	}
	
	
	public void setQueryProcessorClass(String queryProcessorClass) {
		this.queryProcessorClass = queryProcessorClass;
	}

	
	public String getCqlQueryProcessorConfig_xmlCollectionName() {
		return cqlQueryProcessorConfig_xmlCollectionName;
	}
	
	
	public void setCqlQueryProcessorConfig_xmlCollectionName(String cqlQueryProcessorConfig_xmlCollectionName) {
		this.cqlQueryProcessorConfig_xmlCollectionName = cqlQueryProcessorConfig_xmlCollectionName;
	}

	
	public String getCqlQueryProcessorConfig_xmldbURI() {
		return cqlQueryProcessorConfig_xmldbURI;
	}
	
	
	public void setCqlQueryProcessorConfig_xmldbURI(String cqlQueryProcessorConfig_xmldbURI) {
		this.cqlQueryProcessorConfig_xmldbURI = cqlQueryProcessorConfig_xmldbURI;
	}

	
	public String getCqlQueryProcessorConfig_xmldbPath() {
		return cqlQueryProcessorConfig_xmldbPath;
	}
	
	
	public void setCqlQueryProcessorConfig_xmldbPath(String cqlQueryProcessorConfig_xmldbPath) {
		this.cqlQueryProcessorConfig_xmldbPath = cqlQueryProcessorConfig_xmldbPath;
	}

	
	public String getCqlQueryProcessorConfig_xmldbAttachmentPath() {
		return cqlQueryProcessorConfig_xmldbAttachmentPath;
	}
	
	
	public void setCqlQueryProcessorConfig_xmldbAttachmentPath(String cqlQueryProcessorConfig_xmldbAttachmentPath) {
		this.cqlQueryProcessorConfig_xmldbAttachmentPath = cqlQueryProcessorConfig_xmldbAttachmentPath;
	}

	
	public String getCqlQueryProcessorConfig_xmldbConnectorClass() {
		return cqlQueryProcessorConfig_xmldbConnectorClass;
	}
	
	
	public void setCqlQueryProcessorConfig_xmldbConnectorClass(String cqlQueryProcessorConfig_xmldbConnectorClass) {
		this.cqlQueryProcessorConfig_xmldbConnectorClass = cqlQueryProcessorConfig_xmldbConnectorClass;
	}

	
	public String getCqlQueryProcessorConfig_xmldbConfigFile() {
		return cqlQueryProcessorConfig_xmldbConfigFile;
	}
	
	
	public void setCqlQueryProcessorConfig_xmldbConfigFile(String cqlQueryProcessorConfig_xmldbConfigFile) {
		this.cqlQueryProcessorConfig_xmldbConfigFile = cqlQueryProcessorConfig_xmldbConfigFile;
	}

	
	public String getServerConfigLocation() {
		return ContainerConfig.getBaseDirectory() + File.separator + serverConfigLocation;
	}
	
	
	public void setServerConfigLocation(String serverConfigLocation) {
		this.serverConfigLocation = serverConfigLocation;
	}

	
	public String getDataService_cqlValidatorClass() {
		return dataService_cqlValidatorClass;
	}
	
	
	public void setDataService_cqlValidatorClass(String dataService_cqlValidatorClass) {
		this.dataService_cqlValidatorClass = dataService_cqlValidatorClass;
	}

	
	public String getDataService_domainModelValidatorClass() {
		return dataService_domainModelValidatorClass;
	}
	
	
	public void setDataService_domainModelValidatorClass(String dataService_domainModelValidatorClass) {
		this.dataService_domainModelValidatorClass = dataService_domainModelValidatorClass;
	}

	
	public String getDataService_validateCqlFlag() {
		return dataService_validateCqlFlag;
	}
	
	
	public void setDataService_validateCqlFlag(String dataService_validateCqlFlag) {
		this.dataService_validateCqlFlag = dataService_validateCqlFlag;
	}

	
	public String getDataService_validateDomainModelFlag() {
		return dataService_validateDomainModelFlag;
	}
	
	
	public void setDataService_validateDomainModelFlag(String dataService_validateDomainModelFlag) {
		this.dataService_validateDomainModelFlag = dataService_validateDomainModelFlag;
	}

	
	public String getDataService_classMappingsFilename() {
		return ContainerConfig.getBaseDirectory() + File.separator + dataService_classMappingsFilename;
	}
	
	
	public void setDataService_classMappingsFilename(String dataService_classMappingsFilename) {
		this.dataService_classMappingsFilename = dataService_classMappingsFilename;
	}

	
}