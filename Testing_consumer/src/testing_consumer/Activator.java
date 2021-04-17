package testing_consumer;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTracker;

import osgi_publisher.ServicePublisher;
import osgi_publisher.ServicePublisherImpl;

public class Activator implements BundleActivator {

	private static BundleContext context;
	private ServiceTracker track;
	private ServiceReference ref;
	private Scanner c = new Scanner(System.in);
	private String a;
	private String add;
	private String pn;
	private String e;
	private String n;
	


	public void start(BundleContext bundleContext) throws Exception {
		context = bundleContext;
		while(true) {
			//testing 
			ServicePublisher publisher= null;
			ref = context.getServiceReference(ServicePublisher.class.getName());
			publisher = (ServicePublisher) context.getService(ref);

			//Calling method 
			publisher.add();
			
			a=c.nextLine();
			add=c.nextLine();
			pn=c.nextLine();
			e=c.nextLine();
			n = c.nextLine();
			break;
			
			//if(n.contentEquals("END")) {
				//break;
			//}
			
		}
		
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}
