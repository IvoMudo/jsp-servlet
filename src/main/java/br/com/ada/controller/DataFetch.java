package br.com.ada.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class DataFetch {
    public static <T> T fetchFromUrl(String url, Class<T> clazz) {
        ObjectMapper mapper = new ObjectMapper();
        T resp = null;

        try {
            resp = mapper.readValue(new URL(url),clazz);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return resp;
    }
}