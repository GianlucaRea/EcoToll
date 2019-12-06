package application.front.controller;

import application.controller.ControllerAutostrada;
import application.controller.ControllerCasello;


public class GlobalData {
	private static GlobalData instance;
	ControllerAutostrada controllerAutostrada;
	ControllerCasello controllerCasello;
	
	//private casello c;
	private GlobalData() {
		
	}
	
	public static GlobalData get() {
		if (instance == null){
			instance = new GlobalData();
			instance.init();
		}
		return instance;
	}
	
	private void init() {
		controllerAutostrada = ControllerAutostrada.getIstance();
		controllerCasello = ControllerCasello.getIstance();
	}

	public ControllerAutostrada getControllerAutostrada() {
		return controllerAutostrada;
	}
	
	public ControllerCasello getControllerCasello() {
		return controllerCasello;
	}
	

}