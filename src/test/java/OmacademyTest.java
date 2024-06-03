import Steps.BaseSteps;
import Steps.MainSteps;
import org.junit.jupiter.api.Test;

public class OmacademyTest {

    BaseSteps baseSteps = new BaseSteps();

    MainSteps mainSteps = new MainSteps();

    @Test
    public void openFirstBlogLastNews(){
        baseSteps.openMainURL();
        baseSteps.maximizeWindow();
        mainSteps.clickOnLastNewsFirstBlog();
        mainSteps.newsPictureIsVisible();
    }

    @Test
    public void openSecondBlogLastNews(){
        baseSteps.openMainURL();
        baseSteps.maximizeWindow();
        mainSteps.clickOnLastNewsSecondBlog();
        mainSteps.newsPictureIsVisible();
    }

    @Test
    public void checkSearch(){
        baseSteps.openMainURL();
        baseSteps.maximizeWindow();
        mainSteps.searchInputSetValue();
        mainSteps.clickOnSearchButton();
        mainSteps.foundTextIsVisible();
    }

    @Test
    public void findFullAcademyTitle(){
        baseSteps.openMainURL();
        baseSteps.maximizeWindow();
        mainSteps.openMainInfoPage();
        mainSteps.fullAcademyTitleIsVisible();
    }

    @Test
    public void openSchedule(){
        baseSteps.openMainURL();
        baseSteps.maximizeWindow();
        mainSteps.openSchedulePage();
        baseSteps.switchToIframe();
        mainSteps.openGroupSchedule();
        mainSteps.checkGroupNameText();
        baseSteps.switchToDefault();
    }
}
