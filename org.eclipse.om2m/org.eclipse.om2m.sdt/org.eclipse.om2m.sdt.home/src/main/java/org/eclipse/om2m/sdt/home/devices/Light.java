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
import org.eclipse.om2m.sdt.exceptions.ModuleException;
import org.eclipse.om2m.sdt.home.modules.BinarySwitch;
import org.eclipse.om2m.sdt.home.modules.Colour;
import org.eclipse.om2m.sdt.home.modules.ColourSaturation;
import org.eclipse.om2m.sdt.home.modules.FaultDetection;
import org.eclipse.om2m.sdt.home.modules.RunState;
import org.eclipse.om2m.sdt.home.types.DeviceType;

public class Light extends GenericDevice {
	
	private FaultDetection faultDetection;
	
	private BinarySwitch binarySwitch;
	
	private RunState runState;
	
	private Colour colour;
	
	private ColourSaturation colourSaturation;
	
	public Light(final String id, final String serial, final Domain domain) {
		super(id, serial, DeviceType.deviceLight, domain);
	}
	
	public void addModule(Module module) {
		if (module instanceof FaultDetection)
			addModule((FaultDetection)module);
		else if (module instanceof BinarySwitch)
			addModule((BinarySwitch)module);
		else if (module instanceof RunState)
			addModule((RunState)module);
		else if (module instanceof Colour)
			addModule((Colour)module);
		else if (module instanceof ColourSaturation)
			addModule((ColourSaturation)module);
		else
			super.addModule(module);
	}
	
	public void addModule(Colour mod) {
		this.colour = mod;
		super.addModule(colour);
	}
	
	public void addModule(ColourSaturation mod) {
		this.colourSaturation = mod;
		super.addModule(colourSaturation);
	}

	public void addModule(FaultDetection mod) {
		this.faultDetection = mod;
		super.addModule(faultDetection);
	}

	public void addModule(BinarySwitch mod) {
		this.binarySwitch = mod;
		super.addModule(binarySwitch);
	}

	public void addModule(RunState mod) {
		this.runState = mod;
		super.addModule(runState);
	}

	public FaultDetection getFaultDetection() {
		return faultDetection;
	}

	public BinarySwitch getBinarySwitch() throws ModuleException {
		if (binarySwitch == null)
			throw new ModuleException("Not implemented");
		return binarySwitch;
	}

	public RunState getRunState() {
		return runState;
	}

	public Colour getColour() {
		return colour;
	}
	
	public ColourSaturation getColourSaturation() {
		return colourSaturation;
	}
}
