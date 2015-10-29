package com.justinvesting.client.local.components;

import javax.inject.Inject;

import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.client.widget.HasModel;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.Bound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.google.gwt.user.client.DOM;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Composite;
import com.justinvesting.client.local.shared.Person;

@Templated("/com/justinvesting/client/templates/components/PeopleTable.html#person")
public class PeopleTableItem extends Composite implements HasModel<Person> {
	
	@Inject
	@AutoBound
	private DataBinder<Person> peopleList;

	@Bound
	@DataField
	private Element name = DOM.createTD();

	@Bound
	@DataField
	private Element email = DOM.createTD();

	@Bound
	@DataField
	private Element address = DOM.createTD();

	@Override
	public Person getModel() {
		return peopleList.getModel();
	}

	@Override
	public void setModel(Person model) {
		peopleList.setModel(model);
	}

}
