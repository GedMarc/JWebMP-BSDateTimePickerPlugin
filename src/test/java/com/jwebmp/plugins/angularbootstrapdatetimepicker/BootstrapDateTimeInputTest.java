/*
 * Copyright (C) 2017 GedMarc
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwebmp.plugins.angularbootstrapdatetimepicker;

import com.jwebmp.core.Page;
import com.jwebmp.plugins.bs4datetimedropdown.BSDateTimeInput;
import org.junit.jupiter.api.Test;

/**
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
		p.getBody()
		 .add(bis);
		p.getOptions()
		 .setDynamicRender(false);

		System.out.println(p.toString(true));
	}

	@Test
	public void testDateInputOutput()
	{
		BSDateTimeInput bis = new BSDateTimeInput("YYYY-MM-DD", "data.date");
		System.out.println(bis.toString(true));

		Page p = new Page();
		p.getBody()
		 .add(bis);

		System.out.println(p.toString(true));
	}

}
