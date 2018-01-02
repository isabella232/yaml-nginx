/********************************************************** 
* Syntax: ssl_client_certificate file;
* Default: —
* Context: mail, server    
**********************************************************/
package com.wepay.nginx.modules.mail.ssl;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SslClientCertificate extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIL,SERVER);
	}
	public SslClientCertificate() {
		super(contexts, null, "ssl_client_certificate");
	}

}
