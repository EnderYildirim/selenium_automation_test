package org.seleniumhq.example.model;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;
import org.springframework.stereotype.Component;

@Component
public class SeleniumTestScope implements Scope {

    Map<String, Object> scope = Collections.synchronizedMap(new HashMap<String, Object>());

    Map<String, Runnable> destructionCallback = Collections.synchronizedMap(new HashMap<String, Runnable>());

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        if (!scope.containsKey(name)) {
            scope.put(name, objectFactory.getObject());
        }
        return scope.get(name);
    }

    @Override
    public Object remove(String name) {
        return scope.remove(name);
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {
        destructionCallback.put(name, callback);
    }

    @Override
    public Object resolveContextualObject(String key) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }

    public void reset() {
        scope.clear();
        destructionCallback.clear();
    }

}
