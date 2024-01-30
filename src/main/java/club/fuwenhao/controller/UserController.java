package club.fuwenhao.controller;

import club.fuwenhao.entity.User;
import club.fuwenhao.service.UserService;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 用户基本信息表(User)表控制层
 *
 * @author makejava
 * @since 2024-01-29 21:24:05
 */
@RestController
@RequestMapping("User")
public class UserController {
    /**
     * 服务对象
     */
    @Autowired
    private UserService userService;

    /**
     * 分页查询
     *
     * @param User        筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
//    @GetMapping("queryByPage")
//    public ResponseEntity<Page<User>> queryByPage(User User, PageRequest pageRequest) {
//        return ResponseEntity.ok(this.userService.queryByPage(User, pageRequest));
//    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<User> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.userService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param User 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Boolean> add(User User) {
        return ResponseEntity.ok(this.userService.save(User));
    }

    /**
     * 编辑数据
     *
     * @param User 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Boolean> edit(User User) {
        return ResponseEntity.ok(this.userService.update(User,new UpdateWrapper<>(User)));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.userService.update(new UpdateWrapper<>(new User().setId(id).setDeleted(true))));
    }

}

