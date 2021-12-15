/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *******************************************************************************/
package org.eclipse.om2m.core.entitymapper;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.om2m.commons.entities.DynamicAuthorizationConsultationEntity;
import org.eclipse.om2m.commons.resource.ChildResourceRef;
import org.eclipse.om2m.commons.resource.DynamicAuthorizationConsultation;

public class DynamicAuthorizationConsultationMapper extends EntityMapper<DynamicAuthorizationConsultationEntity, DynamicAuthorizationConsultation> {

	@Override
	protected void mapAttributes(DynamicAuthorizationConsultationEntity entity,
			DynamicAuthorizationConsultation resource, int level, int offset) {
		if (level < 0) {
			return;
		}
		
		// regularResource mapper
		EntityMapperFactory.getRegularResourceMapper().mapAttributes(entity, resource, level, offset);
		
		
		// dynamicAuthorizationEnabled
		resource.setDynamicAuthorizationEnabled(entity.getDynamicAuthorizationEnabled());
		
		// dynamicAuthorizationPoA
		resource.getDynamicAuthorisationPoA().addAll(entity.getDynamicAuthorizationPoA());
		
		// dynamicAuthorizationLifetime
		resource.setDynamicAuthorizationLifetime(entity.getDynamicAuthorizationLifetime());
	}

	@Override
	protected List<ChildResourceRef> getChildResourceRef(DynamicAuthorizationConsultationEntity entity, int level, int offset) {
		return new ArrayList<>();
	}
	
	@Override
	protected void mapChildResourceRef(DynamicAuthorizationConsultationEntity entity,
			DynamicAuthorizationConsultation resource, int level, int offset) {
	}

	@Override
	protected void mapChildResources(DynamicAuthorizationConsultationEntity entity,
			DynamicAuthorizationConsultation resource, int level, int offset) {
	}

	@Override
	protected DynamicAuthorizationConsultation createResource() {
		return new DynamicAuthorizationConsultation();
	}

}
