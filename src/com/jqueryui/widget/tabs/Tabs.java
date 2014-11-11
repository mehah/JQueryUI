package com.jqueryui.widget.tabs;

import java.util.HashMap;

import com.jQuery.JQuery;
import greencode.jscript.DOMHandle;
import greencode.jscript.Element;
import greencode.jscript.Window;
import greencode.jscript.event.Events;

import com.jqueryui.JQueryUI;

public class Tabs extends JQueryUI<Tabs, TabsOptions>{
	public Tabs(Element e, boolean initialize) { super(e, initialize); }
	public Tabs(JQuery j, boolean initialize) { super(j, initialize); }
	public Tabs(String selector, boolean initialize) { super(selector, initialize); }
	public Tabs(Element e, HashMap<TabsOptions, Object> options, Window window) { super(e, options, window); }
	public Tabs(Element e, HashMap<TabsOptions, Object> options) { super(e, options); }
	public Tabs(Element e) { super(e); }
	public Tabs(JQuery j, HashMap<TabsOptions, Object> options, Window window) { super(j, options, window); }
	public Tabs(JQuery j, HashMap<TabsOptions, Object> options) { super(j, options); }
	public Tabs(JQuery j) { super(j); }
	public Tabs(String selector, HashMap<TabsOptions, Object> options, Window window) { super(selector, options, window); }
	public Tabs(String selector, HashMap<TabsOptions, Object> options) { super(selector, options); }
	public Tabs(String selector) { super(selector); }
	
	protected void defaultValue() {
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"active", 0);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"collapsible", false);
				
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"disabled", false);			
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"event", Events.CLICK);		
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"heightStyle", "content");		
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"hide", null);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"show", null);
	}
	
	public final Tabs tabs(TabsMethods option)
	{
		tabs(option, Object.class);
		return this;
	}
	
	@SuppressWarnings("unchecked")
	public final<C> C tabs(TabsMethods option, Class<C> cast)
	{
		switch (option) {
			case widget:
				return (C) getWidget();
				
			default:
				DOMHandle.execCommand(this, componentName, option.name());
		}
		
		return (C) this;
	}
	
	public final<C> C tabs(TabsOptions option, Class<C> cast)
	{
		return getOption(option, cast);
	}
	
	public final Tabs tabs(TabsOptions option, Object value)
	{
		return setOption(option, value);
	}
	
	protected void onSetOption(TabsOptions o, Object value) {}	
}
