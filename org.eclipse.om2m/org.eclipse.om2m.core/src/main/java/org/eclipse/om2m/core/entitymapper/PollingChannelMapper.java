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
package org.eclipse.om2m.core.entitymapper;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.om2m.commons.entities.PollingChannelEntity;
import org.eclipse.om2m.commons.resource.ChildResourceRef;
import org.eclipse.om2m.commons.resource.PollingChannel;

public class PollingChannelMapper extends
		EntityMapper<PollingChannelEntity, PollingChannel> {

	@Override
	protected PollingChannel createResource() {
		return new PollingChannel();
	}

	@Override
	protected void mapAttributes(PollingChannelEntity entity,
			PollingChannel resource, int level, int offset) {
		
		if (level < 0) {
			return;
		}
		
		// regular resource attributes
		// expiration time
		resource.setExpirationTime(entity.getExpirationTime());

		// polling channel attributes
		if (entity.getPollingChannelUri() != null) {
			resource.setPollingChannelURI(entity.getPollingChannelUri());
		}
	}
	
	@Override
	protected List<ChildResourceRef> getChildResourceRef(PollingChannelEntity entity, int level, int offset) {
		return new ArrayList<>();
	}

	@Override
	protected void mapChildResourceRef(PollingChannelEntity entity,
			PollingChannel resource, int level, int offset) {
	}

	@Override
	protected void mapChildResources(PollingChannelEntity entity,
			PollingChannel resource, int level, int offset) {
	}

}
