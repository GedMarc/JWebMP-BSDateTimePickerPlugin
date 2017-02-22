package za.co.mmagon.jwebswing.plugins.angularbootstrapdatetimeinput;

import za.co.mmagon.jwebswing.base.angular.AngularPageConfigurator;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.angularbootstrapdatetimedropdown.BSDateTimePageConfigurator;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.controls.BSInput;

/**
 *
 * @author GedMarc
 * @param <J>
 *
 * @since 27 Jan 2017
 *
 */
@ComponentInformation(name = "Bootstrap DateTime Input", description = "Allows user input of a date/time value. Valid dates are displayed in specified format, but input may be in any supported format. ",
        url = "https://github.com/dalelotts/angular-date-time-input", wikiUrl = "https://github.com/GedMarc/JWebSwing-BSDateTimePickerPlugin/wiki")
public class BSDateTimeInput<J extends BSDateTimeInput>
        extends BSInput
{

    private static final long serialVersionUID = 1L;

    /**
     * The default date time input with the given display format (required)
     *
     * @param dateDisplayFormat
     * @param variableName
     */
    public BSDateTimeInput(String dateDisplayFormat, String variableName)
    {
        addAttribute(BSDateTimeInputAttributes.Date_Time_Input, dateDisplayFormat);
        AngularPageConfigurator.setAngularRequired(this, true);
        BSDateTimePageConfigurator.setBSDateTimeRequired(this, true);
        bind(variableName);
    }

    /**
     * Sets the display form of this input
     *
     * @param dateDisplayFormat
     * @return
     */
    public J setDisplayForm(String dateDisplayFormat)
    {
        addAttribute(BSDateTimeInputAttributes.Date_Time_Input, dateDisplayFormat);
        return (J) this;
    }
}
