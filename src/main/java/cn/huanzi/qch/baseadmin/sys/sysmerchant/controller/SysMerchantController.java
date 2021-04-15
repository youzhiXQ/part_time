package cn.huanzi.qch.baseadmin.sys.sysmerchant.controller;

import cn.huanzi.qch.baseadmin.common.controller.*;
import cn.huanzi.qch.baseadmin.sys.sysmerchant.pojo.SysMerchant;
import cn.huanzi.qch.baseadmin.sys.sysmerchant.vo.SysMerchantVo;
import cn.huanzi.qch.baseadmin.sys.sysmerchant.service.SysMerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/sys/sysMerchant/")
public class SysMerchantController extends CommonController<SysMerchantVo, SysMerchant, String> {
    @Autowired
    private SysMerchantService sysMerchantService;


    @GetMapping("merchant")
    public ModelAndView merchant(){
        return new ModelAndView("sys/merchant/merchant");
    }



}
