package cn.huanzi.qch.baseadmin.sys.sysparttime.service;

import cn.huanzi.qch.baseadmin.common.service.*;
import cn.huanzi.qch.baseadmin.sys.sysparttime.pojo.SysParttime;
import cn.huanzi.qch.baseadmin.sys.sysparttime.vo.SysParttimeVo;
import cn.huanzi.qch.baseadmin.sys.sysparttime.repository.SysParttimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
@Transactional
public class SysParttimeServiceImpl extends CommonServiceImpl<SysParttimeVo, SysParttime, String> implements SysParttimeService{

    @PersistenceContext
    private EntityManager em;
    @Autowired
    private SysParttimeRepository sysParttimeRepository;
}
