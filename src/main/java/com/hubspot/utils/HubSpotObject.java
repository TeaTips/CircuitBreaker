/** Copyright 2011 HubSpot, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the
 * License.
 **/

package com.hubspot.utils;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * This is the common parent class for HubSpot objects.
 */
public abstract class HubSpotObject implements Serializable {
    /** Log. */
    private final Log log = LogFactory.getLog(getClass());

    /** @return The log. */
    protected final Log getLog() {
        return log;
    }

    /** @return A String representation of this object. */

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }


}
