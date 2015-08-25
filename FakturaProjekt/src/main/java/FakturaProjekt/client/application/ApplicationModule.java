package FakturaProjekt.client.application;

import FakturaProjekt.client.application.home.HomeModule;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import FakturaProjekt.client.application.wystawianiefaktur.WystawianieFakturModule;
import FakturaProjekt.client.application.popupdialog.PopupDialogModule;

public class ApplicationModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
		install(new PopupDialogModule());
		install(new WystawianieFakturModule());
		install(new HomeModule());

        bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class,
                ApplicationPresenter.MyProxy.class);
    }
}
