class SignValidator:

    def is_valid(self, text: str) -> bool:
        stack = []  

        for char in text:
            
            if char == '(' or char == '{' or char == '[':
                stack.append(char)

           
            elif char == ')' or char == '}' or char == ']':
                
                if not stack:
                    return False

                
                ultimo = stack.pop()

               
                if not self.is_same_type(ultimo, char):
                    return False

       
        return len(stack) == 0

    def is_same_type(self, apertura: str, cierre: str) -> bool:
        return (apertura == '(' and cierre == ')') or \
               (apertura == '{' and cierre == '}') or \
               (apertura == '[' and cierre == ']')          
