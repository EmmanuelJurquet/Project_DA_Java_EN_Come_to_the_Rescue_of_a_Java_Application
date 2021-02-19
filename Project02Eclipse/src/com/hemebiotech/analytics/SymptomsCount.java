package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;



public class SymptomsCount implements ISymptomCount {


	public Map<String,Integer> listAndCountSymptoms()  {


		ISymptomReader lecteur = new ReadSymptomDataFromFile("symptoms.txt");

		List <String> lSymptoms = lecteur.GetSymptoms();

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
		}
		return mSympt;

	}





}


