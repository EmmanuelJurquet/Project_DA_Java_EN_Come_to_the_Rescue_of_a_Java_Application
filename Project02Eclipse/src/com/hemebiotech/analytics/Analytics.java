package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;
/**
 * @author E.Jurquet
 * Instantiate the SymptomsCount , and WriteSymptomsDatatoFile classes 
 * to create a main method: analytics which is a way to make function each classes together.
 */
public class Analytics {

	/**
	 * 
	 * @throws IOException
	 */
	public void analytics () throws IOException {
		
		SymptomsCount symptoms = new SymptomsCount();
		WriteSymptomDataToFile wd = new WriteSymptomDataToFile ();
		Map <String,Integer> results = symptoms.listAndCountSymptoms();
		
		 wd.writeSymptomDataToFile(results);		
	}
}
