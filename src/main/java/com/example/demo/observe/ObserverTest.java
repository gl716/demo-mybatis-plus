package com.example.demo.observe;

public class ObserverTest {

	public static void main(String[] args) {
		Watched watched = new Watched();
		new Watcher(watched);
		watched.changeData("In C, we create bugs.");
		watched.changeData("In JAVA, we inherit bugs.");
		watched.changeData("In JAVA, we inherit bugs.");
		watched.changeData("In Visual Basic, we visualize bugs.");
		
		
	}
}
