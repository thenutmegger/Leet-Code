public class JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {

        if (jewels == null || stones == null){
            return 0;
        }

        int count = 0;
        for (int i = 0; i<jewels.length(); i++){
            for (int j = 0; j<stones.length(); j++){
                if (jewels.charAt(i) == stones.charAt(j)){
                    count++;

                }
            }
        }
        return count;
    }
}
