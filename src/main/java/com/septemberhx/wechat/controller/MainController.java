package com.septemberhx.wechat.controller;

import com.septemberhx.common.bean.MResponse;
import com.septemberhx.mclient.annotation.MFuncDescription;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author SeptemberHX
 * @version 0.1
 * @date 2020/3/31
 */
@Controller
public class MainController {

    @PostMapping(path = "/pay")
    @ResponseBody
    @MFuncDescription(value = "pay", level = 3)
    public MResponse pay(@RequestBody MResponse params, HttpServletRequest request) {
        return MResponse.successResponse();
    }

    @PostMapping(path = "/life")
    @ResponseBody
    @MFuncDescription(value = "life", level = 2)
    public MResponse life(@RequestBody MResponse params, HttpServletRequest request) {
        return MResponse.successResponse();
    }
}
