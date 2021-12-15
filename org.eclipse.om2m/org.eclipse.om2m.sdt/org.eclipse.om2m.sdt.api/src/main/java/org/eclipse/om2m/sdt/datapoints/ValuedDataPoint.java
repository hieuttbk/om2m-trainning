/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *******************************************************************************/
package org.eclipse.om2m.sdt.datapoints;

import org.eclipse.om2m.sdt.DataPoint;
import org.eclipse.om2m.sdt.Identifiers;
import org.eclipse.om2m.sdt.exceptions.AccessException;
import org.eclipse.om2m.sdt.exceptions.DataPointException;
import org.eclipse.om2m.sdt.types.DataType;
import org.eclipse.om2m.sdt.utils.Activator;

public abstract class ValuedDataPoint<T> extends DataPoint {

	public ValuedDataPoint(Identifiers name, DataType type) {
		super(name, type);
	}

	public T getValue() throws DataPointException, AccessException {
		if (! isReadable()) {
			throw new DataPointException("Not readable");
		}
		if (! Activator.isGrantedReadAccess(this)) {
			throw new AccessException("No read access allowed");
		}
		return doGetValue();
	}
	
	public String toStringValue() throws DataPointException, AccessException, Exception {
		return getDataType().getTypeChoice().toString(getValue());
	}

	public void setValue(T value) throws DataPointException, AccessException {
		if (! isWritable()) {
			throw new DataPointException("Not writable");
		}
		if (! Activator.isGrantedWriteAccess(this)) {
			throw new AccessException("No write access allowed");
		}
		doSetValue(value);
	}

	protected abstract T doGetValue() throws DataPointException;

	protected void doSetValue(T value) throws DataPointException {
	}
	
}
