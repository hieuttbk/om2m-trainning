/*
********************************************************************************
 * Copyright (c) 2014, 2018 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 ********************************************************************************

ModuleClass : LockAnnc

This ModuleClass provides the function to lock and unlock an object. 

Created: 2018-06-29 17:19:52
*/

package org.eclipse.om2m.commons.resource.flexcontainerspec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.om2m.commons.resource.AbstractFlexContainerAnnc;

@XmlRootElement(name = LockFlexContainerAnnc.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = LockFlexContainerAnnc.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
public class LockFlexContainerAnnc extends AbstractFlexContainerAnnc {
	
	public static final String LONG_NAME = "lockAnnc";
	public static final String SHORT_NAME = "lockAnnc";
	
	public LockFlexContainerAnnc () {
		setContainerDefinition("org.onem2m.home.moduleclass." + LockFlexContainer.LONG_NAME);
		setLongName(LONG_NAME);
		setShortName(SHORT_NAME);
	}
		
	public void finalizeSerialization() {
	}
	
	public void finalizeDeserialization() {
	}
	
	
}
