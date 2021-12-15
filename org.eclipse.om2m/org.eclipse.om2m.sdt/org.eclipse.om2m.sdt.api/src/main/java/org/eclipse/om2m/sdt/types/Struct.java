/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *******************************************************************************/
package org.eclipse.om2m.sdt.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.om2m.sdt.types.DataType.TypeChoice;

public class Struct implements TypeChoice {
	
	private Collection<DataType> dataTypes;

	public Struct() {
		dataTypes = new ArrayList<DataType>();
	}

	public Collection<DataType> getDataTypes() {
		return Collections.unmodifiableCollection(dataTypes);
	}

	public void addDataType(final DataType dataType) {
		this.dataTypes.add(dataType);
	}

	public void removeDataType(final DataType dataType) {
		this.dataTypes.remove(dataType);
	}
	
	public String getOneM2MType() {
		return "xs:notDefined";
	}

	@Override
	public String toString(Object val) throws Exception {
		throw new Exception("Not implemented");
	}

	@Override
	public Object fromString(String val) throws Exception {
		throw new Exception("Not implemented");
	}

}
