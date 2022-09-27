package com.kaparzh.eugeniydemo.behavioral.observer;

import java.util.List;

public interface Observer {

    void handleEvent(List<String> vacancies);
}
