import java.util.HashSet;

public class Leetcode_1496 {

    public static boolean isPathCrossing(String path) {
        HashSet<Integer> set = new HashSet<>();
        int coordinates = 00;
        set.add(coordinates);


        for(int i = 0; i<path.length(); i++){
            if(path.charAt(i) == 'N'){
                coordinates = coordinates + 1;
                if (!set.contains(coordinates)){
                    set.add(coordinates);
                    continue;
                }
                else {
                    System.out.println("Set = " + set);
                    return true;
                }
            }
            if(path.charAt(i) == 'S'){
                coordinates = coordinates - 1;
                if (!set.contains(coordinates)){
                    set.add(coordinates);
                    continue;
                }
                else {
                    System.out.println("Set = " + set);
                    return true;
                }
            }
            if(path.charAt(i) == 'E'){
                coordinates = coordinates + 10;
                if (!set.contains(coordinates)){
                    set.add(coordinates);
                    continue;
                }
                else {
                    System.out.println("Set = " + set);
                    return true;
                }
            }

            if(path.charAt(i) == 'W'){
                coordinates = coordinates - 10;
                if (!set.contains(coordinates)){
                    set.add(coordinates);
                    continue;
                }
                else {
                    System.out.println("Set = " + set);
                    return true;
                }
            }
        }
        System.out.println("Set = " + set);
        return false;

    }

    public static void main(String[] args) {
        String s = "SENESSEENWNNWNNENNNNNEESSWN";
        System.out.println(isPathCrossing(s));

    }

}
