package com.actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;

public class ProjectModule extends BaseClass{

	@Listeners(com.actitime.generics.ListenerImplementation.class)
	public class CustomerModule extends BaseClass{

		@Test
		public void testCreateProject() 	{
		Reporter.log("CreateProject",true);	
		}
		}
}
