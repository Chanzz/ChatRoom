package xyz.chanjiji.ChatRoom.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xyz.chanjiji.ChatRoom.bean.Message;
import xyz.chanjiji.ChatRoom.bean.MessageExample;

public interface MessageMapper {
    long countByExample(MessageExample example);

    int deleteByExample(MessageExample example);

    int deleteByPrimaryKey(Integer pk);

    int insert(Message record);

    int insertSelective(Message record);

    List<Message> selectByExample(MessageExample example);

    List<Message> selectByExampleWithUser(MessageExample example);

    Message selectByPrimaryKey(Integer pk);

    Message selectByPrimaryKeyWithUser(Integer pk);

    int updateByExampleSelective(@Param("record") Message record, @Param("example") MessageExample example);

    int updateByExample(@Param("record") Message record, @Param("example") MessageExample example);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
}