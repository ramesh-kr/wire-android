/**
 * Wire
 * Copyright (C) 2016 Wire Swiss GmbH
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.waz.zclient.controllers.singleimage;

import android.view.View;
import com.waz.api.Message;
import com.waz.api.User;
import com.waz.utils.wrappers.URI;

public interface ISingleImageController {
    void addSingleImageObserver(SingleImageObserver observer);

    void removeSingleImageObserver(SingleImageObserver observer);

    void hideSingleImage();

    Message getMessage();

    void setViewReferences(View imageContainer);

    void setContainerOutOfScreen(boolean containerOutOfScreen);

    boolean isContainerOutOfScreen();

    View getImageContainer();

    void tearDown();

    void clearReferences();

    void showSingleImage(Message message);

    void showSingleImage(User user);

    void showVideo(URI uri);

    void hideVideo();
}