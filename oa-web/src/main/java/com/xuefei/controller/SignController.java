package com.xuefei.controller;

import com.xuefei.dto.common.BaseResp;
import com.xuefei.dto.common.BaseRespEumn;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sign")
@CrossOrigin(allowCredentials = "true", originPatterns = "*")
public class SignController {

    @RequestMapping("/signError")
    public BaseResp<Void> signError() {
        BaseResp<Void> baseResp = new BaseResp<>();
        baseResp.setSuccess(false);
        baseResp.setCode(BaseRespEumn.SIGN_ERROR.getCode());
        baseResp.setMessage(BaseRespEumn.SIGN_ERROR.getName());
        return baseResp;
    }

    @RequestMapping("/loginError")
    public BaseResp<Void> loginError() {
        BaseResp<Void> baseResp = new BaseResp<>();
        baseResp.setSuccess(false);
        baseResp.setCode(BaseRespEumn.NEED_LOGIN_ERROR.getCode());
        baseResp.setMessage(BaseRespEumn.NEED_LOGIN_ERROR.getName());
        return baseResp;
    }
}
