import com.jwebmp.core.base.angular.services.IAngularModule;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.angularbootstrapdatetimepicker.BSDateTimePickerAngularModule;
import com.jwebmp.plugins.bs4datetimedropdown.BSDateTimePageConfigurator;
import com.jwebmp.plugins.bs4datetimedropdown.BSDateTimePickerInputAngularModule;

module com.jwebmp.plugins.angularbootstrapdatetimepicker {
	exports com.jwebmp.plugins.angularbootstrapdatetimepicker;
	exports com.jwebmp.plugins.bs4datetimedropdown;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires com.jwebmp.plugins.bootstrap;
	requires com.jwebmp.plugins.glyphicons;

	provides IPageConfigurator with BSDateTimePageConfigurator;
	provides IAngularModule with BSDateTimePickerInputAngularModule, BSDateTimePickerAngularModule;

}
