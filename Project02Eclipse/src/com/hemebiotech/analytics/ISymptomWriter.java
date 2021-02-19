package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;
/**
 * 
 * @author E.Jurquet 
 * Method signature of anything that will create and write a file with results of the mSympt Map.
 * @return a List of Strings with Symptoms in alphabetical order and with the number of their occurrences.
 * @param Map<String,Integer>mSympt , which is containing Symptoms/number of occurrences.
 */
public interface ISymptomWriter {
	
	
	public String writeSymptomDataToFile (Map<String,Integer>mSympt);

}
