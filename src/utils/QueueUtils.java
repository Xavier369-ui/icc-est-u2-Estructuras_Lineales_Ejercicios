package utils;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUtils {
    
    public boolean isPalindrome(String texto) {
        Queue<Character> original = new LinkedList<>();
        LinkedList<Character> invertida = new LinkedList<>();

      
        for (char c : texto.toCharArray()) {
            original.add(c);
            invertida.addFirst(c); 
        }

       
        while (!original.isEmpty()) {
            if (!original.remove().equals(invertida.remove())) {
                return false;
            }
        }

        return true;
    }
}
