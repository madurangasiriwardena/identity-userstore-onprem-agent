/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.user.store.outbound.cache;

import org.wso2.carbon.identity.application.common.cache.CacheKey;

public class UserAttributeCacheKey extends CacheKey {

    private static final long serialVersionUID = -5671481946716751542L;
    private String userName;

    public UserAttributeCacheKey(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof UserAttributeCacheKey)) {
            return false;
        }
        return this.userName.equals(((UserAttributeCacheKey) o).getUserName());
    }

    @Override
    public int hashCode() {
        return userName.hashCode();
    }
}
