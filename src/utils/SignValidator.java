package utils;

import java.util.Stack;

public class SignValidator {

    public boolean isValid(String signos){
        Stack<Character> stack = new Stack<Character>();
        char[] caracteres = signos.toCharArray();
        for(Character character : caracteres){
            // character- > (
            // character -> )
            // 1 -> Comprobar si es apertura o cierre
            if(getIsApertura(character)){
                stack.push(character);
                 // ingresar a la fila
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                // usar pop directamente
                char ultimo = stack.pop();
                // ultimo es del mismo tipo que el caracter?
                //mismoTipo = isTipoIgual(character,ultimo);
                // ultimo ( && character ) -> true
                // ultimo { && character } -> true
                // ultimo [ && character ] -> true
                // ultimo ( && character ] -> false
                if(!isTipoIgual(ultimo, character)){
                    return false;
                }


            }
        }
        return stack.isEmpty();
    }
    private boolean isTipoIgual(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')') ||
               (apertura == '{' && cierre == '}') ||
               (apertura == '[' && cierre == ']');
    }
    public boolean getIsApertura(char c){
        return c == '(' || c == '{' || c == '[';

    }
    
}
