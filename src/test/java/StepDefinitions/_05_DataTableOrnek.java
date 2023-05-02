package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.lang.reflect.Type;
import java.util.List;

public class _05_DataTableOrnek {
    @When("Write username {string}")
    public void writeUsername(String userName) {
        System.out.println("userName = "+ userName);
    }

    @And("Write username and Password {string} and {string}")
    public void writeUsernameAndPasswordAnd(String username, String Password) {
        System.out.println("username and password = " + username +" " +Password);
    }

    @And("Write username as DataTable")
    public void writeUsernameAsDataTable(DataTable items) {
       List<String> listitems= items.asList(String.class);

        for (String u: listitems) {
            System.out.println("u = " + u);
        }
    }

    @And("Write username and password as DataTable")
    public void writeUsernameAndPasswordAsDataTable(DataTable items) {

        List< List<String> > listitems= items.asLists(String.class);

        for (int i = 0; i < listitems.size(); i++) {
            System.out.println("listElemanlar = "
                    + listitems.get(i).get(0)+" "+ // username
                      listitems.get(i).get(1) );     // password
            //listElemanlar.get(i).get(2)
        }
    }

}
