package com.jqueryui.widget.dialog;

import greencode.jscript.event.EventObject;
import greencode.jscript.function.implementation.Function;

public abstract class DialogEventHandler implements Function {
	public abstract void init(EventObject event, DialogEventObject ui);
}
