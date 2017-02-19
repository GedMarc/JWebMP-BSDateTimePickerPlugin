/*
 * Copyright 2017 GedMarc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package za.co.mmagon.jwebswing.plugins.angularbootstrapdatetimedropdown;

import za.co.mmagon.jwebswing.base.angular.AngularAttributes;
import za.co.mmagon.jwebswing.base.html.Italic;
import za.co.mmagon.jwebswing.base.html.Span;
import za.co.mmagon.jwebswing.components.bootstrap.Glyphicons;
import za.co.mmagon.jwebswing.components.bootstrap.dropdown.menu.BSDropDownMenuChildren;
import za.co.mmagon.jwebswing.components.bootstrap.forms.groups.sets.BSComponentInputGroupOptions;
import za.co.mmagon.jwebswing.components.bootstrap.forms.groups.sets.BSFormInputGroup;
import za.co.mmagon.jwebswing.plugins.angularbootstrapdatetimeinput.BSDateTimeInput;

/**
 *
 * @author GedMarc
 * @since 07 Feb 2017
 *
 */
public class BSDateTimeDropDownInput
        extends BSDateTimeDropDown implements BSDropDownMenuChildren
{

    private static final long serialVersionUID = 1L;
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
     * Any input group options
     */
    private final BSComponentInputGroupOptions[] inputGroupOptions;

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

    /**
     * The input group required
     *
     * @return
     */
    public BSFormInputGroup getInputGroup()
    {
        if (inputGroup == null)
        {
            this.inputGroup = new BSFormInputGroup(getInputComponent(), inputGroupOptions);
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

    /**
     * Gets the icon class
     *
     * @return
     */
    public String getIconClass()
    {
        return iconClass == null ? Glyphicons.glyphicon_calendar.toString() : iconClass;
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
     * Gets the input component. never null
     *
     * @return
     */
    public BSDateTimeInput getInputComponent()
    {
        if (inputComponent == null)
        {
            setInputComponent(new BSDateTimeInput("YYYY-MMM-DD HH:mm:SS"));
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

    @Override
    public void preConfigure()
    {
        if (!isConfigured())
        {
            getInputComponent().addAttribute(AngularAttributes.ngModel, getVariableName());
            Span iconSpan = new Span();
            Italic icon = new Italic();
            if (getIconClass() != null)
            {
                iconSpan.add(icon);
                icon.addClass(getIconClass());
                //iconSpan.addClass(BSComponentInputGroupOptions.Input_Group_Addon.toString());
                iconSpan.addClass("btn btn-outline-success");
                iconSpan.addClass("rounded-0");
                iconSpan.addClass("rounded-right");
                iconSpan.addAttribute("style", "line-height:2;");
            }
            getInputGroup().add(iconSpan);
            getDropdownButton().removeClass("btn");
            getDropdownButton().add(getInputGroup());

        }
        super.preConfigure();
    }

}
