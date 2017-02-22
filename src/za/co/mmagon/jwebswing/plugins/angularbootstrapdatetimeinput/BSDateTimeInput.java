package za.co.mmagon.jwebswing.plugins.angularbootstrapdatetimeinput;

import za.co.mmagon.jwebswing.base.angular.AngularPageConfigurator;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.controls.BSInput;
import za.co.mmagon.jwebswing.plugins.moment.MomentAngularModule;

/**
 *
 * @author GedMarc
 * @param <J>
 *
 * @since 27 Jan 2017
 *
 */
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
        getAngularModules().add(new MomentAngularModule(this));
        getAngularModules().add(new BSDateTimePickerInputAngularModule(this));
        AngularPageConfigurator.setAngularRequired(this, true);
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
