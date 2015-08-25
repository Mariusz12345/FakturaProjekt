package FakturaProjekt.client.application.wystawianiefaktur;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class WystawianieFakturModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(WystawianieFakturPresenter.class, WystawianieFakturPresenter.MyView.class, WystawianieFakturView.class, WystawianieFakturPresenter.MyProxy.class);
    }
}