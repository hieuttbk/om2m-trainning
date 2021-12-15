/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *******************************************************************************/
package org.eclipse.om2m.sdt.home.types;

import org.eclipse.om2m.sdt.datapoints.EnumDataPoint;

public abstract class DoorState extends EnumDataPoint<DoorState.Values> {
	
	static public enum Values {
		closed, open, opening, closing, stopped
	}
	
	public DoorState() {
		this(DatapointType.doorState);
	}
	
	public DoorState(DatapointType dt) {
		super(dt, HomeDataType.DoorState);
		setValidValues(Values.values());
	}

}
