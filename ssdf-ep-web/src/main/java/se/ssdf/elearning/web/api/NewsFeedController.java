package se.ssdf.elearning.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import se.ssdf.elearning.news.Message;
import se.ssdf.elearning.services.NewsService;

import java.util.Iterator;

@Controller
@RequestMapping(value = "/rest/1/news")
public class NewsFeedController {
    @Autowired
    private NewsService newsService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public Iterator<Message> getNews() {
        return newsService.getArticles();
    }
}
