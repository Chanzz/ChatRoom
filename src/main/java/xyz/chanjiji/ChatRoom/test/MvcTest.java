package xyz.chanjiji.ChatRoom.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:applicationContext.xml","file:C:\\Users\\WIN 10\\IdeaProjects\\ChatRoom\\src\\main\\webapp\\WEB-INF\\dispatcher-servlet.xml"})
public class MvcTest {
    @Autowired
    WebApplicationContext context;

    MockMvc mockMvc;
    @Before
    public void initMockMvc(){
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }
    @Test
    public void testmvc() throws Exception {
        //模拟请求拿到返回值
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/chat")).andReturn();
        System.out.println(result);
        //请求成功中，请求域中会有数据
        MockHttpServletRequest request = result.getRequest();
        System.out.println(request);
        Object pi=request.getAttribute("mes");
        System.out.println(pi);
    }
}
