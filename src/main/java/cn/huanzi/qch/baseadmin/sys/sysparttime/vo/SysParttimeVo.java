package cn.huanzi.qch.baseadmin.sys.sysparttime.vo;

import cn.huanzi.qch.baseadmin. common.pojo.PageCondition;import lombok.Data;
import java.io.Serializable;
import java.util.Date;

@Data
public class SysParttimeVo extends PageCondition implements Serializable {
    private Date createTime;//

    private String parttimeAddress;//

    private String parttimeCompany;//

    private String parttimeDescrpt;//

    private String parttimeJob;//

    private String parttimeTime;//

    private Date updateTime;//

}
