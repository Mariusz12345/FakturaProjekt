package FakturaProjekt.client.application.emaileditor;

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
import FakturaProjekt.client.place.NameTokens;
public class EmailEditorPresenter extends Presenter<EmailEditorPresenter.MyView, EmailEditorPresenter.MyProxy>  {
    interface MyView extends View  {
    	
    	public void zatwierdz();
    	public void ustwa();
    }
    @ContentSlot
    public static final Type<RevealContentHandler<?>> SLOT_EmailEditor = new Type<RevealContentHandler<?>>();
 
    @NameToken(NameTokens.email)
    @ProxyStandard
    interface MyProxy extends ProxyPlace<EmailEditorPresenter> {
    }

    @Inject
    EmailEditorPresenter(
            EventBus eventBus,
            MyView view, 
            MyProxy proxy) {
        super(eventBus, view, proxy, RevealType.Root);
        getView().ustwa();
        
    }
    @Override
    protected void onBind() {
    	super.onBind();
    	getView().zatwierdz();
    	
    }
    
}