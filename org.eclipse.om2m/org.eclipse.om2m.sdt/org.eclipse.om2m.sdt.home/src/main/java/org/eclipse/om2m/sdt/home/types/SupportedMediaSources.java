/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *******************************************************************************/
package org.eclipse.om2m.sdt.home.types;

import org.eclipse.om2m.sdt.datapoints.EnumDataPoint;

public abstract class SupportedMediaSources extends EnumDataPoint<SupportedMediaSources.Values> {
	
	static public enum Values {
		tuner, component, composite, svideo, rgb, dvi, hdmi, displayPort, scart, externalStorage, network
	}
	
	public SupportedMediaSources() {
		this(DatapointType.supportedMediaSources);
	}
	
	public SupportedMediaSources(DatapointType dp) {
		super(dp, HomeDataType.SupportedMediaSources);
		setValidValues(Values.values());
	}
	
}
