/*******************************************************************************
 * Copyright (c) 2013-2020 LAAS-CNRS (www.laas.fr)
 * 7 Colonel Roche 31077 Toulouse - France
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Initial Contributors:
 *     Thierry Monteil : Project manager, technical co-manager
 *     Mahdi Ben Alaya : Technical co-manager
 *     Samir Medjiah : Technical co-manager
 *     Khalil Drira : Strategy expert
 *     Guillaume Garzone : Developer
 *     François Aïssaoui : Developer
 *
 * New contributors :
 *******************************************************************************/
package org.eclipse.om2m.core.datamapper;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.om2m.datamapping.service.DataMapperService;

/**
 * This class gathers the DataMapper Services discovered in the OSGi container
 *
 */
public class DataMapperSelector {
	/** Map of Data Mapper Services */
	private static Map<String, DataMapperService> dataMapperList = new HashMap<String, DataMapperService>();

	/**
	 * Get the Data mapper list
	 * 
	 * @return the data mapper list
	 */
	public static Map<String, DataMapperService> getDataMapperList() {
		return dataMapperList;
	}

}
