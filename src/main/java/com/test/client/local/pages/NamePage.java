package com.test.client.local.pages;

import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.google.gwt.user.client.ui.Composite;
import com.test.client.local.components.NameForm;

@Page(path = "names")
@Templated("/com/test/client/templates/pages/Name.html")
public class NamePage extends Composite {

	@Inject
	@DataField
	private NameForm form;
	
}
