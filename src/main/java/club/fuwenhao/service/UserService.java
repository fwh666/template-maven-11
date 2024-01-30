package club.fuwenhao.service;

import club.fuwenhao.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
/**
 * 用户基本信息表(User)表服务接口
 *
 * @author makejava
 * @since 2024-01-29 21:24:12
 */
public interface UserService extends IService<User> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    User queryById(Long id);

    /**
     * 分页查询
     *
     * @param User       筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
//    Page<User> queryByPage(User User, PageRequest pageRequest);

}
