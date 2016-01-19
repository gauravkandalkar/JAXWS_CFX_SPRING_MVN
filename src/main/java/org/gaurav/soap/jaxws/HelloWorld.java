package org.gaurav.soap.jaxws;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(String text);
}

