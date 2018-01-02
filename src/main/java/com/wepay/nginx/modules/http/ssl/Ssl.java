/********************************************************** 
* Syntax: ssl on | off;
* Default: ssl off;
* Context: http, server    
**********************************************************/
package com.wepay.nginx.modules.http.ssl;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Ssl extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER);
	}
	public Ssl() {
		super(contexts, "off", "ssl");
	}

}
