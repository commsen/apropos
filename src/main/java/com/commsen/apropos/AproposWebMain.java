/*
 * Copyright 2008 COMMSEN International
 *
 * This file is part of APropOS.
 * 
 * APropOS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * APropOS is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with APropOS.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.commsen.apropos;

import org.wings.SFrame;
import org.wings.header.Link;
import org.wings.resource.ClassPathResource;

import com.commsen.apropos.web.MainFrame;

/**
 * @author Milen Dyankov
 * 
 */
public class AproposWebMain {

	public AproposWebMain() {
		SFrame mainFrame = new MainFrame();
		mainFrame.addHeader(new Link("stylesheet", null, "text/css", null, new ClassPathResource("apropos.css", "text/css")));
		mainFrame.show();
	}
}
