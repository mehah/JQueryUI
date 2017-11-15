package com.jqueryui.widget.spinner;

import java.util.HashMap;

import com.jQuery.JQuery;
import com.google.gson.JsonObject;
import com.jqueryui.JQueryUI;

import com.jrender.jscript.DOMHandle;
import com.jrender.jscript.dom.Element;
import com.jrender.jscript.dom.Window;

public class Spinner extends JQueryUI<Spinner, SpinnerOptions>{
	public Spinner(Element e, boolean initialize) { super(e, initialize); }
	public Spinner(JQuery j, boolean initialize) { super(j, initialize); }
	public Spinner(String selector, boolean initialize) { super(selector, initialize); }
	public Spinner(Element e, HashMap<SpinnerOptions, Object> options, Window window) { super(e, options, window); }
	public Spinner(Element e, HashMap<SpinnerOptions, Object> options) { super(e, options); }
	public Spinner(Element e) { super(e); }
	public Spinner(JQuery j, HashMap<SpinnerOptions, Object> options, Window window) { super(j, options, window); }
	public Spinner(JQuery j, HashMap<SpinnerOptions, Object> options) { super(j, options); }
	public Spinner(JQuery j) { super(j); }
	public Spinner(String selector, HashMap<SpinnerOptions, Object> options, Window window) { super(selector, options, window); }
	public Spinner(String selector, HashMap<SpinnerOptions, Object> options) { super(selector, options); }
	public Spinner(String selector) { super(selector); }
	
	protected void defaultValue() {
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"culture", null);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"disabled", false);
		
		JsonObject icons = new JsonObject();
		icons.addProperty("down", "ui-icon-triangle-1-s");
		icons.addProperty("up", "ui-icon-triangle-1-n");
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"icons", icons);
		
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"incremental", true);			
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"max", null);		
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"min", null);		
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"numberFormat", null);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"page", 10);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"step", 1);
	}
	
	public final Spinner spinner(SpinnerMethods option)
	{
		spinner(option, Object.class);
		return this;
	}
	
	@SuppressWarnings("unchecked")
	public final<C> C spinner(SpinnerMethods option, Class<C> cast)
	{
		switch (option) {
			case widget:
				return (C) getWidget();
				
			default:
				DOMHandle.execCommand(this, componentName, option.name());
		}
		
		return (C) this;
	}
	
	public final<C> C spinner(SpinnerOptions option, Class<C> cast)
	{
		return getOption(option, cast);
	}
	
	public final Spinner spinner(SpinnerOptions option, Object value)
	{
		return setOption(option, value);
	}
	
	protected void onSetOption(SpinnerOptions o, Object value) {}
}
