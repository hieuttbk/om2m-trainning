/*******************************************************************************
* Copyright (c) 2014-2018 Orange.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License 2.0
* which accompanies this distribution, and is available at
* https://www.eclipse.org/legal/epl-2.0/
*
* Contributors:
*    BAREAU Cyrille <cyrille.bareau@orange.com>
*    BONNARDEL Gregory <gbonnardel.ext@orange.com>
*    BORAWSKI Pawel <pawel.borawski@orange.com>
*    RATUSZEK Przemyslaw <przemyslaw.ratuszek@orange.com>
*    WIERZBOWSKI Jacek <jacek.wierzbowski@orange.com>
*******************************************************************************/
package org.eclipse.om2m.hue.impl;

import org.eclipse.om2m.hue.api.types.LightState;

public class PendingStateChangeRequest {

	private int group;
	private LightState lightState;
	
	// ====================================================================================
	
	public PendingStateChangeRequest(final int group, final LightState state) {
		this.group = group;
		this.lightState = state;
	}

	// ====================================================================================
	
	/**
	 * @return the requestGroup
	 */
	public int getRequestGroup() {
		return group;
	}

	/**
	 * @param group the requestGroup to set
	 */
	public void setRequestGroup(final int group) {
		this.group = group;
	}

	/**
	 * @return the lightState
	 */
	public LightState getLightState() {
		return lightState;
	}

	/**
	 * @param lightState the lightState to set
	 */
	public void setLightState(final LightState pendingLightState) {
		this.lightState = pendingLightState;
	}
	
}
