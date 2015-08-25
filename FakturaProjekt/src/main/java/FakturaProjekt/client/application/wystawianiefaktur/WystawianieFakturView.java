package FakturaProjekt.client.application.wystawianiefaktur;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

class WystawianieFakturView extends ViewImpl implements WystawianieFakturPresenter.MyView {
	interface Binder extends UiBinder<Widget, WystawianieFakturView> {
	}

	@UiField
	Button pozycja;

	public Button getPozycja() {
		return pozycja;
	}

	@Inject
	WystawianieFakturView(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
	}

}