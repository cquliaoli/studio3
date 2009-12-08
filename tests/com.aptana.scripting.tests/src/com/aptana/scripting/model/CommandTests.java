package com.aptana.scripting.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

public class CommandTests
{
	protected String executeCommand(String bundleName, String commandName)
	{
		BundleManager manager = BundleManager.getInstance();
		
		// make sure we have a test bundle
		File bundleFile = new File("bundles" + File.separator + bundleName);
		assertTrue(bundleFile.exists());
		
		// load bundle
		manager.processBundle(bundleFile, false);
		BundleElement bundle = manager.getBundleFromPath(bundleFile.getAbsolutePath());
		assertNotNull(bundle);

		// get command
		CommandElement command = bundle.getCommandByName(commandName);
		assertNotNull(command);
		
		// run command and grab result
		CommandResult result = command.execute(null);
		assertNotNull(result);
		
		// return string result
		return result.getOutputString();
	}
	
	@Test
	public void invokeStringCommand()
	{
		String resultText = this.executeCommand("invokeString", "Test");
		
		assertEquals("hello\n", resultText);
	}

	@Test
	public void invokeBlockCommand()
	{
		String resultText = this.executeCommand("invokeBlock", "Test");
		
		assertEquals("hello", resultText);
	}
}
