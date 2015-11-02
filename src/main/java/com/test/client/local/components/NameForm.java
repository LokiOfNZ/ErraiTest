package com.test.client.local.components;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import com.test.client.local.shared.Person;
import com.test.client.local.shared.PersonStore;

@Dependent
@Templated("/com/test/client/templates/components/NameForm.html")
public class NameForm extends Composite {

	@Inject
	@DataField
	private TextBox name;

	@Inject
	@DataField
	private TextBox email;

	@Inject
	@DataField
	private CheckBox toggle;
	
	@Inject
	@DataField
	private TextBox address;
	
	@DataField
	private Element addressdiv = DOM.createDiv();

	@Inject
	@DataField 
	private Button submit;
	
	@PostConstruct	
	public void init() {
		address.setValue("", false);
		addressdiv.getStyle().setDisplay(Display.NONE);
	}
	
	@EventHandler("toggle")
	private void onToggle(ClickEvent e) {
		address.setValue("", false);
		if(addressdiv.getStyle().getDisplay().equals(Display.NONE.getCssName())) {
			addressdiv.getStyle().clearDisplay();
		} else {
			addressdiv.getStyle().setDisplay(Display.NONE);
		}
	}

	@EventHandler("submit")
	private void onSubmit(ClickEvent e) {
		Person person = new Person();
		person.setName(name.getValue());
		person.setEmail(email.getValue());
		person.setAddress(address.getValue());
		PersonStore.getPeople().add(person);
		Window.alert("Submitted!");
		name.setValue("", false);
		email.setValue("", false);
		init();
	}
}