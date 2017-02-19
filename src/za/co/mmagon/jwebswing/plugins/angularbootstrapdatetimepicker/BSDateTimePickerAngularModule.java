/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.angularbootstrapdatetimepicker;

import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.base.angular.modules.AngularModuleBase;

/**
 *
 * @author GedMarc
 * @since 27 Jan 2017
 *
 */
public class BSDateTimePickerAngularModule extends AngularModuleBase {

    private static final long serialVersionUID = 1L;

    public BSDateTimePickerAngularModule(ComponentHierarchyBase component) {
        super("ui.bootstrap.datetimepicker");
        component.getJavascriptReferences().add(BSDateTimePickerReferencePool.BootstrapDateTimePickerReference.getJavaScriptReference());
        component.getJavascriptReferences().add(BSDateTimePickerReferencePool.BootstrapDateTimeInputTemplatesReference.getJavaScriptReference());
        component.getJavascriptReferences().add(BSDateTimePickerReferencePool.BootstrapDateTimeInputReference.getJavaScriptReference());
        component.getCssReferences().add(BSDateTimePickerReferencePool.BootstrapDateTimePickerReference.getCssReference());
    }

    @Override
    public String renderFunction() {
        return "";
    }
}
