package com.pl.lodz;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class LanguageService {

    @Getter
    static final List<Map<String,String>> LANGUAGES = new ArrayList<>();

    static void addLanguage(Map<String, String> languageWithParams){
        LANGUAGES.add(languageWithParams);
    }
}
