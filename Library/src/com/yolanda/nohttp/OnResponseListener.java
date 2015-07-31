/**
 * Copyright © YOLANDA. All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.yolanda.nohttp;

import com.yolanda.nohttp.base.BaseListener;

/**
 * Created in Jul 28, 2015 7:32:53 PM
 * 
 * @author YOLANDA
 */
public interface OnResponseListener extends BaseListener {

	/**
	 * Server correct response to callback when an HTTP request
	 * 
	 * @param what The credit of the incoming request is used to distinguish between multiple requests
	 * @param response In response to the results
	 */
	public abstract void onNoHttpResponse(int what, Response response);

	/**
	 * When there was an error correction
	 * 
	 * @param what The credit of the incoming request is used to distinguish between multiple requests
	 * @param responseError In response to the error results
	 */
	public abstract void onNoHttpError(int what, ResponseError responseError);

}
