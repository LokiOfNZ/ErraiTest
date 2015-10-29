package com.justinvesting.client.local.pages;

import org.jboss.errai.ui.nav.client.local.DefaultPage;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.google.gwt.user.client.ui.Composite;

@Page(path = "home", role = DefaultPage.class)
@Templated("/com/justinvesting/client/templates/pages/Home.html")
public class Home extends Composite {

}