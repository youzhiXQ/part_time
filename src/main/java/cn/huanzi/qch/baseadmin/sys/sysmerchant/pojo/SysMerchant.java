package cn.huanzi.qch.baseadmin.sys.sysmerchant.pojo;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "sys_merchant")
@Data
public class SysMerchant implements Serializable {
    private Date createTime;//

    private String merchantAddress;//

    @Id
    private String merchantCompany;//

    private Integer merchantCompanymerchantSize;//

    private String merchantDescrpt;//

    private String merchantJob;//

    private Integer merchantMobile;//

    private String merchantName;//

    private Date updateTime;//

}
