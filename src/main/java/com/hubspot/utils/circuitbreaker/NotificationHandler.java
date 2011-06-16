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

package com.hubspot.utils.circuitbreaker;

/**
 * Defines a basic interface for receiving change notifications
 */
public interface NotificationHandler<T> {
	/**
	 * Fired when a change occurs
	 */
	void onChanged(T event);
}
