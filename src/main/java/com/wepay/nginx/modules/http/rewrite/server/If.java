/********************************************************** 
* Syntax: if (condition) { ... }
* Default: —
* Context: server, location    
**********************************************************/
package com.wepay.nginx.modules.http.rewrite.server;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wepay.nginx.Dumps;
import com.wepay.nginx.helper.NginxHelper;
import com.wepay.nginx.modules.http.core.Server;
import com.wepay.nginx.modules.http.rewrite.Break;
import com.wepay.nginx.modules.http.rewrite.Condition;
import com.wepay.nginx.modules.http.rewrite.Return;
import com.wepay.nginx.modules.http.rewrite.Rewrite;
import com.wepay.nginx.modules.http.rewrite.RewriteLog;
import com.wepay.nginx.modules.http.rewrite.Rewrites;
import com.wepay.nginx.modules.http.rewrite.SetClass;
import com.wepay.nginx.modules.http.rewrite.UninitializedVariableWarn;

public class If extends Server {
	static final List<String> contexts;

	static {
		contexts = Arrays.asList(SERVER, LOCATION);
	}

	@JsonProperty("condition")
	private Condition condition;
	
	@JsonProperty("break")
	private Break breakO;

	@JsonProperty("return")
	private Return returnO;

	@JsonProperty("rewrite")
	private Rewrite rewrite;
	
	@JsonProperty("rewrites")
	private Rewrites rewrites;

	@JsonProperty("rewrite_log")
	private RewriteLog rewriteLog;

	@JsonProperty("set")
	private SetClass setO;

	@JsonProperty("uninitialized_variable_warn")
	private UninitializedVariableWarn uninitializedVariableWarn;

	public If() {
		super(contexts, null, "if");
	}
	
	public Condition getCondition(){
		return condition;
	}
	@Override
	public void populateMap() {
		Map<String, Dumps> map = getMap();
		map.put("rewrites", rewrites);
		map.put("break", breakO);
		map.put("return", returnO);
		map.put("rewrite", rewrite);
		map.put("rewrite_log", rewriteLog);
		map.put("set", setO);
		map.put("uninitialized_variable_warn", uninitializedVariableWarn);

	}
	 
	public String getBlockName() {
		return "("+getCondition().getValue()+")";
	}
	
	@Override
	public String dump(int level) throws Exception {
		String s = super.dump(level + SPACE_COUNT);
		String pre = NginxHelper.getSpace(level);
		return updateConditionBlock(level,
				String.format(NAMED_CONTEXT_PRINT_FORMAT, pre, getClassAnnotation(), getBlockName(), s, pre));
	}
}
