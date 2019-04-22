package xyz.chanjiji.ChatRoom.service;

import xyz.chanjiji.ChatRoom.bean.Message;
import xyz.chanjiji.ChatRoom.dao.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    MessageMapper messageMapper;

    //查询所有信息
    public List<Message> getall() {
        return messageMapper.selectByExampleWithUser(null);
    }
//    public List<Message> getall() {
//        return messageMapper.selectByExample(null);
//    }
}
