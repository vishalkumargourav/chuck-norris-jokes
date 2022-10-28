package vkg.springframework.chucknorrisjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {
    private ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

    public String getChuckNorrisQuotes() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
