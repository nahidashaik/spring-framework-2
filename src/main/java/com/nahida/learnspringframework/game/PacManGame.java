package com.nahida.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacManGame implements GamingConsole{
	@Override
	public void up() {
		System.out.println("PACMAN - go up");
	}
	@Override
	public void down() {
		System.out.println("PACMAN - go down");
	}
	@Override
	public void left() {
		System.out.println("PACMAN - Go left");
	}
	@Override
	public void right(){
		System.out.println("PACMAN - go right");
	}
}
