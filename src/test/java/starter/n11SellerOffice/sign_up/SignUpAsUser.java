package starter.n11SellerOffice.sign_up;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import starter.n11SellerOffice.user_interface.SellerOfficeHomePageElements;
import starter.n11SellerOffice.user_interface.SellerOfficeSignUpPageElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class SignUpAsUser implements Task {

    private final String username_text;
    private final String password_text;
    private final String repassword_text;
    private final String email_text;
    private final String reemail_text;
    private final String nickname_text;

    @Step("{0} Sign up with valid credentials")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SellerOfficeHomePageElements.SIGN_UP_NOW_BTN),
                WaitUntil.the(SellerOfficeSignUpPageElements.USERNAME_FIELD,isClickable())
                        .forNoMoreThan(5).seconds(),
                Click.on(SellerOfficeSignUpPageElements.USERNAME_FIELD),
                SendKeys.of(this.username_text).into(SellerOfficeSignUpPageElements.USERNAME_FIELD),
                WaitUntil.the(SellerOfficeSignUpPageElements.PASSWORD_FIELD,isClickable())
                        .forNoMoreThan(5).seconds(),
                Click.on(SellerOfficeSignUpPageElements.PASSWORD_FIELD),
                SendKeys.of(this.password_text).into(SellerOfficeSignUpPageElements.PASSWORD_FIELD),
                WaitUntil.the(SellerOfficeSignUpPageElements.REPASSWORD_FIELD,isClickable())
                        .forNoMoreThan(5).seconds(),
                Click.on(SellerOfficeSignUpPageElements.REPASSWORD_FIELD),
                SendKeys.of(this.repassword_text).into(SellerOfficeSignUpPageElements.REPASSWORD_FIELD),
                WaitUntil.the(SellerOfficeSignUpPageElements.EMAIL_FIELD,isClickable())
                        .forNoMoreThan(5).seconds(),
                Click.on(SellerOfficeSignUpPageElements.EMAIL_FIELD),
                SendKeys.of(this.email_text).into(SellerOfficeSignUpPageElements.EMAIL_FIELD),
                WaitUntil.the(SellerOfficeSignUpPageElements.REEMAIL_FIELD,isClickable())
                        .forNoMoreThan(5).seconds(),
                Click.on(SellerOfficeSignUpPageElements.REEMAIL_FIELD),
                SendKeys.of(this.reemail_text).into(SellerOfficeSignUpPageElements.REEMAIL_FIELD),
                WaitUntil.the(SellerOfficeSignUpPageElements.STORENAME_FIELD,isClickable())
                        .forNoMoreThan(5).seconds(),
                Click.on(SellerOfficeSignUpPageElements.STORENAME_FIELD),
                SendKeys.of(this.nickname_text).into(SellerOfficeSignUpPageElements.STORENAME_FIELD),
                JavaScriptClick.on(SellerOfficeSignUpPageElements.SAHIS_RADIO_BUTTON),
                JavaScriptClick.on(SellerOfficeSignUpPageElements.SIGN_UP_BTN)
        );
    }

    public SignUpAsUser(String username_text,  String password_text, String repassword_text,
                        String email_text,String reemail_text, String nickname_text){
        this.email_text = email_text;
        this.reemail_text = reemail_text;
        this.username_text = username_text;
        this.password_text = password_text;
        this.repassword_text = repassword_text;
        this.nickname_text = nickname_text;

    }



    public static SignUpAsUser signUpThePage(String username_text,  String password_text,
                                             String repassword_text, String email_text,
                                             String reemail_text, String nickname_text) {
        return instrumented(SignUpAsUser.class
                ,username_text, password_text, repassword_text, email_text, reemail_text, nickname_text);
    }
}
