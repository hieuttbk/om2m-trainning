/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *******************************************************************************/
package org.eclipse.om2m.sdt.home.netatmo.model;

public class DetectedPerson {
	
	private final String id;
	private final String personName;
	private long time;
	
	public DetectedPerson(final String pId, final String pPersonName) {
		this.id = pId;
		this.personName = pPersonName;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public String getId() {
		return id;
	}

	public String getPersonName() {
		return personName;
	}

	@Override
	public String toString() {
		return id + ";" + personName + ";" + time;
	}
	
}
