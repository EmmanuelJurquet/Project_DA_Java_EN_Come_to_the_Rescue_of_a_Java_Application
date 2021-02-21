package com.hemebiotech.analytics;

import java.util.Map;
/**
 * @author E.Jurquet
 * Method signature of anything that will list symptoms and count their occurrences.
 * @return a Map<String,Integer> which will contain Symptoms counted.
 */
public interface ISymptomCount {

	
	public Map<String,Integer> listAndCountSymptoms () ;
}
