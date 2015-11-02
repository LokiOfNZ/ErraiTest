package com.test.client.local;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.jboss.errai.ioc.client.api.EntryPoint;
import org.jboss.errai.ui.nav.client.local.Navigation;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.test.client.local.components.SideNav;
import com.test.client.local.components.TopNav;

@EntryPoint
@ApplicationScoped
@Templated("/com/test/client/templates/pages/Base.html")
public class App extends Composite {

	@Inject
	private Navigation navigation;

	@Inject
	@DataField
	private TopNav topnav;

	@Inject
	@DataField
	private SideNav sidenav;

	@Inject
	@DataField
	private SimplePanel content;

	@PostConstruct
	public void onLoad() {
		content.add(navigation.getContentPanel());
		RootPanel.get().add(this);
	}

}