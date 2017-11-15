package com.jqueryui.widget.slider;

import com.jrender.jscript.dom.event.EventObject;
import com.jrender.jscript.dom.function.implementation.Function;

public abstract class SliderEventHandler implements Function {
	public abstract void init(EventObject event, SliderEventObject ui);
}
