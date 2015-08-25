package FakturaProjekt.client.application.popupdialog;

import javax.inject.Inject;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PopupViewWithUiHandlers;

class PopupDialogView extends PopupViewWithUiHandlers<PopupDialogUiHandlers> implements PopupDialogPresenter.MyView {
    interface Binder extends UiBinder<Widget, PopupDialogView> {
    }

    @UiField Button zatwierdz;
    
    public Button getZatwierdz() {
		return zatwierdz;
	}
	@Inject
    PopupDialogView(EventBus eventBus, Binder uiBinder) {
        super(eventBus);
    
        initWidget(uiBinder.createAndBindUi(this));
    }
	@UiHandler("zatwierdz")
	public void onClick(ClickEvent event) {
		getUiHandlers().PopupDialog();
	}
}