package com.jqueryui.widget.slider;

import greencode.jscript.event.EventObject;
import greencode.jscript.function.implementation.Function;

public abstract class SliderEventHandler implements Function {
	public abstract void init(EventObject event, SliderEventObject ui);
}
