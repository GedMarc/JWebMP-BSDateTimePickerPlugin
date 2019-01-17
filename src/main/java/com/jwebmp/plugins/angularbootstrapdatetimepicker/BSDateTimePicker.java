/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.angularbootstrapdatetimepicker;

import com.jwebmp.core.base.angular.AngularAttributes;
import com.jwebmp.plugins.bootstrap.dropdown.menu.BSDropDownMenuChildren;
import com.jwebmp.plugins.bootstrap.forms.controls.BSInput;

/**
 * An implementation of
 * <p>
 *
 * @param <J>
 *
 * @author GedMarc
 * @version 1.0
 * @since 17 Jan 2017
 */
public class BSDateTimePicker<J extends BSDateTimePicker>
		extends BSInput//<BSDateTimePickerChildren, BSDateTimePickerAttributes, BSDateTimePickerFeatures, BSDateTimePickerEvents, J>
		implements BSDropDownMenuChildren
{


	/**
	 * The associated feature
	 */
	private BSDateTimePickerFeature feature;

	/**
	 * Constructs a new instance
	 *
	 * @param variableName
	 */
	public BSDateTimePicker(String variableName)
	{
		setTag("datetimepicker");
		addAttribute(AngularAttributes.ngModel, variableName);
	}

	/**
	 * Sets this picker as required
	 *
	 * @param required
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setRequired(boolean required)
	{
		addAttribute(AngularAttributes.ngRequired, Boolean.toString(required));
		return (J) this;
	}

	/**
	 * Returns the options if any is required
	 *
	 * @return
	 */
	@Override
	public BSDateTimePickerOptions getOptions()
	{
		return getFeature().getOptions();
	}

	/**
	 * Returns the feature if any is required
	 *
	 * @return
	 */
	public final BSDateTimePickerFeature getFeature()
	{
		if (feature == null)
		{
			feature = new BSDateTimePickerFeature(this);
		}
		return feature;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj == null)
		{
			return false;
		}
		if (getClass() != obj.getClass())
		{
			return false;
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode()
	{
		int hash = 7;
		hash = 79 * hash + (getID().hashCode());
		return hash;
	}

}
