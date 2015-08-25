package FakturaProjekt.client.application.pozycjafaktury;

import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.user.client.ui.Button;
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
public class PozycjaFakturyPresenter extends Presenter<PozycjaFakturyPresenter.MyView, PozycjaFakturyPresenter.MyProxy>  {
    interface MyView extends View  {
    	
    	public Button getPowrot();
    	public void powrod();
    }
    @ContentSlot
    public static final Type<RevealContentHandler<?>> SLOT_PozycjaFaktury = new Type<RevealContentHandler<?>>();

    @NameToken(NameTokens.pozycja)
    @ProxyStandard
    interface MyProxy extends ProxyPlace<PozycjaFakturyPresenter> {
    }
    PlaceManager placemenager;

    @Inject
    PozycjaFakturyPresenter(
            EventBus eventBus,
            MyView view, 
            MyProxy proxy,PlaceManager placemenager) {
        super(eventBus, view, proxy, RevealType.Root);
        this.placemenager=placemenager;
        
    }
    @Override
    protected void onBind() {
    	super.onBind();
    	getView().powrod();
    }
}