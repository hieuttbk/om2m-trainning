/*******************************************************************************
 * Copyright (c) 2018 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *******************************************************************************/
package org.eclipse.om2m.sdt.home.devices;

import org.eclipse.om2m.sdt.Domain;
import org.eclipse.om2m.sdt.Module;
import org.eclipse.om2m.sdt.home.modules.AirQualitySensor;
import org.eclipse.om2m.sdt.home.types.DeviceType;

public class AirQualityMonitor extends GenericDevice {
	
	private AirQualitySensor airQualitySensor;

	public AirQualityMonitor(final String id, final String serial, final Domain domain) {
		super(id, serial, DeviceType.deviceAirQualityMonitor, domain);
	}
	
	public void addModule(Module module) {
		if (module instanceof AirQualitySensor)
			addModule((AirQualitySensor)module);
		else
			super.addModule(module);
	}

	public void addModule(AirQualitySensor airQualitySensor) {
		this.airQualitySensor = airQualitySensor;
		super.addModule(airQualitySensor);
	}

	public AirQualitySensor getAirQualitySensor() {
		return airQualitySensor;
	}

}
