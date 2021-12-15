/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *******************************************************************************/
package org.eclipse.om2m.sdt;

public class Extended {

	private String domain;
	private String clazz;
	
	Extended(final String domain, final String clazz) {
		if ((domain == null) || (clazz == null)) 
			throw new IllegalArgumentException();
		this.clazz = clazz;
		this.domain = domain;
	}

	public String getDomain() {
		return domain;
	}

	public String getClazz() {
		return clazz;
	}

}
