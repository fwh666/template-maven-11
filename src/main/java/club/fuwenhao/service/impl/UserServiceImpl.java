package club.fuwenhao.service.impl;

import club.fuwenhao.dao.UserDao;
import club.fuwenhao.entity.User;
import club.fuwenhao.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 用户基本信息表(User)表服务实现类
 *
 * @author makejava
 * @since 2024-01-29 21:24:13
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {
    @Resource
    private UserDao userDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public User queryById(Long id) {
        return this.userDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param User        筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
//    @Override
//    public Page<User> queryByPage(User User, PageRequest pageRequest) {
//        long total = this.userDao.count(User);
//        return new PageImpl<>(this.userDao.queryAllByLimit(User, pageRequest), pageRequest, total);
//    }

}
