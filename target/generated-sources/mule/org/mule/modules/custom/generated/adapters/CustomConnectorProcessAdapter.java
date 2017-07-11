
package org.mule.modules.custom.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.custom.CustomConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>CustomConnectorProcessAdapter</code> is a wrapper around {@link CustomConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-07-11T11:56:11+05:30", comments = "Build UNNAMED.2793.f49b6c7")
public class CustomConnectorProcessAdapter
    extends CustomConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<CustomConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, CustomConnectorCapabilitiesAdapter> getProcessTemplate() {
        final CustomConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,CustomConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, CustomConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, CustomConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
