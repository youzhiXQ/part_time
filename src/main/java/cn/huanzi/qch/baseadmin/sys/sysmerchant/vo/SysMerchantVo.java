package cn.huanzi.qch.baseadmin.sys.sysmerchant.vo;

import cn.huanzi.qch.baseadmin. common.pojo.PageCondition;import lombok.Data;
import java.io.Serializable;
import java.util.Date;

@Data
public class SysMerchantVo extends PageCondition implements Serializable {
    private Date createTime;//

    private String merchantAddress;//

    private String merchantCompany;//

    private Integer merchantCompanymerchantSize;//

    private String merchantDescrpt;//

    private String merchantJob;//

    private Integer merchantMobile;//

    private String merchantName;//

    private Date updateTime;//

}
