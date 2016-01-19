
package org.gaurav.soap.jaxws;

import javax.jws.WebService;

@WebService(endpointInterface = "org.gaurav.soap.jaxws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

