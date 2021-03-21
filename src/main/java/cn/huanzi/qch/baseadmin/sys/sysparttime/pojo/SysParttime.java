package cn.huanzi.qch.baseadmin.sys.sysparttime.pojo;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "sys_parttime")
@Data
public class SysParttime implements Serializable {
    private Date createTime;//

    private String parttimeAddress;//

    @Id
    private String parttimeCompany;//

    private String parttimeDescrpt;//

    private String parttimeJob;//

    private String parttimeTime;//

    private Date updateTime;//

}
