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
	requires com.jwebmp.core.angularjs;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.bs4datetimedropdown.BSDateTimePageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularModule with com.jwebmp.plugins.bs4datetimedropdown.BSDateTimePickerInputAngularModule, com.jwebmp.plugins.angularbootstrapdatetimepicker.BSDateTimePickerAngularModule;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.bs4datetimedropdown.implementations.BSDateTimePickerExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.bs4datetimedropdown.implementations.BSDateTimePickerExclusionsModule;

	opens com.jwebmp.plugins.angularbootstrapdatetimepicker to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bs4datetimedropdown to com.fasterxml.jackson.databind, com.jwebmp.core;
}
