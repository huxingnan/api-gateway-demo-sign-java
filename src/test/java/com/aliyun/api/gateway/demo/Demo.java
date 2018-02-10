/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyun.api.gateway.demo;

import com.alibaba.fastjson.JSON;
import com.aliyun.api.gateway.demo.util.HttpUtil;
import org.junit.Test;
import java.util.*;

/**
 * 调用示例
 * 请替换APP_KEY,APP_SECRET,HOST,CUSTOM_HEADERS_TO_SIGN_PREFIX为真实配置
 */
public class Demo {


    /**
     * HTTP POST 表单
     *
     * @throws Exception
     */
    @Test
    public void postForm() throws Exception {
        //请求path
        String path = "/restApi/epc/requestCustInventory";
        String host = "http://api-beta.xianyiscm.com";
        String appKey = "23578355";
        String secret="f505bfa05be4dde19be0230df0799b7d";
        Map<String, String> headers = new HashMap<String, String>();
        //（必填）根据期望的Response内容类型设置
        headers.put("Accept", "application/json");
        Map<String, String> bodys = new HashMap<String, String>();
        bodys.put("fromSYS","INSPUR");
        bodys.put("method","requestCustInventory");
        bodys.put("appkey","23578355");
        bodys.put("secret","f505bfa05be4dde19be0230df0799b7d");
        bodys.put("requestContent","<requestCustInventory><customerCode>100977,101011,101305,100192,100259</customerCode><inventoryDate>2018-02-07 13:10:11</inventoryDate><startTime>2017-12-01 14:22:30</startTime><endTime>2018-02-08 12:00:30</endTime><isInventory>1</isInventory><isOrder>1</isOrder></requestCustInventory>");
        bodys.put("requestTime","2018-02-09 19:55:00");
        //调用服务端
        Response response = HttpUtil.httpPost(host, path, 1000, headers, null,bodys, null, appKey, secret);
        System.out.println(JSON.toJSONString(response));
    }


}
