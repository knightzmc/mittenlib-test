package me.bristermitten.mittenlibtest;

import me.bristermitten.mittenlib.config.Config;
import me.bristermitten.mittenlib.config.Source;

import java.util.List;

@Config
@Source("config.yml")
public class ConfigDTO {
    String welcomeMessage;
    int b;
    CDTO c;

    @Config
    static class CDTO {
        String a2;
        List<Object> b2;
    }
}
