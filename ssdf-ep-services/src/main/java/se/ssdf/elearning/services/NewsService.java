package se.ssdf.elearning.services;

import se.ssdf.elearning.news.Message;

import java.util.Iterator;

public interface NewsService {
    Iterator<Message> getArticles();
}
