package starter.n11SellerOffice.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theN11SellerOfficeHomePage() {
        return Task.where("{0} opens the n11 seller office home page",
                Open.browserOn().the(SellerOfficeHomePage.class));
}}
