package FakturaProjekt.client.application.popupdialog;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.PopupView;
import com.gwtplatform.mvp.client.HasUiHandlers;
public class PopupDialogPresenter extends PresenterWidget<PopupDialogPresenter.MyView> implements PopupDialogUiHandlers {
    interface MyView extends PopupView , HasUiHandlers<PopupDialogUiHandlers> {
    	
    	public Button getZatwierdz();
    	public TextBox getImie();
    	public TextBox getCennaJednostki();
    	public TextBox getIlosc();
    	
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
		Window.alert("Zapisano");
		getView().hide();
	}

	
}