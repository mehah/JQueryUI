package com.jqueryui.widget.tooltip;

import java.util.HashMap;

import com.google.gson.JsonObject;
import com.jQuery.JQuery;
import com.jqueryui.JQueryUI;

import greencode.jscript.DOMHandle;
import greencode.jscript.dom.Element;
import greencode.jscript.dom.Window;

public class Tooltip extends JQueryUI<Tooltip, TooltipOptions>{
	public Tooltip(Element e, boolean initialize) { super(e, initialize); }
	public Tooltip(JQuery j, boolean initialize) { super(j, initialize); }
	public Tooltip(String selector, boolean initialize) { super(selector, initialize); }
	public Tooltip(Element e, HashMap<TooltipOptions, Object> options, Window window) { super(e, options, window); }
	public Tooltip(Element e, HashMap<TooltipOptions, Object> options) { super(e, options); }
	public Tooltip(Element e) { super(e); }
	public Tooltip(JQuery j, HashMap<TooltipOptions, Object> options, Window window) { super(j, options, window); }
	public Tooltip(JQuery j, HashMap<TooltipOptions, Object> options) { super(j, options); }
	public Tooltip(JQuery j) { super(j); }
	public Tooltip(String selector, HashMap<TooltipOptions, Object> options, Window window) { super(selector, options, window); }
	public Tooltip(String selector, HashMap<TooltipOptions, Object> options) { super(selector, options); }
	public Tooltip(String selector) { super(selector); }
	
	protected void defaultValue() {
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"content", null);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"disabled", false);
				
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"hide", null);			
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"items", "[title]");	
		
		
		JsonObject position = new JsonObject();
		position.addProperty("my", "left top+15");
		position.addProperty("at", "left bottom");
		position.addProperty("collision", "flipfit");
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"position", position);
		
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"show", null);		
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"tooltipClass", null);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"track", false);
	}
	
	public final Tooltip tooltip(TooltipMethods option)
	{
		tooltip(option, Object.class);
		return this;
	}
	
	@SuppressWarnings("unchecked")
	public final<C> C tooltip(TooltipMethods option, Class<C> cast)
	{
		switch (option) {
			case widget:
				return (C) getWidget();
				
			default:
				DOMHandle.execCommand(this, componentName, option.name());
		}
		
		return (C) this;
	}
	
	public final<C> C tooltip(TooltipOptions option, Class<C> cast)
	{
		return getOption(option, cast);
	}
	
	public final Tooltip tooltip(TooltipOptions option, Object value)
	{
		return setOption(option, value);
	}
	protected void onSetOption(TooltipOptions o, Object value) {}
}
