package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;


/**
 * @author E.Jurquet
 * A way to list and count Symptoms/number of their occurrences.
 */
public class SymptomsCount implements ISymptomCount {

	/**
	 * (non-Javadoc)
	 * @see com.hemebiotech.analytics.ISymptomCount#listAndCountSymptoms()
	 */
	public Map<String,Integer> listAndCountSymptoms()  {


		ISymptomReader lecteur = new ReadSymptomDataFromFile("symptoms.txt");

		List <String> lSymptoms = lecteur.getSymptoms();

		Map<String,Integer> mSympt = new TreeMap<>();



		for (int n= 0; n<lSymptoms.size();n ++) {
			String symptom =lSymptoms.get(n).trim().toLowerCase();

			if (mSympt.containsKey(symptom)) {

				int nbOccurence = mSympt.get(symptom);
				nbOccurence ++;
				mSympt.put(symptom, nbOccurence);
			}
			else {
				mSympt.put(symptom, 1);

			}
		}System.out.println(mSympt.toString());
		return mSympt;

	}





}


