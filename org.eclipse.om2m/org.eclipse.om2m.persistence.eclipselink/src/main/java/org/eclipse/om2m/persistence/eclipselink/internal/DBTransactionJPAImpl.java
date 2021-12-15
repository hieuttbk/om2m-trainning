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
package org.eclipse.om2m.persistence.eclipselink.internal;

import javax.persistence.EntityManager;
import javax.persistence.LockModeType;

import org.eclipse.om2m.persistence.service.DBTransaction;

public class DBTransactionJPAImpl implements DBTransaction {
	
	private EntityManager em ;

	/** Constructor */
	public DBTransactionJPAImpl() {
	}

	@Override
	public void open() {
		if (em == null) {
			em = DBServiceJPAImpl.createEntityManager();
		}
		em.getTransaction().begin();
	}

	@Override
	public void commit() {
		em.getTransaction().commit();
	}

	@Override
	public void close() {
		em.close();
		em = null;
	}

	@Override
	public void clear() {
		em.clear();
	}

	public EntityManager getEm() {
		return em;
	}
	
	@Override
	public void lock(Object object) {
		em.lock(object, LockModeType.PESSIMISTIC_WRITE);
	}
	
	@Override
	public void unlock(Object object) {
		em.lock(object, LockModeType.NONE);
	}

}
