package nLayeredDemo.core;

import nLayeredDemo.JLogger.JLoggerManager;

public class LogManagerAdaptor implements LoggerService{

	
	public void logTo(String message) {
		JLoggerManager manager = new JLoggerManager();
		manager.log(message);
	}

}
