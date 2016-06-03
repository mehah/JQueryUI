package com.jqueryui.widget.dialog;

import greencode.jscript.dom.event.EventObject;
import greencode.jscript.dom.function.implementation.Function;

public abstract class DialogEventHandler implements Function {
	public abstract void init(EventObject event, DialogEventObject ui);
}
