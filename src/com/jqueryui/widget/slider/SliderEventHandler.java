package com.jqueryui.widget.slider;

import greencode.jscript.dom.event.EventObject;
import greencode.jscript.dom.function.implementation.Function;

public abstract class SliderEventHandler implements Function {
	public abstract void init(EventObject event, SliderEventObject ui);
}
