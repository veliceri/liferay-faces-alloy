/**
 * Copyright (c) 2000-2016 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.liferay.faces.alloy.taglib;

/**
 * @author  Neil Griffin
 */
public class AUIListTag extends AUIComponentELTag {

	@Override
	public String getComponentType() {
		return "com.liferay.faces.alloy.AUIList";
	}

	@Override
	public String getRendererType() {
		return "com.liferay.faces.alloy.renderkit.internal.ListRenderer";
	}

}