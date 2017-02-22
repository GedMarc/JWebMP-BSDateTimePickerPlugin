/*
 * Copyright 2017 GedMarc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package za.co.mmagon.jwebswing.plugins.angularbootstrapdatetimedropdown;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;

/**
 *
 * @author GedMarc
 * @since 22 Feb 2017
 *
 */
@PluginInformation(pluginName = "Bootstrap Angular Date Time Picker", pluginUniqueName = "bootstrap-datepicker", pluginDescription = "Native AngularJS datetime picker directive styled by Twitter Bootstrap", pluginVersion = "Bootstrap version 3 or 4",
        pluginDependancyUniqueIDs = "jquery,bootstrap,angular,moment", pluginCategories = "bootstrap,web ui,ui,framework,date picker", pluginSubtitle = "",
        pluginGitUrl = "https://github.com/GedMarc/JWebSwing-BSDateTimePickerPlugin", pluginSourceUrl = "https://dalelotts.github.io/angular-bootstrap-datetimepicker/",
        pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-BSDateTimePickerPlugin/wiki")
public class BSDateTimePageConfigurator extends PageConfigurator
{

    public static final String BSDateTimeEnabled = "bs-datetime-enabled";
    private static final long serialVersionUID = 1L;

    public BSDateTimePageConfigurator()
    {

    }

    @Override
    public Page configure(Page page)
    {
        if (!page.isConfigured())
        {
            if (page.getBody().readChildrenPropertyFirstResult(BSDateTimeEnabled, true))
            {

            }
        }

        return page;
    }
}
