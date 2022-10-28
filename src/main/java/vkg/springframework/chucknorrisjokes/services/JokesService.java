package vkg.springframework.chucknorrisjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokesService {
    private ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

    public String getChuckNorrisQuotes() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
