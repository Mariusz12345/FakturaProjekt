package FakturaProjekt.client.application.pozycjafaktury;

import javax.inject.Inject;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;

import FakturaProjekt.client.place.NameTokens;

class PozycjaFakturyView extends ViewImpl implements PozycjaFakturyPresenter.MyView {
    interface Binder extends UiBinder<Widget, PozycjaFakturyView> {
    }
    @UiField Button powrot;
    
    PlaceManager placemenager;

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