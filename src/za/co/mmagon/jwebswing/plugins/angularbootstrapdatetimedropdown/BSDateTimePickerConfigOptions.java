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
package za.co.mmagon.jwebswing.plugins.angularbootstrapdatetimedropdown;

import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

/**
 *
 * @author GedMarc
 * @since 07 Feb 2017
 *
 */
public class BSDateTimePickerConfigOptions extends JavaScriptPart
{

    private static final long serialVersionUID = 1L;
    /**
     * The actual drop down selector
     */
    private String dropdownSelector;
    /**
     * startView
     * <p>
     * String. Default: 'day'
     * <p>
     * The view that the datetimepicker should show when it is opened. Accepts values of :
     * <p>
     * 'minute' for the minute view 'hour' for the hour view 'day' for the day view (the default) 'month' for the 12-month view 'year' for the 10-year overview. Useful for date-of-birth
     * datetimepickers.
     * <p>
     */
    private String startView;
    /**
     * minView
     * <p>
     * String. 'minute'
     * <p>
     * The lowest view that the datetimepicker should show.
     * <p>
     * Accepts the same values as startView.
     */
    private String minView;
    /**
     * minuteStep
     * <p>
     * Number. Default: 5
     * <p>
     * The increment used to build the hour view. A button is created for each minuteStep minutes.
     */
    private Integer minuteStep;

    public BSDateTimePickerConfigOptions()
    {
    }

    /**
     * The id the selector (with #)
     *
     * @return
     */
    public String getDropdownSelector()
    {
        return dropdownSelector;
    }

    /**
     * Sets the drop down selector directly (for class assignment etc)
     *
     * @param dropdownSelector
     *
     * @return
     */
    public BSDateTimePickerConfigOptions setDropdownSelector(String dropdownSelector)
    {
        this.dropdownSelector = dropdownSelector;
        return this;
    }

    /**
     * Sets the drop down selector to a component
     *
     * @param dropdownSelector
     *
     * @return
     */
    public BSDateTimePickerConfigOptions setDropdownSelector(ComponentHierarchyBase dropdownSelector)
    {
        this.dropdownSelector = dropdownSelector.getID(true);
        return this;
    }

    /**
     * startView
     * <p>
     * String. Default: 'day'
     * <p>
     * The view that the datetimepicker should show when it is opened. Accepts values of :
     * <p>
     * 'minute' for the minute view 'hour' for the hour view 'day' for the day view (the default) 'month' for the 12-month view 'year' for the 10-year overview. Useful for date-of-birth
     * datetimepickers.
     *
     * @return
     */
    public String getStartView()
    {
        return startView;
    }

    /**
     * startView
     * <p>
     * String. Default: 'day'
     * <p>
     * The view that the datetimepicker should show when it is opened. Accepts values of :
     * <p>
     * 'minute' for the minute view 'hour' for the hour view 'day' for the day view (the default) 'month' for the 12-month view 'year' for the 10-year overview. Useful for date-of-birth
     * datetimepickers.
     *
     * @param startView
     */
    public void setStartView(String startView)
    {
        this.startView = startView;
    }

    /**
     * minView
     * <p>
     * String. 'minute'
     * <p>
     * The lowest view that the datetimepicker should show.
     * <p>
     * Accepts the same values as startView.
     *
     * @return
     */
    public String getMinView()
    {
        return minView;
    }

    /**
     * minView
     * <p>
     * String. 'minute'
     * <p>
     * The lowest view that the datetimepicker should show.
     * <p>
     * Accepts the same values as startView.
     *
     * @param minView
     */
    public void setMinView(String minView)
    {
        this.minView = minView;
    }

    /**
     * minuteStep
     * <p>
     * Number. Default: 5
     * <p>
     * The increment used to build the hour view. A button is created for each minuteStep minutes.
     *
     * @return
     */
    public Integer getMinuteStep()
    {
        return minuteStep;
    }

    /**
     * minuteStep
     * <p>
     * Number. Default: 5
     * <p>
     * The increment used to build the hour view. A button is created for each minuteStep minutes.
     *
     * @param minuteStep
     */
    public void setMinuteStep(Integer minuteStep)
    {
        this.minuteStep = minuteStep;
    }

}
