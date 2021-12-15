/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *******************************************************************************/
package org.eclipse.om2m.sdt.home.mocked.modules;

import org.eclipse.om2m.sdt.Domain;
import org.eclipse.om2m.sdt.datapoints.FloatDataPoint;
import org.eclipse.om2m.sdt.datapoints.StringDataPoint;
import org.eclipse.om2m.sdt.exceptions.DataPointException;
import org.eclipse.om2m.sdt.home.modules.Temperature;
import org.eclipse.om2m.sdt.home.types.DatapointType;

public class MockedTemperature extends Temperature {

	public MockedTemperature(String name, Domain domain, FloatDataPoint currentTemperature) {
		this(name, domain, true, currentTemperature);
	}

	public MockedTemperature(String name, Domain domain, final boolean b, FloatDataPoint currentTemperature) {
		super(name, domain, currentTemperature);
		
		if (b) {
			setStepValue(new FloatDataPoint(DatapointType.stepValue) {
				@Override
				public Float doGetValue() throws DataPointException {
					return null;//(float) 1;
				}
			});
			setUnit(new StringDataPoint(DatapointType.unit) {
				@Override
				protected String doGetValue() throws DataPointException {
					return null;// "°C";
				}
			});
		}
	}

}
