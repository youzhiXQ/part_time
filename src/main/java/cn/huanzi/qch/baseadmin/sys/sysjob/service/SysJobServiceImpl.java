package cn.huanzi.qch.baseadmin.sys.sysjob.service;

import cn.huanzi.qch.baseadmin.common.service.*;
import cn.huanzi.qch.baseadmin.sys.sysjob.pojo.SysJob;
import cn.huanzi.qch.baseadmin.sys.sysjob.vo.SysJobVo;
import cn.huanzi.qch.baseadmin.sys.sysjob.repository.SysJobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
@Transactional
public class SysJobServiceImpl extends CommonServiceImpl<SysJobVo, SysJob, Integer> implements SysJobService{

    @PersistenceContext
    private EntityManager em;
    @Autowired
    private SysJobRepository sysJobRepository;
}
