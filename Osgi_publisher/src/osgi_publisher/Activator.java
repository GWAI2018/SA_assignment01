package osgi_publisher;

import java.util.Scanner;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	ServiceRegistration publishServiceRegistration;
	
	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Calculation starts");
		ServicePublisher service = new ServicePublisherImpl();
		publishServiceRegistration = context.registerService(ServicePublisher.class.getName(), service, null);
		
	}
		
		
		

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Calculation stop");
		publishServiceRegistration.unregister();
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	

}
