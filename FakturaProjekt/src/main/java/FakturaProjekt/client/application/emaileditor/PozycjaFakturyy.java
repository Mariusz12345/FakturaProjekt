package FakturaProjekt.client.application.emaileditor;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class PozycjaFakturyy extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(EmailEditorPresenter.class, EmailEditorPresenter.MyView.class, EmailEditorView.class, EmailEditorPresenter.MyProxy.class);
    }
}