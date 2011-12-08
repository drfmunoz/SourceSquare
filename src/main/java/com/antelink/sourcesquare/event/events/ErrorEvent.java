/**
 * Copyright (C) 2009-2011 Antelink SAS
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Affero General Public License Version 3 as published
 * by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License Version 3
 * for more details.
 *
 * You should have received a copy of the GNU Affero General Public License Version
 * 3 along with this program. If not, see http://www.gnu.org/licenses/agpl.html
 *
 * Additional permission under GNU AGPL version 3 section 7
 *
 * If you modify this Program, or any covered work, by linking or combining it with
 * Eclipse Java development tools (JDT) or Jetty (or a modified version of these
 * libraries), containing parts covered by the terms of Eclipse Public License 1.0,
 * the licensors of this Program grant you additional permission to convey the
 * resulting work. Corresponding Source for a non-source form of such a combination
 * shall include the source code for the parts of Eclipse Java development tools
 * (JDT) or Jetty used as well as that of the covered work.
 */
package com.antelink.sourcesquare.event.events;

import com.antelink.sourcesquare.event.base.ClientEvent;
import com.antelink.sourcesquare.event.base.ClientEventType;
import com.antelink.sourcesquare.event.handlers.ErrorEventHandler;

public class ErrorEvent implements ClientEvent<ErrorEventHandler> {
    public static final ClientEventType<ErrorEventHandler> TYPE = new ClientEventType<ErrorEventHandler>();
    private String msg;

    public ErrorEvent(String msg) {
        this.msg = msg;
    }

    @Override
    public ClientEventType<ErrorEventHandler> getHandlerType() {
        return TYPE;
    }

    @Override
    public void dispatch(ErrorEventHandler handler) {
        handler.handle(this.msg);
    }

}