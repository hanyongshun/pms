package com.pms.model;

public class ResFeature {
	public final static int RESSTATUSENABLE = 1;
	public final static int RESSTATUSDISABLE = 0;
	public final static int DELSTATUSNO = 0;
	public final static int DELSTATUSYES = 1;
	public final static int FUNRESTYPEDIR = 0;
	public final static int FUNRESTYPEBUSINESSMENU = 1;
	public final static int FUNRESTYPEOPERATEMENU = 2;
	public final static int FUNRESTYPEDEPEND = 3;
//	private int id;
//	private String name="";
//	private String resource_id;
//	private int resource_status;
//	private String resource_describe;
//	private String RMK;
//	private int delete_status;
//	private String app_id;
//	private String parent_resource;
//	private String resource_order;
//	private String system_type;
//	private String latest_mod_time;
	private int id;
	private String SYSTEM_TYPE;
	private String RESOURCE_ID;
	private String APP_ID;
	private String RESOUCE_NAME;
	private String PARENT_RESOURCE;
	private String URL;
	private String RESOURCE_ICON_PATH;
	private int RESOURCE_STATUS;
	private String RESOURCE_ORDER;
	private String RESOURCE_DESCRIBE;
	private String RMK;
	private int FUN_RESOURCE_TYPE;
	private int DATA_VERSION;
	private int DELETE_STATUS;
	private String LATEST_MOD_TIME;
	
	public int getFUN_RESOURCE_TYPE() {
		return FUN_RESOURCE_TYPE;
	}
	public void setFUN_RESOURCE_TYPE(int fUN_RESOURCE_TYPE) {
		FUN_RESOURCE_TYPE = fUN_RESOURCE_TYPE;
	}
	public int getDATA_VERSION() {
		return DATA_VERSION;
	}
	public void setDATA_VERSION(int dATA_VERSION) {
		DATA_VERSION = dATA_VERSION;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSYSTEM_TYPE() {
		return SYSTEM_TYPE;
	}
	public void setSYSTEM_TYPE(String sYSTEM_TYPE) {
		SYSTEM_TYPE = sYSTEM_TYPE;
	}
	public String getRESOURCE_ID() {
		return RESOURCE_ID;
	}
	public void setRESOURCE_ID(String rESOURCE_ID) {
		RESOURCE_ID = rESOURCE_ID;
	}
	public String getAPP_ID() {
		return APP_ID;
	}
	public void setAPP_ID(String aPP_ID) {
		APP_ID = aPP_ID;
	}
	public String getRESOUCE_NAME() {
		return RESOUCE_NAME;
	}
	public void setRESOUCE_NAME(String rESOUCE_NAME) {
		RESOUCE_NAME = rESOUCE_NAME;
	}
	public String getPARENT_RESOURCE() {
		return PARENT_RESOURCE;
	}
	public void setPARENT_RESOURCE(String pARENT_RESOURCE) {
		PARENT_RESOURCE = pARENT_RESOURCE;
	}
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	public String getRESOURCE_ICON_PATH() {
		return RESOURCE_ICON_PATH;
	}
	public void setRESOURCE_ICON_PATH(String rESOURCE_ICON_PATH) {
		RESOURCE_ICON_PATH = rESOURCE_ICON_PATH;
	}
	public int getRESOURCE_STATUS() {
		return RESOURCE_STATUS;
	}
	public void setRESOURCE_STATUS(int rESOURCE_STATUS) {
		RESOURCE_STATUS = rESOURCE_STATUS;
	}
	public String getRESOURCE_ORDER() {
		return RESOURCE_ORDER;
	}
	public void setRESOURCE_ORDER(String rESOURCE_ORDER) {
		RESOURCE_ORDER = rESOURCE_ORDER;
	}
	public String getRESOURCE_DESCRIBE() {
		return RESOURCE_DESCRIBE;
	}
	public void setRESOURCE_DESCRIBE(String rESOURCE_DESCRIBE) {
		RESOURCE_DESCRIBE = rESOURCE_DESCRIBE;
	}
	public String getRMK() {
		return RMK;
	}
	public void setRMK(String rMK) {
		RMK = rMK;
	}
	public int getDELETE_STATUS() {
		return DELETE_STATUS;
	}
	public void setDELETE_STATUS(int dELETE_STATUS) {
		DELETE_STATUS = dELETE_STATUS;
	}
	public String getLATEST_MOD_TIME() {
		return LATEST_MOD_TIME;
	}
	public void setLATEST_MOD_TIME(String lATEST_MOD_TIME) {
		LATEST_MOD_TIME = lATEST_MOD_TIME;
	}
	
	public boolean isValid() {
		if( (SYSTEM_TYPE == null || SYSTEM_TYPE.isEmpty()) 
				|| (RESOURCE_ID == null || RESOURCE_ID.isEmpty()) 
				|| (APP_ID == null || APP_ID.isEmpty())
				|| (RESOUCE_NAME == null || RESOUCE_NAME.isEmpty())				
				|| (PARENT_RESOURCE == null || PARENT_RESOURCE.isEmpty()) ) {
			return false;
		}
		return true;
	}
}
