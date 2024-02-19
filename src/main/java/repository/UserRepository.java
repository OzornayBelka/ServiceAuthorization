package repository;

import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepository {

    private Map<String, String> users= new ConcurrentHashMap<>();
    private Map<String, List<Authorities>> userAccess = new ConcurrentHashMap<>();


    public List<Authorities> getUserAuthorities(String user, String password) {
        if(users.containsKey(user) & users.containsValue(password)){
            return userAccess.get(user);
        }
        return Collections.emptyList();
    }
}
