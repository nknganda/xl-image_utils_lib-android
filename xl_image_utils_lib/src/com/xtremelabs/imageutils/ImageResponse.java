/*
 * Copyright 2013 Xtreme Labs
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.xtremelabs.imageutils;

import android.graphics.Bitmap;

class ImageResponse {
	public static enum ImageResponseStatus {
		REQUEST_QUEUED, SUCCESS, CACHED_ON_DISK
	}

	private final ImageResponseStatus mImageResponseStatus;
	private final Bitmap mBitmap;
	private final ImageReturnedFrom mImageReturnedFrom;

	public ImageResponse(Bitmap bitmap, ImageReturnedFrom imageReturnedFrom, ImageResponseStatus imageResponseStatus) {
		mBitmap = bitmap;
		mImageReturnedFrom = imageReturnedFrom;
		mImageResponseStatus = imageResponseStatus;
	}

	public Bitmap getBitmap() {
		return mBitmap;
	}

	public ImageReturnedFrom getImageReturnedFrom() {
		return mImageReturnedFrom;
	}

	public ImageResponseStatus getImageResponseStatus() {
		return mImageResponseStatus;
	}
}
