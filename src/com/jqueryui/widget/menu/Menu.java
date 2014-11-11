package com.jqueryui.widget.menu;

import java.util.HashMap;

import com.jQuery.JQuery;
import greencode.jscript.DOMHandle;
import greencode.jscript.Element;
import greencode.jscript.Window;

import com.google.gson.JsonObject;
import com.jqueryui.JQueryUI;

public class Menu extends JQueryUI<Menu, MenuOptions>{
	public Menu(Element e, boolean initialize) { super(e, initialize); }
	public Menu(JQuery j, boolean initialize) { super(j, initialize); }
	public Menu(String selector, boolean initialize) { super(selector, initialize); }
	public Menu(Element e, HashMap<MenuOptions, Object> options, Window window) { super(e, options, window); }
	public Menu(Element e, HashMap<MenuOptions, Object> options) { super(e, options); }
	public Menu(Element e) { super(e); }
	public Menu(JQuery j, HashMap<MenuOptions, Object> options, Window window) { super(j, options, window); }
	public Menu(JQuery j, HashMap<MenuOptions, Object> options) { super(j, options); }
	public Menu(JQuery j) { super(j); }
	public Menu(String selector, HashMap<MenuOptions, Object> options, Window window) { super(selector, options, window); }
	public Menu(String selector, HashMap<MenuOptions, Object> options) { super(selector, options); }
	public Menu(String selector) { super(selector); }
	
	protected void defaultValue() {
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"disabled", false);
		
		JsonObject icons = new JsonObject();
		icons.addProperty("submenu", "ui-icon-carat-1-e");		
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"icons", icons);
		
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"menus", "ul");
		
		JsonObject position = new JsonObject();
		icons.addProperty("my", "left top");
		icons.addProperty("at", "right top");
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"menus", position);
		
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"role", "menu");
	}
	
	public final Menu menu(MenuMethods option)
	{
		menu(option, Object.class);
		return this;
	}
	
	@SuppressWarnings("unchecked")
	public final<C> C  menu(MenuMethods option, Class<C> cast)
	{
		switch (option) {	
			case widget:	
				return (C) getWidget();
				
			case isLastItem:
			case isFirstItem:
				return DOMHandle.getVariableValueByCommand(this, COMPONENT_VAR_OPTION_NAME+option.name(), cast, componentName, option.name());
				
			default:
				DOMHandle.execCommand(this, componentName, option.name());
		}
		
		return (C) this;
	}
	
	public final<C> C menu(MenuOptions option, Class<C> cast)
	{
		return getOption(option, cast);
	}
	
	public final Menu menu(MenuOptions option, Object value)
	{
		return setOption(option, value);
	}
	
	protected void onSetOption(MenuOptions o, Object value) {}	
}
