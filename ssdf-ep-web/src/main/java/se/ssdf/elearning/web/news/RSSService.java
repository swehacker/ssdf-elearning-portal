package se.ssdf.elearning.web.news;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import se.ssdf.elearning.news.Message;
import se.ssdf.elearning.services.NewsService;

import java.util.Iterator;

@Service(value = "NewsService")
public class RSSService implements NewsService {
    private static final Logger LOG = LogManager.getLogger();
    private Feed feed;

    @Scheduled(fixedDelay = 30 * 60 * 1000)
    private void getNewMessages() {
        LOG.debug("Updates RSS Feed from ssdf");
        RSSFeedParser parser = new RSSFeedParser("http://iof3.idrottonline.se/SvenskaSportdykarforbundet/Information/Nyheter/RSS-SSDFNyheter/?complete=2");
        feed = parser.getFeed();
        LOG.debug("RSS Feed from ssdf is updated");
    }

    @Override
    public Iterator<Message> getArticles() {
        return feed.getMessages();
    }
}
