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
import org.eclipse.om2m.sdt.Module;
import org.eclipse.om2m.sdt.exceptions.AccessException;
import org.eclipse.om2m.sdt.exceptions.DataPointException;
import org.eclipse.om2m.sdt.home.types.DatapointType;
import org.eclipse.om2m.sdt.home.types.LiquidLevel.Values;
import org.eclipse.om2m.sdt.home.types.ModuleType;

public class LiquidLevel extends Module {
	
	private org.eclipse.om2m.sdt.home.types.LiquidLevel liquidLevel;

	public LiquidLevel(final String name, final Domain domain, 
			org.eclipse.om2m.sdt.home.types.LiquidLevel liquidLevel) {
		super(name, domain, ModuleType.liquidLevel);

		if ((liquidLevel == null) ||
				! liquidLevel.getShortName().equals(DatapointType.liquidLevel.getShortName())) {
			domain.removeModule(getName());
			throw new IllegalArgumentException("Wrong liquidLevel datapoint: " + liquidLevel);
		}
		this.liquidLevel = liquidLevel;
		liquidLevel.setDoc("The desired quantity of supplies to be used; e.g. of rinse liquid, of water, of milk in a cup of coffee.");
		addDataPoint(liquidLevel);
	}
		
    public LiquidLevel(final String name, final Domain domain, Map<String, DataPoint> dps) {
        this(name, domain, (org.eclipse.om2m.sdt.home.types.LiquidLevel) dps.get(DatapointType.liquidLevel.getShortName()));
    }

	public Values getLiquidLevel() throws DataPointException, AccessException {
		return liquidLevel.getValue();
	}

	public void setLiquidLevel(Values v) throws DataPointException, AccessException {
		liquidLevel.setValue(v);
	}
	
}
