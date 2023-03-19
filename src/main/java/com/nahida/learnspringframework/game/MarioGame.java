package com.nahida.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole{
	@Override
	public void up() {
		System.out.println("MARIO GAME - Jump");
	}
	@Override
	public void down() {
		System.out.println("MARIO GAME - Go into a hole");
	}
	@Override
	public void left() {
		System.out.println("MARIO GAME - Go back");
	}
	@Override
	public void right(){
		System.out.println("MARIO GAME - Accelerate");
	}
}

