package FakturaProjekt.client.application.popupdialog;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class PopupDialogModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
            bindPresenterWidget(PopupDialogPresenter.class, PopupDialogPresenter.MyView.class, PopupDialogView.class);
    }
}