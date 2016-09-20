package com.bftcom.devcomp.api;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceListener;

import java.util.logging.Logger;

/**
 * @author ikka
 * @date: 20.09.2016.
 */
public interface IActivator extends BundleActivator, ServiceListener, QueuesConfiguration {
  static final Logger logger = Logger.getLogger(IActivator.class.getName());

  /**
   * Implements ServiceListener.serviceChanged().
   * Prints the details of any service event from the framework.
   *
   * @param event the fired service event.
   **/
  default void serviceChanged(ServiceEvent event) {
    String[] objectClass = (String[]) event.getServiceReference().getProperty("objectClass");
    int type = event.getType();
    String eventType = null;
    switch (type) {
      case ServiceEvent.REGISTERED:
        eventType = "REGISTERED";
        break;
      case ServiceEvent.UNREGISTERING:
        eventType = "UNREGISTERING";
        break;
      case ServiceEvent.MODIFIED:
        eventType = "MODIFIED";
        break;
      case ServiceEvent.MODIFIED_ENDMATCH:
        eventType = "MODIFIED_ENDMATCH";
        break;
    }
    logger.info("Service of type " + objectClass[0] + eventType);
  }
}
