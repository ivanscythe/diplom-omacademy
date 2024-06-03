package Pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    public static SelenideElement firstBlogLatestNews = $(".blog1latestnews3");

    public static SelenideElement secondBlogLatestNews = $(".blog2latestnews3");

    public static SelenideElement newsPicture = $(".thumbnail.zoomin");

    public static SelenideElement searchInput = $("#search-area160");

    public static SelenideElement searchButton = $("#ajax-search-button160");

    public static SelenideElement searchFoundText = $(".highlight");

    public static SelenideElement orgInfoTab = $(Selectors.byCssSelector("a[href=\"/sveden\"]"));

    public static SelenideElement orgMainInfoTab = $(Selectors.byCssSelector("a[href=\"/sveden/common\"]"));

    public static SelenideElement fullAcademyTitle = $(byText("Автономная некоммерческая профессиональная образовательная организация «Омская академия экономики и предпринимательства»"));

    public static SelenideElement forStudentsTab = $(Selectors.byCssSelector("a[href=\"/students\"]"));

    public static SelenideElement scheduleTab = $(Selectors.byCssSelector("a[href=\"/students/rasp-students\"]"));

    public static SelenideElement groupTitle = $(byText("ИСП-9.17"));

    public static SelenideElement groupTitleText = $(byText("Группа: ИСП-9.17"));
}
