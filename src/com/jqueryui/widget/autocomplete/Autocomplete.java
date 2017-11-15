package com.jqueryui.widget.autocomplete;

import java.util.HashMap;

import com.jQuery.JQuery;
import com.google.gson.JsonObject;
import com.jqueryui.JQueryUI;

import com.jrender.jscript.DOMHandle;
import com.jrender.jscript.dom.Element;
import com.jrender.jscript.dom.Window;

public class Autocomplete extends JQueryUI<Autocomplete, AutocompleteOptions>{
	public Autocomplete(Element e, boolean initialize) { super(e, initialize); }
	public Autocomplete(JQuery j, boolean initialize) { super(j, initialize); }
	public Autocomplete(String selector, boolean initialize) { super(selector, initialize); }
	public Autocomplete(Element e, HashMap<AutocompleteOptions, Object> options, Window window) { super(e, options, window); }
	public Autocomplete(Element e, HashMap<AutocompleteOptions, Object> options) { super(e, options); }
	public Autocomplete(Element e) { super(e); }
	public Autocomplete(JQuery j, HashMap<AutocompleteOptions, Object> options, Window window) { super(j, options, window); }
	public Autocomplete(JQuery j, HashMap<AutocompleteOptions, Object> options) { super(j, options); }
	public Autocomplete(JQuery j) { super(j); }
	public Autocomplete(String selector, HashMap<AutocompleteOptions, Object> options, Window window) { super(selector, options, window); }
	public Autocomplete(String selector, HashMap<AutocompleteOptions, Object> options) { super(selector, options); }
	public Autocomplete(String selector) { super(selector); }
	
	protected void defaultValue() {
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"appendTo", null);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"autoFocus", false);		
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"delay", 300);			
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"minLength", 1);
		
		JsonObject position = new JsonObject();
		position.addProperty("my", "left top");
		position.addProperty("at", "left bottom");
		position.addProperty("collision", "none");
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"position", position);
		
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"source", null);
	}
	
	protected void onSetOption(AutocompleteOptions o, Object value) {}
	
	public final Autocomplete autocomplete(AutocompleteMethods option)
	{
		autocomplete(option, Object.class);
		return this;
	}
	
	@SuppressWarnings("unchecked")
	public final<C> C autocomplete(AutocompleteMethods option, Class<C> cast)
	{
		switch (option) {
			case widget:
				return (C) getWidget();
				
			default:
				DOMHandle.execCommand(this, componentName, option.name());
		}
		
		return (C) this;
	}
	
	public final<C> C autocomplete(AutocompleteOptions option, Class<C> cast)
	{
		return getOption(option, cast);
	}
	
	public final Autocomplete autocomplete(AutocompleteOptions option, Object value)
	{
		return setOption(option, value);
	}	
}
