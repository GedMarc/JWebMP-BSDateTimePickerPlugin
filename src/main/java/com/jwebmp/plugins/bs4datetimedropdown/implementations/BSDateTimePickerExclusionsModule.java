package com.jwebmp.plugins.bs4datetimedropdown.implementations;

import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class BSDateTimePickerExclusionsModule
		implements IGuiceScanModuleExclusions<BSDateTimePickerExclusionsModule>,
				           IGuiceScanJarExclusions<BSDateTimePickerExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("jwebmp-bootstrap-date-time-picker-*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.angularbootstrapdatetimepicker");
		return strings;
	}
}
