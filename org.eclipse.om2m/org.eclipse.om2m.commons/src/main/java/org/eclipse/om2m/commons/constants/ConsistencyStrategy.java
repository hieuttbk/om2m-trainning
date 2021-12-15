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
package org.eclipse.om2m.commons.constants;

import java.math.BigInteger;

/**
 * Constants for group Consistency Strategy
 * 
 *
 */
public class ConsistencyStrategy {

	/** BigInteger constant for Consistency Strategy ABANDON_MEMBER */
	public static final BigInteger ABANDON_MEMBER = BigInteger.valueOf(1);
	/** BigInteger constant for Consistency Strategy ABANDON_GROUP */
	public static final BigInteger ABANDON_GROUP = BigInteger.valueOf(2);
	/** BigInteger constant for Consistency Strategy SET_MIXED */
	public static final BigInteger SET_MIXED = BigInteger.valueOf(3);

}
