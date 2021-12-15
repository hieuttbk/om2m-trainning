/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *******************************************************************************/
package org.eclipse.om2m.sdt.home.smarterkettle.communication;

import static org.eclipse.om2m.sdt.home.smarterkettle.Activator.LOGGER;

import java.util.Scanner;

public class SmarterKettleMain {
	
	public static void main(String[] args) throws InterruptedException {
		
		LOGGER.info("Smart Kettle 2.0");
		LOGGER.info("1 - start, 2 - stop, 3- checkStatus");
		
		while (true) {
			SmarterKettleCommunication kettle = new SmarterKettleCommunication("10.0.1.27", 2081);
			Scanner input = new Scanner(System.in);
			String inputString = input.nextLine();
			int action = Integer.parseInt(inputString);
			
			switch (action) {
			case 1:
				LOGGER.info("Temperature: ");
				inputString = input.nextLine();
				int temperature = Integer.parseInt(inputString);
				kettle.startKettle(temperature);
				break;
			case 2: 
				kettle.stopKettle();
				break;
			case 3:
				kettle.checkStatus();
				break;
			}
			input.close();
		}
	}

}
