/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *******************************************************************************/
package org.eclipse.om2m.sdt.exceptions;

public class PropertyException extends Exception {

	public PropertyException() {
		super();
	}

	public PropertyException(String message) {
		super(message);
	}

	public PropertyException(Throwable cause) {
		super(cause);
	}

	public PropertyException(String message, Throwable cause) {
		super(message, cause);
	}

}
