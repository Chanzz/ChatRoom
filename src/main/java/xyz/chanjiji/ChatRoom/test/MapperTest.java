package xyz.chanjiji.ChatRoom.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xyz.chanjiji.ChatRoom.bean.User;
import xyz.chanjiji.ChatRoom.dao.UserMapper;

/**
 * 测试dao层的工作
 * 导入spring-test模块
 * ContextConfiguration指定spring配置文件位置
 * 直接autowired要使用的组件即可
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest{
    @Autowired
    UserMapper userMapper;
//    测试UserMapper
    @Test
    public void testCRUD(){
//        System.out.println(userMapper);
//        userMapper.insertSelective(new User(null,"test1","123456","测试者1"));
//        userMapper.insertSelective(new User(null,"test2","123456","测试者2"));
    }
}
