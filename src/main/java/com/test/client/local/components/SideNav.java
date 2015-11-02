package com.test.client.local.components;

import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.TransitionAnchor;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Composite;
import com.test.client.local.pages.Home;
import com.test.client.local.pages.NamePage;
import com.test.client.local.pages.PeoplePage;

@Templated("/com/test/client/templates/components/SideNav.html")
public class SideNav extends Composite {
	
	@Inject
	@DataField
	private TransitionAnchor<Home> home;
	
	@DataField
	private Element homeListItem = DOM.createElement("li");
	
	@Inject
	@DataField
	private TransitionAnchor<PeoplePage> people;
	
	@DataField
	private Element peopleListItem = DOM.createElement("li");
	
	@Inject
	@DataField
	private TransitionAnchor<NamePage> names;
	
	@DataField
	private Element nameListItem = DOM.createElement("li");

	@EventHandler("home")
	private void onHome(ClickEvent e) {
		homeListItem.addClassName("active");
		peopleListItem.removeClassName("active");
		nameListItem.removeClassName("active");
	}
	
	@EventHandler("people")
	private void onPeople(ClickEvent e) {
		homeListItem.removeClassName("active");
		peopleListItem.addClassName("active");
		nameListItem.removeClassName("active");
	}
	
	@EventHandler("names")
	private void onNames(ClickEvent e) {
		homeListItem.removeClassName("active");
		peopleListItem.removeClassName("active");
		nameListItem.addClassName("active");
	}
	
}