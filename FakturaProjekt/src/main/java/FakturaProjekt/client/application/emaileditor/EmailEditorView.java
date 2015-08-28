package FakturaProjekt.client.application.emaileditor;

import javax.inject.Inject;

import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.Editor;
import com.google.gwt.editor.client.SimpleBeanEditorDriver;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;

import FakturaProjekt.client.application.pozycjafaktury.Pozycjaaa;
import FakturaProjekt.client.place.NameTokens;

class EmailEditorView extends ViewImpl  implements EmailEditorPresenter.MyView,Editor<Email> {
	private static EmailEditorUiBinder uiBinder = GWT
			.create(EmailEditorUiBinder.class);

	interface EmailEditorUiBinder extends UiBinder<Widget, EmailEditorView> {
	}
	@UiField
	TextBox email;
	@UiField
	Button zatwierdz;
	@UiField
	TextBox cennaJednostki;
	@UiField
	TextBox ilosc;
	@UiField
	ListBox jednostki;
	public EmailEditorView() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	interface Driver extends SimpleBeanEditorDriver<Email, EmailEditorView> {
	}

	Driver driver = GWT.create(Driver.class);
	public void zatwierdz(){
		zatwierdz.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				
				wczytajdane();
				ustwa();
			}
		});
	}
	
		public Email wczytajdane(){
		
		Email email = driver.flush();
		Window.alert("Czy to dziala "+email.getEmail()+"    "+email.getCennaJednostki()+"   "+email.getIlosc()+"  "+email.getJednostki());
		return email;
	}
		
	public void ustwa(){
		driver.initialize(this);
		driver.edit(new Email());
	}

	
}