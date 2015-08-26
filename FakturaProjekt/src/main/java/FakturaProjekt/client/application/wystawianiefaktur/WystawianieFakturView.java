package FakturaProjekt.client.application.wystawianiefaktur;

import javax.inject.Inject;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;

import FakturaProjekt.client.place.NameTokens;

class WystawianieFakturView extends ViewImpl implements WystawianieFakturPresenter.MyView {
	interface Binder extends UiBinder<Widget, WystawianieFakturView> {
	}

	@UiField 
	TextBox nrFaktury;
	@UiField
	Button generator;
	@UiField
	Button pozycja2;
	

	
	


	PlaceManager placeManager;
	
	public Button getPozycja2() {
		return pozycja2;
	}

	public void setNrFaktury(TextBox nrFaktury) {
		this.nrFaktury = nrFaktury;
		nrFaktury.setText("1");
	}

	public void setGenerator(Button generator) {
		this.generator = generator;
	}

	public Button getGenerator() {
		return generator;
	}

	public TextBox getNrFaktury() {
		nrFaktury.setReadOnly(true);
		return nrFaktury;
	}

	@Inject
	WystawianieFakturView(Binder uiBinder,	PlaceManager placeManager) {
		initWidget(uiBinder.createAndBindUi(this));
		this.placeManager=placeManager;
	}
	

	public void liczby(){
		getGenerator().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				nrFaktury.setText("1");
			}
		});
	}
	public void wyswietl(){
		pozycja2.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				PlaceRequest request = new PlaceRequest(NameTokens.pozycja);
				placeManager.revealPlace(request);
			}
		});
		
	}

	
}