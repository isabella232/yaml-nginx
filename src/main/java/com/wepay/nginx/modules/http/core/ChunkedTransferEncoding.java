/********************************************************** 
* Syntax: chunked_transfer_encoding on | off;
* Default: chunked_transfer_encoding on;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ChunkedTransferEncoding extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ChunkedTransferEncoding() {
		super(contexts, "on", "chunked_transfer_encoding");
	}

}
