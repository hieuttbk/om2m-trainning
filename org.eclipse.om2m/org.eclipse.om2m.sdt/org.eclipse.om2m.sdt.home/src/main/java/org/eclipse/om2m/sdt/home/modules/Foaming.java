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
import org.eclipse.om2m.sdt.home.types.FoamStrength;
import org.eclipse.om2m.sdt.home.types.ModuleType;

public class Foaming extends Module{

	private FoamStrength foamingStrength;

	public Foaming(String name, Domain domain, FoamStrength foamingStrength) {
		super(name, domain, ModuleType.foaming);

		if ((foamingStrength == null) ||
				! foamingStrength.getShortName().equals(DatapointType.foamingStrength.getShortName())) {
			domain.removeModule(getName());
			throw new IllegalArgumentException("Wrong foamingStrength datapoint: " + foamingStrength);
		}
		this.foamingStrength = foamingStrength;
		this.foamingStrength.setDoc("The current strength of foamed milk. A higher value indicates a milk which is more foamed.");
		addDataPoint(this.foamingStrength);
	}

	public Foaming(final String name, final Domain domain,  Map<String, DataPoint> dps) {
		this(name, domain,  (FoamStrength) dps.get(DatapointType.foamingStrength.getShortName()));
	}

	public FoamStrength.Values getFoamingStrength() throws DataPointException, AccessException{
		return foamingStrength.getValue();
	}

	public void setFoamingStrength(FoamStrength.Values v)  throws DataPointException, AccessException{
		this.foamingStrength.setValue(v);
	}

}
