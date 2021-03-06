package org.knoesis.utils;

public class WikipediaConstants {
	public static final String API_URL = "http://en.wikipedia.org/w/api.php";
	public static final String PageView_URL = "http://stats.grok.se/json/en/";
	
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String TIMELINE_CONNECTION = "jdbc:mysql://127.0.0.1:3306/Timeline?user=root&password=admin";
	public static final String WIKI_TABLE = "tl_wikipedia";
	public static final String EVENT_TABLE = "tl_event";
	public static final String EVENT_STARTDATE = "start_date";
	public static final String EVENT_ENDDATE = "end_date";
	
	public static final int BATCH_COUNT = 100;
	public static final int EVENT_ID = 1;
	
	public static final String JSON_Property = "daily_views";
	public static final String YYYYMM = "YYYYMM";	
	public static final String YYYYMMDD ="yyyy-MM-dd"; 
	public static final String YYYYMMDDHHMMSS = "yyyy-MM-dd HH:mm:ss";
	public static final String DECIMAL_FORMAT = "#.##";
	
}