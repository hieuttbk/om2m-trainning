/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *******************************************************************************/
package org.eclipse.om2m.sdt.datapoints;

import java.util.List;

import org.eclipse.om2m.sdt.Identifiers;
import org.eclipse.om2m.sdt.types.Array;
import org.eclipse.om2m.sdt.types.DataType;

public abstract class ArrayDataPoint<T> extends ValuedDataPoint<List<T>> {

	public ArrayDataPoint(Identifiers.Typed name) {
		super(name, new DataType(new Array<T>(name.getDataType())));
	}

}
