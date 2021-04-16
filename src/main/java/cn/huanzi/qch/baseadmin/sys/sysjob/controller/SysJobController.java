package cn.huanzi.qch.baseadmin.sys.sysjob.controller;

import cn.huanzi.qch.baseadmin.common.controller.*;
import cn.huanzi.qch.baseadmin.sys.sysjob.pojo.SysJob;
import cn.huanzi.qch.baseadmin.sys.sysjob.vo.SysJobVo;
import cn.huanzi.qch.baseadmin.sys.sysjob.service.SysJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/sys/sysJob/")
public class SysJobController extends CommonController<SysJobVo, SysJob, Integer> {
    @Autowired
    private SysJobService sysJobService;



    @GetMapping("job")
    public ModelAndView job(){
        return new ModelAndView("sys/job/job");
    }



}
