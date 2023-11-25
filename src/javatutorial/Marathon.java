package javatutorial;

public class Marathon {
    public static void main (String[] arguments) {
        String[] names = {
       "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
       "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
       "Aaron", "Kate"
       };
       int[] times = {
       341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
       343, 317, 265
       };
       for (int i = 0; i < names.length; i++) {
        System.out.println(names[i] + ": " + times[i]);
       }
       int bestOne = findBest(times);
       System.out.println("bestone"+ names[bestOne] + ": " + times[bestOne]);
       
       int secondBest =findSecondBest(times);
       System.out.println("second best one"+ names[secondBest] + ": " + times[secondBest]);
       
       int thirdBest = findThirdBest(times);
       System.out.println("third best one"+ names[thirdBest] + ": " + times[thirdBest]);
       }
    
   
    
    
    public static int findBest(int[] times) {
        int minIndex = -1;
        // use integer object type max value 
        int bestTime =Integer.MAX_VALUE;
        
        for (int i =0 ;i<times.length; i++) {
            if(times[i] < bestTime) {
                bestTime = times[i];
                minIndex = i ;
            }
        }
        
        return minIndex; 
    }
    
    public static int findSecondBest(int[] times) {
        int secondBestIndex = -1;
        int minIndex = findBest(times);
        
        for(int i= 0; i < times.length; i++ ) {
            if(i == minIndex) {
                continue;
            }
            if(secondBestIndex == -1 || times[i] < times[secondBestIndex] ) {
                secondBestIndex = i; 
            }
        }
        
        return secondBestIndex; 
    }
    
    public static int findThirdBest(int[] times) {
        int thirdBestIndex = -1;
        int minIndex = findBest(times);
        int secondIndex = findSecondBest(times);
        
        for(int i= 0; i < times.length; i++ ) {
            if(i == minIndex || i == secondIndex) {
                continue;
            }
            if(thirdBestIndex == -1 || times[i] < times[thirdBestIndex] ) {
                thirdBestIndex = i; 
            }
        }
        
        return thirdBestIndex; 
    }
}
