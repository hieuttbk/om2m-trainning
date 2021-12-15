/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *******************************************************************************/
package org.eclipse.om2m.sdt.home.devices;

import org.eclipse.om2m.sdt.Domain;
import org.eclipse.om2m.sdt.Module;
import org.eclipse.om2m.sdt.home.modules.AlarmSpeaker;
import org.eclipse.om2m.sdt.home.modules.FaultDetection;
import org.eclipse.om2m.sdt.home.types.DeviceType;

public class Warning extends GenericDevice {
	
	private AlarmSpeaker alarmSpeaker;
	private FaultDetection faultDetection;
	
	public Warning(final String id, final String serial, final Domain domain) {
		super(id, serial, DeviceType.deviceWarning, domain);
	}
	
	public void addModule(Module module) {
		if (module instanceof AlarmSpeaker)
			addModule((AlarmSpeaker)module);
		else if (module instanceof FaultDetection)
			addModule((FaultDetection)module);
		else 
			super.addModule(module);
	}

	public void addModule(AlarmSpeaker alarmSpeaker) {
		this.alarmSpeaker = alarmSpeaker;
		super.addModule(alarmSpeaker);
	}

	public void addModule(FaultDetection faultDetection) {
		this.faultDetection = faultDetection;
		super.addModule(faultDetection);
	}

	public AlarmSpeaker getAlarmSpeaker() {
		return alarmSpeaker;
	}

	public FaultDetection getFaultDetection() {
		return faultDetection;
	}

}
