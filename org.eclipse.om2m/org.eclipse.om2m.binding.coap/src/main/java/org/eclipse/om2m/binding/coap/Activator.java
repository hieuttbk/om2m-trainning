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

package org.eclipse.om2m.binding.coap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.om2m.binding.service.RestClientService;
import org.eclipse.om2m.core.service.CseService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTracker;

public class Activator  implements BundleActivator{
	
	   /** Logger */
	   private static Log LOGGER = LogFactory.getLog(Activator.class);	       
	   /** SCL service tracker */
	   private ServiceTracker<Object, Object> cseServiceTracker;	    
	   /**the coap server*/
	   CoapServer server;

	   public void start(BundleContext bundleContext) throws Exception {
	    	
	    	// Register the Rest CoAP Client 
	        LOGGER.info("Register CoAP RestClientService..");
	        bundleContext.registerService(RestClientService.class.getName(), new CoapClient(), null);
	        
	    	// Start the CoAP server 
	        LOGGER.info("Starting CoAP server");
	        server= new CoapServer();
	        server.startServer();

	        // Track the SCL service
	        cseServiceTracker = new ServiceTracker<Object, Object>(bundleContext, CseService.class.getName(), null) {
	            public void removedService(ServiceReference<Object> reference, Object service) {
	                LOGGER.info("CSE Service removed");
	                try {
	                    CoapMessageDeliverer.setCse((CseService) service);
	                } catch (IllegalArgumentException e) {
	                    LOGGER.error("Error removing CSE Service",e);
	                }
	            }
	            public Object addingService(ServiceReference<Object> reference) {
	                LOGGER.info("CSE Service discovered");
	                CseService cse = (CseService) this.context.getService(reference);
	                try {
	                    CoapMessageDeliverer.setCse(cse);
	                } catch (Exception e) {
	                    LOGGER.error("Error adding CSE Service",e);

	                }
	                return cse;
	            }
	        };
	        
	        // Open service trackers 
	        cseServiceTracker.open();
	        LOGGER.info("CseService opened");  
	    }
	   
	    @Override
	    public void stop(BundleContext bundleContext) throws Exception {
	    }
}
