/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *******************************************************************************/
package org.eclipse.om2m.sdt.home.netatmo.model;

import java.util.List;

public interface HomeListener {
	
	public void notifyHomeAdded(Home newHome);
	
	public void notifyCameraAddedOrUpdated(Home home, WelcomeCamera camera, boolean updated);

	public void notifyPersonAddedOrUpdated(Home home, Person person, boolean updated);
	
	public void notifyEventsUpdated(Home home, List<Event> events);
	
	public void notifyWeatherStationAddedOrUpdated(WeatherStation ws, boolean updated);
}
