package com.test.client.local.components;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import org.jboss.errai.ui.client.widget.ListWidget;
import org.jboss.errai.ui.client.widget.Table;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.google.gwt.user.client.ui.Composite;
import com.test.client.local.shared.Person;
import com.test.client.local.shared.PersonStore;

@Dependent
@Templated("/com/test/client/templates/components/PeopleTable.html")
public class PeopleTable extends Composite {

	  @Inject 
	  @DataField
	  @Table(root="tbody") 
	  private ListWidget<Person, PeopleTableItem> people;
	  
	  @PostConstruct
	  public void init() {
		  people.setItems(PersonStore.getPeople());
	  }
	
}