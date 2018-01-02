/********************************************************** 
* Syntax: proxy_ssl_protocols [SSLv2] [SSLv3] [TLSv1] [TLSv1.1] [TLSv1.2] [TLSv1.3];
* Default: proxy_ssl_protocols TLSv1 TLSv1.1 TLSv1.2;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxySslProtocols extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ProxySslProtocols() {
		super(contexts, "TLSv1 TLSv1.1 TLSv1.2", "proxy_ssl_protocols");
	}

}
