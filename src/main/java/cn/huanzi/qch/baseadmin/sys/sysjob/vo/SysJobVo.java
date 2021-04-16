package cn.huanzi.qch.baseadmin.sys.sysjob.vo;

import cn.huanzi.qch.baseadmin. common.pojo.PageCondition;import lombok.Data;
import java.io.Serializable;
import java.util.Date;

@Data
public class SysJobVo extends PageCondition implements Serializable {
    private Date createTime;//

    private String jobAddress;//

    private String jobDescript;//

    private Integer jobMerchant;//

    private Integer jobNumber;//

    private String jobPosition;//

    private String jobTimeMoney;//

    private Date updateTime;//

}
