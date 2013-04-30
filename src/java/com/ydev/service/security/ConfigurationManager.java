/**
 * Created By: YBASE
 * Created Date: 2013-4-30 上午11:02:06
 * Author: Tom Yang
 */
package com.ydev.service.security;

import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author Tom Yang
 * @version 1.0
 */
public class ConfigurationManager {

	private  static final Log logger = LogFactory.getLog(ConfigurationManager.class);
	
	private static final String BEAN_NAME = "configurationManager";
	
	private static final String pro_file = "/appSetting.properties";
	
	private Properties appSetting = new Properties();
	
	public void init() {
		addProps(loadProps(pro_file));
	}

	public String getAppSetting(String appKey) {
		return appSetting.getProperty(appKey);
	}

	public void setSettingFile(String settingFile) {
		addProps(loadProps(settingFile));
	}
	
	public void setSettingFiles(String[] settingFiles) {
		for(int i=0;i<settingFiles.length;i++) {
			setSettingFile(settingFiles[i]);
		}
	}
	
	public void setAppSetting(Properties appSetting) {
		this.appSetting = appSetting;
	}

	private void addProps(Properties loadProps) {
		appSetting.putAll(loadProps);
	}

	private Properties loadProps(String proFile) {
		Properties props = new Properties();
		try {
			InputStream ios = getClass().getResourceAsStream(proFile);
			props.load(ios);
		} catch (Exception e) {
			logger.error("unload the appSetting.properties", e);
		}
		return props;
	}
}
