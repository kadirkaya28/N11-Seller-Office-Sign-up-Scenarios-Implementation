package starter.n11SellerOffice.user_interface;

import net.serenitybdd.screenplay.targets.Target;


public class SellerOfficeSignUpPageElements {
    public static Target USERNAME_FIELD = Target.the("username textbox")
            .locatedBy("#usernameInputText");
    public static Target PASSWORD_FIELD = Target.the("password textbox")
            .locatedBy("#passwordInputText");
    public static Target REPASSWORD_FIELD = Target.the("repassword textbox")
            .locatedBy("#passwordRetypeInputText");
    public static Target EMAIL_FIELD = Target.the("email textbox")
            .locatedBy("#emailInputText");
    public static Target REEMAIL_FIELD = Target.the("reemail textbox")
            .locatedBy("#emailRetypeInputText");
    public static Target STORENAME_FIELD = Target.the("store name textbox")
            .locatedBy("#nicknameInputText");
    public static Target MEMBERSHIP_ERROR_MESSAGE = Target.the("membership error message text")
            .locatedBy("#membershipTypeRadioMessage");
    public static Target CONTRACT_ERROR_MESSAGE = Target.the("contract error message text")
            .locatedBy("#j_id261_j_id_cy");
    public static Target SIGN_UP_BTN = Target.the("sign up button")
            .locatedBy("#j_id274_j_id_dj");
    public static Target SAHIS_RADIO_BUTTON = Target.the("sahis radio button")
            .locatedBy("//*[@id=\"membershipTypeRadio:0\"]");
}
