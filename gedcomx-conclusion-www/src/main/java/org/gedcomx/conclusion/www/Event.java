/**
 * Copyright 2011 Intellectual Reserve, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gedcomx.conclusion.www;

import org.gedcomx.www.Links;

import javax.xml.bind.annotation.XmlType;

/**
 * A event conclusion that can support WWW links.
 *
 * @author Ryan Heaton
 */
@XmlType (name = "event")
public class Event extends org.gedcomx.conclusion.Event {
  //todo: what are the implications of using this in the model? does it deserialize correctly? what about for json?

  private Links links;

  /**
   * The WWW links for this event.
   *
   * @return The WWW links for this event.
   */
  public Links getLinks() {
    return links;
  }

  /**
   * The links.
   *
   * @param links The links.
   */
  public void setLinks(Links links) {
    this.links = links;
  }
}