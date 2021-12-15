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
import org.eclipse.om2m.sdt.home.mocked.devices.Activator;
import org.eclipse.om2m.sdt.home.modules.AlarmSpeaker;
import org.eclipse.om2m.sdt.home.types.DatapointType;
import org.eclipse.om2m.sdt.home.types.Tone;

public class MockedAlarmSpeaker extends AlarmSpeaker {
	
	public MockedAlarmSpeaker(String name, Domain domain) {
		super(name, domain,
			new BooleanDataPoint(DatapointType.alarmStatus) {
				private boolean alarmStatus = false;
				@Override
				public void doSetValue(Boolean value) throws DataPointException {
					alarmStatus = value;
					Activator.logger.info("set alarmStatus " + value);
				}
				@Override
				public Boolean doGetValue() throws DataPointException {
					return alarmStatus;
				}
			}
		);

		setTone(new Tone() {
			private Tone.Values tone = Tone.Values.doorbell;
			@Override
			public void doSetValue(Tone.Values value) throws DataPointException {
				tone = value;
				Activator.logger.info("tone " + tone);
			}
			@Override
			public Tone.Values doGetValue() throws DataPointException {
				return tone;
			}
		});
	}

}
