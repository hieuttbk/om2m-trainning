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
package org.eclipse.om2m.webapp.resourcesbrowser.json;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class WelcomeServlet extends HttpServlet {
    /** Serial Version UID */
    private static final long serialVersionUID = 1L;
    private Activator activator = null;
    
    public WelcomeServlet(Activator _a) {
		this.activator = _a;
	}
    
	@Override
    protected void service(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
		String cseBaseContext = (System.getProperty("org.eclipse.om2m.cseBaseContext", "/om2m").equals("/") ?
    			"/~":System.getProperty("org.eclipse.om2m.cseBaseContext", "/om2m") + "/~");
		httpServletResponse.sendRedirect(this.activator.globalContext+activator.uiContext+activator.sep+"welcome/index.html?context="+System.getProperty("org.eclipse.om2m.globalContext","")+cseBaseContext+"&"+"cseId="+System.getProperty("org.eclipse.om2m.cseBaseId", "in-cse")); //dgo
    }
}
