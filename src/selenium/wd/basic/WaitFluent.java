package selenium.wd.basic;

/*
 Fluent Wait
The fluent wait is used to tell the web driver to wait for a condition, as well as the frequency with which we want to check
 the condition before throwing an "ElementNotVisibleException" exception.

Frequency: Setting up a repeat cycle with the time frame to verify/check the condition at the regular interval of time

Let's consider a scenario where an element is loaded at different intervals of time. The element might load within 10 seconds, 20 seconds 
or even more then that if we declare an explicit wait of 20 seconds. It will wait till the specified time before throwing an exception.
 In such scenarios, the fluent wait is the ideal wait to use as this will try to find the element at different frequency until it finds it 
 or the final timer runs out.
 */

public class WaitFluent {
	
}