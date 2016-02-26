package com.gmail.duleekag.javapos;

import jpos.JposException;
import jpos.config.JposEntry;
import jpos.loader.JposServiceInstance;
import jpos.loader.JposServiceInstanceFactory;
import jpos.services.BaseService;
import jpos.services.EventCallbacks;
public class JavaPOSCommon implements BaseService, JposServiceInstanceFactory {

	public void checkHealth(int arg0) throws JposException {
		// TODO Auto-generated method stub
		
	}

	public void claim(int arg0) throws JposException {
		// TODO Auto-generated method stub
		
	}

	public void close() throws JposException {
		// TODO Auto-generated method stub
		
	}

	public void directIO(int arg0, int[] arg1, Object arg2) throws JposException {
		// TODO Auto-generated method stub
		
	}

	public String getCheckHealthText() throws JposException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean getClaimed() throws JposException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean getDeviceEnabled() throws JposException {
		// TODO Auto-generated method stub
		return false;
	}

	public String getDeviceServiceDescription() throws JposException {
		// TODO Auto-generated method stub
		return null;
	}

	public int getDeviceServiceVersion() throws JposException {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean getFreezeEvents() throws JposException {
		// TODO Auto-generated method stub
		return false;
	}

	public String getPhysicalDeviceDescription() throws JposException {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPhysicalDeviceName() throws JposException {
		// TODO Auto-generated method stub
		return null;
	}

	public int getState() throws JposException {
		// TODO Auto-generated method stub
		return 0;
	}

	public void open(String arg0, EventCallbacks arg1) throws JposException {
		// TODO Auto-generated method stub
		
	}

	public void release() throws JposException {
		// TODO Auto-generated method stub
		
	}

	public void setDeviceEnabled(boolean arg0) throws JposException {
		// TODO Auto-generated method stub
		
	}

	public void setFreezeEvents(boolean arg0) throws JposException {
		// TODO Auto-generated method stub
		
	}

	public JposServiceInstance createInstance(String arg0, JposEntry arg1) throws JposException {
		// TODO Auto-generated method stub
		return null;
	}

}
