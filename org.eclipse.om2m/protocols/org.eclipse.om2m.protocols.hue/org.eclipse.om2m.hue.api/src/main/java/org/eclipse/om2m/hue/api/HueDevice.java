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
*******************************************************************************/
package org.eclipse.om2m.hue.api;

import java.util.Dictionary;

/**
 * Parent class for both Bridge ({@link HueBridgeDevice}) and Light ({@link HueLightDevice}) Hue devices.
 */
public interface HueDevice {

	/**
	 * OSGi service properties
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	Dictionary getProperties();

	/**
	 * XML description of the Hue device
	 * @return
	 */
	String getXmlDescription();

}
