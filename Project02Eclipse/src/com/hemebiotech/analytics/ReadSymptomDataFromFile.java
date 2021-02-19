package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;

	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}
	/**
	 * (non-javadoc)
	 * @see com.hemebiotech.analytics.ISymptomReader#getSymptoms()
	 */
	@Override
	public List<String> getSymptoms() {
		List<String> result = new ArrayList<>();

		if (filepath != null) {

			BufferedReader reader = null;

			try {
				reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();

				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
			}catch (IOException e) {
				e.printStackTrace();
			}finally {
				if (reader != null) {
					try {
						reader.close();
					} catch (IOException e) {

						e.printStackTrace();
					}
				}
			}
		}
		return result;
	}

}
