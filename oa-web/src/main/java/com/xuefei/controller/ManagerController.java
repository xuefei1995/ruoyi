package com.xuefei.controller;

import com.xuefei.configuration.CommonProps;
import com.xuefei.dto.common.BaseResp;
import com.xuefei.dto.common.BaseRespEumn;
import com.xuefei.dto.manager.AccountInfoDto;
import com.xuefei.pojo.manager.Account;
import com.xuefei.service.manager.IManagerService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.List;

@RestController
@RequestMapping("/manager")
@Validated
@CrossOrigin(allowCredentials = "true", originPatterns = "*")
public class ManagerController {

    @Autowired
    private CommonProps commonProps;

    @DubboReference(version = "1.0.0")
    private IManagerService managerService;

    //查询所有账户信息
    @GetMapping("/accountInfoList/{pageNum}/{pageSize}")
    public BaseResp<List<AccountInfoDto>> accountInfoList(@PathVariable("pageNum") @Min(1) Integer pageNum,
            @PathVariable("pageSize") @Min(1) @Max(10) Integer pageSize) {
        BaseResp<List<AccountInfoDto>> baseResp = new BaseResp<>();
        try {
            List<AccountInfoDto> list = managerService.accountInfoList(pageNum, pageSize);
            baseResp.setResult(list);
        } catch (Exception e) {
            baseResp.setSuccess(false);
            baseResp.setCode(BaseRespEumn.UNKNOWN_SYSTEM_ERROR.getCode());
            baseResp.setMessage(BaseRespEumn.UNKNOWN_SYSTEM_ERROR.getName() + e.getMessage());
        }

        return baseResp;
    }

    //注册账户信息
    @PostMapping("register")
    public BaseResp<Void> register(@Validated @RequestBody AccountInfoDto accountInfoDto) {
        BaseResp<Void> baseResp = new BaseResp<>();
        try {
            managerService.register(accountInfoDto);
        } catch (Exception e) {
            baseResp.setSuccess(false);
            baseResp.setCode(BaseRespEumn.UNKNOWN_SYSTEM_ERROR.getCode());
            baseResp.setMessage(BaseRespEumn.UNKNOWN_SYSTEM_ERROR.getName() + e.getMessage());
        }
        return baseResp;
    }

    @GetMapping("/login/{userName}/{passWord}")
    public BaseResp<Void> login(@PathVariable("userName") String userName, @PathVariable("passWord") String passWord,
            HttpServletRequest request) {
        BaseResp<Void> baseResp = new BaseResp<>();
        try {
            Account account = managerService.login(userName, passWord);
            if (account == null) {
                baseResp.setSuccess(false);
                baseResp.setCode(BaseRespEumn.LOGIN_ERROR.getCode());
                baseResp.setMessage(BaseRespEumn.LOGIN_ERROR.getName());
                return baseResp;
            }
            //登录成功设置session
            HttpSession session = request.getSession();
            session.setAttribute("login", account.getAccountId());
            session.setMaxInactiveInterval(commonProps.getMaxInactiveInterval());
        } catch (Exception e) {
            baseResp.setSuccess(false);
            baseResp.setCode(BaseRespEumn.UNKNOWN_SYSTEM_ERROR.getCode());
            baseResp.setMessage(BaseRespEumn.UNKNOWN_SYSTEM_ERROR.getName() + e.getMessage());
        }
        return baseResp;
    }

    @PutMapping("update")
    public BaseResp<Void> update(@RequestBody Account account) {
        BaseResp<Void> baseResp = new BaseResp<>();
        try {
            managerService.update(account);
        } catch (Exception e) {
            baseResp.setSuccess(false);
            baseResp.setCode(BaseRespEumn.UNKNOWN_SYSTEM_ERROR.getCode());
            baseResp.setMessage(BaseRespEumn.UNKNOWN_SYSTEM_ERROR.getName() + e.getMessage());
        }
        return baseResp;
    }

    @DeleteMapping("/delete/{accountId}")
    public BaseResp<Void> delete(@PathVariable("accountId") Long accountId) {
        BaseResp<Void> baseResp = new BaseResp<>();
        try {
            managerService.delete(accountId);
        } catch (Exception e) {
            baseResp.setSuccess(false);
            baseResp.setCode(BaseRespEumn.UNKNOWN_SYSTEM_ERROR.getCode());
            baseResp.setMessage(BaseRespEumn.UNKNOWN_SYSTEM_ERROR.getName() + e.getMessage());
        }
        return baseResp;
    }

}
