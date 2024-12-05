package FrameworkPrep.Tests;

import FrameworkPrep.Pages.UserRegisterPage;
import org.testng.annotations.Test;

public class registerUserTest extends BaseTest
{
    @Test
    public void register()
    {
        UserRegisterPage ur= new UserRegisterPage(driver);
        ur.regUser();
    }

}
