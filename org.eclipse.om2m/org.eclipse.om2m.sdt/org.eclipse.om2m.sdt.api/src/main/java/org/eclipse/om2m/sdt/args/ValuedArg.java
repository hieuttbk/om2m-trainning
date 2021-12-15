/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *******************************************************************************/
package org.eclipse.om2m.sdt.args;

import org.eclipse.om2m.sdt.Arg;
import org.eclipse.om2m.sdt.types.DataType;

public class ValuedArg<T> extends Arg {
	
	private T value;

	public ValuedArg(String name, DataType type) {
		super(name, type);
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

}
