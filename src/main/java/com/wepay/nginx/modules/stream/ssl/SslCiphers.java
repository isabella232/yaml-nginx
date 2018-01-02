/********************************************************** 
* Syntax: ssl_ciphers ciphers;
* Default: ssl_ciphers HIGH:!aNULL:!MD5;
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.ssl;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SslCiphers extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM,SERVER);
	}
	public SslCiphers() {
		super(contexts, "HIGH:!aNULL:!MD5", "ssl_ciphers");
	}

}
