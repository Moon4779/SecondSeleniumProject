package utils;

import models.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProvider {

    @org.testng.annotations.DataProvider
    public Iterator<Object[]> validLoginUsers() throws IOException {
        List<Object[]> list = new ArrayList<>();

        URL url = new URL("https://docs.google.com/spreadsheets/d/e/2PACX-1vTweA0WnhPuBpQUMxUEjLAtO3l2vtTGcmtSTzbm-NDHPCTWL1KrNR7Mvtj-sg_7UW9S0FIzBB9k5Ib4/pub?gid=0&single=true&output=csv");
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line = reader.readLine();
        while (line != null) {
            String[] split = line.split(",");
            list.add(new Object[]{new User().setEmail(split[0]).setPassword(split[1])});
            line = reader.readLine();
        }

        return list.iterator();
    }

    }
