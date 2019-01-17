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
package com.jwebmp.plugins.bs4datetimedropdown;

import com.jwebmp.core.base.angular.AngularAttributes;
import com.jwebmp.core.base.html.Italic;
import com.jwebmp.core.base.html.Span;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap.dropdown.menu.BSDropDownMenuChildren;
import com.jwebmp.plugins.bootstrap.forms.groups.sets.BSComponentInputGroupOptions;
import com.jwebmp.plugins.bootstrap.forms.groups.sets.BSFormInputGroup;
import com.jwebmp.plugins.glyphicons.Glyphicons;

import java.util.Objects;

/**
 * @author GedMarc
 * @since 07 Feb 2017
 */
@ComponentInformation(name = "Bootstrap DateTime Input",
		description = "Displays a drop down with the date time input and a selector for the date time picker ",
		url = "https://github.com/dalelotts/angular-date-time-input",
		wikiUrl = "https://github.com/GedMarc/JWebMP-BSDateTimePickerPlugin/wiki")
public class BSDateTimeDropDownInput
		extends BSDateTimeDropDown
		implements BSDropDownMenuChildren
{


	/**
	 * Any input group options
	 */
	private final BSComponentInputGroupOptions[] inputGroupOptions;
	/**
	 * The input group
	 */
	private BSFormInputGroup inputGroup;
	/**
	 * The actual input component
	 */
	private BSDateTimeInput inputComponent;
	/**
	 * The icon to apply to the input. defaults to glyphicon calendar
	 */
	private String iconClass;

	/**
	 * Creates an input with the given input and options
	 *
	 * @param variableName
	 * @param iconClass
	 * @param inputGroupOptions
	 */
	public BSDateTimeDropDownInput(String variableName, String iconClass, BSComponentInputGroupOptions... inputGroupOptions)
	{
		super(variableName);
		this.iconClass = iconClass;
		this.inputGroupOptions = inputGroupOptions == null ? new BSComponentInputGroupOptions[0] : inputGroupOptions;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof BSDateTimeDropDownInput))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}
		BSDateTimeDropDownInput that = (BSDateTimeDropDownInput) o;
		return Objects.equals(getInputGroup(), that.getInputGroup()) && Objects.equals(getInputComponent(), that.getInputComponent());
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(super.hashCode(), getInputGroup(), getInputComponent());
	}

	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			setNoCaret(true);

			getInputComponent().addAttribute(AngularAttributes.ngModel, getVariableName());
			Span iconSpan = new Span();
			Italic icon = new Italic();
			if (getIconClass() != null)
			{
				iconSpan.add(icon);
				icon.addClass(getIconClass());
				iconSpan.addClass("input-group-addon");
			}
			getInputGroup().add(iconSpan);
			getDropdownButton().add(getInputGroup());

		}
		super.preConfigure();
	}

	/**
	 * Gets the input component. never null
	 *
	 * @return
	 */
	public BSDateTimeInput getInputComponent()
	{
		if (inputComponent == null)
		{
			setInputComponent(new BSDateTimeInput("YYYY-MMM-DD HH:mm:SS", "dummy.date"));
		}
		return inputComponent;
	}

	/**
	 * Sets the input component with the relevant properties
	 *
	 * @param inputComponent
	 */
	public void setInputComponent(BSDateTimeInput inputComponent)
	{
		this.inputComponent = inputComponent;
	}

	/**
	 * Gets the icon class
	 *
	 * @return
	 */
	public String getIconClass()
	{
		return iconClass == null ? Glyphicons.calendar.toString() : iconClass;
	}

	/**
	 * Sets the icon class
	 *
	 * @param iconClass
	 */
	public void setIconClass(String iconClass)
	{
		this.iconClass = iconClass;
	}

	/**
	 * The input group required
	 *
	 * @return
	 */
	public BSFormInputGroup getInputGroup()
	{
		if (inputGroup == null)
		{
			inputGroup = new BSFormInputGroup(getInputComponent(), inputGroupOptions);
		}
		return inputGroup;
	}

	/**
	 * Sets the input group required
	 *
	 * @param inputGroup
	 */
	public void setInputGroup(BSFormInputGroup inputGroup)
	{
		this.inputGroup = inputGroup;
	}
}
