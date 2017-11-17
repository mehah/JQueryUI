jQueryUI
=========
Plugin to use [jQueryUI](http://jqueryui.com/) with [jRender](https://github.com/mehah/jRender).

Example
========
```java
	Dialog modal = new Dialog();			
	modal.dialog();
	
	modal.dialog(DialogOptions.title, "Message")
	     .dialog(DialogOptions.width, 600)
	     .dialog(DialogOptions.resizable, false)
	     .html("Welcome to jQueryUI for jRender.");

	modal.dialog(DialogMethods.open);
```
