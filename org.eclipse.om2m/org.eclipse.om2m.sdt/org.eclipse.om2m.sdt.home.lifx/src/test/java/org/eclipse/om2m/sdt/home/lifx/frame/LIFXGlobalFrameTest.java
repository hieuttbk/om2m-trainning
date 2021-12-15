/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *******************************************************************************/
package org.eclipse.om2m.sdt.home.lifx.frame;

import org.eclipse.om2m.sdt.home.lifx.impl.lan.frame.LIFXFrame;
import org.eclipse.om2m.sdt.home.lifx.impl.lan.frame.LIFXFrameAddress;
import org.eclipse.om2m.sdt.home.lifx.impl.lan.frame.LIFXGlobalFrame;
import org.eclipse.om2m.sdt.home.lifx.impl.lan.frame.LIFXProtocolHeader;

import junit.framework.TestCase;

public class LIFXGlobalFrameTest extends TestCase {

	public void testNewFrame() throws Exception {
		
		LIFXGlobalFrame globalFrame = new LIFXGlobalFrame();
		
		
		
		globalFrame.setFrame(new LIFXFrame());
		globalFrame.setFrameAddress(new LIFXFrameAddress());
		globalFrame.setProtocolHeader(new LIFXProtocolHeader());
		
		globalFrame.getFrame().setSource(12);
		globalFrame.getFrame().setTagged(true);;
		
		byte[] globalFrameBytes = globalFrame.getBytes();
		for(int i = 0; i < globalFrameBytes.length; i++) {
			System.out.println(globalFrameBytes[i]);
		}
		
		
		
	}
}
