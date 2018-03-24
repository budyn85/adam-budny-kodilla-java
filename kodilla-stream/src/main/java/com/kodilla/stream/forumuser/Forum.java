package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum(){
        forumUserList.add(new ForumUser(11001,"Jacek Nowak", 'M',1990,12,24,300));
        forumUserList.add(new ForumUser(93002,"Paweł Kowalski ", 'M',1956,10,31,200));
        forumUserList.add(new ForumUser(92003,"Ludwik Gałąź", 'M',1945,01,10,10));
        forumUserList.add(new ForumUser(58014,"Adrianna Pawlak", 'F',1996,03,14,0));
        forumUserList.add(new ForumUser(50124,"Maciej Długi", 'M',2000,06,04,80));
        forumUserList.add(new ForumUser(43546,"Alan Charuk", 'M',2010,12,28,120));
        forumUserList.add(new ForumUser(29573,"Krystian Antkiewicz", 'M',1987,11,25,240));
        forumUserList.add(new ForumUser(12233,"Patryk Nawrot", 'M',1965,01,8,800));
        forumUserList.add(new ForumUser(11110,"Dawid Kubacki", 'M',1976,06,20,20));
        forumUserList.add(new ForumUser(13245,"Andrzej Serówka", 'M',2011,04,04,100));
        forumUserList.add(new ForumUser(12123,"Michał Kwiatek", 'M',2000,02,16,156));
        forumUserList.add(new ForumUser(93845,"Krystyna Plucha", 'F',1990,06,16,958));
        forumUserList.add(new ForumUser(39201,"Aneta Jędzejczyk", 'F',1980,07,9,482));
        forumUserList.add(new ForumUser(85892,"Beata Posiadło", 'F',2001,10,3,563));
        forumUserList.add(new ForumUser(12853,"Dorota Bienko", 'F',2004,01,14,123));
        forumUserList.add(new ForumUser(74628,"Szymon Witkowski", 'M',1986,05,4,2));
        forumUserList.add(new ForumUser(14938,"Patrycja Orzeszek", 'F',1978,05,4,376));
    }
    public List<ForumUser> getUserList(){
        return new ArrayList<>(forumUserList);
    }
}
