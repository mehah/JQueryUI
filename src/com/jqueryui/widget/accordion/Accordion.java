package com.jqueryui.widget.accordion;

import java.util.HashMap;

import jQuery.JQuery;

import com.google.gson.JsonObject;
import com.jqueryui.JQueryUI;

import greencode.jscript.DOMHandle;
import greencode.jscript.Element;
import greencode.jscript.Window;
import greencode.jscript.event.Events;

public class Accordion extends JQueryUI<Accordion, AccordionOptions>{
	
	public Accordion(Element e, boolean initialize) { super(e, initialize); }
	public Accordion(JQuery j, boolean initialize) { super(j, initialize); }
	public Accordion(String selector, boolean initialize) { super(selector, initialize); }
	public Accordion(Element e, HashMap<AccordionOptions, Object> options, Window window) { super(e, options, window); }
	public Accordion(Element e, HashMap<AccordionOptions, Object> options) { super(e, options); }
	public Accordion(Element e) { super(e); }
	public Accordion(JQuery j, HashMap<AccordionOptions, Object> options, Window window) { super(j, options, window); }
	public Accordion(JQuery j, HashMap<AccordionOptions, Object> options) { super(j, options); }
	public Accordion(JQuery j) { super(j); }
	public Accordion(String selector, HashMap<AccordionOptions, Object> options, Window window) { super(selector, options, window); }
	public Accordion(String selector, HashMap<AccordionOptions, Object> options) { super(selector, options); }
	public Accordion(String selector) { super(selector); }

	protected void defaultValue() {
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"active", "0");
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"animateType", new JsonObject());		
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"collapsible", false);			
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"disabled", false);		
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"event", Events.CLICK);		
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"header", "> li > :first-child,> :not(li):even");
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"heightStyle", "auto");
		
		JsonObject icons = new JsonObject();
		icons.addProperty("header", "ui-icon-triangle-1-e");
		icons.addProperty("activeHeader", "ui-icon-triangle-1-s");
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"icons", icons);
	}
	
	protected void onSetOption(AccordionOptions o, Object value) {}
	
	public final Accordion accordion(AccordionMethods option)
	{
		accordion(option, Object.class);
		return this;
	}
	
	@SuppressWarnings("unchecked")
	public final<C> C accordion(AccordionMethods option, Class<C> cast)
	{
		switch (option) {
			case widget:
				return (C) getWidget();
				
			default:
				DOMHandle.execCommand(this, componentName, option.name());
		}
		
		return (C) this;
	}
	
	public final<C> C accordion(AccordionOptions option, Class<C> cast)
	{
		return getOption(option, cast);
	}
	
	public final Accordion accordion(AccordionOptions option, Object value)
	{
		return setOption(option, value);
	}		
}
