/*******************************************************************************
 *  Copyright (c) 2013-2020 LAAS-CNRS (www.laas.fr)
 *  7 Colonel Roche 31077 Toulouse - France
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *  
 *  Initial Contributors:
 *      Thierry Monteil : Project manager, technical co-manager
 *      Mahdi Ben Alaya : Technical co-manager
 *      Samir Medjiah : Technical co-manager
 *      Khalil Drira : Strategy expert
 *      Guillaume Garzone : Developer
 *      François Aïssaoui : Developer
 *
 *   New contributors :
 *******************************************************************************/
package org.eclipse.om2m.binding.mqtt.util;

import org.eclipse.om2m.commons.resource.ResponsePrimitive;

public final class Utils {

	public static void fillPrimitiveContent(){
		
	}
	
	public static void fillContent(ResponsePrimitive requestPrimitive){
		if(requestPrimitive.getPrimitiveContent() != null && 
				!requestPrimitive.getPrimitiveContent().getAny().isEmpty() && 
				requestPrimitive.getContent() == null){
			requestPrimitive.setContent(requestPrimitive.getPrimitiveContent().getAny().get(0));
		}
	}
	
}
