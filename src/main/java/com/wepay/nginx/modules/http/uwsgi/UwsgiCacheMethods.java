/********************************************************** 
* Syntax: uwsgi_cache_methods GET | HEAD | POST ...;
* Default: uwsgi_cache_methods GET HEAD;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiCacheMethods extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public UwsgiCacheMethods() {
		super(contexts, "GET HEAD", "uwsgi_cache_methods");
	}

}
