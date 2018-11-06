import com.jwebmp.core.base.angular.services.IAngularModule;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.angularbootstrapdatetimepicker.BSDateTimePickerAngularModule;
import com.jwebmp.plugins.bs4datetimedropdown.BSDateTimePageConfigurator;
import com.jwebmp.plugins.bs4datetimedropdown.BSDateTimePickerInputAngularModule;
import com.jwebmp.plugins.bs4datetimedropdown.implementations.BSDateTimePickerExclusionsModule;

module com.jwebmp.plugins.angularbootstrapdatetimepicker {
	exports com.jwebmp.plugins.angularbootstrapdatetimepicker;
	exports com.jwebmp.plugins.bs4datetimedropdown;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires com.jwebmp.plugins.bootstrap;
	requires com.jwebmp.plugins.glyphicons;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with BSDateTimePageConfigurator;
	provides IAngularModule with BSDateTimePickerInputAngularModule, BSDateTimePickerAngularModule;

	provides IGuiceScanModuleExclusions with BSDateTimePickerExclusionsModule;
	provides IGuiceScanJarExclusions with BSDateTimePickerExclusionsModule;

	opens com.jwebmp.plugins.angularbootstrapdatetimepicker to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bs4datetimedropdown to com.fasterxml.jackson.databind, com.jwebmp.core;
}
