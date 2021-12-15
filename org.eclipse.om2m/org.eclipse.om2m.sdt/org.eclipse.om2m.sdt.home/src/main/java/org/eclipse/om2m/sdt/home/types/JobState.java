/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *******************************************************************************/
package org.eclipse.om2m.sdt.home.types;

import org.eclipse.om2m.sdt.datapoints.EnumDataPoint;

public abstract class JobState extends EnumDataPoint<JobState.Values> {
	
	static public enum Values {
		aborted, cancelled, completed, paused, pending, processing
	}
	
	public JobState() {
		this(DatapointType.currentJobState);
	}
	
	public JobState(DatapointType dt) {
		super(dt, HomeDataType.JobState);
		setValidValues(Values.values());
	}

}
