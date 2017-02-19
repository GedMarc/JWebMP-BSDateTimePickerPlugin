package za.co.mmagon.jwebswing.plugins.angularbootstrapdatetimeinput;

import za.co.mmagon.jwebswing.base.html.interfaces.AttributeDefinitions;

/**
 *
 * @author GedMarc
 * @since 27 Jan 2017
 *
 */
public enum BSDateTimeInputAttributes implements AttributeDefinitions
{
    Date_Time_Input,;

    private BSDateTimeInputAttributes()
    {

    }

    @Override
    public String toString()
    {
        return "data-" + super.toString().toLowerCase().replace('_', '-');
    }

    @Override
    public boolean isKeyword()
    {
        return false;
    }

}
