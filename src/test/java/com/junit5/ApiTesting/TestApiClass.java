package com.junit5.ApiTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.junit5.Controller.RestControllerClass;
import com.junit5.Service.WelcomeService;

@WebMvcTest(value = RestControllerClass.class)
public class TestApiClass {
	
	@MockBean
	private WelcomeService welcomeService;
	
	@Autowired
	private MockMvc mockMvc;
	
	//Request
	@Test
	public void testWelcomeMsg() throws Exception {
		
		when(welcomeService.getWelcomeMsg()).thenReturn("");
		
		MockHttpServletRequestBuilder reqBuilder = MockMvcRequestBuilders.get("/welcome");
		
		ResultActions perform = mockMvc.perform(reqBuilder);
		
		MvcResult result = perform.andReturn();
		
		MockHttpServletResponse response = result.getResponse();
		
		int status = response.getStatus();
		
		assertEquals(200, status);
	
	
		
	}
	
}
