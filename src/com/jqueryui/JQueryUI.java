package com.jqueryui;

import java.util.HashMap;
import java.util.Map.Entry;

import com.jQuery.JQuery;
import greencode.jscript.DOMHandle;
import greencode.jscript.Element;
import greencode.jscript.Window;
import greencode.kernel.Console;

public abstract class JQueryUI<E extends JQueryUI<E, O>, O extends Enum<O>> extends JQuery {
	public JQueryUI(String selector, boolean initialize) {
		super(selector); if(initialize) initialize(null);
	}
	
	public JQueryUI(Element e, boolean initialize) {
		super(e); if(initialize) initialize(null);
	}

	public JQueryUI(JQuery j, boolean initialize) {
		super(j); if(initialize) initialize(null);
	}
	
	public JQueryUI(String selector) {
		super(selector); initialize(null);
	}
	
	public JQueryUI(Element e) {
		super(e); initialize(null);
	}

	public JQueryUI(JQuery j) {
		super(j); initialize(null);
	}
	
	public JQueryUI(String selector, HashMap<O, Object> options) {
		super(selector); initialize(options);
	}
	
	public JQueryUI(Element e, HashMap<O, Object> options) {
		super(e); initialize(options);
	}

	public JQueryUI(JQuery j, HashMap<O, Object> options) {
		super(j); initialize(options);
	}
	
	public JQueryUI(Element e, HashMap<O, Object> options, Window window) {
		super(e, window); initialize(options);
	}

	public JQueryUI(JQuery j, HashMap<O, Object> options, Window window) {
		super(j, window); initialize(options);
	}

	public JQueryUI(String selector, HashMap<O, Object> options, Window window) {
		super(selector, window); initialize(options);
	}

	protected final transient String componentName = getClass().getSimpleName().toLowerCase();
	protected final transient String COMPONENT_VAR_NAME = "jqueryui."+componentName+".";
	protected final transient String COMPONENT_VAR_OPTION_NAME = "jqueryui."+componentName+".option.";
	
	protected abstract void defaultValue();
	protected abstract void onSetOption(O o, Object value);
	
	private void initialize(HashMap<O, Object> options)
	{
		defaultValue();
		if(options != null)
		{
			DOMHandle.execCommand(this, componentName, options);
			
			for(Entry<O, Object> entry : options.entrySet())
			{
				DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+entry.getKey(), entry.getValue());
				onSetOption(entry.getKey(), entry.getValue());
			}
		}
		else
			DOMHandle.execCommand(this, componentName);
	}
	
	protected final JQuery getWidget()
	{
		JQuery widget = DOMHandle.getVariableValue(this, COMPONENT_VAR_NAME+"widget", JQuery.class);
		
		if(widget == null)
		{
			widget = getInstance(window);
			DOMHandle.setVariableValue(this, COMPONENT_VAR_NAME+"widget", widget);
			DOMHandle.registerReturnByCommand(this, DOMHandle.getUID(widget), componentName, "widget");
		}
		
		return widget;
	}
	
	protected final<C> C getOption(O option, Class<C> cast)
	{
		return DOMHandle.getVariableValueByCommand(this, COMPONENT_VAR_OPTION_NAME+option.name(), cast, componentName, "option", option.name());
	}
	
	@SuppressWarnings("unchecked")
	protected final E setOption(O option, Object value)
	{
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+option.name(), value);
		DOMHandle.execCommand(this, componentName, "option", option.name(), value);
		return (E) this;
	}
	
	protected void checkCast(String msg, Class<?> Class, Class<?> cast) {
		if(!Class.equals(cast))
			Console.error(msg);
	}
}
