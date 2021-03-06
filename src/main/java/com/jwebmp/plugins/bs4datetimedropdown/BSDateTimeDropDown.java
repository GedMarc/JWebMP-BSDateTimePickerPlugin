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

import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.angularbootstrapdatetimepicker.BSDateTimePicker;
import com.jwebmp.plugins.bootstrap.dropdown.BSDropDown;

import java.util.Objects;

/**
 * @author GedMarc
 * @since 07 Feb 2017
 */
@ComponentInformation(name = "Bootstrap DateTime Dropdown",
		description = "Native AngularJS datetime picker directive styled by Twitter Bootstrap",
		url = "https://github.com/dalelotts/angular-bootstrap-datetimepicker",
		wikiUrl = "https://github.com/GedMarc/JWebMP-BSDateTimePickerPlugin/wiki")
public class BSDateTimeDropDown<J extends BSDateTimeDropDown<J>>
		extends BSDropDown<J>
{


	/**
	 * The physical date picker
	 */
	private BSDateTimePicker datePicker;
	/**
	 * The options for the date picker
	 */
	private BSDateTimePickerConfigOptions options;
	/**
	 * The variable name for the picker
	 */
	private String variableName;

	/**
	 * Constructs a new date time drop down bound to the variable name
	 *
	 * @param variableName
	 */
	public BSDateTimeDropDown(String variableName)
	{
		setDatePicker(new BSDateTimePicker(variableName));
		setVariableName(variableName);
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof BSDateTimeDropDown))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}
		BSDateTimeDropDown<?> that = (BSDateTimeDropDown<?>) o;
		return Objects.equals(getDatePicker(), that.getDatePicker()) && Objects.equals(getVariableName(), that.getVariableName());
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(super.hashCode(), getDatePicker(), getVariableName());
	}

	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			getOptions().setDropdownSelector(getDropdownButton());
			getDatePicker().addAttribute("data-datetimepicker-config", getOptions().toString()
			                                                                       .replace('\"', '\'')
			                                                                       .replace("\r", "")
			                                                                       .replace("\n", "")
			                                                                       .replace("\t", "")
			                                                                       .replace("  ", ""));

			addClass("show");

		}

		super.preConfigure();
	}

	/**
	 * Gets the options for this component
	 *
	 * @return
	 */
	@Override
	public BSDateTimePickerConfigOptions getOptions()
	{
		if (options == null)
		{
			options = new BSDateTimePickerConfigOptions();
		}
		return options;
	}

	/**
	 * Sets the options of this component
	 *
	 * @param options
	 */
	public void setOptions(BSDateTimePickerConfigOptions options)
	{
		this.options = options;
	}

	/**
	 * Return the date picker
	 *
	 * @return
	 */
	public BSDateTimePicker getDatePicker()
	{
		if (datePicker == null)
		{
			datePicker = new BSDateTimePicker("");
		}
		return datePicker;
	}

	/**
	 * Sets the date picker
	 *
	 * @param datePicker
	 *
	 * @return
	 */
	public final BSDateTimeDropDown setDatePicker(BSDateTimePicker datePicker)
	{
		if (this.datePicker != null)
		{
			getDropdownMenu().remove(this.datePicker);
		}
		this.datePicker = datePicker;
		if (this.datePicker != null)
		{
			getDropdownMenu().add(this.datePicker);

		}
		return this;
	}

	/**
	 * Gets the variable name for this component
	 *
	 * @return
	 */
	public String getVariableName()
	{
		return variableName;
	}

	/**
	 * Sets the variable name of the component
	 *
	 * @param variableName
	 */
	public void setVariableName(String variableName)
	{
		this.variableName = variableName;
	}
}
