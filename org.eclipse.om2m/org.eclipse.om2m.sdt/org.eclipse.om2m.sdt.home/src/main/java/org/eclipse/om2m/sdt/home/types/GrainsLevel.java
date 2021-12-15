/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *******************************************************************************/
package org.eclipse.om2m.sdt.home.types;

import org.eclipse.om2m.sdt.datapoints.EnumDataPoint;

public abstract class GrainsLevel extends EnumDataPoint<GrainsLevel.Values> {
	
	static public enum Values {
		zero, low, medium, high, maximum
	}
	
	public GrainsLevel() {
		this(DatapointType.grainsRemaining);
	}
	
	public GrainsLevel(DatapointType dp) {
		super(dp, HomeDataType.GrainsLevel);
		setValidValues(Values.values());
	}
	
}
