package FakturaProjekt.client.application.wystawianiefaktur;

import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.user.cellview.client.DataGrid;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import FakturaProjekt.client.place.NameTokens;
public class WystawianieFakturPresenter extends Presenter<WystawianieFakturPresenter.MyView, WystawianieFakturPresenter.MyProxy>   {
    
	PlaceManager placeManager;
	
	interface MyView extends View  {
    	
    	public TextBox getNrFaktury();
    	public Button getGenerator();
    	public void liczby();
    	public Button getPozycja2();
    	public void wyswietl();
    	public DataGrid<Pozycja> getPozycje();
		public void wyswietlFakture();
    }
    @ContentSlot
    public static final Type<RevealContentHandler<?>> SLOT_WystawianieFaktur = new Type<RevealContentHandler<?>>();

    @NameToken(NameTokens.faktura)
    @ProxyStandard
    interface MyProxy extends ProxyPlace<WystawianieFakturPresenter> {
    }
    @Inject
    WystawianieFakturPresenter(
            EventBus eventBus,
            MyView view, 
            MyProxy proxy,
            PlaceManager placeManager) {
        super(eventBus, view, proxy, RevealType.Root);
        this.placeManager= placeManager;
    }
    protected void onBind() {
        super.onBind();
        getView().wyswietlFakture();
        getView().getNrFaktury().setReadOnly(true);
        getView().getNrFaktury().setText("0");
        getView().liczby();
        getView().wyswietl();
    }
}