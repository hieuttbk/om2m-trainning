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
package org.eclipse.om2m.persistence.eclipselink.internal.util;

import org.eclipse.om2m.persistence.eclipselink.internal.dao.CreatedAnnouncedResourceDAO;
import org.eclipse.om2m.persistence.service.util.AnnouncedResourceUtil;
import org.eclipse.om2m.persistence.service.util.ComplexFindUtil;
import org.eclipse.om2m.persistence.service.util.DBUtilManager;
import org.eclipse.om2m.persistence.service.util.DynamicAuthorizationConsultationUtil;


public class DBUtilManagerImpl implements DBUtilManager{

	@Override
	public ComplexFindUtil getComplexFindUtil() {
		return new ComplexFindUtilImpl();
	}
	
	@Override
	public AnnouncedResourceUtil getAnnouncedResourceUtil() {
		return new CreatedAnnouncedResourceDAO();
	}
	
	@Override
	public DynamicAuthorizationConsultationUtil getDynamicAuthorizationConsultationUtil() {
		return new DynamicAuthorizationConsultationUtilImpl();
	}
	
}
