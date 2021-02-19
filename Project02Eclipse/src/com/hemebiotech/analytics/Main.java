package com.hemebiotech.analytics;

import java.io.IOException;
/**
 * 
 * 
 * @author E.Jurquet
 * @version 2.0
 * Main class. Start of the Program AnalyticsCounter.
 */
public class Main {

	public static void main(String[] args)  {
		
		Analytics analytics = new Analytics();
			
		try {
			analytics.analytics();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
