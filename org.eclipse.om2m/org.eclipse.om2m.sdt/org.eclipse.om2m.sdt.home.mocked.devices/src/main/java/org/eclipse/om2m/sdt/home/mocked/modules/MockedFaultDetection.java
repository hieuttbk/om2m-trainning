/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *******************************************************************************/
package org.eclipse.om2m.sdt.home.mocked.modules;

import org.eclipse.om2m.sdt.Domain;
import org.eclipse.om2m.sdt.datapoints.BooleanDataPoint;
import org.eclipse.om2m.sdt.exceptions.DataPointException;
import org.eclipse.om2m.sdt.home.modules.FaultDetection;
import org.eclipse.om2m.sdt.home.types.DatapointType;

public class MockedFaultDetection extends FaultDetection {

	public MockedFaultDetection(String name, Domain domain) {
		super(name, domain, 
			new BooleanDataPoint(DatapointType.status) {
				@Override
				public Boolean doGetValue() throws DataPointException {
					return (Math.random() * 100) == 1;
				}
			}
		);
	}

}
