package za.co.mmagon.jwebswing.plugins.angularbootstrapdatetimeinput;

import za.co.mmagon.jwebswing.components.bootstrap.forms.controls.BSInput;
import za.co.mmagon.jwebswing.components.moment.MomentAngularModule;

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

    public BSDateTimeInput(String dateDisplayFormat)
    {
        addAttribute(BSDateTimeInputAttributes.Date_Time_Input, dateDisplayFormat);
        getAngularModules().add(new MomentAngularModule(this));
        getAngularModules().add(new BSDateTimePickerInputAngularModule(this));
        setLoadAngular(true);
    }
}
