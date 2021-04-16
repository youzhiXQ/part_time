package cn.huanzi.qch.baseadmin.sys.sysjob.pojo;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "sys_job")
@Data
public class SysJob implements Serializable {
    private Date createTime;//

    private String jobAddress;//

    private String jobDescript;//

    @Id
    private Integer jobMerchant;//

    private Integer jobNumber;//

    private String jobPosition;//

    private String jobTimeMoney;//

    private Date updateTime;//

}
