package za.co.mmagon.jwebswing.plugins.angularbootstrapdatetimeinput;

import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.base.angular.modules.AngularModuleBase;
import za.co.mmagon.jwebswing.plugins.angularbootstrapdatetimepicker.BSDateTimePickerReferencePool;

/**
 *
 * @author GedMarc
 * @since 27 Jan 2017
 *
 */
public class BSDateTimePickerInputAngularModule extends AngularModuleBase
{

    private static final long serialVersionUID = 1L;

    public BSDateTimePickerInputAngularModule(ComponentHierarchyBase page)
    {
        super("ui.dateTimeInput");
        page.getJavascriptReferences().add(BSDateTimePickerReferencePool.BootstrapDateTimeInputReference.getJavaScriptReference());
    }

    @Override
    public String renderFunction()
    {
        return "";
    }
}
