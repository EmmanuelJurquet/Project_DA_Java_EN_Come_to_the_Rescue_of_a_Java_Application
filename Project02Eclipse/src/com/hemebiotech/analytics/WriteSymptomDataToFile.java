package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
/**
 * 
 * @author E.Jurquet
 * A way to  create and write on a file the  results of the mSympt Map.
 *
 */
public class WriteSymptomDataToFile implements ISymptomWriter{
	/**
	 * (non-javadoc)
	 * @see com.hemebiotech.analytics.ISymptomWriter#writeSymptomDataToFile(Map)
	 */
	public String writeSymptomDataToFile (Map<String,Integer>mSympt) {


		FileWriter writer = null;
		BufferedWriter bw = null ;
		try {
			writer = new FileWriter ("result.out");
			bw = new BufferedWriter (writer);

			for (Entry<String,Integer> entry : mSympt.entrySet() ) {
				String key = entry.getKey();
				Integer value = entry.getValue();
				String line =key+"   : "+value+"\n";
				bw.write(line);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}finally {

			if (bw != null) {try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			}
		}

		return null;

	}
}


