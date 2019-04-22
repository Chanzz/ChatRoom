package xyz.chanjiji.ChatRoom.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xyz.chanjiji.ChatRoom.bean.Message;
import xyz.chanjiji.ChatRoom.bean.User;
import xyz.chanjiji.ChatRoom.dao.MessageMapper;
import xyz.chanjiji.ChatRoom.dao.UserMapper;

import java.util.UUID;

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

    @Autowired
    MessageMapper messageMapper;

    @Autowired
    SqlSession sqlSession;
//    测试UserMapper
    @Test
    public void testCRUD(){
//        System.out.println(userMapper);
//        userMapper.insertSelective(new User(null,"test1","123456","测试者1"));
//        userMapper.insertSelective(new User(null,"test2","123456","测试者2"));
//        userMapper.insertSelective(new User(null,"test3","123456","测试者3"));
//        messageMapper.insertSelective(new Message(null,"hello world",1,null));
        MessageMapper mapper=sqlSession.getMapper(MessageMapper.class);
        for (int i=0;i<100;i++){
            String uid= UUID.randomUUID().toString().substring(0,5)+i;
            mapper.insertSelective(new Message(null,uid,1,null));
        }
        System.out.println("批量执行完成");
    }
}
