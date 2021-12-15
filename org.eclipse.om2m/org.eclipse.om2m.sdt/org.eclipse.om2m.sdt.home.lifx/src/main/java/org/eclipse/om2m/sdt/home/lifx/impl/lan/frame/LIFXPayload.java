/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *******************************************************************************/
package org.eclipse.om2m.sdt.home.lifx.impl.lan.frame;

public abstract class  LIFXPayload {

	protected byte[] payload;

	public byte[] getPayload() {
		return payload;
	}

	public void  setPayload(byte[] payload) throws Exception {
		this.payload = payload;
		unmarshal();
	}
	
	public int getPayloadSize() {
		if (payload != null) {
			return payload.length;
		}
		return 0;
	}
	
	public abstract int getType();
	
	public abstract void unmarshal() throws Exception;
	
	public void marshal() {
	}
	
	
	
}
