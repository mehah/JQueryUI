package com.jqueryui.widget.progressbar;

import java.util.HashMap;

import com.jQuery.JQuery;
import com.jqueryui.JQueryUI;

import com.jrender.jscript.DOMHandle;
import com.jrender.jscript.dom.Element;
import com.jrender.jscript.dom.Window;

public class Progressbar extends JQueryUI<Progressbar, ProgressbarOptions>{
	public Progressbar(Element e, boolean initialize) { super(e, initialize); }
	public Progressbar(JQuery j, boolean initialize) { super(j, initialize); }
	public Progressbar(String selector, boolean initialize) { super(selector, initialize); }
	public Progressbar(Element e, HashMap<ProgressbarOptions, Object> options, Window window) { super(e, options, window); }
	public Progressbar(Element e, HashMap<ProgressbarOptions, Object> options) { super(e, options); }
	public Progressbar(Element e) { super(e); }
	public Progressbar(JQuery j, HashMap<ProgressbarOptions, Object> options, Window window) { super(j, options, window); }
	public Progressbar(JQuery j, HashMap<ProgressbarOptions, Object> options) { super(j, options); }
	public Progressbar(JQuery j) { super(j); }
	public Progressbar(String selector, HashMap<ProgressbarOptions, Object> options, Window window) { super(selector, options, window); }
	public Progressbar(String selector, HashMap<ProgressbarOptions, Object> options) { super(selector, options); }
	public Progressbar(String selector) { super(selector); }
	
	protected void defaultValue() {
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"disabled", false);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"max", 1024);		
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"value", 25);
	}
	
	public final Progressbar progressbar(ProgressbarMethods option)
	{
		progressbar(option, Object.class);
		return this;
	}
	
	@SuppressWarnings("unchecked")
	public final<C> C  progressbar(ProgressbarMethods option, Class<C> cast)
	{
		switch (option) {	
			case widget:	
				return (C) getWidget();
				
			default:
				DOMHandle.execCommand(this, componentName, option.name());
		}
		
		return (C) this;
	}
	
	public final<C> C progressbar(ProgressbarOptions option, Class<C> cast)
	{
		return getOption(option, cast);
	}
	
	public final Progressbar progressbar(ProgressbarOptions option, Object value)
	{
		return setOption(option, value);
	}

	protected void onSetOption(ProgressbarOptions o, Object value) {}	
}
