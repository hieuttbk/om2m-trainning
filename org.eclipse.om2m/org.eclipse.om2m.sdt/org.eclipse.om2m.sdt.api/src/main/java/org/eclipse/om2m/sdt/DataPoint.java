/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *******************************************************************************/
package org.eclipse.om2m.sdt;

import org.eclipse.om2m.sdt.types.DataType;

public class DataPoint extends Element {
	
	private boolean optional;
	private boolean readable;
	private boolean writable;
	
	private DataType type;
	
	private Device owner;
	
	private Module parent;
	
	private String longName;
	private String shortName;

	public DataPoint(final Identifiers name, final DataType type) {
		super(name.getShortName());
		if (type == null)
			throw new IllegalArgumentException();
		this.type = type;
		optional = false;
		readable = true;
		writable = true;
		longName = name.getLongName();
		shortName = name.getShortName();
	}

	public DataType getDataType() {
		return type;
	}

	public boolean isOptional() {
		return optional;
	}

	public void setOptional(final boolean optional) {
		this.optional = optional;
	}

	public boolean isReadable() {
		return readable;
	}

	public void setReadable(final boolean readable) {
		this.readable = readable;
	}

	public boolean isWritable() {
		return writable;
	}

	public void setWritable(final boolean writable) {
		this.writable = writable;
	}

	@Override
	protected String prettyPrint(String t1) {
		String t2 = t1 + "\t";
		StringBuffer ret = new StringBuffer(t1).append("<DataPoint name=\"" + getName()
			+ "\" readable=\"" + readable + "\" writable=\"" + writable + "\">");
		if (getDoc() != null) ret.append("\n").append(t2).append(getDoc());
		return ret.append("\n").append(type.prettyPrint(t2))
				.append("\n").append(t1).append("</DataPoint>").toString();
	}

	void setOwner(Device owner) {
		this.owner = owner;
	}

	public Device getOwner() {
		return owner;
	}
	
	void setParent(Module parent) {
		this.parent = parent;
	}

	public Module getParent() {
		return parent;
	}
	
	/**
	 * @return the longName
	 */
	public String getLongName() {
		return longName;
	}

	/**
	 * @return the shortDefinitionType
	 */
	public String getShortName() {
		return shortName;
	}
	
	@Override
	public String toString() {
		return "<" + getClass().getSimpleName() + " name=" + name
				+ " shortName=" + shortName + " longName=" + longName + " type=" + type
				+ "/>";
	}

}
