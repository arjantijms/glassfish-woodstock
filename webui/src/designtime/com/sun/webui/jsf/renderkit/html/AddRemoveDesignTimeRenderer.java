/*
 * Copyright (c) 2007, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package com.sun.webui.jsf.renderkit.html;

import com.sun.webui.jsf.component.AddRemove;

import java.io.IOException;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;

/**
 * A delegating renderer for {@link com.sun.webui.jsf.component.AddRemove}.
 *
 * @author gjmurphy
 */
public class AddRemoveDesignTimeRenderer extends SelectorDesignTimeRenderer {
    
    /** Creates a new instance of ListboxDesignTimeRenderer */
    public AddRemoveDesignTimeRenderer() {
        super(new AddRemoveRenderer());
    }

    public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
        if(component instanceof AddRemove) {
            AddRemove addRemove = (AddRemove) component;
            // Clear facets that are used to cache properties, so that any changes to
            // property will render
            if (addRemove.getFacet(AddRemove.AVAILABLE_LABEL_FACET) != null)
                addRemove.getFacets().remove(AddRemove.AVAILABLE_LABEL_FACET);
            if (addRemove.getFacet(AddRemove.SELECTED_LABEL_FACET) != null)
                addRemove.getFacets().remove(AddRemove.SELECTED_LABEL_FACET);
        }
        super.encodeBegin(context, component);
    }
    
}