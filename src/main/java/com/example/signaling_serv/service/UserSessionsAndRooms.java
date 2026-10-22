package com.example.signaling_serv.service;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.socket.WebSocketSession;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class UserSessionsAndRooms {
    private final ConcurrentHashMap<String, WebSocketSession> userSessions = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, List<WebSocketSession>> simpleRooms = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, List<WebSocketSession>> groupRooms = new ConcurrentHashMap<>();


    public WebSocketSession getUserSession(String id){
        return userSessions.get(id);
    }

    public void addUserSession(String id, WebSocketSession session){
        userSessions.put(id, session);
    }

}
