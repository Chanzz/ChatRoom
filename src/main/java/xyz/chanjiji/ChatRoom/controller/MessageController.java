package xyz.chanjiji.ChatRoom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.chanjiji.ChatRoom.bean.Message;
import xyz.chanjiji.ChatRoom.service.MessageService;

import java.util.List;

/**
 * 处理信息CRUD请求
 */
@Controller
public class MessageController {
    @Autowired
    MessageService messageService;

    @RequestMapping("/chat")
    public String getMes(Model model){
        List<Message> mes = messageService.getall();
        model.addAttribute("mes",mes);
        return "list";
    }
}
