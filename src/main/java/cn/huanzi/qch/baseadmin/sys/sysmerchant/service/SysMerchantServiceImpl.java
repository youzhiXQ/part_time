package cn.huanzi.qch.baseadmin.sys.sysmerchant.service;

import cn.huanzi.qch.baseadmin.common.service.*;
import cn.huanzi.qch.baseadmin.sys.sysmerchant.pojo.SysMerchant;
import cn.huanzi.qch.baseadmin.sys.sysmerchant.vo.SysMerchantVo;
import cn.huanzi.qch.baseadmin.sys.sysmerchant.repository.SysMerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
@Transactional
public class SysMerchantServiceImpl extends CommonServiceImpl<SysMerchantVo, SysMerchant, String> implements SysMerchantService{

    @PersistenceContext
    private EntityManager em;
    @Autowired
    private SysMerchantRepository sysMerchantRepository;
}
