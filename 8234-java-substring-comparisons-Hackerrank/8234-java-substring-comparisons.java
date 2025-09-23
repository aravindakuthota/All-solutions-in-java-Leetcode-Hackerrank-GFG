

    public static String getSmallestAndLargest(String s, int k) {
        String smallest =s.substring(0,k);
        String largest = s.substring(0,k);
        
        for(int i =0; i<=s.length()-k;i++){
            String sub = s.substring(i, i+k);
            
            if(sub.compareTo(smallest) < 0){
                smallest = sub;
            }
            
            if(sub.compareTo(largest) > 0) {
                largest = sub;
            }
        }
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }

