/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *******************************************************************************/
package org.eclipse.om2m.sdt.home.smartercoffee.communication;

public class SmarterCoffeeStatusDescriptor {

	public int code;
	
	public String description;
	
	public SmarterCoffeeStatusDescriptor(int code, String desc){
		this.code = code;
		this.description = desc;
	}
	
}
