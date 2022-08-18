package com.example.demo.observe;

import java.util.Observable;
import java.util.Observer;

public class Watcher implements Observer{
	
	public Watcher(Watched watched)
	{
		watched.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("data has changed"+((Watched)o).retrieveData());
	}

}
