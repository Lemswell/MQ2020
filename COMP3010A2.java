import java.util.*

public class COMP3010A2 {

    // This assignment consists of finding and optimizing the breaking down of strings into substrings with number of breaks 'b' on string 's'

    public ArrayList<Integer> BasicBreakIdxOrdering(String s, ArrayList<Integer> b) {
        ArrayList<Integer> sb = new ArrayList<Integer>(); // breakpoints sorted in optimal order
        
        /* First method: checking high and low for biggest breaks
        //               the distance (in terms of index) between highest 'break' and 's' length is compared to the distance between lowest 'break' and 0
        //               the 'break' with the highest distance is added, and 
        //               the process is repeated with new given substring.
        
        ArrayList<Integer> bCopy = new ArrayList<Integer>(); // copy of break indicies
        
        for(Integer i : b) {
            bCopy.add(i);
        }
        
        int low = 0;
        int high = s.length()-1;
        
        // note that 'breaks' are inputted in ascending order
        while(bCopy.size()>0){
            if(bCopy.get(0) - low > high - bCopy.get(b.size()-1)) {
                sb.add(bCopy.get(0));
                low = bCopy.get(0);
                bCopy.remove(0);
            } else {
                sb.add(bCopy.get(b.size()-1));
                high = bCopy.get(b.size()-1);
                bCopy.remove(b.size()-1);
            }
        }
        
        // unoptimal case: breaks occuring at beggining & end of string

        */
        
        // string where 'a' represents arbitrary char and 'b' represents a occurance of a break such that 'b' is the first char of the following string
        //          note that first char cannot be a 'b'
        // 'abaaaaaaaaaabbb' 
        // new method must account for the spaces between 'b's and 
        
        
        // Second method: Prioritsing the 'removal' of largest gap between breaks 
        
        
        
        
        return sb;
    }
}
