/** 
 * Copyright 2010 Daniel Guermeur and Amy Unruh
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *   See http://connectrapp.appspot.com/ for a demo, and links to more information 
 *   about this app and the book that it accompanies.
 */
package com.metadot.book.connectr.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.metadot.book.connectr.client.helper.ClickPoint;
import com.metadot.book.connectr.shared.FriendSummaryDTO;

public class ShowFriendPopupEvent extends GwtEvent<ShowFriendPopupEventHandler> {
  public static Type<ShowFriendPopupEventHandler> TYPE = new Type<ShowFriendPopupEventHandler>();
  private final FriendSummaryDTO friend;
  private final ClickPoint point;

  public ClickPoint getClickPoint() {
    return point;
  }

  public ShowFriendPopupEvent(FriendSummaryDTO friend, ClickPoint point) {
    this.friend = friend;
    this.point = point;
  }

  public FriendSummaryDTO getFriend() {
    return friend;
  }

  @Override
  public Type<ShowFriendPopupEventHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(ShowFriendPopupEventHandler handler) {
    handler.onShowFriendPopup(this);
  }
}