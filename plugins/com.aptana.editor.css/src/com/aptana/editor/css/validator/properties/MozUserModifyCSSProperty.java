/**
 * Aptana Studio
 * Copyright (c) 2005-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the GNU Public License (GPL) v3 (with exceptions).
 * Please see the license.html included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package com.aptana.editor.css.validator.properties;

import org.w3c.css.util.ApplContext;
import org.w3c.css.util.InvalidParamException;
import org.w3c.css.values.CssExpression;

/**
 * -moz-user-modify CSS property implementation.
 * 
 * @author Denis Denisenko
 */
public class MozUserModifyCSSProperty extends CSSFixedSetProperty
{

	private static final String PROPERTY_NAME = "-moz-user-modify"; //$NON-NLS-1$
	private static final String[] VALUES = new String[] { "inherit", "read-only", "read-write", "write-only" }; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$

	/**
	 * @param context
	 *            the current context
	 * @param expression
	 *            the expression to create property from
	 * @param check
	 *            whether to check property value
	 * @throws InvalidParamException
	 *             if expression is invalid
	 */
	public MozUserModifyCSSProperty(ApplContext context, CssExpression expression, boolean check)
			throws InvalidParamException
	{
		super(PROPERTY_NAME, VALUES, context, expression, check);
	}

	/**
	 * @param context
	 *            the current context
	 * @param expression
	 *            the expression to create property from
	 * @throws InvalidParamException
	 *             if expression is invalid
	 */
	public MozUserModifyCSSProperty(ApplContext context, CssExpression expression) throws InvalidParamException
	{
		this(context, expression, false);
	}

	public MozUserModifyCSSProperty()
	{
		super(PROPERTY_NAME, VALUES);
	}
}
