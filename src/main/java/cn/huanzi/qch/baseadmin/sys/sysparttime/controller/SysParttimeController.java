package cn.huanzi.qch.baseadmin.sys.sysparttime.controller;

import cn.huanzi.qch.baseadmin.common.controller.*;
import cn.huanzi.qch.baseadmin.sys.sysparttime.pojo.SysParttime;
import cn.huanzi.qch.baseadmin.sys.sysparttime.vo.SysParttimeVo;
import cn.huanzi.qch.baseadmin.sys.sysparttime.service.SysParttimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/sys/sysParttime/")
public class SysParttimeController extends CommonController<SysParttimeVo, SysParttime, String> {
    @Autowired
    private SysParttimeService sysParttimeService;


    @GetMapping("parttime")
    public ModelAndView parttime(){
        return new ModelAndView("sys/parttime/parttime");
    }

}
