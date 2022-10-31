package onboarding;

import java.util.*;

public class Problem7 {

    /**
     * @param user     : 주어진 사용자 이름 string
     * @param friends  : friends 관계가 나타내져 있는 String[][]
     * @param visitors : 방문자 String
     * @return Set<String> : 모든 유저 이름을 담은 Set
     */
    public static Set<String> getAllUserSet(String user, List<List<String>> friends, List<String> visitors) {
        Set<String> allUser = new HashSet<>();
        allUser.add(user);
        for (String visitor : visitors) {
            allUser.add(visitor);
        }
        for (int i = 0; i < friends.size(); i++) {
            allUser.add(friends.get(i).get(0));
            allUser.add(friends.get(i).get(1));
        }
        return allUser;
    }

    /**
     * @param friends : friends 관계가 나타내져 있는 String[][]
     * @return Map<String, List < String>> : 해당하는 유저의 이름 -> 친구 리스트를 반환해주는 Map
     */
    public static Map<String, List<String>> makeFriendGraph(List<List<String>> friends) {
        Map<String, List<String>> friendGraph = new HashMap<>();
        for (int i = 0; i < friends.size(); i++) {
            String from = friends.get(i).get(0);
            String to = friends.get(i).get(1);
            if (friendGraph.get(from) == null) {
                List<String> temp = new ArrayList<>();
                temp.add(to);
                friendGraph.put(from, temp);
            } else {
                friendGraph.get(from).add(to);
            }
            if (friendGraph.get(to) == null) {
                List<String> temp = new ArrayList<>();
                temp.add(from);
                friendGraph.put(to, temp);
            } else {
                friendGraph.get(to).add(from);
            }
        }
        return friendGraph;
    }

    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> answer = Collections.emptyList();
        return answer;
    }
}
