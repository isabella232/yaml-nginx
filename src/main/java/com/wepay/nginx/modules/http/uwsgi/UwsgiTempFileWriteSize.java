/********************************************************** 
* Syntax: uwsgi_temp_file_write_size size;
* Default: uwsgi_temp_file_write_size 8k|16k;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiTempFileWriteSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public UwsgiTempFileWriteSize() {
		super(contexts, "8k|16k", "uwsgi_temp_file_write_size");
	}

}
