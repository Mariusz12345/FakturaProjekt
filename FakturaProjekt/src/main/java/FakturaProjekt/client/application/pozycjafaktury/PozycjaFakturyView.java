package FakturaProjekt.client.application.pozycjafaktury;

import javax.inject.Inject;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.UiHandlers;
import com.gwtplatform.mvp.client.ViewImpl;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;

import FakturaProjekt.client.place.NameTokens;

class PozycjaFakturyView extends ViewWithUiHandlers<UiHandlers> implements PozycjaFakturyPresenter.MyView {
    interface Binder extends UiBinder<Widget, PozycjaFakturyView> {
    }
    @UiField TextBox imie;
    @UiField TextBox cennaJednostki;
    @UiField TextBox ilosc;
    
    @UiField Button powrot;
    
    PlaceManager placemenager;
    
    public TextBox getImie() {
		return imie;
	}

	public TextBox getCennaJednostki() {
		return cennaJednostki;
	}

	public TextBox getIlosc() {
		return ilosc;
	}

	public Button getPowrot() {
		return powrot;
	}
	
	@Inject
    PozycjaFakturyView(Binder uiBinder,PlaceManager placemenager) {
        initWidget(uiBinder.createAndBindUi(this));
        this.placemenager=placemenager;
    }
	
	
	public void powrod(){
		powrot.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
			
				PlaceRequest request = new PlaceRequest(NameTokens.faktura);
				placemenager.revealPlace(request);
				Window.alert("Zapisano");
			}
		});
	}
}