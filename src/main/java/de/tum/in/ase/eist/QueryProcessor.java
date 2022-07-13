package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("Max")) {
           return "Max";
        } else if(query.contains("plus")) {
            String[] params = query.split(" ");
            int sus = 0;
            for(String s : params) {
                try {
                    int n = Integer.parseInt(s);
                    sum += n
                } catch (NumberFormatException e) {
                    //comment
                }
            }
            return String.valueOf(sum);
        }
        } else { // TODO extend the programm here
            return "";
        }
    }
}
