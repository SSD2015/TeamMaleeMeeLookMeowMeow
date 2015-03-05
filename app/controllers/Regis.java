package controllers;

import play.data.Form;
import play.mvc.*;
import result.Account;
import views.html.*;

//import static play.mvc.Results.ok;

/**
 * Created by patawat on 3/3/15 AD.
 */
public class Regis extends Controller {
    public static Result regis() {
        return ok(Register.render());
    }
    public static Result addNewAcc() {
        Account account = Form.form(Account.class).bindFromRequest().get();

        account.save();

        return ok(Register.render());
    }
}
