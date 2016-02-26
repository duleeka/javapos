# JavaPOS Common 

The JavaPOSCommon class implementes the core functionalities shared by different JavaPOS compliant device categories.

The following interfaces are implemented by JavaPOSCommon class.

### BaseService 
```java
	public void checkHealth(int arg0) throws JposException;
	public void claim(int arg0) throws JposException;
	public void close() throws JposException;
	public void directIO(int arg0, int[] arg1, Object arg2) throws JposException;
	public String getCheckHealthText() throws JposException;
	public boolean getClaimed() throws JposException;
	public boolean getDeviceEnabled() throws JposException;
	public String getDeviceServiceDescription() throws JposException;
	public int getDeviceServiceVersion() throws JposException;
	public boolean getFreezeEvents() throws JposException;
	public String getPhysicalDeviceDescription() throws JposException;
	public String getPhysicalDeviceName() throws JposException;
	public int getState() throws JposException;
	public void open(String arg0, EventCallbacks arg1) throws JposException;
	public void release() throws JposException;
	public void setDeviceEnabled(boolean arg0) throws JposException;
	public void setFreezeEvents(boolean arg0) throws JposException;
```	
### JposServiceInstanceFactory 
```Java
	public JposServiceInstance createInstance(String arg0, JposEntry arg1) throws JposException;
```