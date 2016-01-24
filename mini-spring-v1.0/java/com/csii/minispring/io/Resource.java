package com.csii.minispring.io;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public interface Resource {
	boolean exists();

	boolean isReadable();

	boolean isOpen();

	File getFile() throws IOException;

	long lastModified() throws IOException;

	String getFilename();
	
	String getDescription();
	
	InputStream getInputStream() throws IOException;
}
