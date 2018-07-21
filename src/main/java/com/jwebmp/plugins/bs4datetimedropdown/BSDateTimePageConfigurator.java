/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.bs4datetimedropdown;

import com.jwebmp.core.Page;
import com.jwebmp.core.PageConfigurator;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.plugins.angularbootstrapdatetimepicker.BSDateTimePickerAngularModule;

/**
 * @author GedMarc
 * @since 22 Feb 2017
 */
@PluginInformation(pluginName = "BS Date Time Picker",
		pluginUniqueName = "bootstrap-datepicker",
		pluginDescription = "Native AngularJS datetime picker directive styled by Twitter Bootstrap",
		pluginVersion = "BS 3.3.7 / 4a6",
		pluginDependancyUniqueIDs = "jquery,bootstrap,angular,moment,glyphicons",
		pluginCategories = "bootstrap,web ui,ui,framework,date picker",
		pluginSubtitle = "A Bootstrap Date Time Picker controlled by Angular for intuitive data transfer and customized calendar templates.",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-BSDateTimePickerPlugin",
		pluginSourceUrl = "https://dalelotts.github.io/angular-bootstrap-datetimepicker/",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-BSDateTimePickerPlugin/wiki",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/BSDateTimePickerPlugin.jar/download",
		pluginIconUrl = "bower_components/angular-bootstrap-datetimepicker/date_time_picker_icon.png",
		pluginIconImageUrl = "bower_components/angular-bootstrap-datetimepicker/date_time_picker_logo.jpg",
		pluginLastUpdatedDate = "2017/03/04")
public class BSDateTimePageConfigurator
		extends PageConfigurator
{

	public static final String BSDateTimeEnabled = "bs-datetime-enabled";
	private static final long serialVersionUID = 1L;

	public BSDateTimePageConfigurator()
	{
		//Nothing needed
	}

	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			page.getAngular()
			    .getAngularModules()
			    .add(new BSDateTimePickerAngularModule(page.getBody()));
			page.getAngular()
			    .getAngularModules()
			    .add(new BSDateTimePickerInputAngularModule(page.getBody()));

		}
		return page;
	}
}
