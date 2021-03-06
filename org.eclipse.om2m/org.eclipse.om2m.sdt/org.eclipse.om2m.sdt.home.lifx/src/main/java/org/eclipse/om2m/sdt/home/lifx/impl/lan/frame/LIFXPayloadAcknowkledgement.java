/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *******************************************************************************/
package org.eclipse.om2m.sdt.home.lifx.impl.lan.frame;

public class LIFXPayloadAcknowkledgement extends LIFXPayload {
	
	public static final int TYPE = 45;

	@Override
	public int getType() {
		return TYPE;
	}

	@Override
	public void unmarshal() throws Exception {
		// nothing to do
	}
	
	@Override
	public String toString() {
		return "Acknowledgment";
	}

}
