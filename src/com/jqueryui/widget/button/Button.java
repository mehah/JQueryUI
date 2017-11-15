package com.jqueryui.widget.button;

import java.util.HashMap;

import com.jQuery.JQuery;
import com.google.gson.JsonObject;
import com.jqueryui.JQueryUI;

import com.jrender.jscript.DOMHandle;
import com.jrender.jscript.dom.Element;
import com.jrender.jscript.dom.Window;

public class Button extends JQueryUI<Button, ButtonOptions>{
	
	public Button(Element e, boolean initialize) { super(e, initialize); }
	public Button(JQuery j, boolean initialize) { super(j, initialize); }
	public Button(String selector, boolean initialize) { super(selector, initialize); }
	public Button(Element e, HashMap<ButtonOptions, Object> options, Window window) { super(e, options, window); }
	public Button(Element e, HashMap<ButtonOptions, Object> options) { super(e, options); }
	public Button(Element e) { super(e); }
	public Button(JQuery j, HashMap<ButtonOptions, Object> options, Window window) { super(j, options, window); }
	public Button(JQuery j, HashMap<ButtonOptions, Object> options) { super(j, options); }
	public Button(JQuery j) { super(j); }
	public Button(String selector, HashMap<ButtonOptions, Object> options, Window window) { super(selector, options, window); }
	public Button(String selector, HashMap<ButtonOptions, Object> options) { super(selector, options); }
	public Button(String selector) { super(selector); }
	
	protected void defaultValue() {
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"disabled", false);
		JsonObject icons = new JsonObject();
		icons.add("primary", null);
		icons.add("secondary", null);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"icons", icons);
		
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"label", null);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"text", true);
	}
	
	public final Button button(ButtonMethods option)
	{
		button(option, Object.class);
		return this;
	}
	
	@SuppressWarnings("unchecked")
	public final<C> C button(ButtonMethods option, Class<C> cast)
	{
		switch (option) {
			case widget:
				return (C) getWidget();
				
			default:
				DOMHandle.execCommand(this, componentName, option.name());
		}
		
		return (C) this;
	}
	
	public final<C> C button(ButtonOptions option, Class<C> cast)
	{
		return getOption(option, cast);
	}
	
	public final Button button(ButtonOptions option, Object value)
	{
		return setOption(option, value);
	}
	
	protected void onSetOption(ButtonOptions o, Object value) {}	
}
