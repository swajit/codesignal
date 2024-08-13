/*

  matches = [    "teamA vs teamB: teamA",    "teamC vs teamD: teamD",    "teamA vs teamC: teamC",    "teamB vs teamD: teamB",    "teamC vs teamB: teamB"]
  Expected output
        teamB: 2
        teamC: 2
        teamA: 1
        teamD: 1
*/
import java.util.*;

public class GameLeague {
    public static void main(String[] args) {
        String[] matches = {
                "teamA vs teamB: teamA",
                "teamC vs teamD: teamD",
                "teamA vs teamC: teamC",
                "teamB vs teamD: teamB",
                "teamC vs teamB: teamB"
        };

        Map<String, Integer> standings = calculateStandings(matches);

//        for(String s:standings.keySet()){
//            System.out.println(s + ": " + standings.get(s));
//        }

//        TreeMap<String,Integer> sortedMap = new TreeMap<String,Integer>(standings);
//        for(String s:sortedMap.keySet()){
//            System.out.println(s + ": " + sortedMap.get(s));
//        }
        List<String> sortedStandings = sortStandings(standings);

        for (String team : sortedStandings) {
            System.out.println(team + ": " + standings.get(team));
        }
    }

    private static List<String> sortStandings(Map<String, Integer> standings) {
        List<String> sortedList = new ArrayList<>();
        List<Map.Entry<String,Integer>> sortedlist2 = new LinkedList<Map.Entry<String,Integer>>(standings.entrySet());
        Collections.sort(sortedlist2, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for(Map.Entry<String,Integer> key : sortedlist2){
            System.out.println(key.getKey() + " - " + key.getValue());
        }
        return sortedList;
    }

    private static Map<String, Integer> calculateStandings(String[] matches) {
        Map<String, Integer> standing = new HashMap<>();
        int wins=0;
        for(String match:matches){
            String[] matchDetails = match.split(": ");
            String winner = matchDetails[1];
            String[] teams = matchDetails[0].split(" vs ");
            if(standing.containsKey(winner)){
                wins = standing.get(winner) + 1;
                standing.put(winner,wins);
            }else{
                standing.put(winner,1);
            }

            for(String team:teams){
                standing.putIfAbsent(team,0);
            }

        }
        return standing;
    }

}

