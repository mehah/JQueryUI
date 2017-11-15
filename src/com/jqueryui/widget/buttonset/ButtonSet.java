package com.jqueryui.widget.buttonset;

import java.util.HashMap;

import com.jQuery.JQuery;
import com.jqueryui.JQueryUI;

import com.jrender.jscript.DOMHandle;
import com.jrender.jscript.dom.Element;
import com.jrender.jscript.dom.Window;

public class ButtonSet extends JQueryUI<ButtonSet, ButtonSetOptions>{
	
	public ButtonSet(Element e, boolean initialize) { super(e, initialize); }
	public ButtonSet(JQuery j, boolean initialize) { super(j, initialize); }
	public ButtonSet(String selector, boolean initialize) { super(selector, initialize); }
	public ButtonSet(Element e, HashMap<ButtonSetOptions, Object> options, Window window) { super(e, options, window); }
	public ButtonSet(Element e, HashMap<ButtonSetOptions, Object> options) { super(e, options); }
	public ButtonSet(Element e) { super(e); }
	public ButtonSet(JQuery j, HashMap<ButtonSetOptions, Object> options, Window window) { super(j, options, window); }
	public ButtonSet(JQuery j, HashMap<ButtonSetOptions, Object> options) { super(j, options); }
	public ButtonSet(JQuery j) { super(j); }
	public ButtonSet(String selector, HashMap<ButtonSetOptions, Object> options, Window window) { super(selector, options, window); }
	public ButtonSet(String selector, HashMap<ButtonSetOptions, Object> options) { super(selector, options); }
	public ButtonSet(String selector) { super(selector); }
	
	protected void defaultValue() {
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"disabled", false);		
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"items", "button, input[type=button], input[type=submit], input[type=reset], input[type=checkbox], input[type=radio], a, :data(ui-button)");
	}
	
	public final ButtonSet buttonset(ButtonSetMethods option)
	{
		buttonset(option, Object.class);
		return this;
	}
	
	@SuppressWarnings("unchecked")
	public final<C> C buttonset(ButtonSetMethods option, Class<C> cast)
	{
		switch (option) {
			case widget:
				return (C) getWidget();
				
			default:
				DOMHandle.execCommand(this, componentName, option.name());
		}
		
		return (C) this;
	}
	
	public final<C> C buttonset(ButtonSetOptions option, Class<C> cast)
	{
		return getOption(option, cast);
	}
	
	public final ButtonSet buttonset(ButtonSetOptions option, Object value)
	{
		return setOption(option, value);
	}
	
	protected void onSetOption(ButtonSetOptions o, Object value) {}	
}
