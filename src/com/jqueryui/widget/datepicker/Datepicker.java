package com.jqueryui.widget.datepicker;

import java.util.HashMap;

import com.jQuery.JQuery;
import com.google.gson.JsonObject;
import com.jqueryui.JQueryUI;

import com.jrender.jscript.DOMHandle;
import com.jrender.jscript.dom.Element;
import com.jrender.jscript.dom.Window;

public class Datepicker extends JQueryUI<Datepicker, DatepickerOptions>{
	public Datepicker(Element e, boolean initialize) { super(e, initialize); }
	public Datepicker(JQuery j, boolean initialize) { super(j, initialize); }
	public Datepicker(String selector, boolean initialize) { super(selector, initialize); }
	public Datepicker(Element e, HashMap<DatepickerOptions, Object> options, Window window) { super(e, options, window); }
	public Datepicker(Element e, HashMap<DatepickerOptions, Object> options) { super(e, options); }
	public Datepicker(Element e) { super(e); }
	public Datepicker(JQuery j, HashMap<DatepickerOptions, Object> options, Window window) { super(j, options, window); }
	public Datepicker(JQuery j, HashMap<DatepickerOptions, Object> options) { super(j, options); }
	public Datepicker(JQuery j) { super(j); }
	public Datepicker(String selector, HashMap<DatepickerOptions, Object> options, Window window) { super(selector, options, window); }
	public Datepicker(String selector, HashMap<DatepickerOptions, Object> options) { super(selector, options); }
	public Datepicker(String selector) { super(selector); }
	
	protected void defaultValue() {
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"altField", "");
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"altFormat", "");
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"appendText", "");
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"autoSize", false);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"beforeShow", null);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"beforeShowDay", null);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"buttonImage", "");
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"buttonImageOnly", false);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"buttonText", "...");
		/*setVariableValue(COMPONENT_VAR_OPTION_NAME+"calculateWeek", null);*/
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"changeMonth", false);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"changeYear", false);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"closeText", "Done");
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"constrainInput", true);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"currentText", "Today");
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"dateFormat", "mm/dd/yy");
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"dayNames", new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"});
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"dayNamesMin", new String[]{"Su", "Mo", "Tu", "We", "Th", "Fr", "Sa"});
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"dayNamesShort", new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"});
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"defaultDate", null);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"duration", "normal");
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"firstDay", 0);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"gotoCurrent", false);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"hideIfNoPrevNext", false);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"isRTL", false);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"maxDate", null);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"minDate", null);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"monthNames", new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"});
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"monthNamesShort", new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"});
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"navigationAsDateFormat", false);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"nextText", "Next");
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"numberOfMonths", 1);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"onChangeMonthYear", null);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"onClose", null);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"onSelect", null);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"prevText", "Prev");
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"selectOtherMonths", false);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"shortYearCutoff", "+10");
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"showAnim", "show");
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"showButtonPanel", false);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"showCurrentAtPos", 0);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"showMonthAfterYear", false);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"showOn", "focus");
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"showOptions", new JsonObject());
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"showOtherMonths", false);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"showWeek", false);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"stepMonths", 1);
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"weekHeader", "Wk");
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"yearRange", "c-10:c+10");
		DOMHandle.setVariableValue(this, COMPONENT_VAR_OPTION_NAME+"yearSuffix", "");
	}

	public final Datepicker datepicker(DatepickerMethods option)
	{
		datepicker(option, Object.class);
		return this;
	}
	
	@SuppressWarnings("unchecked")
	public final<C> C datepicker(DatepickerMethods option, Class<C> cast)
	{
		switch (option) {
			case isDisabled:
			case getDate:
				return DOMHandle.getVariableValueByCommand(this, COMPONENT_VAR_OPTION_NAME+option.name(), cast, componentName, option.name());
				
			case widget:
				return (C) getWidget();
				
			default:
				DOMHandle.execCommand(this, componentName, option.name());
		}
		
		return (C) this;
	}
	
	public final<C> C datepicker(DatepickerOptions option, Class<C> cast)
	{
		return getOption(option, cast);
	}
	
	public final Datepicker datepicker(DatepickerOptions option, Object value)
	{
		return setOption(option, value);
	}
	
	protected void onSetOption(DatepickerOptions o, Object value) {}	
}
