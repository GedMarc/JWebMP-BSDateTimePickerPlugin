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

import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.angularbootstrapdatetimepicker.BSDateTimePicker;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;
import za.co.mmagon.jwebswing.plugins.bootstrap.dropdown.BSDropDown;

/**
 *
 * @author GedMarc
 * @since 07 Feb 2017
 *
 */
@ComponentInformation(name = "Bootstrap DateTime Dropdown", description = "Native AngularJS datetime picker directive styled by Twitter Bootstrap",
        url = "https://github.com/dalelotts/angular-bootstrap-datetimepicker", wikiUrl = "https://github.com/GedMarc/JWebSwing-BSDateTimePickerPlugin/wiki")
public class BSDateTimeDropDown extends BSDropDown
{

    private static final long serialVersionUID = 1L;

    private BSDateTimePicker datePicker;

    private BSDateTimePickerConfigOptions options;

    private String variableName;

    public BSDateTimeDropDown(String variableName)
    {
        setDatePicker(new BSDateTimePicker(variableName));
        this.variableName = variableName;
        BSDateTimePageConfigurator.setBSDateTimeRequired(this, true);
    }

    @Override
    public void preConfigure()
    {
        if (!isConfigured())
        {
            getOptions().setDropdownSelector(getDropdownButton());
            getDatePicker().addAttribute("data-datetimepicker-config", getOptions().toString().replace('\"', '\'').replace("\r", "").replace("\n", "").replace("\t", "").replace("  ", ""));

            if (BootstrapPageConfigurator.isBootstrap4())
            {
                addClass("show");
            }
        }
        super.preConfigure();
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
     * Gets the options for this component
     *
     * @return
     */
    @Override
    public BSDateTimePickerConfigOptions getOptions()
    {
        if (options == null)
        {
            this.options = new BSDateTimePickerConfigOptions();
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
