/*
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.zbs.techbrain.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <BaseWeb>
 *
 * @author 宅布斯大人
 * @version BaseWeb.java, v 1.0 22:48 宅布斯大人
 */
@RestController
public class BaseWeb
{

    @RequestMapping("test")
    public Object ss(){
        return "asdfasd";
    }
}
