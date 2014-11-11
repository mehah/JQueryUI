package com.jqueryui.widget.dialog;

import greencode.jscript.DOMHandle;
import greencode.jscript.Element;
import greencode.jscript.Window;
import com.jQuery.JQuery;

import java.util.HashMap;
import java.util.List;

import com.jqueryui.JQueryUI;

public class Dialog extends JQueryUI<Dialog, DialogOptions>{
	public Dialog(Element e, boolean initialize) { super(e, initialize); }
	public Dialog(JQuery j, boolean initialize) { super(j, initialize); }
	public Dialog(String selector, boolean initialize) { super(selector, initialize); }
	public Dialog(Element e, HashMap<DialogOptions, Object> options, Window window) { super(e, options, window); }
	public Dialog(Element e, HashMap<DialogOptions, Object> options) { super(e, options); }
	public Dialog(Element e) { super(e); }
	public Dialog(JQuery j, HashMap<DialogOptions, Object> options, Window window) { super(j, options, window); }
	public Dialog(JQuery j, HashMap<DialogOptions, Object> options) { super(j, options); }
	public Dialog(JQuery j) { super(j); }
	public Dialog(String selector, HashMap<DialogOptions, Object> options, Window window) { super(selector, options, window); }
	public Dialog(String selector, HashMap<DialogOptions, Object> options) { super(selector, options); }
	public Dialog(String selector) { super(selector); }
	
	protected void defaultValue() {
		DOMHandle.setVariableValue(this, COMPONENT_VAR_NAME+DialogMethods.isOpen.name(), true);
		
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"appendTo", "body");
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"autoOpen", true);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"closeOnEscape", true);		
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"closeText", "close");		
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"dialogClass", "");
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"disabled", false);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"draggable", true);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"height", "auto");
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"hide", null);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"maxHeight", null);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"maxWidth", null);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"minHeight", 150);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"minWidth", 150);		
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"modal", false);		
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"position", null);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"resizable", true);		
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"show", null);		
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"title", null);		
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"width", 300);		
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"closeButton", null);
	}
	
	protected void onSetOption(DialogOptions o, Object value) {
		if(o.equals(DialogOptions.autoOpen))
			DOMHandle.setVariableValue(this, COMPONENT_VAR_NAME+DialogMethods.isOpen.name(), value);
	}
	
	public final Dialog dialog(DialogMethods option)
	{
		dialog(option, Object.class);
		return this;
	}
	
	@SuppressWarnings("unchecked")
	public final<C> C dialog(DialogMethods option, Class<C> cast)
	{
		switch (option) {
			case isOpen:
				return DOMHandle.getVariableValueByCommand(this, COMPONENT_VAR_NAME+option.name(), cast, componentName, option.name());
	
			case widget:
				return (C) getWidget();
			
			case closeButton:
				checkCast("Cast closeButton to JQuery.class", cast, JQuery.class);
				return (C) ((JQuery)dialog(DialogMethods.widget, cast)).find(".ui-dialog-titlebar-close");
				
			case close:
				DOMHandle.setVariableValue(this, COMPONENT_VAR_NAME+DialogMethods.isOpen.name(), false);	
				break;
				
			case open:
				DOMHandle.setVariableValue(this, COMPONENT_VAR_NAME+DialogMethods.isOpen.name(), true);	
				break;
		}
		
		DOMHandle.execCommand(this, componentName, option.name());
		return (C) this;
	}
	
	public final<C> C dialog(DialogOptions option, Class<C> cast)
	{
		return getOption(option, cast);
	}
	
	public final Dialog dialog(DialogOptions option, Object value)
	{
		return setOption(option, value);
	}
	
	public final Dialog registerButtons(List<DialogButton> buttons)
	{
		for (int i = -1, s = buttons.size(); ++i < s;)
		{
			buttons.get(i).mainElementUID = DOMHandle.getUID(this);
		}
		return dialog(DialogOptions.buttons, buttons);		
	}	
}
