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
import org.eclipse.om2m.sdt.home.modules.LiquidLevel;
import org.eclipse.om2m.sdt.home.types.DeviceType;

public class WaterValve extends GenericActuator {
	
	private LiquidLevel waterLevel;

	public WaterValve(final String id, final String serial, final Domain domain) {
		super(id, serial, DeviceType.deviceWaterValve, domain);
		setDeviceSubModelName("WATER");
	}
	
	public void addModule(Module module) {
		if (module instanceof LiquidLevel)
			addModule((LiquidLevel)module);
		else
			super.addModule(module);
	}

	public void addModule(LiquidLevel waterLevel) {
		this.waterLevel = waterLevel;
		super.addModule(waterLevel);
	}

	public LiquidLevel getWaterLevel() {
		return waterLevel;
	}

}
