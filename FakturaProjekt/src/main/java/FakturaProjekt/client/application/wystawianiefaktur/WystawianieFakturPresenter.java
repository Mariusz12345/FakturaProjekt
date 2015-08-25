package FakturaProjekt.client.application.wystawianiefaktur;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.user.client.ui.Button;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import FakturaProjekt.client.application.popupdialog.PopupDialogPresenter;
import FakturaProjekt.client.place.NameTokens;
public class WystawianieFakturPresenter extends Presenter<WystawianieFakturPresenter.MyView, WystawianieFakturPresenter.MyProxy>   {
    
	@Inject PopupDialogPresenter presenter;
	
	interface MyView extends View  {
    	
    	public Button getPozycja();
    	
    	
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
            MyProxy proxy) {
        super(eventBus, view, proxy, RevealType.Root);
       
        
    }
    
    protected void onBind() {
        super.onBind();
        getView().getPozycja().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				
				addToPopupSlot(presenter);
			}
		});
    }

	
    
}