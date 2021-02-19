package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

public class WriteSymptomDataToFile implements ISymptomWriter {

	public Map<String,Integer> writeSymptomDataToFile (Map<String,Integer>mSympt) {

		try {
			FileWriter writer = new FileWriter ("result.out");
			BufferedWriter  bw = new BufferedWriter (writer);

			for (Entry<String,Integer> entry : mSympt.entrySet() ) {
				String key = entry.getKey();
				Integer value = entry.getValue();
				String line =key+"   : "+value+"\n";
				bw.write(line);
			}
			bw.close();
			writer.close();
		}
	 catch (IOException e) {
		 e.printStackTrace();
	 }
		return mSympt;
	 }
}
	
	


