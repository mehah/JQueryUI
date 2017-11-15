package com.jqueryui.widget.dialog;

import com.jrender.jscript.dom.event.EventObject;
import com.jrender.jscript.dom.function.implementation.Function;

public abstract class DialogEventHandler implements Function {
	public abstract void init(EventObject event, DialogEventObject ui);
}
