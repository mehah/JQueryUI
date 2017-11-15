package com.jqueryui.widget.dialog;

import com.jrender.jscript.dom.FunctionHandle;

public class DialogButton {
	private String text;
	private FunctionHandle click;
	
	Integer mainElementUID;
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public FunctionHandle getClick() {
		return click;
	}

	public void setClick(FunctionHandle click) {
		this.click = click;
	}
}
