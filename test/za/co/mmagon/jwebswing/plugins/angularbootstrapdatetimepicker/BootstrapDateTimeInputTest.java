/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.angularbootstrapdatetimepicker;

import org.junit.Test;
import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.plugins.angularbootstrapdatetimeinput.BSDateTimeInput;

/**
 *
 * @author GedMarc
 */
public class BootstrapDateTimeInputTest
{

    public BootstrapDateTimeInputTest()
    {
    }

    @Test
    public void testSomeMethod()
    {
        BSDateTimeInput bis = new BSDateTimeInput("YYYY-MM-DD", "data.date");
        System.out.println(bis.toString(true));

        Page p = new Page();
        p.getBody().add(bis);
        p.getOptions().setDynamicRender(false);

        System.out.println(p.toString(true));
    }

    @Test
    public void testDateInputOutput()
    {
        BSDateTimeInput bis = new BSDateTimeInput("YYYY-MM-DD", "data.date");
        System.out.println(bis.toString(true));

        Page p = new Page();
        p.getBody().add(bis);

        System.out.println(p.toString(true));
    }

}
