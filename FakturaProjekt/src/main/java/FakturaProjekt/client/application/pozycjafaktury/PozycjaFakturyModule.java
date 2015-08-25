package FakturaProjekt.client.application.pozycjafaktury;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class PozycjaFakturyModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(PozycjaFakturyPresenter.class, PozycjaFakturyPresenter.MyView.class, PozycjaFakturyView.class, PozycjaFakturyPresenter.MyProxy.class);
    }
}