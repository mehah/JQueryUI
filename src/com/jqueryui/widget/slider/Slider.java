package com.jqueryui.widget.slider;

import java.util.HashMap;

import jQuery.JQuery;
import greencode.jscript.DOMHandle;
import greencode.jscript.Element;
import greencode.jscript.Window;

import com.jqueryui.JQueryUI;

public class Slider extends JQueryUI<Slider, SliderOptions>{
	public Slider(Element e, boolean initialize) { super(e, initialize); }
	public Slider(JQuery j, boolean initialize) { super(j, initialize); }
	public Slider(String selector, boolean initialize) { super(selector, initialize); }
	public Slider(Element e, HashMap<SliderOptions, Object> options, Window window) { super(e, options, window); }
	public Slider(Element e, HashMap<SliderOptions, Object> options) { super(e, options); }
	public Slider(Element e) { super(e); }
	public Slider(JQuery j, HashMap<SliderOptions, Object> options, Window window) { super(j, options, window); }
	public Slider(JQuery j, HashMap<SliderOptions, Object> options) { super(j, options); }
	public Slider(JQuery j) { super(j); }
	public Slider(String selector, HashMap<SliderOptions, Object> options, Window window) { super(selector, options, window); }
	public Slider(String selector, HashMap<SliderOptions, Object> options) { super(selector, options); }
	public Slider(String selector) { super(selector); }
	
	protected void defaultValue() {
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"animate", false);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"disabled", false);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"max", 100);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"min", 0);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"orientation", "horizontal");
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"range", false);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"step", 1);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"value", 0);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"values", null);
	}
	
	public final Slider slider(SliderMethods option)
	{
		slider(option, Object.class);
		return this;
	}
	
	@SuppressWarnings("unchecked")
	public final<C> C  slider(SliderMethods option, Class<C> cast)
	{
		switch (option) {	
			case widget:	
				return (C) getWidget();
				
			default:
				DOMHandle.execCommand(this, componentName, option.name());
		}
		
		return (C) this;
	}
	
	public final<C> C slider(SliderOptions option, Class<C> cast)
	{
		return getOption(option, cast);
	}
	
	public final Slider slider(SliderOptions option, Object value)
	{
		return setOption(option, value);
	}
	
	protected void onSetOption(SliderOptions o, Object value) {}
}
