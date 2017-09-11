/*
 * Copyright (C) 2017 Bastian Oppermann
 * 
 * This file is part of Javacord.
 * 
 * Javacord is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser general Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 * 
 * Javacord is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, see <http://www.gnu.org/licenses/>.
 */
package de.btobastian.javacord.events.server;

import de.btobastian.javacord.DiscordApi;
import de.btobastian.javacord.entities.Region;
import de.btobastian.javacord.entities.Server;

/**
 * A server change region event.
 */
public class ServerChangeRegionEvent extends ServerEvent {

    /**
     * The old region of the server.
     */
    private final Region oldRegion;

    /**
     * Creates a new server change region event.
     *
     * @param api The api instance of the event.
     * @param server The server of the event.
     * @param oldRegion The old region of the server.
     */
    public ServerChangeRegionEvent(DiscordApi api, Server server, Region oldRegion) {
        super(api, server);
        this.oldRegion = oldRegion;
    }

    /**
     * Gets the old region of the server.
     *
     * @return The old region of the server.
     */
    public Region getOldRegion() {
        return oldRegion;
    }

    /**
     * Gets the new region of the server.
     *
     * @return The new region of the server.
     */
    public Region getNewRegion() {
        // TODO return getServer().getRegion();
        return Region.UNKNOWN;
    }

}
