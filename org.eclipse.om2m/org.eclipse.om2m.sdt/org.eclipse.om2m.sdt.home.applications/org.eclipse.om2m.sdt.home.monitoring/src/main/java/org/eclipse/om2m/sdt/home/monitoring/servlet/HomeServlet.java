/*******************************************************************************
 * Copyright (c) 2013-2020 LAAS-CNRS (www.laas.fr)
 * 7 Colonel Roche 31077 Toulouse - France
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *     Thierry Monteil (Project co-founder) - Management and initial specification,
 *         conception and documentation.
 *     Mahdi Ben Alaya (Project co-founder) - Management and initial specification,
 *         conception, implementation, test and documentation.
 *     Christophe Chassot - Management and initial specification.
 *     Khalil Drira - Management and initial specification.
 *     Yassine Banouar - Initial specification, conception, implementation, test
 *         and documentation.
 ******************************************************************************/
package org.eclipse.om2m.sdt.home.monitoring.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.om2m.sdt.home.monitoring.util.Constants;
import org.eclipse.om2m.sdt.home.monitoring.util.FileUtil;
import org.eclipse.om2m.sdt.home.monitoring.util.HttpSessionHelper;

public class HomeServlet extends HttpServlet {
	
	private static Log LOGGER = LogFactory.getLog(HomeServlet.class);

	private static final long serialVersionUID = 1L;

	public HomeServlet() {
	}

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// check session
		LOGGER.info("home " + request.getParameterMap());
		
		HttpSession session = request.getSession();
		HttpSessionHelper sessionHelper = new HttpSessionHelper(session);
		boolean authenticatedUser = sessionHelper.getAuthenticatedUser();
		if ((session != null) && authenticatedUser) {
			response.setHeader("Set-Cookie", "JSESSIONID=" + System.currentTimeMillis() + ";Path=/");
			response.sendRedirect("/" + Constants.APPNAME);
		} else {
			String redirect = Constants.WEBAPPS + "login.html";
			String name = request.getParameter(Constants.NAME);
			String password = request.getParameter(Constants.PASSWORD);
			if (! (FileUtil.isEmpty(name) || FileUtil.isEmpty(password))) {
				redirect += "?" + Constants.NAME + "=" + name 
						+ "&" + Constants.PASSWORD + "=" + password;
			}
			response.sendRedirect(redirect);	
		}
	}

}
