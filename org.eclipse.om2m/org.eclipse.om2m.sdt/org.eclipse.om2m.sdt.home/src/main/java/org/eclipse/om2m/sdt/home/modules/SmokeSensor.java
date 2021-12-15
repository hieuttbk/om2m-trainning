/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *******************************************************************************/
package org.eclipse.om2m.sdt.home.modules;

import java.util.Map;

import org.eclipse.om2m.sdt.DataPoint;
import org.eclipse.om2m.sdt.Domain;
import org.eclipse.om2m.sdt.datapoints.BooleanDataPoint;
import org.eclipse.om2m.sdt.datapoints.IntegerDataPoint;
import org.eclipse.om2m.sdt.exceptions.AccessException;
import org.eclipse.om2m.sdt.exceptions.DataPointException;
import org.eclipse.om2m.sdt.home.types.DatapointType;
import org.eclipse.om2m.sdt.home.types.ModuleType;

public class SmokeSensor extends AbstractAlarmSensor {
	
	private IntegerDataPoint detectedTime;
	private IntegerDataPoint smokeThreshhold;
	private IntegerDataPoint currentValue;

	public SmokeSensor(final String name, final Domain domain, BooleanDataPoint alarm) {
		super(name, domain, alarm, ModuleType.smokeSensor, "The detection of smoke.");
	}
	
	public SmokeSensor(final String name, final Domain domain, Map<String, DataPoint> dps) {
		this(name, domain, (BooleanDataPoint) dps.get(DatapointType.alarm.getShortName()));
		IntegerDataPoint dp = (IntegerDataPoint) dps.get(DatapointType.detectedTime.getShortName());
		if (dp != null)
			setDetectedTime(dp);
		dp = (IntegerDataPoint) dps.get(DatapointType.smokeThreshhold.getShortName());
		if (dp != null)
			setSmokeThreshhold(dp);
		dp = (IntegerDataPoint) dps.get(DatapointType.currentValue.getShortName());
		if (dp != null)
			setCurrentValue(dp);
	}

	public void setDetectedTime(IntegerDataPoint dp) {
		detectedTime = dp;
		detectedTime.setOptional(true);
		detectedTime.setDoc("The time the smoke is detected.");
		addDataPoint(detectedTime);
	}
	
	public int getDetectedTime() throws DataPointException, AccessException {
		if (detectedTime == null)
			throw new DataPointException("Not implemented");
		return detectedTime.getValue();
	}

	public void setDetectedTime(int v) throws DataPointException, AccessException {
		if (detectedTime == null)
			throw new DataPointException("Not implemented");
		detectedTime.setValue(v);
	}

	private void setCurrentValue(IntegerDataPoint dp) {
		currentValue = dp;
		currentValue.setOptional(true);
		currentValue.setWritable(false);
		currentValue.setDoc("The current data value of the smoke sensor.");
		addDataPoint(currentValue);
	}
	
	public int getCurrentValue() throws DataPointException, AccessException {
		if (currentValue == null)
			throw new DataPointException("Not implemented");
		return currentValue.getValue();
	}

	private void setSmokeThreshhold(IntegerDataPoint dp) {
		smokeThreshhold = dp;
		smokeThreshhold.setOptional(true);
		smokeThreshhold.setDoc("The threshhold to trigger the alarm. The unit of measure is ppm.");
		addDataPoint(smokeThreshhold);
	}
	
	public int getSmokeThreshhold() throws DataPointException, AccessException {
		if (smokeThreshhold == null)
			throw new DataPointException("Not implemented");
		return smokeThreshhold.getValue();
	}

	public void setSmokeThreshhold(int v) throws DataPointException, AccessException {
		if (smokeThreshhold == null)
			throw new DataPointException("Not implemented");
		smokeThreshhold.setValue(v);
	}

}
