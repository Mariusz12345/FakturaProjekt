package FakturaProjekt.client.application.popupdialog;

import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.user.client.ui.Button;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
    import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.PopupView;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.Proxy;
import com.gwtplatform.mvp.client.HasUiHandlers;
public class PopupDialogPresenter extends PresenterWidget<PopupDialogPresenter.MyView> implements PopupDialogUiHandlers {
    interface MyView extends PopupView , HasUiHandlers<PopupDialogUiHandlers> {
    	
    	public Button getZatwierdz();
    	
    }
    @Inject
    PopupDialogPresenter(
            EventBus eventBus,
            MyView view) {
        super(eventBus, view);
        
        getView().setUiHandlers(this);
    }
    	
    protected void onBind() {
        super.onBind();
    }
	@Override
	public void PopupDialog() {
		getView().hide();
	}
    
}