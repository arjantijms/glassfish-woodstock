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

package org.example;

import com.sun.faces.annotation.Component;
import com.sun.faces.annotation.Property;

/**
 * Yet another default component.
 */
@Component()
public class DefaultPropertyComponent12 {

    @Property(displayName="defaultProperty")
    private String defaultProperty;

    public String getDefaultProperty() {
        return this.defaultProperty;
    }

    public void setDefaultProperty(String defaultProperty) {
        this.defaultProperty = defaultProperty;
    }
    
}