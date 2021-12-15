/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *******************************************************************************/
package org.eclipse.om2m.sdt.home.lifx.impl.lan.frame;

public class LIFXPayloadFactory {
	
	public static LIFXPayload getLIFXPayload(int type, byte[] payload) throws Exception {
		LIFXPayload lifxPayload = null;
		switch (type) {
		case LIFXPayloadStateService.TYPE:
			lifxPayload = new LIFXPayloadStateService();
			break;
		case LIFXPayloadState.TYPE:
			lifxPayload = new LIFXPayloadState();
			break;
		case LIFXPayloadSetPower.TYPE:
			lifxPayload = new LIFXPayloadSetPower();
			break;
		case LIFXPayloadStatePower.TYPE:
			lifxPayload = new LIFXPayloadStatePower();
			break;
		case LIFXPayloadAcknowkledgement.TYPE:
			lifxPayload = new LIFXPayloadAcknowkledgement();
		default:
		}
		if (lifxPayload != null) {
			lifxPayload.setPayload(payload);
		}
		return lifxPayload;
	}

}
