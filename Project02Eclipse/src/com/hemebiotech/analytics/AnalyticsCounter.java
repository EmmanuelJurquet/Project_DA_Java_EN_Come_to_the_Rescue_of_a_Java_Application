package com.hemebiotech.analytics;

import java.util.Map;

public class AnalyticsCounter {
	
	
	
	public void analyseTheData (Map<String, Integer> mSympt) {
		
		SymptomsCount symptoms2 = new SymptomsCount();
		symptoms2.listAndCountSymptoms();
		
		WriteSymptomDataToFile wd = new WriteSymptomDataToFile();
		wd.writeSymptomDataToFile(mSympt);
		
	}

	public static void main(String[] args) {

		AnalyticsCounter analyticsCounter = new AnalyticsCounter();
		analyticsCounter.analyseTheData();

	}



}
