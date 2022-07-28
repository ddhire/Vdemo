package com.Vdemo.Vdemo;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VdemoApplicationTests {
	private VdemoApplication analyser = new VdemoApplication();
    @Test	 
    public void testWordCount() {     	 
   	 assertEquals(7,analyser.getWordCount("Train to win in the digital economy"));	 
    }


	@Test
	void contextLoads() {
	}

}
