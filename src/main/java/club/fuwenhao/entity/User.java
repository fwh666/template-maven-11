package club.fuwenhao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户基本信息表(TUser)实体类
 *
 * @author makejava
 * @since 2024-01-29 21:24:10
 */
@Data
@TableName(value = "t_user")
@Accessors(chain = true)
public class User implements Serializable {
    private static final long serialVersionUID = -63392546544560421L;
    /**
     * 主键ID
     */
    private Long id;
    /**
     * UID
     */
    private Long uid;
    /**
     * 用户名昵称
     */
    private String userName;
    /**
     * 头像URL
     */
    private String avatarImage;
    /**
     * 性别0-未知 1-男 2-女
     */
    private Integer sex;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 出生年份
     */
    private Integer year;
    /**
     * 出生月份
     */
    private Integer month;
    /**
     * 出生日份
     */
    private Integer day;
    /**
     * 星座
     */
    private String constellation;
    /**
     * 身高cm
     */
    private Integer height;
    /**
     * 体重kg
     */
    private Integer weight;
    /**
     * 学历
     */
    private String education;
    /**
     * 学校
     */
    private String school;
    /**
     * 工作职位
     */
    private String job;
    /**
     * 现居住地
     */
    private String address;
    /**
     * 家乡籍贯
     */
    private String hometown;
    /**
     * 年收入
     */
    private String income;
    /**
     * 婚姻状况
     */
    private String marriage;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 删除标识 0-未 1-删除
     */
    private Boolean deleted;

}

