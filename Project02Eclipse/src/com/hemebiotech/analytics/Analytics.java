package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

public class Analytics {

	
	public void analytics () {
		SymptomsCount symptoms = new SymptomsCount();
		WriteSymptomDataToFile wd = new WriteSymptomDataToFile ();
		
		Map <String,Integer> results = symptoms.listAndCountSymptoms();
		String resultats = wd.writeSymptomDataToFile(results);
		
	
		
	}
}
