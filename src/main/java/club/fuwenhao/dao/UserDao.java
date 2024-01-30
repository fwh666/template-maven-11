package club.fuwenhao.dao;

import club.fuwenhao.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * 用户基本信息表(User)表数据库访问层
 *
 * @author makejava
 * @since 2024-01-29 21:24:09
 */

public interface UserDao extends BaseMapper<User> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    User queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param User     查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
//    List<User> queryAllByLimit(User User, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param User 查询条件
     * @return 总行数
     */
    long count(User User);
}

