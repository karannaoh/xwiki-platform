/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package com.xpn.xwiki.wysiwyg.server.wiki;

import org.xwiki.component.annotation.ComponentRole;
import org.xwiki.gwt.wysiwyg.client.wiki.EntityConfig;
import org.xwiki.gwt.wysiwyg.client.wiki.EntityReference;
import org.xwiki.gwt.wysiwyg.client.wiki.EntityReference.EntityType;

/**
 * The service used to create links.
 * 
 * @version $Id$
 */
@ComponentRole
public interface LinkService
{
    /**
     * Creates an entity link configuration object (URL, link reference) for a link with the specified origin and
     * destination. The link reference in the returned {@link EntityConfig} is relative to the link origin.
     * 
     * @param origin the origin of the link
     * @param destination the destination of the link
     * @return the link configuration object that can be used to insert the link in the origin page
     */
    EntityConfig getEntityConfig(EntityReference origin, EntityReference destination);

    /**
     * Parses the given link reference and extracts a reference to the linked entity. The returned entity reference is
     * resolved relative to the given base entity reference.
     * 
     * @param linkReference a link reference pointing to an entity of the specified type
     * @param entityType the type of entity being linked
     * @param baseReference the entity reference used to resolve the linked entity reference
     * @return a reference to the linked entity
     */
    EntityReference parseLinkReference(String linkReference, EntityType entityType, EntityReference baseReference);
}
