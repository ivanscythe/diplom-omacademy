package Steps;

import static Pages.MainPage.*;
import static com.codeborne.selenide.Condition.visible;

public class MainSteps extends BaseSteps {

    public void openSchedulePage() {
        forStudentsTab.hover();
        scheduleTab.click();
    }

    public void openGroupSchedule() { groupTitle.click(); }

    public void checkGroupNameText() { groupTitleText.shouldBe(visible);}

    public void clickOnLastNewsFirstBlog() { firstBlogLatestNews.click(); }

    public void clickOnLastNewsSecondBlog() { secondBlogLatestNews.click(); }

    public void newsPictureIsVisible() { newsPicture.shouldBe(visible); }

    public void searchInputSetValue() { searchInput.setValue("Конкурс"); }

    public void clickOnSearchButton() { searchButton.click(); }

    public void foundTextIsVisible() { searchFoundText.shouldBe(visible); }

    public void openMainInfoPage() {
        orgInfoTab.hover();
        orgMainInfoTab.click();
    }

    public void fullAcademyTitleIsVisible() { fullAcademyTitle.shouldBe(visible); }
}
