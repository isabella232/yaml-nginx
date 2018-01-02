/********************************************************** 
* Syntax: uwsgi_store on | off | string;
* Default: uwsgi_store off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiStore extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public UwsgiStore() {
		super(contexts, "off", "uwsgi_store");
	}

}
