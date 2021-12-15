/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *******************************************************************************/
package org.eclipse.om2m.sdt;

import org.eclipse.om2m.sdt.types.BasicType;

public class Constraint extends Element {
	
	private String value;
	
	private BasicType type;

	public Constraint(final String name) {
		super(name);
	}

	public BasicType getType() {
		return type;
	}

	public void setType(final BasicType type) {
		this.type= type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(final String value) {
		this.value = value;
	}

}
